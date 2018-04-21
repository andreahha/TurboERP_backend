package com.turbomaquinas.DAO.diagnostico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.diagnostico.InspeccionEquipo;
import com.turbomaquinas.POJO.diagnostico.InspeccionEquipoVista;

@Repository
public class JDBCInspeccionEquipo implements InspeccionEquipoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(InspeccionEquipo ins) throws DataAccessException{
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("comentarios");
		columnas.add("consecutivo");
		columnas.add("sustituye_id");
		columnas.add("creado_por");
		columnas.add("alfresco_id");
		columnas.add("ordenes_id");
		columnas.add("personal_id");
		
		insert.setTableName("INSPECCION_EQUIPOS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("comentarios", ins.getComentarios());
		datos.put("consecutivo", ins.getConsecutivo());
		datos.put("sustituye_id", ins.getSustituye_id());
		datos.put("creado_por", ins.getCreado_por());
		datos.put("alfresco_id", ins.getAlfresco_id());
		datos.put("ordenes_id", ins.getOrdenes_id());
		datos.put("personal_id", ins.getPersonal_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public InspeccionEquipo actualizar(InspeccionEquipo ins) throws DataAccessException{
		jdbcTemplate.update("UPDATE INSPECCION_EQUIPOS SET comentarios=?, consecutivo=?, sustituye_id=?,"
				+ " activo=?, modificado_por=?, alfresco_id=?, ordenes_id=?, personal_id=? where id=?",
				ins.getComentarios(), ins.getConsecutivo(), ins.getSustituye_id(), ins.getActivo(), ins.getModificado_por(),
				ins.getAlfresco_id(), ins.getOrdenes_id(), ins.getPersonal_id(), ins.getId());
		return ins;
	}

	@Override
	public InspeccionEquipoVista buscar(int id) throws DataAccessException{
		InspeccionEquipoVista iv = jdbcTemplate.queryForObject("SELECT * FROM INSPECCION_EQUIPOS_V WHERE id=?",
				new InspeccionEquipoVistaRM(), id);
		return iv;
	}

	@Override
	public List<InspeccionEquipoVista> consultar() throws DataAccessException{
		List<InspeccionEquipoVista> iv = jdbcTemplate.query("SELECT * FROM INSPECCION_EQUIPOS_V", 
				new InspeccionEquipoVistaRM());
		return iv;
	}

	@Override
	public List<Integer> anioInspeccionEquipo() throws DataAccessException{
		List<Integer> i = jdbcTemplate.queryForList("SELECT DISTINCT(anio) FROM INSPECCION_EQUIPOS_V ORDER BY anio DESC", 
				Integer.class);
		return i;
	}

	@Override
	public List<InspeccionEquipoVista> inspeccionEquipoAnio(int anio) throws DataAccessException{
		List<InspeccionEquipoVista> i = jdbcTemplate.query("SELECT * FROM INSPECCION_EQUIPOS_V WHERE anio=?", 
			 new InspeccionEquipoVistaRM(), anio);
		return i;
	}

	@Override
	public List<InspeccionEquipoVista> consultaPorOrden(int id) throws DataAccessException{
		List<InspeccionEquipoVista> i = jdbcTemplate.query("SELECT * FROM INSPECCION_EQUIPOS_V WHERE ORDENES_id = ?", 
				new InspeccionEquipoVistaRM(), id);
		return i;
	}
}
