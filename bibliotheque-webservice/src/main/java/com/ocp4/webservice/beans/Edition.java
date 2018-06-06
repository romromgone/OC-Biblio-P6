package com.ocp4.webservice.beans;


public class Edition {
	private String isbn;
	private String editeur;
	private String anneeEdition;
	private String format;
	private Integer idOuvrage;
	
	private Ouvrage ouvrage;

	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public String getAnneeEdition() {
		return anneeEdition;
	}
	public void setAnneeEdition(String anneeEdition) {
		this.anneeEdition = anneeEdition;
	}

	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}

	public Integer getIdOuvrage() {
		return idOuvrage;
	}
	public void setIdOuvrage(Integer idOuvrage) {
		this.idOuvrage = idOuvrage;
	}

	
	public Ouvrage getOuvrage() {
		return ouvrage;
	}
	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}
		
}
