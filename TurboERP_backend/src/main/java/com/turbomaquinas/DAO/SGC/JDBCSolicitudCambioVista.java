package com.turbomaquinas.DAO.SGC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.SGC.SolicitudCambioVista;

@Repository
public class JDBCSolicitudCambioVista implements SolicitudCambioVistaDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<SolicitudCambioVista> consultar() throws DataAccessException {
		List<SolicitudCambioVista> solicitudes = jdbcTemplate.query("SELECT * FROM SOLICITUDES_CAMBIO_V", new SolicitudCambioVistaRM());
		return solicitudes;
	}

	@Override
	public SolicitudCambioVista buscar(int id) throws DataAccessException {
			SolicitudCambioVista s = jdbcTemplate.queryForObject("SELECT * FROM SOLICITUDES_CAMBIO_V WHERE id = ?", new SolicitudCambioVistaRM(), id);
			return s;
	}

	@Override
	public List<SolicitudCambioVista> consultar(String claveDepto) throws DataAccessException {
		List<SolicitudCambioVista> solicitudes = jdbcTemplate.query("SELECT * FROM SOLICITUDES_CAMBIO_V WHERE clave = ?", new SolicitudCambioVistaRM(), claveDepto);
		return solicitudes;
	}

	@Override
	public List<SolicitudCambioVista> consultarporEstado(String estado, String rol) {
		String consulta = "SELECT * FROM SOLICITUDES_CAMBIO_V WHERE estado = ? ";
		if(estado.equals("P"))
			switch (rol) {
			case "GC":
				consulta = consulta + "AND tipo IN (1,2,3,4)";
				break;
			case "GG":
				consulta = consulta + "AND tipo IN (5,6,7,8,9)";
				break;	
			case "JE":
				consulta = consulta + "AND tipo IN (10,11,12,13,14)";
				break;
			case "RH":
				consulta = consulta + "AND tipo IN (15,16,17,18,19,20)";
				break;
			default:
				break;
			}
		else if(estado.equals("E"))
				switch (rol) {
				case "GG":
					consulta = consulta + "AND tipo IN (1,2,3,4,5,6,7,8,9,10,11,15,16)";
					break;	
				case "JE":
					consulta = consulta + "AND tipo IN (12,13,14)";
					break;
				case "RH":
					consulta = consulta + "AND tipo IN (17,18,19,20)";
					break;
				default:
					break;
				}
		else if(estado.equals("R"))
			switch (rol) {
			case "GC":
				consulta = consulta + "AND tipo IN (1,2,3,4,5,6,7,8,9)";
				break;	
			case "JE":
				consulta = consulta + "AND tipo IN (10,11,12,13,14)";
				break;
			case "RH":
				consulta = consulta + "AND tipo IN (15,16,17,18,19,20)";
				break;
			default:
				break;
			}

		List<SolicitudCambioVista> solicitudes = jdbcTemplate.query(consulta, new SolicitudCambioVistaRM(), estado);
		return solicitudes;
	}
}
