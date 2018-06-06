package com.ocp4.webservice.dao;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class DaoFactory {
	@Inject
	private UsagerDao usagerDao;
	@Inject
	private OuvrageDao ouvrageDao;
	@Inject
	private EditionDao editionDao;
	@Inject
	private ExemplaireDao exemplaireDao;
	@Inject
	private EmpruntDao empruntDao;
    

    /* Méthodes de récupération de l'implémentation des différents DAO */
    public UsagerDao getUsagerDao() {
        return usagerDao;
    }
    public OuvrageDao getOuvrageDao() {
        return ouvrageDao;
    }
    public EditionDao getEditionDao() {
        return editionDao;
    } 
    public ExemplaireDao getExemplaireDao() {
        return exemplaireDao;
    }
    public EmpruntDao getEmpruntDao() {
        return empruntDao;
    }
    
}
