package com.turbomaquinas.DAO.general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.Ctasban;
import com.turbomaquinas.POJO.general.CtasbanVista;

@Repository
public class JDBCCtasBan implements CtasbanDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(Ctasban cb) throws DataAccessException {
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("numero");
		columnas.add("dolares");
		columnas.add("descripcion");
		columnas.add("creado_por");
		columnas.add("CATALOGO_CUENTAS_id");
		columnas.add("BANCOS_id");
		
		insert.setTableName("CUENTAS_BANCARIAS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		
		datos.put("numero",cb.getNumero());
		datos.put("dolares",cb.getDolares());
		datos.put("descripcion",cb.getDescripcion());
		datos.put("creado_por",cb.getCreado_por());
		datos.put("CATALOGO_CUENTAS_id",cb.getCatalogo_cuentas_id());
		datos.put("BANCOS_id",cb.getBancos_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
		
	}

	@Override
	public void actualizar(Ctasban cb) throws DataAccessException {
		jdbcTemplate.update("UPDATE CUENTAS_BANCARIAS set descripcion = ?, modificado_por = ?, "
				+ "CATALOGO_CUENTAS_id = ?, BANCOS_id = ? WHERE id = ?", cb.getDescripcion(), cb.getModificado_por(),
				cb.getCatalogo_cuentas_id(), cb.getBancos_id(), cb.getId());
	}

	@Override
	public CtasbanVista buscar(int id) throws DataAccessException {
		CtasbanVista cbv = jdbcTemplate.queryForObject("SELECT * FROM CUENTAS_BANCARIAS_V WHERE id = ?", 
				new CtasbanVistaRM(), id);
		return cbv;
	}

	@Override
	public List<CtasbanVista> consultar() throws DataAccessException {
		List<CtasbanVista> cbl = jdbcTemplate.query("SELECT * FROM CUENTAS_BANCARIAS_V", new CtasbanVistaRM());
		return cbl;
	}

	@Override
	public CtasbanVista buscarporNumero(String numero) throws DataAccessException {
		
		CtasbanVista cb = jdbcTemplate.queryForObject("SELECT * FROM CUENTAS_BANCARIAS_V WHERE numero = ?", 
				new CtasbanVistaRM(), numero);
		
		return cb;
	}

}
