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

import com.turbomaquinas.POJO.general.Puesto;

@Repository
public class JDBCPuesto implements PuestoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Puesto> consultar() throws DataAccessException{
		List<Puesto> lp = jdbcTemplate.query("SELECT * FROM PUESTOS", new PuestoRM());
		return lp;
	}

	@Override
	public boolean esJefe(int id) throws DataAccessException{
		boolean jefe = jdbcTemplate.queryForObject("SELECT IF(nivel='J', TRUE, FALSE) FROM PUESTOS WHERE id = ?", Boolean.class, id);
		return jefe;
	}

	@Override
	public int crear(Puesto p) throws DataAccessException {

		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("clave");
		columnas.add("descripcion");
		columnas.add("nivel");
		columnas.add("creado_por");
		
		insert.setTableName("PUESTOS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		
		datos.put("clave",p.getClave());
		datos.put("descripcion", p.getDescripcion());
		datos.put("nivel", p.getNivel());
		datos.put("creado_por", p.getCreado_por());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public Puesto actualizar(Puesto p) throws DataAccessException {
		jdbcTemplate.update("UPDATE PUESTOS set clave = ?, descripcion = ?, nivel = ?, modificado_por = ? WHERE id = ?",
				p.getClave(), p.getDescripcion(), p.getNivel(), p.getModificado_por(), p.getId());
		return p;
	}

	@Override
	public Puesto buscar(int id) throws DataAccessException {
		Puesto pv = jdbcTemplate.queryForObject("SELECT * FROM PUESTOS WHERE id = ?",
				new PuestoRM(), id);
		return pv;
	}
}
