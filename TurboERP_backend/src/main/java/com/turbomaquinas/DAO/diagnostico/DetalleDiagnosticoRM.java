package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.DetalleDiagnostico;

public class DetalleDiagnosticoRM implements RowMapper<DetalleDiagnostico>{

	@Override
	public DetalleDiagnostico mapRow(ResultSet rs, int i) throws SQLException {

		DetalleDiagnostico dd = new DetalleDiagnostico();
		dd.setId(rs.getInt("id"));
		dd.setDescripcion(rs.getString("descripcion"));
		dd.setTipo_actividad(rs.getString("tipo_actividad"));
		dd.setLugar(rs.getInt("lugar"));
		dd.setSuministro(rs.getInt("suministro"));
		dd.setActivo(rs.getInt("activo"));
		dd.setCreado_por(rs.getInt("creado_por"));
		dd.setCreado(rs.getDate("creado"));
		dd.setModificado_por(rs.getInt("modificado_por"));
		dd.setModificado(rs.getDate("modificado"));
		dd.setEncabezados_diagnostico_id(rs.getInt("encabezados_diagnostico_id"));
		dd.setPlanta(rs.getInt("planta"));
		dd.setUnidades(rs.getInt("unidades"));
		return dd;
	}
	

}
