package com.ocp4.webservice.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ocp4.webservice.beans.Usager;


@WebService(serviceName = "UsagerService")
public class UsagerService extends AbstractService {

	@WebMethod
	public Usager trouverUsager(String mail) {
		Usager usager = getDaoFactory().getUsagerDao().trouver(mail);
		return usager;
	}

}
