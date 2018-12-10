package com.ocp4.webservice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.ocp4.webservice.beans.Reservation;


@Named
public class ReservationDaoImpl extends AbstractDaoImpl implements ReservationDao {
	@Inject
	private UsagerDao usagerDao;
	@Inject
	private OuvrageDao ouvrageDao;
	
	private static final String SQL_INSERT = "INSERT INTO reservation (position, tsmailenvoye, mail, idouvrage) VALUES (?, null, ?, ?)";
	private static final String SQL_DELETE = "DELETE FROM reservation WHERE mail = ? AND idouvrage = ?";
	private static final String SQL_COUNT_PAR_OUVRAGE = "SELECT COUNT(*) FROM reservation WHERE idouvrage = ?";
	private static final String SQL_SELECT_PAR_OUVRAGE_ET_POSITION_SUP_UN = "SELECT * FROM reservation WHERE idouvrage = ? AND position > 1";
	
	@Override
	public void creer(Integer position, String mailUsager, Integer idOuvrage) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		
		int row = jdbcTemplate.update(SQL_INSERT, position, mailUsager, idOuvrage);	
	}
	
	@Override
	public void supprimer(String mailUsager, Integer idOuvrage) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		
		int row = jdbcTemplate.update(SQL_DELETE, mailUsager, idOuvrage);	
	}
	
	@Override
	public Integer enumererParOuvrage(Integer idOuvrage) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		
		int nbReservations = jdbcTemplate.queryForObject(SQL_COUNT_PAR_OUVRAGE, new Object[] {idOuvrage}, Integer.class);
		
		return nbReservations;
	}
	
	@Override
	public List<Reservation> listerParOuvrageEtPositionSuperieurAUn(Integer idOuvrage) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

   	    List<Reservation> reservations = jdbcTemplate.query(SQL_SELECT_PAR_OUVRAGE_ET_POSITION_SUP_UN, new Object[] {idOuvrage}, getRowMapper());
   	    
   	    return reservations;
	}
	
	private RowMapper<Reservation> getRowMapper() { 	
    	RowMapper<Reservation> reservationRowMapper = new RowMapper<Reservation>() {
            public Reservation mapRow(ResultSet rs, int rowNum) throws SQLException {
            	Reservation reservation = new Reservation();
            	reservation.setPosition(rs.getInt("position"));
            	reservation.setTsMailEnvoye(rs.getTimestamp("tsmailenvoye"));
            	reservation.setMailUsager(rs.getString("mail"));
            	reservation.setIdOuvrage(rs.getInt("idouvrage")); 
            	reservation.setUsager(usagerDao.trouver(reservation.getMailUsager()));
            	reservation.setOuvrage(ouvrageDao.trouver(reservation.getIdOuvrage()));
                return reservation;
            }
        };	
        return reservationRowMapper;
    }

}
