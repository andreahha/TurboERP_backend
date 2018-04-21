package com.turbomaquinas.DAO.SGC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.SGC.SolicitudCambio;

@Repository
public class JDBCSolicitudCambio implements SolicitudCambioDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(SolicitudCambio solicitud) throws DataAccessException {
		/*jdbcTemplate.update("INSERT INTO SOLICITUDES_CAMBIO (descripcion, prioridad, tipo, proyecto, costo, dias, DEPARTAMENTOS_id, SOLICITANTE_id, creado_por) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", 
				solicitud.getDescripcion(), solicitud.getPrioridad(), 
				solicitud.getTipo(), solicitud.getProyecto(),
				solicitud.getCosto(), solicitud.getDias(),
				solicitud.getDepartamentoId(), solicitud.getSolicitanteId(), solicitud.getCreadoPor());
		return null;*/
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("titulo");
		columnas.add("descripcion");
		columnas.add("prioridad");
		columnas.add("tipo");
		columnas.add("proyecto");
		columnas.add("costo");
		columnas.add("dias");
		columnas.add("DEPARTAMENTOS_id");
		columnas.add("SOLICITANTE_id");
		columnas.add("creado_por");
		
		insert.setTableName("SOLICITUDES_CAMBIO");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("titulo", solicitud.getTitulo());
		datos.put("descripcion", solicitud.getDescripcion());
		datos.put("prioridad", solicitud.getPrioridad());
		datos.put("tipo", solicitud.getTipo());
		datos.put("proyecto", solicitud.getProyecto());
		datos.put("costo", solicitud.getCosto());
		datos.put("dias", solicitud.getDias());
		datos.put("DEPARTAMENTOS_id", solicitud.getDepartamentoId());
		datos.put("SOLICITANTE_id", solicitud.getSolicitanteId());
		datos.put("creado_por", solicitud.getCreadoPor());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}
	
	@Override
	public void actualizarEvaluacion(SolicitudCambio solicitud) throws DataAccessException{
		jdbcTemplate.update("call EVALUAR_SOLICITUD_CAMBIO(?, ?, ?, ?, ?, ?, ?, ?, ?)",
				solicitud.getId(),
				solicitud.getAfecta(),
				solicitud.getTrabajo(),
				solicitud.getImpactoEconomico(),
				solicitud.getImpactoTiempo(),
				solicitud.getImpactoAlcance(),
				solicitud.getImpactoCalidad(),
				solicitud.getImpactoRiesgo(),
				solicitud.getEvaluadorId());
	}
	
	@Override
	public void actualizarResolucion(SolicitudCambio solicitud) throws DataAccessException{
		jdbcTemplate.update("call AUTORIZAR_SOLICITUD_CAMBIO(?, ?, ?)",
				solicitud.getId(),
				solicitud.getResolucion(),
				solicitud.getComentarios());
	}
	
	@Override
	public void actualizarVerificacion(SolicitudCambio solicitud) throws DataAccessException{
		jdbcTemplate.update("call CERRAR_SOLICITUD_CAMBIO(?, ?, ?, ?)",
				solicitud.getId(),
				solicitud.getFechaTerminacion(),
				solicitud.getCompletadoPor(),
				solicitud.getFechaVerificacion());
	}
}
