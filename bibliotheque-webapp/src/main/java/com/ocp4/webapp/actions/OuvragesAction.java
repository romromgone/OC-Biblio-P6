package com.ocp4.webapp.actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
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
	private String classification;
	private String resume;
	private Usager usager;
	private List<Ouvrage> listeRechercheOuvrages;
	private Map<Ouvrage, Integer> nbMapExemplairesDispos;
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

	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}

	public Usager getUsager() {
		return usager;
	}

	public List<Ouvrage> getListeRechercheOuvrages() {
		return listeRechercheOuvrages;
	}

	public Map<Ouvrage, Integer> getNbMapExemplairesDispos() {
		return nbMapExemplairesDispos;
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
        		if (auteur == null && classification == null) listeRechercheOuvrages = getOuvrageService().rechercherParTitre(titre);
        		else if (titre == null && classification == null) listeRechercheOuvrages = getOuvrageService().rechercherParAuteur(auteur);
        		else if (auteur == null && titre == null) listeRechercheOuvrages = getOuvrageService().rechercherParClassification(classification);
        		else if (classification == null) listeRechercheOuvrages = getOuvrageService().rechercherParTitreEtAuteur(titre, auteur);
        		/*for (Ouvrage ouvrage : listeRechercheOuvrages) {
        			nbMapExemplairesDispos.put(ouvrage, null);
        		    List<Edition> listeEditions = getEditionService().listerParOuvrage(ouvrage.getId());
        		    for (Edition edition : listeEditions) {
        		    	List<Exemplaire> listeExemplaires = getExemplaireService().listerParEdition(edition.getIsbn());
        		    	Integer nbExemplairesDispos = 0;
        		    	for (Exemplaire exemplaire : listeExemplaires) {
        		    		if (!getEmpruntService().enCoursPourExemplaire(exemplaire.getId())) {
        		    			nbExemplairesDispos++;   		    			
        		    		}
        		    		nbMapExemplairesDispos.put(ouvrage, nbExemplairesDispos);
        		    	}
        		    }
        		}*/
            	vResult = ActionSupport.SUCCESS;
        	} catch (RuntimeException e) {
        		this.addActionError("Erreur de la recherche");
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
