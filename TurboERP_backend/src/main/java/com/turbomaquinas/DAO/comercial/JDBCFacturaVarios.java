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

import com.turbomaquinas.POJO.comercial.FacturaVarios;

@Repository
public class JDBCFacturaVarios implements FacturaVariosDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(FacturaVarios fv) throws DataAccessException {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		
		columnas.add("tipo");
		columnas.add("numero");
		columnas.add("fecha_factura");
		columnas.add("fecha_vencimiento");
		columnas.add("subtotal");
		columnas.add("descuento");
		columnas.add("iva");
		columnas.add("iva_retenido");
		columnas.add("moneda");
		columnas.add("tipo_cambio");
		columnas.add("condiciones_pago");
		columnas.add("observaciones");
		columnas.add("creado_por");
		columnas.add("FACTURA_VARIOS_id_sust");
		columnas.add("DATOS_TIMBRADO_id");
		columnas.add("FORMAS_PAGO_id");
		columnas.add("METODOS_PAGO_id");
		columnas.add("USO_CFDI_id");
		columnas.add("CLIENTES_id");

		insert.setTableName("FACTURA_VARIOS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("tipo", fv.getTipo());
		datos.put("numero", fv.getNumero());
		datos.put("fecha_factura", fv.getFecha_factura());
		datos.put("fecha_vencimiento", fv.getFecha_vencimiento());
		datos.put("subtotal", fv.getSubtotal());
		datos.put("descuento", fv.getDescuento());
		datos.put("iva", fv.getIva());
		datos.put("iva_retenido", fv.getIva_retenido());
		datos.put("moneda", fv.getMoneda());
		datos.put("tipo_cambio", fv.getTipo_cambio());
		datos.put("condiciones_pago", fv.getCondiciones_pago());
		datos.put("observaciones", fv.getObservaciones());
		datos.put("creado_por", fv.getCreado_por());
		datos.put("FACTURA_VARIOS_id_sust", fv.getFactura_varios_id_sust());
		datos.put("DATOS_TIMBRADO_id", fv.getDatos_timbrado_id());
		datos.put("FORMAS_PAGO_id", fv.getFormas_pago_id());
		datos.put("METODOS_PAGO_id", fv.getMetodos_pago_id());
		datos.put("USO_CFDI_id", fv.getUso_cfdi_id());
		datos.put("CLIENTES_id", fv.getClientes_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public FacturaVarios actualizar(FacturaVarios fv) throws DataAccessException {
		jdbcTemplate.update("UPDATE FACTURA_VARIOS SET fecha_baja = ?, mes_baja = ?, "
				+ " anio_baja = ?, activo = ?, modificado_por = ?, DATOS_TIMBRADO_id = ? WHERE id = ?",
				fv.getFecha_baja(), fv.getMes_baja(), fv.getAnio_baja(), fv.getActivo(),
				fv.getModificado_por(),	fv.getDatos_timbrado_id(), fv.getId());
		return fv;	
	}

	@Override
	public FacturaVarios buscar(int id) throws DataAccessException {
		FacturaVarios fvb = jdbcTemplate.queryForObject("SELECT * FROM FACTURA_VARIOS WHERE id = ?", 
				new FacturaVariosRM(), id);
		return fvb;	}

	@Override
	public List<FacturaVarios> consultar() throws DataAccessException {
		List<FacturaVarios> fvl = jdbcTemplate.query("SELECT * FROM FACTURA_VARIOS", new FacturaVariosRM());
		return fvl;	}

	@Override
	public void cancelar(FacturaVarios fv) throws DataAccessException{
		fv.setActivo(0);
		jdbcTemplate.update("UPDATE FACTURA_VARIOS SET fecha_baja = ?, mes_baja = ?, "
				+ " anio_baja = ?, activo = ?, modificado_por = ? WHERE id = ?",
				fv.getFecha_baja(), fv.getMes_baja(), fv.getAnio_baja(), fv.getActivo(),
				fv.getModificado_por(), fv.getId());
	}

	@Override
	public List<FacturaVarios> consultarFacturasVariosPendientesPorCliente(int id, String moneda) throws DataAccessException {
		String filtradoMoneda = "";		
	   	if(!moneda.equals("*")){
			filtradoMoneda = "and moneda = ?";
		}	   	
		String sql = "SELECT * "
				+ "FROM FACTURA_VARIOS fv "
				+ "WHERE saldo > 0 AND estado='T' AND CLIENTES_id=? "+filtradoMoneda;
		List<FacturaVarios> fv = null;
	    
	    if(moneda.equals("*")){
	    	 fv = jdbcTemplate.query(sql,new FacturaVariosRM(), id);
		}
	    else{
			fv = jdbcTemplate.query(sql,new FacturaVariosRM(), id, moneda);
	    }			
		return fv;
	}
	
}
