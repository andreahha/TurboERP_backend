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

import com.turbomaquinas.POJO.comercial.FacturaVariosDetalle;

@Repository
public class JDBCFacturaVariosDetalle implements FacturaVariosDetalleDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(FacturaVariosDetalle fvd) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		
		columnas.add("descripcion");
		columnas.add("importe");
		columnas.add("creado_por");
		columnas.add("productos_sat_id");
		columnas.add("factura_varios_id");
		
		insert.setTableName("FACTURA_VARIOS_DETALLE");
		insert.setColumnNames(columnas);
		Map<String, Object> datos = new HashMap<>();
		
		datos.put("descripcion", fvd.getDescripcion());
		datos.put("importe", fvd.getImporte());
		datos.put("creado_por", fvd.getCreado_por());
		datos.put("productos_sat_id", fvd.getProductos_sat_id());
		datos.put("factura_varios_id", fvd.getFactura_varios_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public FacturaVariosDetalle actualizar(FacturaVariosDetalle fvd) throws DataAccessException{
		jdbcTemplate.update("UPDATE FACTURA_VARIOS_DETALLE SET descripcion=?, importe=?, productos_sat_id=?,"
				+ "factura_varios_id WHERE id=?",
				fvd.getDescripcion(), fvd.getImporte(), fvd.getProductos_sat_id(), fvd.getFactura_varios_id(), fvd.getId());
		return fvd;
	}

	@Override
	public FacturaVariosDetalle buscar(int id) throws DataAccessException{
		FacturaVariosDetalle fd = jdbcTemplate.queryForObject("SELECT * FROM FACTURA_VARIOS_DETALLE WHERE id=?",
				new FacturaVariosDetalleRM(), id);
		return fd;
	}

	@Override
	public List<FacturaVariosDetalle> consultar() throws DataAccessException{
		List<FacturaVariosDetalle> fd = jdbcTemplate.query("SELECT * FROM FACTURA_VARIOS_DETALLE", new FacturaVariosDetalleRM());
		return fd;
	}
}
