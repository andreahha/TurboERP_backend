package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.MarcaEquipo;

@Repository
public class JDBCMarcaEquipo implements MarcaEquipoDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public MarcaEquipo buscar(int id) throws DataAccessException {
		MarcaEquipo me = jdbcTemplate.queryForObject("SELECT * FROM MARCAS_EQUIPOS WHERE id = ?",
				new MarcaEquipoRM(), id);
		return me;
	}

	@Override
	public List<MarcaEquipo> consultar() throws DataAccessException {
		List<MarcaEquipo> mcas = jdbcTemplate.query("SELECT * FROM MARCAS_EQUIPOS", 
				new MarcaEquipoRM());
		return mcas;
	}

	@Override
	public MarcaEquipo crear(MarcaEquipo m) throws DataAccessException {
			jdbcTemplate.update("INSERT INTO MARCAS_EQUIPOS(descripcion, creado_por) VALUES(?, ?)",
					m.getDescripcion(), m.getCreado_por());
			return m;	}

	@Override
	public MarcaEquipo actualizar(MarcaEquipo m) throws DataAccessException {
		jdbcTemplate.update("UPDATE MARCAS_EQUIPOS set descripcion = ?, modificado_por = ? "
				+ "WHERE id = ?",m.getDescripcion(), m.getModificado_por(),m.getId());
		return m;	}

}
