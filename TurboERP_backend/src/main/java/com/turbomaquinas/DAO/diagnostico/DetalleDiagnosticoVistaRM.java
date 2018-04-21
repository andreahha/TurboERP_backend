package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.DetalleDiagnosticoVista;

public class DetalleDiagnosticoVistaRM implements RowMapper<DetalleDiagnosticoVista>{

	@Override
	public DetalleDiagnosticoVista mapRow(ResultSet rs, int i) throws SQLException {

		DetalleDiagnosticoVista ddv = new DetalleDiagnosticoVista();
		ddv.setId(rs.getInt("id"));
		ddv.setDescripcion(rs.getString("descripcion"));
		ddv.setTipo_actividad(rs.getString("tipo_actividad"));
		ddv.setLugar(rs.getInt("lugar"));
		ddv.setSuministro(rs.getInt("suministro"));
		ddv.setActivo(rs.getInt("activo"));
		ddv.setEncabezados_diagnostico_id(rs.getInt("encabezados_diagnostico_id"));
		ddv.setDescripcionEncabezado(rs.getString("descripcionEncabezado"));
		ddv.setLugarEncabezado(rs.getInt("lugarEncabezado"));
		ddv.setDiagnostico_id(rs.getInt("diagnostico_id"));
		ddv.setConsecutivo_diagnostico(rs.getInt("consecutivo_diagnostico"));
		ddv.setCant_subindices(rs.getInt("cant_subindices"));
		ddv.setPlanta(rs.getInt("planta"));
		ddv.setUnidades(rs.getInt("unidades"));
		ddv.setFecha_diags(rs.getString("fecha_diags"));
		ddv.setAutorizado(rs.getInt("autorizado"));
		return ddv;
	}

}
