package com.ocp4.webapp.actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import generated.clientserviceReservation.Reservation;
import generated.clientserviceReservation.ReservationService;
import generated.clientserviceReservation.ReservationService_Service;
import generated.clientserviceEmprunt.EmpruntService;
import generated.clientserviceEmprunt.EmpruntService_Service;
import generated.clientserviceEmprunt.ParseException_Exception;
import generated.clientserviceOuvrage.Ouvrage;
import generated.clientserviceOuvrage.OuvrageService;
import generated.clientserviceOuvrage.OuvrageService_Service;
import generated.clientserviceUsager.Usager;


public class ReservationsAction  extends ActionSupport implements SessionAware {
	private Integer idOuvrage;
	private Integer position;
	private Usager usager;
	private List<Reservation> reservationsEnCours;
	private EmpruntService empruntServiceField;
	private Map<String, Object> session;
	
	
	public Integer getIdOuvrage() {
		return idOuvrage;
	}
	public void setIdOuvrage(Integer idOuvrage) {
		this.idOuvrage = idOuvrage;
	}
	
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	
	public List<Reservation> getReservationsEnCours() {
		return reservationsEnCours;
	}

	public EmpruntService getEmpruntServiceField() {
		empruntServiceField = getEmpruntService();
		return empruntServiceField;
	}
	
	@Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
	
	
	public String doReservations() throws ParseException_Exception {
		String vResult = ActionSupport.INPUT;
		
		usager = (Usager) session.get("usager");
        if (usager == null) {
        	this.addActionError("Vous avez été déconnecté");
        	return ActionSupport.ERROR;
        }
        else {
        	try {            	     
            	reservationsEnCours = getReservationService().listerParUsager(usager.getMail());    	       	
            	vResult = ActionSupport.SUCCESS;
        	} catch (RuntimeException e) {
    		      		
        	}    	
        }
        return vResult;        	
    }
	
	public String doAnnuler() throws ParseException_Exception {
		String vResult = ActionSupport.INPUT;
		
		usager = (Usager) session.get("usager");
        if (usager == null) {
        	this.addActionError("Vous avez été déconnecté");
        	return ActionSupport.ERROR;
        }
        else {
        	try {
        		getReservationService().supprimer(position, usager.getMail(), idOuvrage);
            	vResult = ActionSupport.SUCCESS;
        	} catch (RuntimeException e) {
        		this.addActionError("Erreur annulation");
            	return ActionSupport.ERROR;
        	}    	
        }
        return vResult; 	
	}
	
	
	private ReservationService getReservationService() {
		ReservationService reservationService;
    	URL wsdlLocationReservation = null;
    	
    	try {
    		wsdlLocationReservation = new URL(getText("WSDLLocationReservation"));
		} catch (MalformedURLException e) {		
			e.printStackTrace();
		}

		ReservationService_Service reservationServiceService = new ReservationService_Service(wsdlLocationReservation);
		reservationService = reservationServiceService.getReservationServicePort(); 
		return reservationService;
    }
	
	private OuvrageService getOuvrageService() {
		OuvrageService ouvrageService;
    	URL wsdlLocationOuvrage = null;
    	
    	try {
    		wsdlLocationOuvrage = new URL(getText("WSDLLocationOuvrage"));
		} catch (MalformedURLException e) {		
			e.printStackTrace();
		}

		OuvrageService_Service ouvrageServiceService = new OuvrageService_Service(wsdlLocationOuvrage);
		ouvrageService = ouvrageServiceService.getOuvrageServicePort(); 
		return ouvrageService;
    }
	
	private EmpruntService getEmpruntService() {
		EmpruntService empruntService;
    	URL wsdlLocationEmprunt = null;
    	
    	try {
    		wsdlLocationEmprunt = new URL(getText("WSDLLocationEmprunt"));
		} catch (MalformedURLException e) {		
			e.printStackTrace();
		}

		EmpruntService_Service empruntServiceService = new EmpruntService_Service(wsdlLocationEmprunt);
		empruntService = empruntServiceService.getEmpruntServicePort(); 
		return empruntService;
    }
	
}
