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

import com.turbomaquinas.POJO.comercial.ConceptosFacturacionContable;
import com.turbomaquinas.POJO.comercial.ConceptosFacturacionContableVista;

@Repository
public class JDBCConceptosFacturacionContable implements ConceptosFacturacionContableDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public ConceptosFacturacionContableVista buscar(int id) throws DataAccessException {
		ConceptosFacturacionContableVista cncv = jdbcTemplate.queryForObject("SELECT * FROM CONCEPTOS_FACTURACION_CONTABLE_V"
				+ " WHERE id= ?", new ConceptosFacturacionContableVistaRM(), id);
		return cncv;
	}
	
	@Override
	public List<ConceptosFacturacionContableVista> consultar() throws DataAccessException {
		List<ConceptosFacturacionContableVista> cncv = jdbcTemplate.query("SELECT * FROM CONCEPTOS_FACTURACION_CONTABLE_V WHERE activo = 1", 
				new ConceptosFacturacionContableVistaRM());
		return cncv;
	}

	@Override
	public int crear(ConceptosFacturacionContable cnc) throws DataAccessException  {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("creado_por");
		columnas.add("CATALOGO_CUENTAS_id_nac");
		columnas.add("CATALOGO_CUENTAS_id_ext");
		columnas.add("aplica_iva");
		columnas.add("tipo");
		
		insert.setTableName("CONCEPTOS_FACTURACION_CONTABLE");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", cnc.getDescripcion());
		datos.put("creado_por", cnc.getCreado_por());
		datos.put("CATALOGO_CUENTAS_id_nac", cnc.getCatalogo_cuentas_id_nac());
		datos.put("CATALOGO_CUENTAS_id_ext", cnc.getCatalogo_cuentas_id_ext());
		datos.put("aplica_iva", cnc.getAplica_iva());
		datos.put("tipo", cnc.getTipo());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		return id.intValue();

	}

	@Override
	public void desactivar(int id, int modificado_por) throws DataAccessException {
		String sql = "UPDATE CONCEPTOS_FACTURACION_CONTABLE SET activo=0, modificado_por=? WHERE id=?";
		jdbcTemplate.update(sql,modificado_por,id);
	}

	

}
