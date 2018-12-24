package com.ocp4.webservice.dao;

import java.util.List;

import com.ocp4.webservice.beans.Usager;


public interface UsagerDao {
	Usager trouver(String mail);
	List<Usager> listerParOptionRappel();
	void modifierOptionRappel(String mailUsager, Boolean optionRappel);
}
