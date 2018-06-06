package com.ocp4.webservice.dao;

import com.ocp4.webservice.beans.Usager;


public interface UsagerDao {
	Usager trouver(String mail);
}
