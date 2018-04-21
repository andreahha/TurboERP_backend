package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.ModeloEquipo;

@Repository
public class JDBCModeloEquipo implements ModeloEquipoDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public ModeloEquipo buscar(int id) throws DataAccessException {
		ModeloEquipo me = jdbcTemplate.queryForObject("SELECT * FROM MODELOS_EQUIPOS WHERE ID = ?", 
				new ModeloEquipoRM(), id);
		return me;
	}

	@Override
	public List<ModeloEquipo> consultar() throws DataAccessException {
		List<ModeloEquipo> mlos = jdbcTemplate.query("SELECT * FROM MODELOS_EQUIPOS", 
				new ModeloEquipoRM());
		return mlos;
	}

	@Override
	public ModeloEquipo crear(ModeloEquipo md) throws DataAccessException {
		jdbcTemplate.update("INSERT INTO MODELOS_EQUIPOS(descripcion, creado_por) VALUE(?, ?)",
				md.getDescripcion(), md.getCreado_por());
		return md;
	}

	@Override
	public ModeloEquipo actualizar(ModeloEquipo md) throws DataAccessException {
		jdbcTemplate.update("UPDATE MODELOS_EQUIPOS SET descripcion = ?, modificado_por = ? "
				+ "WHERE id = ?", md.getDescripcion(), md.getModificado_por(), md.getId());
		return md;
	}
	

}
