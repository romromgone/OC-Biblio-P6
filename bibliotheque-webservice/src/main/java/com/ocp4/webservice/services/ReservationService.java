package com.ocp4.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ocp4.webservice.beans.Reservation;
import com.ocp4.webservice.dao.ReservationDao;


@WebService(serviceName = "ReservationService")
public class ReservationService extends AbstractService {
	
	@WebMethod
	public List<Reservation> listerTout() {	
		return getDaoFactory().getReservationDao().listerTout();
	}
	
	@WebMethod
	public List<Reservation> listerParUsager(String mailUsager) {
		return getDaoFactory().getReservationDao().listerParUsager(mailUsager);
	}
	
	@WebMethod
	public List<Reservation> listerPourChaqueOuvragePremierePosition() {
		return getDaoFactory().getReservationDao().listerPourChaqueOuvragePremierePosition();
	}
	
	@WebMethod
	public List<Reservation> listerDelaiDepasse() {
		return getDaoFactory().getReservationDao().listerDelaiDepasse();
	}
	
	@WebMethod
	public void ajouter(String mailUsager, Integer idOuvrage) {
		ReservationDao reservationDao = getDaoFactory().getReservationDao();
		
		int position = reservationDao.enumererParOuvrage(idOuvrage) + 1;
		
		reservationDao.creer(position, mailUsager, idOuvrage);
	}
	
	@WebMethod
	public void supprimer(Integer position, String mailUsager, Integer idOuvrage) {
		ReservationDao reservationDao = getDaoFactory().getReservationDao();
		
		List<Reservation> reservations = reservationDao.listerParOuvrageEtPositionSuperieur(position, idOuvrage);
		for (Reservation reservation : reservations) {
			int newPosition = reservation.getPosition() - 1;
			reservationDao.modifierPosition(newPosition, reservation.getMailUsager(), idOuvrage);
		}
		
		reservationDao.supprimer(mailUsager, idOuvrage);
	}
	
	@WebMethod
	public Integer enumererParOuvrage(Integer idOuvrage) {
		ReservationDao reservationDao = getDaoFactory().getReservationDao();
		
		return reservationDao.enumererParOuvrage(idOuvrage);
	}
	
	@WebMethod
	public void ajouterTSMailEnvoye(String mailUsager, Integer idOuvrage) {
		ReservationDao reservationDao = getDaoFactory().getReservationDao();
		
		reservationDao.ajouterTSMailEnvoye(mailUsager, idOuvrage);
	}

}
