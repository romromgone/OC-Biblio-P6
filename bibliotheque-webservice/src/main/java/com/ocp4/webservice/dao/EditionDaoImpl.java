package com.ocp4.webservice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ocp4.webservice.beans.Edition;


@Named
public class EditionDaoImpl extends AbstractDaoImpl implements EditionDao {
	@Inject
	private OuvrageDao ouvrageDao;
	
	private static final String SQL_SELECT_PAR_ID = "SELECT * FROM edition WHERE isbn = ?";
	private static final String SQL_SELECT_PAR_OUVRAGE = "SELECT * FROM edition WHERE idouvrage = ? ORDER BY editeur";
    
	
	@Override
    public Edition trouver(String isbn) {
        return trouver(SQL_SELECT_PAR_ID, isbn);
    }
        
    @Override
    public List<Edition> listerParOuvrage(Integer idOuvrage) {
        return lister(SQL_SELECT_PAR_OUVRAGE, idOuvrage);
    }
    
    
    private Edition trouver(String sql, Object... objets)  {
   	    JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

   	    Edition edition = jdbcTemplate.queryForObject(sql, objets, getRowMapper());
    
        return edition;
    }
    
    private List<Edition> lister(String sql, Object... objets)  {
    	JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

   	    List<Edition> editions = jdbcTemplate.query(sql, objets, getRowMapper());

        return editions;
    }
     
    private RowMapper<Edition> getRowMapper() { 	
    	RowMapper<Edition> editionRowMapper = new RowMapper<Edition>() {
            public Edition mapRow(ResultSet rs, int rowNum) throws SQLException {
            	Edition edition = new Edition();
            	edition.setIsbn(rs.getString("isbn"));
            	edition.setEditeur(rs.getString("editeur"));
            	edition.setAnneeEdition(rs.getString("anneeedition"));
            	edition.setFormat(rs.getString("format"));
            	edition.setIdOuvrage(rs.getInt("idouvrage"));
            	edition.setOuvrage(ouvrageDao.trouver(edition.getIdOuvrage()));
                return edition;
            }
        };	
        return editionRowMapper;
    }

}
