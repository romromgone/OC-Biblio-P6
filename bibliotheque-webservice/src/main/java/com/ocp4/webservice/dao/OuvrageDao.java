package com.ocp4.webservice.dao;

import java.util.List;

import com.ocp4.webservice.beans.Ouvrage;


public interface OuvrageDao {
	Ouvrage trouver(Integer idOuvrage);
	List<Ouvrage> listerTout();
	List<Ouvrage> rechercherParTitre(String titre);
	List<Ouvrage> rechercherParAuteur(String auteur);
	List<Ouvrage> rechercherParTitreEtAuteur(String titre, String auteur);
	List<Ouvrage> rechercherParClassification(String classification);
}
