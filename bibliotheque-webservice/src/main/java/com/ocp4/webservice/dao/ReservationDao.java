package com.ocp4.webservice.dao;

import java.util.List;

import com.ocp4.webservice.beans.Reservation;


public interface ReservationDao {
	List<Reservation> listerTout();
	List<Reservation> listerParUsager(String mailUsager);
	void creer(Integer position, String mailUsager, Integer idOuvrage);
	void supprimer(String mailUsager, Integer idOuvrage);
	Integer enumererParOuvrage(Integer idOuvrage);
	List<Reservation> listerParOuvrageEtPositionSuperieur(Integer position, Integer idOuvrage);
	void modifierPosition(Integer position, String mailUsager, Integer idOuvrage);
}
