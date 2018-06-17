package com.ocp4.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ocp4.webservice.beans.Ouvrage;


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
}
