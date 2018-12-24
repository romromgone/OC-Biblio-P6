package com.ocp4.webservice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Named;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ocp4.webservice.beans.Usager;


@Named
public class UsagerDaoImpl extends AbstractDaoImpl implements UsagerDao {
    private static final String SQL_SELECT_PAR_MAIL = "SELECT * FROM usager WHERE mail = ?";
    private static final String SQL_SELECT_PAR_OPTION_RAPPEL = "SELECT * FROM usager WHERE optionrappel = true";
	private static final String SQL_UPDATE_OPTION_RAPPEL = "UPDATE usager SET optionrappel = ? WHERE mail = ?";


    
    @Override
    public Usager trouver(String mail) {
        return trouver( SQL_SELECT_PAR_MAIL, mail );
    }
    
    @Override
    public List<Usager> listerParOptionRappel() {
    	return lister(SQL_SELECT_PAR_OPTION_RAPPEL);
    }
    
    @Override
    public void modifierOptionRappel(String mailUsager, Boolean optionRappel) {
    	JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		
		jdbcTemplate.update(SQL_UPDATE_OPTION_RAPPEL, optionRappel, mailUsager);		
    }
    
    
    private Usager trouver(String sql, Object... objets)  {
    	 JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());    

         Usager usager = jdbcTemplate.queryForObject(sql, objets, getRowMapper());

         return usager;
    }
    
    private List<Usager> lister(String sql, Object... objets)  {
    	JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

   	    List<Usager> usager = jdbcTemplate.query(sql, objets, getRowMapper());

        return usager;
    }
    
    private RowMapper<Usager> getRowMapper() { 	
    	RowMapper<Usager> usagerRowMapper = new RowMapper<Usager>() {
            public Usager mapRow(ResultSet rs, int rowNum) throws SQLException {
            	Usager usager = new Usager();
                usager.setMail(rs.getString("mail"));
                usager.setMdp(rs.getString("mdp"));
                usager.setNom(rs.getString("nomuser"));
                usager.setPrenom(rs.getString("prenomuser"));
                usager.setTelephone(rs.getString("telephone"));
                usager.setOptionRappel(rs.getBoolean("optionrappel"));
                return usager;
            }
        };	
        return usagerRowMapper;
    }

}
