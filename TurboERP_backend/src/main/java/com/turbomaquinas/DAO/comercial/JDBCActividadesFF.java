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

import com.turbomaquinas.POJO.comercial.ActividadesFF;
import com.turbomaquinas.POJO.comercial.ActividadesFFVista;

@Repository
public class JDBCActividadesFF implements ActividadesFFDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int crear(ActividadesFF aff) throws DataAccessException {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		
		columnas.add("descripcion");
		columnas.add("importe");
		columnas.add("descuento");
		columnas.add("tipo_actividad");
		columnas.add("creado_por");
		columnas.add("FACTURA_FINAL_id");
		columnas.add("CONCEPTOS_FACTURACION_id");

		insert.setTableName("ACTIVIDADES_FACTURA_FINAL");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", aff.getDescripcion());
		datos.put("importe", aff.getImporte());
		datos.put("descuento", aff.getDescuento());
		datos.put("tipo_actividad", aff.getTipo_actividad());
		datos.put("creado_por", aff.getCreado_por());
		datos.put("FACTURA_FINAL_id", aff.getFactura_final_id());
		datos.put("CONCEPTOS_FACTURACION_id", aff.getConceptos_facturacion_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public ActividadesFF actualizar(ActividadesFF aff) throws DataAccessException {
		jdbcTemplate.update("UPDATE ACTIVIDADES_FACTURA_FINAL SET importe = ?, descuento = ?, "
				+ "modificado_por = ?, activo = ?, FACTURA_FINAL_id = ?, "
				+ "WHERE id = ? ", aff.getImporte(), aff.getDescuento(),
				aff.getModificado_por(), aff.getActivo(), aff.getFactura_final_id(),  
				aff.getId());
		return aff;
	}

	@Override
	public ActividadesFF buscar(int id) throws DataAccessException {
		ActividadesFF affb = jdbcTemplate.queryForObject("SELECT * FROM ACTIVIDADES_FACTURA_FINAL "
				+ "WHERE id = ? ", new ActividadesFFRM(), id);
		return affb;
	}

	@Override
	public List<ActividadesFF> consultar() throws DataAccessException {
		List<ActividadesFF> affl = jdbcTemplate.query("SELECT * FROM ACTIVIDADES_FACTURA_FINAL", 
				new ActividadesFFRM());
		return affl;
	}

	@Override
	public List<ActividadesFFVista> consultarPorFactura(int idFactura) {
		List<ActividadesFFVista> affv = jdbcTemplate.query("SELECT * FROM ACTIVIDADES_FACTURA_FINAL_V WHERE FACTURA_FINAL_id=? and activo=1",new ActividadesFFVistaRM(), idFactura);
		return affv;
	}
	

}
