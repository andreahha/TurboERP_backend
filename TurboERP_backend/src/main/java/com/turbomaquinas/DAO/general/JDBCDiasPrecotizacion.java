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

import com.turbomaquinas.POJO.general.DiasPrecotizacion;

@Repository
public class JDBCDiasPrecotizacion implements DiasPrecotizacionDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(DiasPrecotizacion dp) throws DataAccessException {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("dias");
		columnas.add("tipo");
		columnas.add("creado_por");
		columnas.add("PRECOTIZACIONES_id");
		
		insert.setTableName("DIAS_PRECOTIZACIONES");;
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("dias", dp.getDias());
		datos.put("tipo", dp.getTipo());
		datos.put("creado_por", dp.getCreado_por());
		datos.put("PRECOTIZACIONES_id", dp.getPrecotizaciones_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public DiasPrecotizacion actualizar(DiasPrecotizacion dp) throws DataAccessException {
		jdbcTemplate.update("UPDATE DIAS_PRECOTIZACIONES SET dias = ?, tipo=?, modificado_por = ?, "
				+ "PRECOTIZACIONES_id = ? WHERE id = ? ", dp.getDias(), dp.getTipo(), dp.getModificado_por(),
				dp.getPrecotizaciones_id(), dp.getId()); 
		return dp;
	}

	@Override
	public DiasPrecotizacion buscar(int id) throws DataAccessException {
		DiasPrecotizacion dpb = jdbcTemplate.queryForObject("SELECT * FROM DIAS_PRECOTIZACIONES WHERE id = ?",
				new DiasPrecotizacionRM(), id);
		return dpb;
	}

	@Override
	public List<DiasPrecotizacion> consultar() throws DataAccessException {
		List<DiasPrecotizacion> dpv = jdbcTemplate.query("SELECT * FROM DIAS_PRECOTIZACIONES ", 
				new DiasPrecotizacionRM());
		return dpv;
	}

	@Override
	public List<DiasPrecotizacion> buscarDiasPorPrecotizacion(int id) {
		List<DiasPrecotizacion> dipv = jdbcTemplate.query("SELECT * FROM DIAS_PRECOTIZACIONES "
				+ "WHERE PRECOTIZACIONES_id = ? ",new DiasPrecotizacionRM(), id);
		return dipv;
	}

	@Override
	public Integer sumarDias(int id) throws DataAccessException{
		Integer i = jdbcTemplate.queryForObject("SELECT COALESCE(SUM(dias), 0) FROM DIAS_PRECOTIZACIONES "
				+ "WHERE PRECOTIZACIONES_id = ? AND creado >= (SELECT MAX(creado) "
				+ "FROM DIAS_PRECOTIZACIONES WHERE PRECOTIZACIONES_id = ? AND tipo = 'S')", 
				Integer.class, id, id);
		return i;
	}

}
