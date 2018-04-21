package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.SubindicePrecotizacionVista;

public class SubindicePrecotizacionVistaRM implements RowMapper<SubindicePrecotizacionVista>{

	@Override
	public SubindicePrecotizacionVista mapRow(ResultSet rs, int i) throws SQLException {
		SubindicePrecotizacionVista sv = new SubindicePrecotizacionVista();
		sv.setId(rs.getInt("id"));
		sv.setDescripcion(rs.getString("descripcion"));
		sv.setTipo_actividad(rs.getString("tipo_actividad"));
		sv.setLugar(rs.getInt("lugar"));
		sv.setActivo(rs.getInt("activo"));
		sv.setCreado_por(rs.getInt("creado_por"));
		sv.setCreado(rs.getDate("creado"));
		sv.setModificado_por(rs.getInt("modificado_por"));
		sv.setModificado(rs.getDate("modificado"));
		sv.setDetalle_precotizaciones_id(rs.getInt("detalle_precotizaciones_id"));
		sv.setDescripcion_detalle(rs.getString("descripcion_detalle"));
		sv.setDetalle_lugar(rs.getInt("detalle_lugar"));
		sv.setEncabezados_precotizaciones_id(rs.getInt("encabezados_precotizaciones_id"));
		sv.setDescripcion_encabezado(rs.getString("descripcion_encabezado"));
		sv.setLugar_encabezado(rs.getInt("lugar_encabezado"));
		sv.setPrecotizaciones_id(rs.getInt("precotizaciones_id"));
		sv.setNumero_precotizacion(rs.getInt("numero_precotizacion"));
		return sv;
	}

}
