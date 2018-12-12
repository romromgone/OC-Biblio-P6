package com.ocp4.webservice.services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ocp4.webservice.beans.Emprunt;
import com.ocp4.webservice.beans.Exemplaire;


@WebService(serviceName = "EmpruntService")
public class EmpruntService extends AbstractService {
	
	@Inject
	ExemplaireService exemplaireService;

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
		
		List<Exemplaire> exemplaires = exemplaireService.listerParOuvrage(idOuvrage);		
		for (Exemplaire exemplaire : exemplaires) {
			Emprunt empruntEnCours = getDaoFactory().getEmpruntDao().listerEnCoursParExemplaire(exemplaire.getId()).get(0);
			Emprunt empruntNonRendu = getDaoFactory().getEmpruntDao().listerNonRendusParExemplaire(exemplaire.getId()).get(0);
			if (empruntEnCours != null) emprunts.add(empruntEnCours);
			else if (empruntNonRendu != null) emprunts.add(empruntNonRendu);
		}
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
	
}
