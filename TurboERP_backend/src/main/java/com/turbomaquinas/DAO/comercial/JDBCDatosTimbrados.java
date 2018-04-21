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

import com.turbomaquinas.POJO.comercial.DatosTimbrados;

@Repository
public class JDBCDatosTimbrados implements DatosTimbradosDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int crear(DatosTimbrados dt) throws DataAccessException {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		
		columnas.add("folio_fiscal");
		columnas.add("fecha");
		columnas.add("cadena_original");
		columnas.add("sello_emisor");
		columnas.add("sello_sat");
		columnas.add("leyenda");
		columnas.add("creado_por");

		insert.setTableName("DATOS_TIMBRADO");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		
		datos.put("folio_fiscal", dt.getFolio_fiscal());
		datos.put("fecha", dt.getFecha());
		datos.put("cadena_original", dt.getCadena_original());
		datos.put("sello_emisor", dt.getSello_emisor());
		datos.put("sello_sat", dt.getSello_sat());
		datos.put("leyenda", dt.getLeyenda());
		datos.put("creado_por", dt.getCreado_por());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public DatosTimbrados actualizar(DatosTimbrados dt) throws DataAccessException {
		jdbcTemplate.update("UPDATE DATOS_TIMBRADO SET folio_fiscal = ?, fecha = ?, cadena_original = ?, "
				+ "sello_emisor = ?, sello_sat = ?, leyenda = ?, modificado_por = ? WHERE id = ?",
				dt.getFolio_fiscal(), dt.getFecha(), dt.getCadena_original(), dt.getSello_emisor(),
				dt.getSello_sat(), dt.getLeyenda(), dt.getModificado_por(), dt.getId());
		return dt;
	}

	@Override
	public DatosTimbrados buscar(int id) throws DataAccessException {
		DatosTimbrados dt = jdbcTemplate.queryForObject("SELECT * FROM DATOS_TIMBRADO WHERE id = ?", 
				new DatosTimbradosRM(), id);
		return dt;
	}

	@Override
	public List<DatosTimbrados> consultar() throws DataAccessException {
		List<DatosTimbrados> dtl = jdbcTemplate.query("SELECT * FROM DATOS_TIMBRADO", new DatosTimbradosRM());
		return dtl;
	}

}
