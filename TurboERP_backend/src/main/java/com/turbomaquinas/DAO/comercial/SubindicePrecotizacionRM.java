package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.SubindicePrecotizacion;

public class SubindicePrecotizacionRM implements RowMapper<SubindicePrecotizacion>{

	@Override
	public SubindicePrecotizacion mapRow(ResultSet rs, int i) throws SQLException {
		SubindicePrecotizacion s = new SubindicePrecotizacion();
		s.setId(rs.getInt("id"));
		s.setDescripcion(rs.getString("descripcion"));
		s.setLugar(rs.getInt("lugar"));
		s.setActivo(rs.getInt("activo"));
		s.setCreado_por(rs.getInt("creado_por"));
		s.setCreado(rs.getDate("creado"));
		s.setModificado_por(rs.getInt("modificado_por"));
		s.setModificado(rs.getDate("modificado"));
		s.setDetalle_precotizaciones_id(rs.getInt("detalle_precotizaciones_id"));
		return s;
	}

}
