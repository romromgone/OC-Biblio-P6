package com.ocp4.batch;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ocp4.batch.beans.EmailConnexion;
import com.ocp4.batch.beans.WsdlLocation;


import generated.clientserviceEmprunt.Emprunt;
import generated.clientserviceEmprunt.EmpruntService;
import generated.clientserviceEmprunt.EmpruntService_Service;
import generated.clientserviceExemplaire.ExemplaireService;
import generated.clientserviceExemplaire.ExemplaireService_Service;
import generated.clientserviceReservation.Reservation;
import generated.clientserviceReservation.ReservationService;
import generated.clientserviceReservation.ReservationService_Service;


@Component
public class BatchTask 
{
	@Autowired
    private EmailConnexion emailConnexion;
	@Autowired
    private WsdlLocation wsdlLocation;
    private String separateur = System.getProperty("line.separator");
  
   
    @Scheduled(cron = "${cronExpr}")
    public void LaunchTasks() {
    	System.out.println("Batchs lancés ! " + LocalDateTime.now());
    	TaskAvertirNonRendu();
    	TaskInformerExemplaireDispo();
    	TaskTraiterReservationsDelaisDepasses();
    }
    
    private void TaskAvertirNonRendu() {
    	long pauseEmail=0;
        List<Emprunt> empruntNonRendus = getEmpruntService().listerNonRendus();
            
        System.out.println("Envoi des mails pour les ouvrages non rendus");
        
        for (Emprunt emprunt : empruntNonRendus) {
            while (System.currentTimeMillis()<pauseEmail) {}
            pauseEmail = System.currentTimeMillis() + emailConnexion.getConnexionEmailDelay();
 
            String text = "Bonjour " + emprunt.getUsager().getPrenom() + " " + emprunt.getUsager().getNom() + "," 
            			+ separateur + separateur + "Ceci est un rappel car vous n'avez pas rendu votre exemplaire du livre " + "\"" + emprunt.getExemplaire().getEdition().getOuvrage().getTitre() + "\""
            			+ " de " + emprunt.getExemplaire().getEdition().getOuvrage().getAuteur()+" dont l'emprunt prenait fin le "
            			+ emprunt.getDateFin() + "." + separateur + separateur 
            			+ "Merci de bien vouloir nous le retourner dans les plus brefs délais." + separateur + separateur 
            		    + "Cordialement. Votre bibliothèque.";
           
            String erreur = EnvoyerMail(emailConnexion.getConnexionHost(), emailConnexion.getConnexionUsername(), emailConnexion.getConnexionPassword(), emailConnexion.getConnexionFrom(), "Non retour de votre emprunt", text, emprunt.getMailUsager());          
            if (erreur != "Sending OK") {
                System.out.println(LocalDateTime.now() + "- Mail usager : " + emprunt.getMailUsager() + "- Id exemplaire : " + emprunt.getIdExemplaire() + "- " + erreur);
            }

        }
        System.out.println("--> "+LocalDateTime.now()+"; Effectué !");
    }
    
    private void TaskInformerExemplaireDispo() {
    	long pauseEmail=0;  	
		List<Reservation> reservations = getReservationService().listerPourChaqueOuvragePremierePosition();
		
		System.out.println("Envoi des mails pour les exemplaires disponibles");
		
		for (Reservation reservation : reservations) {	
			
			if (getExemplaireService().trouverExemplaireDisponible(reservation.getIdOuvrage()) != null) {
				while (System.currentTimeMillis()<pauseEmail) {}
	            pauseEmail = System.currentTimeMillis() + emailConnexion.getConnexionEmailDelay();
	            
	            String text = "Bonjour " + reservation.getUsager().getPrenom() + " " + reservation.getUsager().getNom() + "," 
            			+ separateur + separateur + "Suite à votre réservation concernant l'ouvrage suivant : " + "\"" + reservation.getOuvrage().getTitre() + "\""
            			+ " de "+ reservation.getOuvrage().getAuteur() + " , nous vous informons qu'un exemplaire est désormais disponible." + separateur + separateur       			
            			+ "Vous disposez maintenant de 48 heures pour venir le récupérer à la bibliothèque. Passé ce délai votre réservation sera supprimée." + separateur + separateur 
            		    + "Cordialement. Votre bibliothèque.";
	            
	            String erreur = EnvoyerMail(emailConnexion.getConnexionHost(), emailConnexion.getConnexionUsername(), emailConnexion.getConnexionPassword(), emailConnexion.getConnexionFrom(), "Exemplaire disponible suite à votre réservation", text, reservation.getMailUsager());          
	            if (erreur != "Sending OK") {
	                System.out.println(LocalDateTime.now() + "- Mail usager : " + reservation.getMailUsager() + "- Id ouvrage : " + reservation.getIdOuvrage() + "- " + erreur);
	            }
	            
	            getReservationService().ajouterTSMailEnvoye(reservation.getMailUsager(), reservation.getIdOuvrage());
			}
			
		}
		System.out.println("--> "+LocalDateTime.now()+"; Effectué !");
    }
    
