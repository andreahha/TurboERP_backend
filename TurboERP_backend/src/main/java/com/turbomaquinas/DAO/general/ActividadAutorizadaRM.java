package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.ActividadAutorizada;

public class ActividadAutorizadaRM implements RowMapper<ActividadAutorizada>{

	@Override
	public ActividadAutorizada mapRow(ResultSet rs, int i) throws SQLException {
		ActividadAutorizada ac = new ActividadAutorizada();
		ac.setId(rs.getInt("id"));
		ac.setNumero_referencia(rs.getInt("numero_referencia"));
		ac.setTipo_actividad(rs.getString("tipo_actividad"));
		ac.setSuministro(rs.getInt("suministro"));
		ac.setPlanta(rs.getInt("planta"));
		ac.setClase_actividad(rs.getString("clase_actividad"));
		ac.setImporte_autorizado(rs.getFloat("importe_autorizado"));
		ac.setImporte_baja(rs.getFloat("importe_baja"));
		ac.setImporte_anticipo(rs.getFloat("importe_anticipo"));
		ac.setImporte_factura(rs.getFloat("importe_factura"));
		ac.setImporte_pendiente(rs.getFloat("importe_pendiente"));
		ac.setDescuento(rs.getFloat("descuento"));
		ac.setFecha_regularizacion(rs.getDate("fecha_regularizacion"));
		ac.setActivo(rs.getInt("activo"));
		ac.setCreado_por(rs.getInt("creado_por"));
		ac.setCreado(rs.getDate("creado"));
		ac.setModificado_por(rs.getInt("modificado_por"));
		ac.setModificado(rs.getDate("modificado"));
		ac.setPedidos_id(rs.getInt("pedidos_id"));
		ac.setSolicitud_bajas_actividades_id(rs.getInt("solicitud_bajas_actividades_id"));
		ac.setPre_pedidos_id(rs.getInt("pre_pedidos_id"));
		ac.setOt_irregulares_id(rs.getInt("ot_irregulares_id"));
		ac.setAutorizaciones_id(rs.getInt("autorizaciones_id"));
		ac.setDetalles_cotizaciones_id(rs.getInt("detalles_cotizaciones_id"));
		return ac;
	}

}
