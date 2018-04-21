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

import com.turbomaquinas.POJO.comercial.PagosDetalle;
import com.turbomaquinas.POJO.comercial.PagosDetalleVista;

@Repository
public class JDBCPagosDetalle implements PagosDetalleDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int crear(PagosDetalle pd) throws DataAccessException {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("importe");
		columnas.add("tipo_cambio");
		columnas.add("creado_por");
		columnas.add("FACTURA_FINAL_id");
		columnas.add("FACTURA_VARIOS_id");
		columnas.add("FACTURAS_ANTICIPO_id");
		columnas.add("PAGOS_id");

		insert.setTableName("PAGOS_DETALLE");
		insert.setColumnNames(columnas);
		Map<String, Object> datos = new HashMap<>();
		
		datos.put("importe", pd.getImporte());
		datos.put("tipo_cambio", pd.getTipo_cambio());
		datos.put("creado_por", pd.creado_por);
		datos.put("FACTURA_FINAL_id", pd.getFactura_final_id());
		datos.put("FACTURA_VARIOS_id", pd.getFactura_varios_id());
		datos.put("FACTURAS_ANTICIPO_id", pd.getFacturas_anticipo_id());
		datos.put("PAGOS_id", pd.getPagos_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public PagosDetalle actualizar(PagosDetalle pd) throws DataAccessException {
		
		jdbcTemplate.update("UPDATE PAGOS_DETALLE SET activo = ?, modificado_por = ?  WHERE id = ?",
				pd.getActivo(), pd.getModificado_por(), pd.getId());
		return pd;
	}

	@Override
	public PagosDetalleVista buscar(int id) throws DataAccessException {
		
		PagosDetalleVista pdb = jdbcTemplate.queryForObject("SELECT * FROM PAGOS_DETALLE_V WHERE id = ?", 
				new PagosDetalleVistaRM(), id);
		return pdb;
	}

	@Override
	public List<PagosDetalleVista> consultar() throws DataAccessException {
		
		List<PagosDetalleVista> pdl = jdbcTemplate.query("SELECT * FROM PAGOS_DETALLE_V ", new PagosDetalleVistaRM());
		return pdl;
	}

}
