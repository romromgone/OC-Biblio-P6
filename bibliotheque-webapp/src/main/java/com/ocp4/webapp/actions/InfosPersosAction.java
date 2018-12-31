package com.ocp4.webapp.actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import generated.clientserviceEmprunt.ParseException_Exception;
import generated.clientserviceUsager.Usager;
import generated.clientserviceUsager.UsagerService;
import generated.clientserviceUsager.UsagerService_Service;


public class InfosPersosAction extends ActionSupport implements SessionAware {
	private Usager usager;
	private Boolean isOptionRappel;
	private Map<String, Object> session;

	public Usager getUsager() {
		return usager;
	}
	
	public Boolean getIsOptionRappel() {
		return isOptionRappel;
	}

	public void setIsOptionRappel(Boolean isOptionRappel) {
		this.isOptionRappel = isOptionRappel;
	}

	@Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
	
    public String doInfos() {          
        usager = (Usager) session.get("usager");
        
        if (usager == null) {
        	this.addActionError("Vous avez été déconnecté");
        	return ActionSupport.ERROR;
        } else {
        	isOptionRappel = getUsagerService().trouverUsager(usager.getMail()).isOptionRappel();
        	return ActionSupport.SUCCESS;
        }
    }
    
    public String doModifierOptionRappel() throws ParseException_Exception {
		String vResult = ActionSupport.INPUT;
		
		usager = (Usager) session.get("usager");
        if (usager == null) {
        	this.addActionError("Vous avez été déconnecté");
        	return ActionSupport.ERROR;
        }
        else {
        	try {
        		isOptionRappel = getUsagerService().trouverUsager(usager.getMail()).isOptionRappel();
        		if (isOptionRappel == true) {
        			getUsagerService().modifierOptionRappel(usager.getMail(), false);	
        		} else {
        			getUsagerService().modifierOptionRappel(usager.getMail(), true);
        		}
        		vResult = ActionSupport.SUCCESS;
        		
        	} catch (RuntimeException e) {
        		this.addActionError("Erreur");
            	return ActionSupport.ERROR;
        	}    	
        }
        return vResult; 	
	}
    
    
    private UsagerService getUsagerService() {
		UsagerService usagerService;
    	URL wsdlLocationUsager = null;
    	
    	try {
    		wsdlLocationUsager = new URL(getText("WSDLLocationUsager"));
		} catch (MalformedURLException e) {		
			e.printStackTrace();
		}

		UsagerService_Service usagerServiceService = new UsagerService_Service(wsdlLocationUsager);
		usagerService = usagerServiceService.getUsagerServicePort(); 
		return usagerService;
    }

}
