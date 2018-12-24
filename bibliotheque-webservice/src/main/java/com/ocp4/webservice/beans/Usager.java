package com.ocp4.webservice.beans;


public class Usager {
	private String mail;
	private String mdp;
	private String nom;
	private String prenom;
	private String telephone;
	private Boolean optionRappel;
	
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public Boolean getOptionRappel() {
		return optionRappel;
	}
	public void setOptionRappel(Boolean optionRappel) {
		this.optionRappel = optionRappel;
	}
		
}
