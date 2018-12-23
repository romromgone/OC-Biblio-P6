package com.ocp4.webservice.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ocp4.webservice.beans.Edition;
import com.ocp4.webservice.beans.Emprunt;
import com.ocp4.webservice.beans.Ouvrage;

import com.ocp4.webservice.beans.Exemplaire;;


@WebService(serviceName = "OuvrageService")
public class OuvrageService extends AbstractService {

	@WebMethod
	public Ouvrage trouverOuvrage(Integer idOuvrage) {
		Ouvrage ouvrage = getDaoFactory().getOuvrageDao().trouver(idOuvrage);
		return ouvrage;
	}

	@WebMethod
	public List<Ouvrage> listerTout() {
		List<Ouvrage> ouvrages = getDaoFactory().getOuvrageDao().listerTout();
		return ouvrages;
	}
	
	@WebMethod
	public List<Ouvrage> rechercherParTitre(String titre) {
		List<Ouvrage> ouvrages = getDaoFactory().getOuvrageDao().rechercherParTitre(titre);
		return ouvrages;
	}
	
	@WebMethod
	public List<Ouvrage> rechercherParAuteur(String auteur) {
		List<Ouvrage> ouvrages = getDaoFactory().getOuvrageDao().rechercherParAuteur(auteur);
		return ouvrages;
	}
	
	@WebMethod
	public List<Ouvrage> rechercherParTitreEtAuteur(String titre, String auteur) {
		List<Ouvrage> ouvrages = getDaoFactory().getOuvrageDao().rechercherParTitreEtAuteur(titre, auteur);
		return ouvrages;
	}
	    
	@WebMethod
	public Boolean enCoursDEmprunt(Integer idOuvrage, String mailUsager) {
		Boolean result = false;
		List<Exemplaire> exemplaires = listerParOuvrage(idOuvrage);
		List<Emprunt> empruntsEnCours = getDaoFactory().getEmpruntDao().listerEnCoursParUsager(mailUsager);
		List<Emprunt> empruntsNonRendus = getDaoFactory().getEmpruntDao().listerNonRendusParUsager(mailUsager);
	
		List<Emprunt> emprunts = new ArrayList<Emprunt>(empruntsEnCours);
		emprunts.addAll(empruntsNonRendus);
		
		for (Emprunt emprunt : emprunts) {
			for (Exemplaire exemplaire : exemplaires) {
				if (emprunt.getIdExemplaire() == exemplaire.getId()) {
					result = true;
				}
			}	
		}
		return result;
	}
	
	@WebMethod
	public Boolean listeReservationsComplete(Integer idOuvrage) {
		List<Exemplaire> exemplaires = listerParOuvrage(idOuvrage);
		Integer nbReservations = getDaoFactory().getReservationDao().enumererParOuvrage(idOuvrage);
		
		if (nbReservations >= (exemplaires.size() * 2)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	private List<Exemplaire> listerParOuvrage(Integer idOuvrage) {
		List<Exemplaire> listeExemplaires = new ArrayList<>();
		
		List<Edition> editions = getDaoFactory().getEditionDao().listerParOuvrage(idOuvrage);
	    for (Edition edition : editions) {
	    	List<Exemplaire> exemplaires = getDaoFactory().getExemplaireDao().listerParEdition(edition.getIsbn());
	    	for (Exemplaire exemplaire : exemplaires) {
	    		listeExemplaires.add(exemplaire);
	    	}
	    }
	    return listeExemplaires;
	}
	    
}
