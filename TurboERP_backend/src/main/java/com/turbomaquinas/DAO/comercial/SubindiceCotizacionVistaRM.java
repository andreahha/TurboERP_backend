package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.SubindiceCotizacionVista;

public class SubindiceCotizacionVistaRM implements RowMapper<SubindiceCotizacionVista>{

	@Override
	public SubindiceCotizacionVista mapRow(ResultSet rs, int i) throws SQLException {
		SubindiceCotizacionVista sv = new SubindiceCotizacionVista();
		sv.setId(rs.getInt("id"));
		sv.setDescripcion(rs.getString("descripcion"));
		sv.setImporte(rs.getBigDecimal("importe"));
		sv.setTipo_actividad(rs.getString("tipo_actividad"));
		sv.setLugar(rs.getInt("lugar"));
		sv.setActivo(rs.getInt("activo"));
		sv.setCreado_por(rs.getInt("creado_por"));
		sv.setCreado(rs.getDate("creado"));
		sv.setModificado_por(rs.getInt("modificado_por"));
		sv.setModificado(rs.getDate("modificado"));
		sv.setDetalle_cotizaciones_id(rs.getInt("detalle_cotizaciones_id"));
		sv.setDetalle_descripcion(rs.getString("detalle_descripcion"));
		sv.setDetalle_tipo_actividad(rs.getString("detalle_tipo_actividad"));
		sv.setDetalle_lugar(rs.getInt("detalle_lugar"));
		sv.setEncabezados_cotizaciones_id(rs.getInt("encabezados_cotizaciones_id"));
		sv.setDescripcion_encabezado(rs.getString("descripcion_encabezado"));
		sv.setLugar_encabezado(rs.getInt("lugar_encabezado"));
		sv.setCotizaciones_id(rs.getInt("cotizaciones_id"));
		sv.setNumero_cotizacion(rs.getInt("numero_cotizacion"));
		return sv;
	}

}
