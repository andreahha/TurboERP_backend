package com.turbomaquinas.DAO.diagnostico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.diagnostico.DetalleRemisionEmbarqueVista;

@Repository
public class JDBCDetalleEmbarque implements DetalleEmbarqueDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<DetalleRemisionEmbarqueVista> detallesPorRemision(int id) throws DataAccessException{
		List<DetalleRemisionEmbarqueVista> rev = jdbcTemplate.query("select * from DETALLE_EMBARQUE_V where REMISIONES_EMBARQUE_id=?", 
				new DetalleEmbarqueVistaRM(), id);
		return rev;
	}

}
