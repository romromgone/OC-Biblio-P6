package com.ocp4.webservice.beans;

import java.sql.Date;


public class Emprunt {
	private String dateDeb;
	private String dateFin;
	private Boolean prolonge;
	private Boolean rendu;
	private String mailUsager;
	private Integer idExemplaire;
	
	private Usager usager;
	private Exemplaire exemplaire;
	
	
	public String getDateDeb() {
		return dateDeb;
	}
	public void setDateDeb(String dateDeb) {
		this.dateDeb = dateDeb;
	}
	
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	
	public Boolean getProlonge() {
		return prolonge;
	}
	public void setProlonge(Boolean prolonge) {
		this.prolonge = prolonge;
	}
	
	public Boolean getRendu() {
		return rendu;
	}
	public void setRendu(Boolean rendu) {
		this.rendu = rendu;
	}
	
	public String getMailUsager() {
		return mailUsager;
	}
	public void setMailUsager(String mailUsager) {
		this.mailUsager = mailUsager;
	}
	
	public Integer getIdExemplaire() {
		return idExemplaire;
	}
	public void setIdExemplaire(Integer idExemplaire) {
		this.idExemplaire = idExemplaire;
	}
	
	
	public Usager getUsager() {
		return usager;
	}
	public void setUsager(Usager usager) {
		this.usager = usager;
	}
	
	public Exemplaire getExemplaire() {
		return exemplaire;
	}
	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}

}
