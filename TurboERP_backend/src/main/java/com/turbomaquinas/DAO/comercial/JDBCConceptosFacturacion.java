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

import com.turbomaquinas.POJO.comercial.ConceptosFacturacion;
import com.turbomaquinas.POJO.comercial.ConceptosFacturacionVista;

@Repository
public class JDBCConceptosFacturacion implements ConceptosFacturacionDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int crear(ConceptosFacturacion cf) throws DataAccessException {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("creado_por");
		columnas.add("PRODUCTOS_SAT_id");
		columnas.add("MEDIDAS_SAT_id");
		
		insert.setTableName("CONCEPTOS_FACTURACION");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", cf.getDescripcion());
		datos.put("creado_por", cf.getCreado_por());
		datos.put("PRODUCTOS_SAT_id", cf.getProductos_sat_id());
		datos.put("MEDIDAS_SAT_id", cf.medidas_sat_id);
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public ConceptosFacturacion actualizar(ConceptosFacturacion cf) throws DataAccessException {
		jdbcTemplate.update("UPDATE CONCEPTOS_FACTURACION SET descripcion = ?, modificado_por = ?, activo = ?,"
				+ " PRODUCTOS_SAT_id = ? , MEDIDAS_SAT_id = ? WHERE id = ?", cf.getDescripcion(), cf.getModificado_por(), cf.getActivo(),
				cf.getProductos_sat_id(), cf.getMedidas_sat_id(), cf.getId());
		return cf;
	}

	@Override
	public ConceptosFacturacionVista buscar(int id) throws DataAccessException {
		ConceptosFacturacionVista cfb = jdbcTemplate.queryForObject("SELECT * FROM CONCEPTOS_FACTURACION_V "
				+ " WHERE id= ?", new ConceptosFacturacionVistaRM(), id);
		return cfb;
	}

	@Override
	public List<ConceptosFacturacionVista> consultar() throws DataAccessException {
		List<ConceptosFacturacionVista> cfv = jdbcTemplate.query("SELECT * FROM CONCEPTOS_FACTURACION_V", 
				new ConceptosFacturacionVistaRM());
		return cfv;
	}

	@Override
	public void desactivar(int id, int modificado_por) throws DataAccessException{
		String sql = "UPDATE CONCEPTOS_FACTURACION SET activo=0, modificado_por=? WHERE id=?";
		jdbcTemplate.update(sql,modificado_por,id);
	}

}
