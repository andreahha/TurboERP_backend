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

import com.turbomaquinas.POJO.comercial.FacturaAnticipo;

@Repository
public class JDBCFacturaAnticipo implements FacturaAnticipoDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int crear(FacturaAnticipo fa) throws DataAccessException {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();

		columnas.add("tipo");
		columnas.add("numero");
		columnas.add("fecha_anticipo");
		columnas.add("fecha_vencimiento");
		columnas.add("descripcion");
		columnas.add("subtotal");
		columnas.add("iva");
		columnas.add("iva_retenido");
		columnas.add("moneda");
		columnas.add("tipo_cambio");
		columnas.add("condiciones_pago");
		columnas.add("creado_por");
		columnas.add("FACTURAS_ANTICIPO_id_sust");
		columnas.add("DATOS_TIMBRADO_id");
		columnas.add("PRODUCTOS_SAT_id");
		columnas.add("FORMAS_PAGO_id");
		columnas.add("METODOS_PAGO_id");
		columnas.add("USO_CFDI_id");
		columnas.add("CLIENTES_id");
		
		insert.setTableName("FACTURAS_ANTICIPO");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("tipo", fa.getTipo());
		datos.put("numero", fa.getNumero());
		datos.put("fecha_anticipo", fa.getFecha_anticipo());
		datos.put("fecha_vencimiento", fa.getFecha_vencimiento());
		datos.put("descripcion", fa.getDescripcion());
		datos.put("subtotal", fa.getSubtotal());
		datos.put("iva", fa.getIva());
		datos.put("iva_retenido", fa.getIva_retenido());
		datos.put("moneda", fa.getMoneda());
		datos.put("tipo_cambio", fa.getTipo_cambio());
		datos.put("condiciones_pago", fa.getCondiciones_pago());
		datos.put("creado_por", fa.getCreado_por());
		datos.put("FACTURAS_ANTICIPO_id_sust", fa.getFacturas_anticipo_id_sust());
		datos.put("DATOS_TIMBRADO_id", fa.getDatos_timbrado_id());
		datos.put("PRODUCTOS_SAT_id", fa.getProductos_sat_id());
		datos.put("FORMAS_PAGO_id", fa.getFormas_pago_id());
		datos.put("METODOS_PAGO_id", fa.getMetodos_pago_id());
		datos.put("USO_CFDI_id", fa.getUso_cfdi_id());
		datos.put("CLIENTES_id", fa.getClientes_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public FacturaAnticipo actualizar(FacturaAnticipo fa) throws DataAccessException {
		jdbcTemplate.update("UPDATE FACTURAS_ANTICIPO SET fecha_baja = ?, mes_baja = ?, "
				+ " anio_baja = ?, activo = ?, modificado_por = ?, DATOS_TIMBRADO_id = ? WHERE id = ?",
				fa.getFecha_baja(), fa.getMes_baja(), fa.getAnio_baja(), fa.getActivo(),
				fa.getModificado_por(),	fa.getDatos_timbrado_id(), fa.getId());
		return fa;
	}

	@Override
	public FacturaAnticipo buscar(int id) throws DataAccessException {
		FacturaAnticipo fa = jdbcTemplate.queryForObject("SELECT * FROM FACTURAS_ANTICIPO WHERE Id = ?",
				new FacturaAnticipoRM(), id);
		return fa;
	}

	@Override
	public List<FacturaAnticipo> consultar() throws DataAccessException {
		List<FacturaAnticipo> fal = jdbcTemplate.query("SELECT * FROM FACTURAS_ANTICIPO", 
				new FacturaAnticipoRM());
		return fal;
	}

}
