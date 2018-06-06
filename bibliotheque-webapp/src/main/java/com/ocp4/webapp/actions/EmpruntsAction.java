package com.ocp4.webapp.actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import generated.clientserviceEmprunt.*;
import generated.clientserviceUsager.Usager;


public class EmpruntsAction extends ActionSupport implements SessionAware {
	private Integer idExemplaire;
	private String dateDeb;
	private Usager usager;
	private List<Emprunt> empruntsEnCours;
	private List<Emprunt> empruntsNonRendus;
	private Map<String, Object> session;
	
	
	public Integer getIdExemplaire() {
		return idExemplaire;
	}
	public void setIdExemplaire(Integer idExemplaire) {
		this.idExemplaire = idExemplaire;
	}

	public String getDateDeb() {
		return dateDeb;
	}
	public void setDateDeb(String dateDeb) {
		this.dateDeb = dateDeb;
	}

	public Usager getUsager() {
		return usager;
	}
	
	public List<Emprunt> getEmpruntsEnCours() {
		return empruntsEnCours;
	}

	public List<Emprunt> getEmpruntsNonRendus() {
		return empruntsNonRendus;
	}

	@Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
	
	
	public String doEmprunts() {
		String vResult = ActionSupport.INPUT;
		
		usager = (Usager) session.get("usager");
        if (usager == null) {
        	this.addActionError("Vous avez été déconnecté");
        	return ActionSupport.ERROR;
        }
        else {
        	try {
        		EmpruntService empruntService = getEmpruntService();
            	empruntsEnCours = empruntService.listerEnCoursParUsager(usager.getMail());
            	empruntsNonRendus = empruntService.listerNonRendusParUsager(usager.getMail());
            	vResult = ActionSupport.SUCCESS;
        	} catch (RuntimeException e) {
    		      		
        	}    	
        }
        return vResult;        	
    }
	
	public String doProlonger() throws ParseException_Exception {
		String vResult = ActionSupport.INPUT;
		
		usager = (Usager) session.get("usager");
        if (usager == null) {
        	this.addActionError("Vous avez été déconnecté");
        	return ActionSupport.ERROR;
        }
        else {
        	try {
        		int result = getEmpruntService().prolonger(usager.getMail(), idExemplaire, dateDeb);
            	vResult = ActionSupport.SUCCESS;
        	} catch (RuntimeException e) {
        		this.addActionError("Erreur prolongation");
            	return ActionSupport.ERROR;
        	}    	
        }
        return vResult; 	
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
