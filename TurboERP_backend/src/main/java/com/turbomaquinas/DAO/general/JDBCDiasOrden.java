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

import com.turbomaquinas.POJO.general.DiasOrden;
import com.turbomaquinas.POJO.general.DiasOrdenVista;

@Repository
public class JDBCDiasOrden implements DiasOrdenDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(DiasOrden d) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("dias");
		columnas.add("tipo");
		columnas.add("creado_por");
		columnas.add("ORDENES_id");
		columnas.add("AREAS_id");
		
		insert.setTableName("DIAS_ORDENES");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("dias", d.getDias());
		datos.put("tipo", d.getTipo());
		datos.put("creado_por", d.getCreado_por());
		datos.put("ordenes_id", d.getOrdenes_id());
		datos.put("areas_id", d.getAreas_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public void actualizar(DiasOrden d) throws DataAccessException{
		jdbcTemplate.update("UPDATE DIAS_ORDENES SET dias=?, tipo=?, activo=?, modificado_por=?, ORDENES_id=?, AREAS_id=? WHERE id=?", 
				d.getDias(), d.getTipo(), d.getActivo(), d.getModificado_por(), d.getOrdenes_id(), d.getAreas_id(), d.getId());		
	}

	@Override
	public DiasOrdenVista buscar(int id) throws DataAccessException{
		DiasOrdenVista dv = jdbcTemplate.queryForObject("SELECT * FROM DIAS_ORDENES_V WHERE id=?", 
				new DiasOrdenVistaRM(), id);
		return dv;
	}

	@Override
	public List<DiasOrdenVista> consultar() throws DataAccessException{
		List<DiasOrdenVista> dv = jdbcTemplate.query("SELECT * FROM DIAS_ORDENES_V", 
				new DiasOrdenVistaRM());
		return dv;
	}

	@Override
	public List<DiasOrdenVista> buscarDiasPorOrden(int id) {
		List<DiasOrdenVista> diov = jdbcTemplate.query("SELECT * FROM DIAS_ORDENES_V "
				+ "WHERE ordenes_id = ? ",new DiasOrdenVistaRM(), id);
		return diov;
	}

	@Override
	public Integer sumarDias(int id) throws DataAccessException{
		Integer i = jdbcTemplate.queryForObject("SELECT COALESCE(SUM(dias), 0) FROM DIAS_ORDENES "
				+ "WHERE ORDENES_id = ? AND creado >= (SELECT MAX(creado) "
				+ "FROM DIAS_ORDENES WHERE ORDENES_id = ? AND tipo = 'S')", 
				Integer.class, id, id);
		return i;
	}

}
