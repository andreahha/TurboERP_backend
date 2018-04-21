package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.EquipoPorRecibir;

public class EquipoPorRecibirRM implements RowMapper<EquipoPorRecibir>{

	@Override
	public EquipoPorRecibir mapRow(ResultSet rs, int i) throws SQLException {
		EquipoPorRecibir er = new EquipoPorRecibir();
		er.setId(rs.getInt("id"));
		er.setDescripcion(rs.getString("descripcion"));
		er.setFecha_estimada_llegada(rs.getDate("fecha_estimada_llegada"));
		er.setTransporte(rs.getString("transporte"));
		er.setComentarios(rs.getString("comentarios"));
		er.setSoportes(rs.getString("soportes"));
		er.setSoporte_turbomaquinas(rs.getInt("soporte_turbomaquinas"));
		er.setPeso(rs.getFloat("peso"));
		er.setFlete(rs.getInt("flete"));
		er.setActivo(rs.getInt("activo"));
		er.setCreado_por(rs.getInt("creado_por"));
		er.setCreado(rs.getDate("creado"));
		er.setModificado_por(rs.getInt("modificado_por"));
		er.setModificado(rs.getDate("modificado"));
		er.setOrdenes_id(rs.getInt("ordenes_id"));
		er.setClientes_id(rs.getInt("clientes_id"));
		er.setSolicitud_fletes_id(rs.getInt("solicitud_fletes_id"));
		er.setMedidas_equipos_id(rs.getInt("medidas_equipos_id"));
		return er;
	}

}
