package com.ocp4.webapp.actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import generated.clientserviceEdition.Edition;
import generated.clientserviceEdition.EditionService;
import generated.clientserviceEdition.EditionService_Service;
import generated.clientserviceEmprunt.EmpruntService;
import generated.clientserviceEmprunt.EmpruntService_Service;
import generated.clientserviceEmprunt.ParseException_Exception;
import generated.clientserviceExemplaire.Exemplaire;
import generated.clientserviceExemplaire.ExemplaireService;
import generated.clientserviceExemplaire.ExemplaireService_Service;
import generated.clientserviceOuvrage.Ouvrage;
import generated.clientserviceOuvrage.OuvrageService;
import generated.clientserviceOuvrage.OuvrageService_Service;
import generated.clientserviceUsager.Usager;


public class OuvragesAction  extends ActionSupport implements SessionAware {
	private String titre;
	private String auteur;
	private Usager usager;
	private List<Ouvrage> listeRechercheOuvrages;
	private int nbExemplairesDispos;
	private Map<String, Object> session;
	

	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public Usager getUsager() {
		return usager;
	}

	public List<Ouvrage> getListeRechercheOuvrages() {
		return listeRechercheOuvrages;
	}

	public int getNbExemplairesDispos() {
		return nbExemplairesDispos;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}

	@Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
	
	
	public String doRechercher() throws ParseException_Exception {
		String vResult = ActionSupport.INPUT;
				
		usager = (Usager) session.get("usager");
        if (usager == null) {
        	this.addActionError("Vous avez été déconnecté");
        	return ActionSupport.ERROR;
        }
        else {
        	try {        		
        		listeRechercheOuvrages = getOuvrageService().rechercherParTitreEtAuteur(titre, auteur);
        		for (Ouvrage ouvrage : listeRechercheOuvrages) {
        		    List<Edition> listeEditions = getEditionService().listerParOuvrage(ouvrage.getId());
        		    for (Edition edition : listeEditions) {
        		    	List<Exemplaire> listeExemplaires = getExemplaireService().listerParEdition(edition.getIsbn());
        		    	for (Exemplaire exemplaire : listeExemplaires) {
        		    		if (exemplaire.isEstDisponible() == true) {
        		    			nbExemplairesDispos++;   		    			
        		    		}
    		    		}
        		    }
    			}
        		vResult = ActionSupport.SUCCESS;  		
        	} catch (RuntimeException e) {
        		this.addActionError("Erreur de la recherche" + e);
            	return ActionSupport.ERROR;
        	}    	
        }
        return vResult; 	
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
	
	private EditionService getEditionService() {
		EditionService editionService;
    	URL wsdlLocationEdition = null;
    	
    	try {
    		wsdlLocationEdition = new URL(getText("wsdlLocationEdition"));
		} catch (MalformedURLException e) {		
			e.printStackTrace();
		}

		EditionService_Service editionServiceService = new EditionService_Service(wsdlLocationEdition);
		editionService = editionServiceService.getEditionServicePort(); 
		return editionService;
    }
	
	private ExemplaireService getExemplaireService() {
		ExemplaireService exemplaireService;
    	URL wsdlLocationExemplaire = null;
    	
    	try {
    		wsdlLocationExemplaire = new URL(getText("WSDLLocationExemplaire"));
		} catch (MalformedURLException e) {		
			e.printStackTrace();
		}

		ExemplaireService_Service exemplaireServiceService = new ExemplaireService_Service(wsdlLocationExemplaire);
		exemplaireService = exemplaireServiceService.getExemplaireServicePort(); 
		return exemplaireService;
    }

}
