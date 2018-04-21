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

import com.turbomaquinas.POJO.comercial.Convenio;

@Repository
public class JDBCConvenio implements ConvenioDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(Convenio convenio) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas= new ArrayList<>();
		columnas.add("comentarios");
		columnas.add("revision");
		columnas.add("sustituye_id");
		columnas.add("creado_por");
		columnas.add("ordenes_id");
		
		insert.setTableName("CONVENIOS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("comentarios", convenio.getComentarios());
		datos.put("revision", convenio.getRevision());
		datos.put("sustituye_id", convenio.getSustituye_id());
		datos.put("creado_por", convenio.getCreado_por());
		datos.put("ordenes_id", convenio.getOrdenes_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public void actualizar(Convenio convenio) throws DataAccessException{
		jdbcTemplate.update("UPDATE CONVENIOS SET comentarios=?, revision=?, sustituye_id=?, activo=?, "
				+ "modificado_por=?, ORDENES_id=? WHERE id=?", 
				convenio.getComentarios(), convenio.getRevision(), convenio.getSustituye_id(), 
				convenio.getActivo(), convenio.getModificado_por(), convenio.getOrdenes_id(), convenio.getId());
	}

	@Override
	public Convenio buscar(int id) throws DataAccessException{
		Convenio con = jdbcTemplate.queryForObject("SELECT * FROM CONVENIOS WHERE id=?", new ConvenioRM(), id);
		return con;
	}

	@Override
	public List<Convenio> consultar() throws DataAccessException{
		List<Convenio> con = jdbcTemplate.query("SELECT * FROM CONVENIOS", new ConvenioRM());
		return con;
	}

}
