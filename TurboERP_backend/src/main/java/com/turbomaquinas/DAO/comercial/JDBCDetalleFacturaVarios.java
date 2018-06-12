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

import com.turbomaquinas.POJO.comercial.DetalleFacturaVarios;
import com.turbomaquinas.POJO.comercial.DetalleFacturaVariosVista;

@Repository
public class JDBCDetalleFacturaVarios implements DetalleFacturaVariosDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(DetalleFacturaVarios fvd) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		
		columnas.add("cantidad");
		columnas.add("descripcion");
		columnas.add("precio_unitario");
		columnas.add("cuota_iva");
		columnas.add("creado_por");
		columnas.add("conceptos_facturacion_id");
		columnas.add("factura_varios_id");
		
		insert.setTableName("DETALLE_FACTURA_VARIOS");
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
	public void actualizar(DetalleFacturaVarios fvd) throws DataAccessException{
		jdbcTemplate.update("UPDATE DETALLE_FACTURA_VARIOS SET cantidad = ?, descripcion = ?, precio_unitario = ?, conceptos_facturacion_id = ?,"
				+ "factura_varios_id = ? WHERE id=?",
				fvd.getCantidad(), fvd.getDescripcion(), fvd.getPrecio_unitario(), fvd.getConceptos_facturacion_id(), fvd.getFactura_varios_id(), fvd.getId());
	}

	@Override
	public DetalleFacturaVariosVista buscar(int id) throws DataAccessException{
		DetalleFacturaVariosVista fdv = jdbcTemplate.queryForObject("SELECT * FROM DETALLE_FACTURA_VARIOS_V WHERE id=?",
				new DetalleFacturaVariosVistaRM(), id);
		return fdv;
	}

	@Override
	public List<DetalleFacturaVariosVista> consultar() throws DataAccessException{
		List<DetalleFacturaVariosVista> fdv = jdbcTemplate.query("SELECT * FROM DETALLE_FACTURA_VARIOS_V", new DetalleFacturaVariosVistaRM());
		return fdv;
	}

	@Override
	public List<DetalleFacturaVariosVista> consultarPorFacturaVarios(int id) {
		List<DetalleFacturaVariosVista> fdv = jdbcTemplate.query("SELECT * FROM DETALLE_FACTURA_VARIOS_V WHERE factura_varios_id = ?", new DetalleFacturaVariosVistaRM(), id);
		return fdv;
	}
}
