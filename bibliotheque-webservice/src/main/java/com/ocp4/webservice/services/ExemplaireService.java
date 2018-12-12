package com.ocp4.webservice.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ocp4.webservice.beans.Edition;
import com.ocp4.webservice.beans.Exemplaire;

@Named
@WebService(serviceName = "ExemplaireService")
public class ExemplaireService extends AbstractService {

	@WebMethod
	public Exemplaire trouverExemplaire(Integer idExemplaire) {
		Exemplaire exemplaire = getDaoFactory().getExemplaireDao().trouver(idExemplaire);
		return exemplaire;
	}

	@WebMethod
	public List<Exemplaire> listerParEdition(String isbn) {
		List<Exemplaire> exemplaires = getDaoFactory().getExemplaireDao().listerParEdition(isbn);
		return exemplaires;
	}
	
	@WebMethod
	public List<Exemplaire> listerParOuvrage(Integer idOuvrage) {
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
