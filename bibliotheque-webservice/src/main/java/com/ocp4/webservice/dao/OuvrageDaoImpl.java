package com.ocp4.webservice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Named;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ocp4.webservice.beans.Ouvrage;


@Named
public class OuvrageDaoImpl extends AbstractDaoImpl implements OuvrageDao {
	private static final String SQL_SELECT_PAR_ID = "SELECT * FROM ouvrage WHERE idouvrage = ?";
	private static final String SQL_SELECT = "SELECT * FROM ouvrage ORDER BY classification, auteur";
	private static final String SQL_SELECT_PAR_TITRE = "SELECT * FROM ouvrage WHERE titre = ? ORDER BY classification, auteur";
	private static final String SQL_SELECT_PAR_AUTEUR = "SELECT * FROM ouvrage WHERE auteur = ? ORDER BY titre";
	private static final String SQL_SELECT_PAR_TITRE_ET_AUTEUR = "SELECT * FROM ouvrage WHERE titre = ? AND auteur = ?";
	private static final String SQL_SELECT_PAR_CLASSIFICATION = "SELECT * FROM ouvrage WHERE classification = ? ORDER BY auteur, titre";
    
	
	@Override
    public Ouvrage trouver(Integer idOuvrage) {
        return trouver(SQL_SELECT_PAR_ID, idOuvrage);
    }
        
    @Override
    public List<Ouvrage> listerTout() {
    	JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
    	
        List<Ouvrage> ouvrages = jdbcTemplate.query(SQL_SELECT, getRowMapper());

        return ouvrages;	
    }
    
    @Override
    public List<Ouvrage> rechercherParTitre(String titre) {
        return rechercher(SQL_SELECT_PAR_TITRE, titre);
    }
    
    @Override
    public List<Ouvrage> rechercherParAuteur(String auteur) {
        return rechercher(SQL_SELECT_PAR_AUTEUR, auteur);
    }
    
    @Override
    public List<Ouvrage> rechercherParTitreEtAuteur(String titre, String auteur) {
        return rechercher(SQL_SELECT_PAR_TITRE_ET_AUTEUR, titre, auteur);
    }
    
    @Override
    public List<Ouvrage> rechercherParClassification(String classification) {
        return rechercher(SQL_SELECT_PAR_CLASSIFICATION, classification);
    }
    
    
    private Ouvrage trouver(String sql, Object... objets)  {
   	    JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

        Ouvrage ouvrage = jdbcTemplate.queryForObject(sql, objets, getRowMapper());

      
        return ouvrage;
    }
    
    private List<Ouvrage> rechercher(String sql, Object... objets)  {
    	JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

   	    List<Ouvrage> ouvrages = jdbcTemplate.query(sql, objets, getRowMapper());

        return ouvrages;
    }
     
    private RowMapper<Ouvrage> getRowMapper() { 	
    	RowMapper<Ouvrage> ouvrageRowMapper = new RowMapper<Ouvrage>() {
            public Ouvrage mapRow(ResultSet rs, int rowNum) throws SQLException {
           	    Ouvrage ouvrage = new Ouvrage();
           	    ouvrage.setId(rs.getInt("idouvrage"));
           	    ouvrage.setTitre(rs.getString("titre"));
           	    ouvrage.setAuteur(rs.getString("auteur"));
           	    ouvrage.setAnneeParution(rs.getString("anneeparution"));
           	    ouvrage.setClassification(rs.getString("classification"));
           	    ouvrage.setResume(rs.getString("resume"));
                return ouvrage;
            }
        };	
        return ouvrageRowMapper;
    }

}


