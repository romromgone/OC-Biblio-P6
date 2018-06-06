package com.ocp4.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ocp4.webservice.beans.Edition;


@WebService(serviceName = "EditionService")
public class EditionService extends AbstractService {

	@WebMethod
	public Edition trouverEdition(String isbn) {
		Edition edition = getDaoFactory().getEditionDao().trouver(isbn);
		return edition;
	}

	@WebMethod
	public List<Edition> listerParOuvrage(Integer idOuvrage) {
		List<Edition> editions = getDaoFactory().getEditionDao().listerParOuvrage(idOuvrage);
		return editions;
	}
	
}
