package com.ocp4.webservice.beans;


public class Exemplaire {
	private Integer id;
	private Boolean estDisponible;
	private String isbn;
	
	private Edition edition;	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getEstDisponible() {
		return estDisponible;
	}
	public void setEstDisponible(Boolean estDisponible) {
		this.estDisponible = estDisponible;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
	public Edition getEdition() {
		return edition;
	}
	public void setEdition(Edition edition) {
		this.edition = edition;
	}
	
}
