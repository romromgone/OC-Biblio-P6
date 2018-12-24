package com.ocp4.webservice.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ocp4.webservice.beans.Edition;
import com.ocp4.webservice.beans.Emprunt;
import com.ocp4.webservice.beans.Exemplaire;
import com.ocp4.webservice.dao.EmpruntDao;


@WebService(serviceName = "EmpruntService")
public class EmpruntService extends AbstractService {

	@WebMethod
	public Emprunt trouverEmprunt(String mail, Integer idExemplaire, String dateDeb) throws ParseException {
		Emprunt emprunt = getDaoFactory().getEmpruntDao().trouver(mail, idExemplaire, dateDeb);
		return emprunt;
	}
	
	@WebMethod
	public Integer prolonger(String mail, Integer idExemplaire, String dateDeb) throws ParseException {
		return getDaoFactory().getEmpruntDao().prolonger(mail, idExemplaire, dateDeb);	
	}

	@WebMethod
	public List<Emprunt> listerNonRendus() {
		List<Emprunt> emprunts = getDaoFactory().getEmpruntDao().listerNonRendus();
		return emprunts;
	}
	
	@WebMethod
	public List<Emprunt> listerEnCoursParUsager(String mail) {
		List<Emprunt> emprunts = getDaoFactory().getEmpruntDao().listerEnCoursParUsager(mail);
		return emprunts;
	}
	
	@WebMethod
	public List<Emprunt> listerNonRendusParUsager(String mail) {
		List<Emprunt> emprunts = getDaoFactory().getEmpruntDao().listerNonRendusParUsager(mail);
		return emprunts;
	}
	
	@WebMethod
	public List<Emprunt> listerEnCoursParOuvrage(Integer idOuvrage) {
		List<Emprunt> emprunts = new ArrayList<>();
		EmpruntDao empruntDao = getDaoFactory().getEmpruntDao();
		
		List<Exemplaire> exemplaires = listerParOuvrage(idOuvrage);	   
		for (Exemplaire exemplaire : exemplaires) {
			if(empruntDao.enCoursParExemplaire(exemplaire.getId())) {
				emprunts.add(empruntDao.trouverEnCoursParExemplaire(exemplaire.getId()));
			} else if (empruntDao.nonRendusParExemplaire(exemplaire.getId())) {
				emprunts.add(empruntDao.trouverNonRendusParExemplaire(exemplaire.getId()));
			}			
		}
		return emprunts;
	}
	
	@WebMethod
	public List<Emprunt> listerParUsagerEtBientotAExpiration(String mail) {
		List<Emprunt> emprunts = getDaoFactory().getEmpruntDao().listerParUsagerEtBientotAExpiration(mail);
		return emprunts;
	}
	
	@WebMethod
	public String getDateRetourPlusProcheParOuvrage(Integer idOuvrage) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		List<Date> datesFin = new ArrayList<>();
		List<Emprunt> emprunts = listerEnCoursParOuvrage(idOuvrage);
		for (Emprunt emprunt : emprunts) {
			datesFin.add(df.parse(emprunt.getDateFin()));
		}
		Date minDate = java.util.Collections.min(datesFin);
		return df.format(minDate);
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
