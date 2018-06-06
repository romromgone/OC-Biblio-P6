package com.ocp4.webservice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.ocp4.webservice.beans.Exemplaire;


@Named
public class ExemplaireDaoImpl extends AbstractDaoImpl implements ExemplaireDao {
	@Inject
	private EditionDao editionDao;
	
	private static final String SQL_SELECT_PAR_ID = "SELECT * FROM exemplaire WHERE idexemplaire = ?";
	private static final String SQL_SELECT_PAR_EDITION = "SELECT * FROM exemplaire WHERE isbn = ?";
    
	
	@Override
    public Exemplaire trouver(Integer idExemplaire) {
        return trouver(SQL_SELECT_PAR_ID, idExemplaire);
    }
        

    @Override
    public List<Exemplaire> listerParEdition(String isbn) {
        return lister(SQL_SELECT_PAR_EDITION, isbn);
    }
    
    
    private Exemplaire trouver(String sql, Object... objets)  {
   	    JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

   	    Exemplaire edition = jdbcTemplate.queryForObject(sql, objets, getRowMapper());
    
        return edition;
    }
    
    private List<Exemplaire> lister(String sql, Object... objets)  {
    	JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

   	    List<Exemplaire> editions = jdbcTemplate.query(sql, objets, getRowMapper());

        return editions;
    }
     
    private RowMapper<Exemplaire> getRowMapper() { 	
    	RowMapper<Exemplaire> exemplaireRowMapper = new RowMapper<Exemplaire>() {
            public Exemplaire mapRow(ResultSet rs, int rowNum) throws SQLException {
            	Exemplaire exemplaire = new Exemplaire();
            	exemplaire.setId(rs.getInt("idexemplaire"));
            	exemplaire.setIsbn(rs.getString("isbn"));
            	exemplaire.setEdition(editionDao.trouver(exemplaire.getIsbn())); 	
                return exemplaire;
            }
        };	
        return exemplaireRowMapper;
    }
}
