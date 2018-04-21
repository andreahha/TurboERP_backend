package com.turbomaquinas.DAO.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.MedidaEquipo;

@Repository
public class JDBCMedidaEquipo implements MedidaEquipoDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public MedidaEquipo buscar(int id) throws DataAccessException {
		MedidaEquipo md = jdbcTemplate.queryForObject("SELECT * FROM MEDIDAS_EQUIPOS WHERE id = ?",
				new MedidaEquipoRM(), id);
		return md;
	}

	@Override
	public List<MedidaEquipo> consultar() throws DataAccessException {
		List<MedidaEquipo> mdas = jdbcTemplate.query("SELECT * FROM MEDIDAS_EQUIPOS", 
				new MedidaEquipoRM());
		return mdas;
	}

	@Override
	public int crear(MedidaEquipo me) throws DataAccessException {
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("creado_por");

		insert.setTableName("MEDIDAS_EQUIPOS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", me.getDescripcion());
		datos.put("creado_por", me.getCreado_por());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public MedidaEquipo actualizar(MedidaEquipo me) throws DataAccessException {
		jdbcTemplate.update("UPDATE MEDIDAS_EQUIPOS set descripcion = ?, modificado_por = ? "
				+ "WHERE id = ?",me.getDescripcion(), me.getModificado_por(), me.getId());
		return me;
	}

}
