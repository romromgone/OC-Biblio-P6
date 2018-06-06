package com.ocp4.webapp.actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.jasypt.util.password.ConfigurablePasswordEncryptor;

import com.opensymphony.xwork2.ActionSupport;

import generated.clientserviceUsager.*;


public class ConnexionAction extends ActionSupport implements SessionAware {
	private String mail;
	private String mdp;
	private Usager usager;
	private Map<String, Object> session;

	
    public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Usager getUsager() {
		return usager;
	}

	@Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }

    public String doConnexion() {
    	String vResult = ActionSupport.INPUT;
          
        try {
        	usager = TrouverUsager();  
        	ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();
            passwordEncryptor.setAlgorithm("SHA-256");
            passwordEncryptor.setPlainDigest(false);  
            if (passwordEncryptor.checkPassword(mdp, usager.getMdp())) {	            
                this.addActionMessage("Succès de la connexion.");
                this.session.put("usager", usager);
                vResult = ActionSupport.SUCCESS;
            }
            else {
            	this.addFieldError("mdp", "Erreur de mot de passe.");
	            }
   
        } catch (RuntimeException e) {
        	this.addFieldError("mail", "Usager inexistant");
        }
            
        return vResult;
    }
    
    public String doDeconnexion() {
    	this.session.remove("usager");
    	return ActionSupport.SUCCESS;	
    }
    
    
    private Usager TrouverUsager() {
    	Usager usager;
    	URL wsdlLocationUsager = null;
    	
    	try {
			wsdlLocationUsager = new URL(getText("WSDLLocationUsager"));
		} catch (MalformedURLException e) {		
			e.printStackTrace();
		}

		UsagerService_Service usagerServiceService = new UsagerService_Service(wsdlLocationUsager);
		UsagerService usagerService = usagerServiceService.getUsagerServicePort();
		usager = usagerService.trouverUsager(mail);  
		return usager;
    }

}
