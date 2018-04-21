package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.DetallePrecotizacion;


public class DetallePrecotizacionRM implements RowMapper<DetallePrecotizacion>{

	@Override
	public DetallePrecotizacion mapRow(ResultSet rs, int i) throws SQLException {
		DetallePrecotizacion dp = new DetallePrecotizacion();
		dp.setId(rs.getInt("id"));
		dp.setDescripcion(rs.getString("descripcion"));
		dp.setTipo_actividad(rs.getString("tipo_actividad"));
		dp.setLugar(rs.getInt("lugar"));
		dp.setSuministro(rs.getInt("suministro"));
		dp.setPlanta(rs.getInt("planta"));
		dp.setActivo(rs.getInt("activo"));
		dp.setCreado_por(rs.getInt("creado_por"));
		dp.setCreado(rs.getDate("creado"));
		dp.setModificado_por(rs.getInt("modificado_por"));
		dp.setModificado(rs.getDate("modificado"));
		dp.setEncabezados_precotizaciones_id(rs.getInt("encabezados_precotizaciones_id"));
		return dp;
	}

}
