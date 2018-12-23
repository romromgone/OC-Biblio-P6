package com.ocp4.webservice.dao;

import java.text.ParseException;
import java.util.List;

import com.ocp4.webservice.beans.Emprunt;


public interface EmpruntDao {
	Emprunt trouver(String mail, Integer idExemplaire, String dateDeb) throws ParseException;
	Integer prolonger(String mail, Integer idExemplaire, String dateDeb) throws ParseException;
	List<Emprunt> listerNonRendus();
	List<Emprunt> listerEnCoursParUsager(String mail);
	List<Emprunt> listerNonRendusParUsager(String mail);
	Boolean enCoursParExemplaire(Integer idExemplaire);
	Boolean nonRendusParExemplaire(Integer idExemplaire);
	Emprunt trouverEnCoursParExemplaire(Integer idExemplaire);
	Emprunt trouverNonRendusParExemplaire(Integer idExemplaire);
}
