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

import com.turbomaquinas.POJO.comercial.ActividadesFA;

@Repository
public class JDBCActividadesFA implements ActividadesFADAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(ActividadesFA afa) throws DataAccessException {

		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		
		columnas.add("importe");
		columnas.add("creado_por");
		columnas.add("ACTIVIDADES_AUTORIZADAS_id");
		columnas.add("FACTURAS_ANTICIPO_id");
		
		insert.setTableName("ACTIVIDADES_FACTURA_ANTICIPO");
		insert.setColumnNames(columnas);

		Map<String, Object> datos = new HashMap<>();
		datos.put("importe", afa.getImporte());
		datos.put("creado_por", afa.getCreado_por());
		datos.put("ACTIVIDADES_AUTORIZADAS_id", afa.getActividades_autorizadas_id());
		datos.put("FACTURAS_ANTICIPO_id", afa.getFacturas_anticipo_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		return id.intValue();
	}

	@Override
	public ActividadesFA actualizar(ActividadesFA afa) throws DataAccessException {
		jdbcTemplate.update("UPDATE ACTIVIDADES_FACTURA_ANTICIPO SET importe = ?, modificado_por = ?, "
				+ "ACTIVIDADES_AUTORIZADAS_id = ?, FACTURAS_ANTICIPO_id = ? WHERE id = ? ", afa.getImporte(),
				afa.getModificado_por(), afa.getActividades_autorizadas_id(), afa.getFacturas_anticipo_id(),
				afa.getId());
		return afa;
	}

	@Override
	public ActividadesFA buscar(int id) throws DataAccessException {
		ActividadesFA afab = jdbcTemplate.queryForObject("SELECT * FROM ACTIVIDADES_FACTURA_ANTICIPO "
				+ "WHERE id = ?", new ActividadesFARM(), id);
		return afab;
	}

	@Override
	public List<ActividadesFA> consultar() throws DataAccessException {
		List<ActividadesFA> afal = jdbcTemplate.query("SELECT * FROM ACTIVIDADES_FACTURA_ANTICIPO", new ActividadesFARM());
		return afal;
	}

}
