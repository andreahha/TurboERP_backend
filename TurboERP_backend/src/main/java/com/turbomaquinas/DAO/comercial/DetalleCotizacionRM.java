package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.DetalleCotizacion;

public class DetalleCotizacionRM implements RowMapper<DetalleCotizacion>{

	@Override
	public DetalleCotizacion mapRow(ResultSet rs, int i) throws SQLException {

		DetalleCotizacion dc = new DetalleCotizacion();
		dc.setId(rs.getInt("id"));
		dc.setDescripcion(rs.getString("descripcion"));
		dc.setTipo_actividad(rs.getString("tipo_actividad"));
		dc.setLugar(rs.getInt("lugar"));
		dc.setSuministro(rs.getInt("suministro"));
		dc.setPlanta(rs.getInt("planta"));
		dc.setClase_actividad(rs.getString("clase_actividad"));
		dc.setImporte(rs.getBigDecimal("importe"));
		dc.setActivo(rs.getInt("activo"));
		dc.setCreado_por(rs.getInt("creado_por"));
		dc.setCreado(rs.getDate("creado"));
		dc.setModificado_por(rs.getInt("modificado_por"));
		dc.setModificado(rs.getDate("modificado"));
		dc.setEncabezados_cotizaciones_id(rs.getInt("ENCABEZADOS_COTIZACIONES_id"));
		dc.setDetalle_diagnostico_id(rs.getInt("DETALLE_DIAGNOSTICO_id"));
		return dc;
	}

}
