package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.DetallePrecotizacionVista;

public class DetallePrecotizacionVistaRM implements RowMapper<DetallePrecotizacionVista>{

	@Override
	public DetallePrecotizacionVista mapRow(ResultSet rs, int i) throws SQLException {
		DetallePrecotizacionVista dpv = new DetallePrecotizacionVista();
		dpv.setId(rs.getInt("id"));
		dpv.setDescripcion(rs.getString("descripcion"));
		dpv.setTipoActividad(rs.getString("tipoActividad"));
		dpv.setLugar(rs.getInt("lugar"));
		dpv.setSuministro(rs.getInt("suministro"));
		dpv.setPlanta(rs.getInt("planta"));
		dpv.setActivo(rs.getInt("activo"));
		dpv.setPrecotizaciones_id(rs.getInt("precotizaciones_id"));
		dpv.setNumero_precotizacion(rs.getInt("numero_precotizacion"));
		dpv.setEncabezados_precotizaciones_id(rs.getInt("encabezados_precotizaciones_id"));
		dpv.setDescripcion_encabezado(rs.getString("descripcion_encabezado"));
		dpv.setLugar_encabezado(rs.getInt("lugar_encabezado"));
		dpv.setNumero_precotizacion(rs.getInt("numero_precotizacion"));
		dpv.setCant_subindices(rs.getInt("cant_subindices"));
		return dpv;
	}

}
