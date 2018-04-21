package com.turbomaquinas.DAO.servexternos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.servexternos.SolicitudServExterno;

@Repository
public class JDBCSolicitudServExterno implements SolicitudServExternoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(SolicitudServExterno sol) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("anio");
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
		
		insert.setTableName("SOLICITUD_SERVICIO_EXTERNO");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("anio", sol.getAnio());
		datos.put("descripcion", sol.getDescripcion());
		datos.put("monto", sol.getMonto());
		datos.put("moneda", sol.getMoneda());
		datos.put("mes_estimado", sol.getMes_estimado());
		datos.put("año_estimado", sol.getAño_estimado());
		datos.put("status", sol.getStatus());
		datos.put("probabilidad", sol.getProbabilidad());
		datos.put("comentario", sol.getComentario());
		datos.put("creado_por", sol.getCreado_por());
		datos.put("clientes_id", sol.getClientes_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public void actualizar(SolicitudServExterno sol) throws DataAccessException{
		jdbcTemplate.update("UPDATE SOLICITUD_SERVICIO_EXTERNO SET anio=?, descripcion=?, monto=?, moneda=?, mes_estimado=?, "
				+ "año_estimado=?, activo=?, status=?, fecha_baja=?, fecha_detenido=?, probabilidad=?, comentario=?, fecha_cierre=?, "
				+ "modificado_por=?, clientes_id=? WHERE id=?", sol.getAnio(), sol.getDescripcion(), sol.getMonto(), sol.getMoneda(), sol.getMes_estimado(), 
				sol.getAño_estimado(), sol.getActivo(), sol.getStatus(), sol.getFecha_baja(), sol.getFecha_detenido(), 
				sol.getProbabilidad(), sol.getComentario(), sol.getFecha_cierre(), sol.getModificado_por(), sol.getClientes_id(), sol.getId());
	}

	@Override
	public SolicitudServExterno buscar(int id) throws DataAccessException{
		SolicitudServExterno solicitud = jdbcTemplate.queryForObject("SELECT * FROM SOLICITUD_SERVICIO_EXTERNO WHERE id=?", 
				new SolicitudServExternoRM(), id);
		return solicitud;
	}

	@Override
	public List<SolicitudServExterno> consultar() throws DataAccessException{
		List<SolicitudServExterno> solicitud = jdbcTemplate.query("SELECT * FROM SOLICITUD_SERVICIO_EXTERNO", 
				new SolicitudServExternoRM());
		return solicitud;
	}
}