    private void TaskTraiterReservationsDelaisDepasses() {
    	long pauseEmail=0;  	
		List<Reservation> reservations = getReservationService().listerDelaiDepasse();
		
		System.out.println("Envoi des mails pour les réservation dont le délai de retrait de 48 heures est expiré");
		
		for (Reservation reservation : reservations) {	
			
			while (System.currentTimeMillis()<pauseEmail) {}
            pauseEmail = System.currentTimeMillis() + emailConnexion.getConnexionEmailDelay();
            
            String text = "Bonjour " + reservation.getUsager().getPrenom() + " " + reservation.getUsager().getNom() + "," 
        			+ separateur + separateur + "Suite à votre réservation concernant l'ouvrage suivant : " + "\"" + reservation.getOuvrage().getTitre() + "\""
        			+ " de "+ reservation.getOuvrage().getAuteur() + " , nous vous informons que le délai de 48 heures qui vous a été laissé pour récupérer l'exemplaire disponible est dépassé." + separateur + separateur       			
        			+ "Votre réservation va donc être automatiquement supprimée." + separateur + separateur 
        		    + "Cordialement. Votre bibliothèque.";
            
            String erreur = EnvoyerMail(emailConnexion.getConnexionHost(), emailConnexion.getConnexionUsername(), emailConnexion.getConnexionPassword(), emailConnexion.getConnexionFrom(), "Délai de retrait expiré pour votre réservation", text, reservation.getMailUsager());          
            if (erreur != "Sending OK") {
                System.out.println(LocalDateTime.now() + "- Mail usager : " + reservation.getMailUsager() + "- Id ouvrage : " + reservation.getIdOuvrage() + "- " + erreur);
            }
            
            getReservationService().supprimer(reservation.getPosition(), reservation.getMailUsager(), reservation.getIdOuvrage());
		}	
		
		System.out.println("--> "+LocalDateTime.now()+"; Effectué !");	
    }
    
    
    private String EnvoyerMail(String host, String userName, String password, String from, String subject, String message, String recipient) {
        Email email= new SimpleEmail();
        try {
        	email.setHostName(host);
            email.setSslSmtpPort("465");
        	email.setAuthenticator(new DefaultAuthenticator(userName, password));
        	email.setSSLOnConnect(true);
        	email.setFrom(from);
        	email.setSubject(subject);
        	email.setMsg(message);
        	email.addTo(recipient);      
        	email.send();
        	return "Sending OK";
        }catch(Exception e) {         
            return e.getMessage();       
        }
    }
    
    private ReservationService getReservationService() {
		ReservationService reservationService;
    	URL wsdlLocationReservation = null;
    	
    	try {
    		wsdlLocationReservation = new URL(wsdlLocation.getWsdlLocationReservation());
		} catch (MalformedURLException e) {		
			e.printStackTrace();
		}

		ReservationService_Service reservationServiceService = new ReservationService_Service(wsdlLocationReservation);
		reservationService = reservationServiceService.getReservationServicePort(); 
		return reservationService;
    }
    
    private ExemplaireService getExemplaireService() {
		ExemplaireService exemplaireService;
    	URL wsdlLocationExemplaire = null;
    	
    	try {
    		wsdlLocationExemplaire = new URL(wsdlLocation.getWsdlLocationExemplaire());
		} catch (MalformedURLException e) {		
			e.printStackTrace();
		}

		ExemplaireService_Service exemplaireServiceService = new ExemplaireService_Service(wsdlLocationExemplaire);
		exemplaireService = exemplaireServiceService.getExemplaireServicePort(); 
		return exemplaireService;
    }
    
    private EmpruntService getEmpruntService() {
		EmpruntService empruntService;
    	URL wsdlLocationEmprunt = null;
    	
    	try {
    		wsdlLocationEmprunt = new URL(wsdlLocation.getWsdlLocationEmprunt());
		} catch (MalformedURLException e) {		
			e.printStackTrace();
		}

		EmpruntService_Service empruntServiceService = new EmpruntService_Service(wsdlLocationEmprunt);
		empruntService = empruntServiceService.getEmpruntServicePort(); 
		return empruntService;
    }
    
}
