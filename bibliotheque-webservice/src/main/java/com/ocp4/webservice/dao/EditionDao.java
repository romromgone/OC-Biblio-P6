package com.ocp4.webservice.dao;

import java.util.List;

import com.ocp4.webservice.beans.Edition;


public interface EditionDao {
	Edition trouver(String isbn);
	List<Edition> listerParOuvrage(Integer idOuvrage);
}
