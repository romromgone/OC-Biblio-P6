package com.ocp4.webservice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
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
	
	private static final String SQL_SELECT_ALL = "SELECT * FROM reservation";
	private static final String SQL_SELECT_PAR_USAGER = "SELECT * FROM reservation WHERE mail = ?";
	private static final String SQL_SELECT_PAR_OUVRAGE_ET_POSITION_SUP = "SELECT * FROM reservation WHERE idouvrage = ? AND position > ?";
	private static final String SQL_SELECT_POUR_CHAQUE_OUVRAGE_PREMIERE_POSITION = "SELECT * FROM reservation where position = 1";
	private static final String SQL_SELECT_DELAI_DEPASSE = "SELECT * FROM reservation WHERE tsmailenvoye + INTERVAL '48 hours' < NOW()::timestamp";
	private static final String SQL_INSERT = "INSERT INTO reservation (position, tsmailenvoye, mail, idouvrage) VALUES (?, null, ?, ?)";
	private static final String SQL_DELETE = "DELETE FROM reservation WHERE mail = ? AND idouvrage = ?";
	private static final String SQL_COUNT_PAR_OUVRAGE = "SELECT COUNT(*) FROM reservation WHERE idouvrage = ?";
	private static final String SQL_UPDATE_POSITION = "UPDATE reservation SET position = ? WHERE mail = ? AND idouvrage = ?";
	private static final String SQL_UPDATE_TSMAILENVOYE = "UPDATE reservation SET tsmailenvoye = ? WHERE mail = ? AND idouvrage = ?";

	
	@Override
    public List<Reservation> listerTout() {
    	JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
    	
        List<Reservation> reservations = jdbcTemplate.query(SQL_SELECT_ALL, getRowMapper());

        return reservations;	
    }
	
	@Override
	public List<Reservation> listerParUsager(String mailUsager) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
    	
        List<Reservation> reservations = jdbcTemplate.query(SQL_SELECT_PAR_USAGER, new Object[] {mailUsager}, getRowMapper());

        return reservations;
	}
	
	@Override
	public List<Reservation> listerParOuvrageEtPositionSuperieur(Integer position, Integer idOuvrage) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

   	    List<Reservation> reservations = jdbcTemplate.query(SQL_SELECT_PAR_OUVRAGE_ET_POSITION_SUP, new Object[] {idOuvrage, position}, getRowMapper());
   	    
   	    return reservations;
	}
	
	@Override
	public List<Reservation> listerPourChaqueOuvragePremierePosition() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

   	    List<Reservation> reservations = jdbcTemplate.query(SQL_SELECT_POUR_CHAQUE_OUVRAGE_PREMIERE_POSITION, getRowMapper());
   	    
   	    return reservations;
	}
	
	@Override
	public List<Reservation> listerDelaiDepasse() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());

   	    List<Reservation> reservations = jdbcTemplate.query(SQL_SELECT_DELAI_DEPASSE, getRowMapper());
   	    
   	    return reservations;
	}
	
	@Override
	public void creer(Integer position, String mailUsager, Integer idOuvrage) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		
		jdbcTemplate.update(SQL_INSERT, position, mailUsager, idOuvrage);	
	}
	
	@Override
	public void supprimer(String mailUsager, Integer idOuvrage) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		
		jdbcTemplate.update(SQL_DELETE, mailUsager, idOuvrage);	
	}
	
	@Override
	public Integer enumererParOuvrage(Integer idOuvrage) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		
		int nbReservations = jdbcTemplate.queryForObject(SQL_COUNT_PAR_OUVRAGE, new Object[] {idOuvrage}, Integer.class);
		
		return nbReservations;
	}
	
	@Override
	public void modifierPosition(Integer position, String mailUsager, Integer idOuvrage) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		
		jdbcTemplate.update(SQL_UPDATE_POSITION, position, mailUsager, idOuvrage);			
	}
	
	@Override
	public void ajouterTSMailEnvoye(String mailUsager, Integer idOuvrage) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		Date date = new Date();
		
		jdbcTemplate.update(SQL_UPDATE_TSMAILENVOYE, new Timestamp(date.getTime()), mailUsager, idOuvrage);	
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
