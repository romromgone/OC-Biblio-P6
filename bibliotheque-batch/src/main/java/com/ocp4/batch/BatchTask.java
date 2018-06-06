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


@Component
public class BatchTask 
{
	@Autowired
    private EmailConnexion emailConnexion;
	@Autowired
    private WsdlLocation wsdlLocation;
    private URL wsdlLocationEmprunt;
    private long pauseEmail = 0;
    private String separateur = System.getProperty("line.separator");
  
   
    @Scheduled(cron = "${cronExpr}")
    public void Task() {
    	try {
			wsdlLocationEmprunt = new URL(wsdlLocation.getWsdlLocationEmprunt());
		} catch (MalformedURLException e) {		
			e.printStackTrace();
		}
       
        System.out.println("--> "+LocalDateTime.now()+"; Récupétation des emprunts non rendus.");
        EmpruntService_Service empruntServiceService = new EmpruntService_Service(wsdlLocationEmprunt);
		EmpruntService empruntService = empruntServiceService.getEmpruntServicePort();
        List<Emprunt> empruntNonRendus = empruntService.listerNonRendus();
            
        System.out.println("--> "+LocalDateTime.now()+"; Envoi des mails.");
        for (Emprunt emprunt : empruntNonRendus) {
            while (System.currentTimeMillis()<pauseEmail) {}
            pauseEmail = System.currentTimeMillis() + emailConnexion.getConnexionEmailDelay();
 
            String text = "Bonjour " + emprunt.getUsager().getPrenom() + " " + emprunt.getUsager().getNom() + "," 
            			+ separateur + separateur + "Ceci est un rappel car vous n'avez pas rendu votre exemplaire du livre " + "\""+emprunt.getExemplaire().getEdition().getOuvrage().getTitre()+"\""
            			+ " de "+ emprunt.getExemplaire().getEdition().getOuvrage().getAuteur()+" dont l'emprunt prenait fin le "
            			+ emprunt.getDateFin() + "." + separateur + separateur 
            			+ "Merci de bien vouloir nous le retourner dans les plus brefs délais ou de le prolonger dans le cas où ce prêt n'a pas déjà été prolongé." + separateur + separateur 
            		    + "Cordialement. Votre bibliothèque.";
           
            String erreur = EnvoyerMail(emailConnexion.getConnexionHost(), emailConnexion.getConnexionUsername(), emailConnexion.getConnexionPassword(), emailConnexion.getConnexionFrom(), "Non retour de votre emprunt", text, emprunt.getMailUsager());          
            if (erreur != "Sending OK") {
                System.out.println(LocalDateTime.now() + "- Mail usager : " + emprunt.getMailUsager() + "- Id exemplaire : " + emprunt.getIdExemplaire() + "- " + erreur);
            }

        }
        System.out.println("--> "+LocalDateTime.now()+"; Effectué");
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
    
}
