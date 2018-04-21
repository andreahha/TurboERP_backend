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

import com.turbomaquinas.POJO.comercial.Proyecto;

@Repository
public class JDBCProyecto implements ProyectoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(Proyecto proyecto) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas= new ArrayList<>();
		columnas.add("descripcion");
		columnas.add("monto");
		columnas.add("moneda");
		columnas.add("mes_estimado");
		columnas.add("año_estimado");
		columnas.add("status");
		columnas.add("probabilidad");
		columnas.add("comentario");
		columnas.add("creado_por");
		columnas.add("clientes_id");
		
		insert.setTableName("PROYECTOS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion", proyecto.getDescripcion());
		datos.put("monto", proyecto.getMonto());
		datos.put("moneda", proyecto.getMoneda());
		datos.put("mes_estimado", proyecto.getMes_estimado());
		datos.put("año_estimado", proyecto.getAño_estimado());
		datos.put("status", proyecto.getStatus());
		datos.put("probabilidad", proyecto.getProbabilidad());
		datos.put("comentario", proyecto.getComentario());
		datos.put("creado_por", proyecto.getCreado_por());
		datos.put("clientes_id", proyecto.getClientes_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public void actualizar(Proyecto proyecto) throws DataAccessException{
		jdbcTemplate.update("UPDATE PROYECTOS SET descripcion=?, monto=?, moneda=?, mes_estimado=?, año_estimado=?, status=?, "
				+ "fecha_baja=?, fecha_detenido=?, probabilidad=?, comentario=?, fecha_cierre=?, activo=?, modificado_por=?, "
				+ "CLIENTES_id=? WHERE id=?", 
				proyecto.getDescripcion(), proyecto.getMonto(), proyecto.getMoneda(), proyecto.getMes_estimado(), 
				proyecto.getAño_estimado(), proyecto.getStatus(), proyecto.getFecha_baja(), proyecto.getFecha_detenido(), 
				proyecto.getProbabilidad(), proyecto.getComentario(), proyecto.getFecha_cierre(), proyecto.getActivo(), 
				proyecto.getModificado_por(), proyecto.getClientes_id(), proyecto.getId());
	}

	@Override
	public Proyecto buscar(int id) throws DataAccessException{
		Proyecto pro = jdbcTemplate.queryForObject("SELECT * FROM PROYECTOS WHERE id=?", 
				new ProyectoRM(), id);
		return pro;
	}

	@Override
	public List<Proyecto> consultar() throws DataAccessException{
		List<Proyecto> pro = jdbcTemplate.query("SELECT * FROM PROYECTOS", new ProyectoRM());
		return pro;
	}

}
