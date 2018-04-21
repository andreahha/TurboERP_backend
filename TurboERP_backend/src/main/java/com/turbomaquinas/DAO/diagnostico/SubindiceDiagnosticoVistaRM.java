package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnosticoVista;

public class SubindiceDiagnosticoVistaRM implements RowMapper<SubindiceDiagnosticoVista>{

	@Override
	public SubindiceDiagnosticoVista mapRow(ResultSet rs, int i) throws SQLException {
		SubindiceDiagnosticoVista sv = new SubindiceDiagnosticoVista();
		sv.setId(rs.getInt("id"));
		sv.setDescripcion(rs.getString("descripcion"));
		sv.setLugar(rs.getInt("lugar"));
		sv.setActivo(rs.getInt("activo"));
		sv.setCreado_por(rs.getInt("creado_por"));
		sv.setCreado(rs.getDate("creado"));
		sv.setModificado_por(rs.getInt("modificado_por"));
		sv.setModificado(rs.getDate("modificado"));
		sv.setDetalle_diagnostico_id(rs.getInt("detalle_diagnostico_id"));
		sv.setDetalle_diagnostico(rs.getString("detalle_diagnostico"));
		sv.setTipo_actividad(rs.getString("tipo_actividad"));
		sv.setDetalle_lugar(rs.getInt("detalle_lugar"));
		sv.setEncabezados_diagnostico_id(rs.getInt("encabezados_diagnostico_id"));
		sv.setDescripcion_encabezado(rs.getString("descripcion_encabezado"));
		sv.setLugar_encabezado(rs.getInt("lugar_encabezado"));
		sv.setDiagnostico_id(rs.getInt("diagnostico_id"));
		sv.setConsecutivo_diagnostico(rs.getInt("consecutivo_diagnostico"));
		return sv;
	}

}
