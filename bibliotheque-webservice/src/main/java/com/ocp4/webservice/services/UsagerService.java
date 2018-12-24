package com.ocp4.webservice.services;

import java.util.List;

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
	
	@WebMethod
	public List<Usager> listerParOptionRappel() {
		List<Usager> usager = getDaoFactory().getUsagerDao().listerParOptionRappel();
		return usager;
	}
	
	@WebMethod
	public void modifierOptionRappel(String mailUsager, Boolean optionRappel) {
		getDaoFactory().getUsagerDao().modifierOptionRappel(mailUsager, optionRappel);	
	}

}
