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

import com.turbomaquinas.POJO.comercial.OportunidadTrabajo;

@Repository
public class JDBCOportunidadTrabajo implements OportunidadTrabajoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(OportunidadTrabajo o) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas= new ArrayList<>();
		columnas.add("anio");
		columnas.add("fecha_posible");
		columnas.add("descripcion");
		columnas.add("comentario");
		columnas.add("probabilidad");
		columnas.add("monto");
		columnas.add("moneda");
		columnas.add("creado_por");
		columnas.add("clientes_id");
		columnas.add("contactos_id");
		
		insert.setTableName("OPORTUNIDADES_TRABAJO");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("anio", o.getAnio());
		datos.put("fecha_posible", o.getFecha_posible());
		datos.put("descripcion", o.getDescripcion());
		datos.put("comentario", o.getComentario());
		datos.put("probabilidad", o.getProbabilidad());
		datos.put("monto", o.getMonto());
		datos.put("moneda", o.getMoneda());
		datos.put("creado_por", o.getCreado_por());
		datos.put("clientes_id", o.getClientes_id());
		datos.put("contactos_id", o.getContactos_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public void actualizar(OportunidadTrabajo o) throws DataAccessException{
		jdbcTemplate.update("UPDATE OPORTUNIDADES_TRABAJO SET anio=?, fecha_posible=?, descripcion=?, comentario=?, probabilidad=?, "
				+ "monto=?, moneda=?, usuario_cierre=?, fecha_cierre=?, activo=?, modificado_por=?, CLIENTES_id=?, CONTACTOS_id=? "
				+ "WHERE id=?", 
				o.getAnio(), o.getFecha_posible(), o.getDescripcion(), o.getComentario(), o.getProbabilidad(), o.getMonto(), 
				o.getMoneda(), o.getUsuario_cierre(), o.getFecha_cierre(), o.getActivo(), o.getModificado_por(), o.getClientes_id(), 
				o.getContactos_id(), o.getId());
	}

	@Override
	public OportunidadTrabajo buscar(int id) throws DataAccessException{
		OportunidadTrabajo o = jdbcTemplate.queryForObject("SELECT * FROM OPORTUNIDADES_TRABAJO WHERE id=?", 
				new OportunidadTrabajoRM(), id);
		return o;
	}

	@Override
	public List<OportunidadTrabajo> consultar() throws DataAccessException{
		List<OportunidadTrabajo> o = jdbcTemplate.query("SELECT * FROM OPORTUNIDADES_TRABAJO", 
				new OportunidadTrabajoRM());
		return o;
	}

}
