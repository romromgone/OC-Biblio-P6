package com.ocp4.webservice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ocp4.webservice.beans.Emprunt;


@Named
public class EmpruntDaoImpl extends AbstractDaoImpl implements EmpruntDao {
	@Inject
	private UsagerDao usagerDao;
	@Inject
	private ExemplaireDao exemplaireDao;
	
	private static final String SQL_SELECT_PAR_ID = "SELECT * FROM emprunt WHERE mail = ? AND idexemplaire = ? AND datedeb = ?";
	private static final String SQL_UPDATE_PROLONGER = "UPDATE emprunt SET (datefin, prolonge) = (datefin + 28, true) WHERE mail = ? AND idexemplaire = ? AND datedeb = ?";
	private static final String SQL_SELECT_NON_RENDU = "SELECT * FROM emprunt WHERE rendu = false AND datefin < DATE(NOW())";
	private static final String SQL_SELECT_EN_COURS_PAR_USAGER = "SELECT * FROM emprunt WHERE mail = ? AND datefin >= DATE(NOW())";
	private static final String SQL_SELECT_NON_RENDU_PAR_USAGER = "SELECT * FROM emprunt WHERE mail = ? AND rendu = false AND datefin < DATE(NOW())";
	private static final String SQL_SELECT_EN_COURS_PAR_EXEMPLAIRE = "SELECT * FROM emprunt WHERE idexemplaire = ? AND datefin >= DATE(NOW())";
	private static final String SQL_SELECT_NON_RENDU_PAR_EXEMPLAIRE = "SELECT * FROM emprunt WHERE idexemplaire = ? AND rendu = false AND datefin < DATE(NOW())";
	
    
	
	@Override
    public Emprunt trouver(String mail, Integer idExemplaire, String dateDeb) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date dateD = df.parse(dateDeb);
		java.sql.Date sqlDate = new java.sql.Date(dateD.getTime()); 
        return trouver(SQL_SELECT_PAR_ID, mail, idExemplaire, sqlDate);
    }
	
	@Override    
	public Integer prolonger(String mail, Integer idExemplaire, String dateDeb) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date dateD = df.parse(dateDeb);
		java.sql.Date sqlDate = new java.sql.Date(dateD.getTime()); 
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		
		int nbLignesMaj = jdbcTemplate.update(SQL_UPDATE_PROLONGER, mail, idExemplaire, sqlDate);
		return nbLignesMaj;
	}
		
    @Override
    public List<Emprunt> listerNonRendus() {
        return lister(SQL_SELECT_NON_RENDU);
    }
    
    @Override
    public List<Emprunt> listerEnCoursParUsager(String mail) {
        return lister(SQL_SELECT_EN_COURS_PAR_USAGER, mail);
    }
    
    @Override
    public List<Emprunt> listerNonRendusParUsager(String mail) {
        return lister(SQL_SELECT_NON_RENDU_PAR_USAGER, mail);
    }
    
    @Override
    public List<Emprunt> listerEnCoursParExemplaire(Integer idExemplaire) {
    	return lister(SQL_SELECT_EN_COURS_PAR_EXEMPLAIRE, idExemplaire);
    }
    
    @Override
    public List<Emprunt> listerNonRendusParExemplaire(Integer idExemplaire) {
    	return lister(SQL_SELECT_NON_RENDU_PAR_EXEMPLAIRE, idExemplaire);
    }
    
    
    private Emprunt trouver(String sql, Object... objets)  {
   	    JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

   	    Emprunt edition = jdbcTemplate.queryForObject(sql, objets, getRowMapper());
    
        return edition;
    }
    
    private List<Emprunt> lister(String sql, Object... objets)  {
    	JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

   	    List<Emprunt> editions = jdbcTemplate.query(sql, objets, getRowMapper());

        return editions;
    }
     
    private RowMapper<Emprunt> getRowMapper() { 	
    	RowMapper<Emprunt> empruntRowMapper = new RowMapper<Emprunt>() {
            public Emprunt mapRow(ResultSet rs, int rowNum) throws SQLException {
            	if (rs.next() == false) {
            		return null;
            	} else {
            		do {
	        			Emprunt emprunt = new Emprunt();
	                	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	                  	emprunt.setDateDeb(df.format(rs.getDate("datedeb")));
	                	emprunt.setDateFin(df.format(rs.getDate("datefin")));
	                	emprunt.setProlonge(rs.getBoolean("prolonge"));
	                	emprunt.setRendu(rs.getBoolean("rendu"));
	                	emprunt.setMailUsager(rs.getString("mail"));
	                	emprunt.setIdExemplaire(rs.getInt("idexemplaire")); 
	                	emprunt.setUsager(usagerDao.trouver(emprunt.getMailUsager()));
	                	emprunt.setExemplaire(exemplaireDao.trouver(emprunt.getIdExemplaire()));
	                    return emprunt;
            		} while(rs.next());
            	}
            	
            }
        };	
        return empruntRowMapper;
    }

}
