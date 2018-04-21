package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.SubindiceCotizacion;

public class SubindiceCotizacionRM implements RowMapper<SubindiceCotizacion>{

	@Override
	public SubindiceCotizacion mapRow(ResultSet rs, int i) throws SQLException {
		SubindiceCotizacion s = new SubindiceCotizacion();
		s.setId(rs.getInt("id"));
		s.setDescripcion(rs.getString("descripcion"));
		s.setImporte(rs.getBigDecimal("importe"));
		s.setTipo_actividad(rs.getString("tipo_actividad"));
		s.setLugar(rs.getInt("lugar"));
		s.setActivo(rs.getInt("activo"));
		s.setCreado_por(rs.getInt("creado_por"));
		s.setCreado(rs.getDate("creado"));
		s.setModificado_por(rs.getInt("modificado_por"));
		s.setModificado(rs.getDate("modificado"));
		s.setDetalle_cotizaciones_id(rs.getInt("detalle_cotizaciones_id"));
		return s;

	}
}
