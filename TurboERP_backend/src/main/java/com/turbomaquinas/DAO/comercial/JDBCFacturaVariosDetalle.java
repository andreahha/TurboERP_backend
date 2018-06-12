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
import com.turbomaquinas.POJO.comercial.FacturaVariosDetalleVista;

@Repository
public class JDBCFacturaVariosDetalle implements FacturaVariosDetalleDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(FacturaVariosDetalle fvd) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		
		columnas.add("cantidad");
		columnas.add("descripcion");
		columnas.add("precio_unitario");
		columnas.add("cuota_iva");
		columnas.add("creado_por");
		columnas.add("conceptos_facturacion_id");
		columnas.add("factura_varios_id");
		
		insert.setTableName("FACTURA_VARIOS_DETALLE");
		insert.setColumnNames(columnas);
		Map<String, Object> datos = new HashMap<>();
		
		datos.put("cantidad", fvd.getCantidad());
		datos.put("descripcion", fvd.getDescripcion());
		datos.put("precio_unitario", fvd.getPrecio_unitario());
		datos.put("cuota_iva", fvd.getCuota_iva());
		datos.put("creado_por", fvd.getCreado_por());
		datos.put("conceptos_facturacion_id", fvd.getConceptos_facturacion_id());
		datos.put("factura_varios_id", fvd.getFactura_varios_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public void actualizar(FacturaVariosDetalle fvd) throws DataAccessException{
		jdbcTemplate.update("UPDATE FACTURA_VARIOS_DETALLE SET cantidad = ?, descripcion = ?, precio_unitario = ?, conceptos_facturacion_id = ?,"
				+ "factura_varios_id = ? WHERE id=?",
				fvd.getCantidad(), fvd.getDescripcion(), fvd.getPrecio_unitario(), fvd.getConceptos_facturacion_id(), fvd.getFactura_varios_id(), fvd.getId());
	}

	@Override
	public FacturaVariosDetalleVista buscar(int id) throws DataAccessException{
		FacturaVariosDetalleVista fdv = jdbcTemplate.queryForObject("SELECT * FROM FACTURA_VARIOS_DETALLE_V WHERE id=?",
				new FacturaVariosDetalleVistaRM(), id);
		return fdv;
	}

	@Override
	public List<FacturaVariosDetalleVista> consultar() throws DataAccessException{
		List<FacturaVariosDetalleVista> fdv = jdbcTemplate.query("SELECT * FROM FACTURA_VARIOS_DETALLE_V", new FacturaVariosDetalleVistaRM());
		return fdv;
	}

	@Override
	public List<FacturaVariosDetalleVista> consultarPorFacturaVarios(int id) {
		List<FacturaVariosDetalleVista> fdv = jdbcTemplate.query("SELECT * FROM FACTURA_VARIOS_DETALLE_V WHERE factura_varios_id = ?", new FacturaVariosDetalleVistaRM(), id);
		return fdv;
	}
}
