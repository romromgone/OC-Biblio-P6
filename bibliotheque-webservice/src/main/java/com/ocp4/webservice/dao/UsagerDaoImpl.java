package com.ocp4.webservice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.inject.Named;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ocp4.webservice.beans.Usager;


@Named
public class UsagerDaoImpl extends AbstractDaoImpl implements UsagerDao {
    private static final String SQL_SELECT_PAR_MAIL = "SELECT * FROM usager WHERE mail = ?";

    
    @Override
    public Usager trouver(String mail) {
        return trouver( SQL_SELECT_PAR_MAIL, mail );
    }
    
    
    private Usager trouver(String sql, Object... objets)  {
    	 JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());    

         Usager usager = jdbcTemplate.queryForObject(sql, objets, getRowMapper());

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
                return usager;
            }
        };	
        return usagerRowMapper;
    }

}
