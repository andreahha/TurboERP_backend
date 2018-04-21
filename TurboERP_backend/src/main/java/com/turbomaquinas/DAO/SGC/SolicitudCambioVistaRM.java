package com.turbomaquinas.DAO.SGC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.SGC.SolicitudCambioVista;

public class SolicitudCambioVistaRM implements RowMapper<SolicitudCambioVista> {

	@Override
	public SolicitudCambioVista mapRow(ResultSet rs, int i) throws SQLException {
		SolicitudCambioVista s = new SolicitudCambioVista();
		s.setId(rs.getInt("id"));
		s.setNumero(rs.getInt("numero"));
		s.setFecha(rs.getDate("fecha"));
		s.setTitulo(rs.getString("titulo"));
		s.setDescripcion(rs.getString("descripcion"));
		s.setPrioridad(rs.getString("prioridad"));
		s.setTipo(rs.getInt("tipo"));
		s.setProyecto(rs.getString("proyecto"));
		s.setCosto(rs.getInt("costo"));
		s.setDias(rs.getInt("dias"));
		s.setFechaEvaluacion(rs.getDate("fecha_evaluacion"));
		s.setAfecta(rs.getString("afecta"));
		s.setTrabajo(rs.getString("trabajo"));
		s.setImpactoEconomico(rs.getInt("impacto_economico"));
		s.setImpactoTiempo(rs.getInt("impacto_tiempo"));
		s.setImpactoAlcance(rs.getString("impacto_alcance"));
		s.setImpactoCalidad(rs.getString("impacto_calidad"));
		s.setImpactoRiesgo(rs.getString("impacto_riesgo"));
		s.setFechaResolucion(rs.getDate("fecha_resolucion"));
		s.setResolucion(rs.getString("resolucion"));
		s.setComentarios(rs.getString("comentarios"));
		s.setFechaTerminacion(rs.getDate("fecha_terminacion"));
		s.setCompletadoPor(rs.getString("completado_por"));
		s.setFechaVerificacion(rs.getDate("fecha_verificacion"));
		s.setEvaluadorId(rs.getInt("EVALUADOR_id"));
		s.setEstado(rs.getString("estado"));
		s.setDepartamentoId(rs.getInt("DEPARTAMENTOS_id"));
		s.setSolicitanteId(rs.getInt("SOLICITANTE_id"));	
		s.setClave(rs.getString("clave"));
		s.setDescripcionDepto(rs.getString("descripcion_depto"));
		s.setNumeroSolicitante(rs.getInt("numero_solicitante"));
		s.setNombreSolicitante(rs.getString("nombre"));
		s.setPaternoSolicitante(rs.getString("paterno"));
		s.setMaternoSolicitante(rs.getString("materno"));
		return s;
	}

}
