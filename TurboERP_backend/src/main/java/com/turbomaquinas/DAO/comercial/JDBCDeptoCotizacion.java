package com.turbomaquinas.DAO.comercial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.DeptoCotizacion;

@Repository
public class JDBCDeptoCotizacion implements DeptoCotizacionDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int crear(DeptoCotizacion dc) throws DataAccessException {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		
		columnas.add("creado_por");
		columnas.add("DETALLE_COTIZACIONES_id");
		columnas.add("DEPARTAMENTOS_id");
		
		insert.setTableName("DEPTOS_COTIZACIONES");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("creado_por", dc.getCreado_por());
		datos.put("DETALLE_COTIZACIONES_id", dc.getDetalle_cotizaciones_id());
		datos.put("DEPARTAMENTOS_id", dc.getDepartamentos_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		return id.intValue();
	}

	@Override
	public DeptoCotizacion actualizar(DeptoCotizacion dc) throws DataAccessException {
		jdbcTemplate.update("UPDATE DEPTOS_COTIZACIONES SET modificado_por = ?, "
				+ "DETALLE_COTIZACIONES_id = ?, DEPARTAMENTOS_id = ? WHERE id = ?", dc.getModificado_por(), 
				dc.getDetalle_cotizaciones_id(), dc.getDepartamentos_id(), dc.getId());
		return dc;
	}

	@Override
	public DeptoCotizacion buscar(int id) throws DataAccessException {
		DeptoCotizacion dc = jdbcTemplate.queryForObject("SELECT * FROM DEPTOS_COTIZACIONES WHERE id = ? ", 
				new DeptoCotizacionRM(), id);
		return dc;
	}

	@Override
	public List<DeptoCotizacion> consultar() throws DataAccessException {
		List<DeptoCotizacion> dcl = jdbcTemplate.query("SELECT * FROM DEPTOS_COTIZACIONES", new DeptoCotizacionRM());
		return dcl;
	}

}
