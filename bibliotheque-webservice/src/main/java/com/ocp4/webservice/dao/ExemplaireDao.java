package com.ocp4.webservice.dao;

import java.util.List;

import com.ocp4.webservice.beans.Exemplaire;


public interface ExemplaireDao {
	Exemplaire trouver(Integer idExemplaire);
	List<Exemplaire> listerParEdition(String isbn);
}
