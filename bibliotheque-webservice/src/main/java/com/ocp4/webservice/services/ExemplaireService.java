package com.ocp4.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ocp4.webservice.beans.Exemplaire;


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
	
}
