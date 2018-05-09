package com.turbomaquinas.DAO.comercial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.NotaCredito;
import com.turbomaquinas.POJO.comercial.NotaCreditoVista;

@Repository
public class JDBCNotaCredito implements NotaCreditoDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(NotaCredito nc) throws DataAccessException {
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("numero");
		columnas.add("fecha");
		columnas.add("subtotal");
		columnas.add("iva");
		columnas.add("tipo_cambio");
		columnas.add("descripcion");
		columnas.add("creado_por");
		columnas.add("DATOS_TIMBRADO_id");
		columnas.add("CONCEPTOS_NOTAS_CREDITO_id");
		columnas.add("NOTAS_CREDITO_id_sust");
		
		insert.setTableName("NOTAS_CREDITO");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		
		datos.put("numero", nc.getNumero());
		datos.put("fecha", nc.getFecha());
		datos.put("subtotal", nc.getSubtotal());
		datos.put("iva", nc.getIva());
		datos.put("tipo_cambio", nc.getTipo_cambio());
		datos.put("descripcion", nc.getDescripcion());
		datos.put("creado_por", nc.getCreado_por());
		datos.put("DATOS_TIMBRADO_id", nc.getDatos_timbrado_id());
		datos.put("CONCEPTOS_NOTAS_CREDITO_id", nc.getConceptos_notas_credito_id());
		datos.put("NOTAS_CREDITO_id_sust", nc.getNotas_credito_id_sust());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public void actualizar(NotaCredito nc) throws DataAccessException {
		jdbcTemplate.update("UPDATE NOTAS_CREDITO set fecha_baja = ?, modificado_por = ?, "
				+ " DATOS_TIMBRADO_id = ?"
				+ "NOTAS_CREDITO_id_sust = ?  WHERE id = ?", nc.getFecha_baja(), nc.getModificado_por(),
				nc.getDatos_timbrado_id(), 
				nc.getNotas_credito_id_sust(), nc.getId());
	}

	@Override
	public NotaCredito buscar(int id) throws DataAccessException {
		NotaCredito nc = jdbcTemplate.queryForObject("SELECT * FROM NOTAS_CREDITO WHERE id = ?", 
				new NotaCreditoRM(), id);
		return nc;
	}

	@Override
	public List<NotaCreditoVista> consultar() throws DataAccessException {
		List<NotaCreditoVista> ncl = jdbcTemplate.query("SELECT * FROM NOTAS_CREDITO_V", new NotaCreditoVistaRM());
		return ncl;
	}

	@Override
	public int aplicarNotasCredito(String doc) {
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("APLICAR_NOTAS_CREDITO");
		
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("p_nota_credito_id", 0);
		inParamMap.put("doc", doc);
		SqlParameterSource in = new MapSqlParameterSource(inParamMap);
		
		Map<String, Object> simpleJdbcCallResult = simpleJdbcCall.execute(in);
		
		for (Entry<String, Object> entry : simpleJdbcCallResult.entrySet()) {
	        if (entry.getKey().compareTo("p_nota_credito_id") == 0) {
	            return (Integer) entry.getValue();
	        }
	    }		
		return 0;
	}

	
}
