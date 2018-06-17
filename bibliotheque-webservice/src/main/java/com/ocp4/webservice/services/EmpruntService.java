package com.ocp4.webservice.services;

import java.text.ParseException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ocp4.webservice.beans.Emprunt;


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
	
}
