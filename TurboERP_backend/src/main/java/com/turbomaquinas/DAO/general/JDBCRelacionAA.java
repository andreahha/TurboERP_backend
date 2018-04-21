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

import com.turbomaquinas.POJO.general.RelacionAA;

@Repository
public class JDBCRelacionAA implements RelacionAADAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(RelacionAA relacion) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("creado_por");
		columnas.add("actividades_autorizadas_id");
		columnas.add("detalle_cotizaciones_id");
		columnas.add("detalle_diagnostico_id");
		
		insert.setTableName("RELACION_ACTIVIDADES_AUTORIZADAS");;
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("creado_por", relacion.getCreado_por());
		datos.put("actividades_autorizadas_id", relacion.getActividades_autorizadas_id());
		datos.put("detalle_cotizaciones_id", relacion.getDetalle_cotizaciones_id());
		datos.put("detalle_diagnostico_id", relacion.getDetalle_diagnostico_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

}
