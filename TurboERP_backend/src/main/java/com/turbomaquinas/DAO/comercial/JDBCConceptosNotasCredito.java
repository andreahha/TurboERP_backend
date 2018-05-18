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

import com.turbomaquinas.POJO.comercial.ConceptosNotasCredito;
import com.turbomaquinas.POJO.comercial.ConceptosNotasCreditoVista;

@Repository
public class JDBCConceptosNotasCredito implements ConceptosNotasCreditoDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public ConceptosNotasCreditoVista buscar(int id) throws DataAccessException {
		ConceptosNotasCreditoVista cncv = jdbcTemplate.queryForObject("SELECT * FROM CONCEPTOS_NOTAS_CREDITO_V"
				+ " WHERE id= ?", new ConceptosNotasCreditoVistaRM(), id);
		return cncv;
	}
	
	@Override
	public List<ConceptosNotasCreditoVista> consultar() throws DataAccessException {
		List<ConceptosNotasCreditoVista> cncv = jdbcTemplate.query("SELECT * FROM CONCEPTOS_NOTAS_CREDITO_V WHERE activo = 1", 
				new ConceptosNotasCreditoVistaRM());
		return cncv;
	}

	@Override
	public int crear(ConceptosNotasCredito cnc) throws DataAccessException  {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("creado_por");
		columnas.add("CATALOGO_CUENTAS_id_nac");
		columnas.add("CATALOGO_CUENTAS_id_ext");
		columnas.add("aplica_iva");
		
		insert.setTableName("CONCEPTOS_NOTAS_CREDITO");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", cnc.getDescripcion());
		datos.put("creado_por", cnc.getCreado_por());
		datos.put("CATALOGO_CUENTAS_id_nac", cnc.getCatalogo_cuentas_id_nac());
		datos.put("CATALOGO_CUENTAS_id_ext", cnc.getCatalogo_cuentas_id_ext());
		datos.put("aplica_iva", cnc.getAplica_iva());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		return id.intValue();

	}

	

}
