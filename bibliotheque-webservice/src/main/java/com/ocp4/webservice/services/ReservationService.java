package com.ocp4.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ocp4.webservice.beans.Reservation;
import com.ocp4.webservice.dao.ReservationDao;


@WebService(serviceName = "ReservationService")
public class ReservationService extends AbstractService {
	
	@WebMethod
	public void ajouter(String mailUsager, Integer idOuvrage) {
		ReservationDao reservationDao = getDaoFactory().getReservationDao();
		
		int nbReservations = reservationDao.enumererParOuvrage(idOuvrage);
		
		reservationDao.creer(nbReservations + 1, mailUsager, idOuvrage);
	}
	
	@WebMethod
	public void supprimer(Integer position, String mailUsager, Integer idOuvrage) {
		ReservationDao reservationDao = getDaoFactory().getReservationDao();
		
		List<Reservation> reservations = reservationDao.listerParOuvrageEtPositionSuperieur(position, idOuvrage);
		for (Reservation reservation : reservations) {
			reservation.setPosition(reservation.getPosition() -  1);
		}
		
		reservationDao.supprimer(mailUsager, idOuvrage);
	}

}
