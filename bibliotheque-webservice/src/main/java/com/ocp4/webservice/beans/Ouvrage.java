package com.ocp4.webservice.beans;


public class Ouvrage {
	private Integer id;
	private String titre;
	private String auteur;
	private String anneeParution;
	private String classification;
	private String resume;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public String getAnneeParution() {
		return anneeParution;
	}
	public void setAnneeParution(String anneeParution) {
		this.anneeParution = anneeParution;
	}
	
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	
}
