package com.ocp4.webservice.beans;

import java.sql.Timestamp;


public class Reservation {
	private Integer position;
	private Timestamp tsMailEnvoye;
	private String mailUsager;
	private Integer idOuvrage;
	
	private Usager usager;
	private Ouvrage ouvrage;
	
	
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	
	public Timestamp getTsMailEnvoye() {
		return tsMailEnvoye;
	}
	public void setTsMailEnvoye(Timestamp tsMailEnvoye) {
		this.tsMailEnvoye = tsMailEnvoye;
	}
	
	public String getMailUsager() {
		return mailUsager;
	}
	public void setMailUsager(String mailUsager) {
		this.mailUsager = mailUsager;
	}
	
	public Integer getIdOuvrage() {
		return idOuvrage;
	}
	public void setIdOuvrage(Integer idOuvrage) {
		this.idOuvrage = idOuvrage;
	}
	
	
	public Usager getUsager() {
		return usager;
	}
	public void setUsager(Usager usager) {
		this.usager = usager;
	}
	
	public Ouvrage getOuvrage() {
		return ouvrage;
	}
	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}
	
}

