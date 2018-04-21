package com.turbomaquinas.DAO.servexternos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.servexternos.SolicitudServExterno;

public class SolicitudServExternoRM implements RowMapper<SolicitudServExterno>{

	@Override
	public SolicitudServExterno mapRow(ResultSet rs, int i) throws SQLException {
		SolicitudServExterno sse = new SolicitudServExterno();
		sse.setId(rs.getInt("id"));
		sse.setNumero(rs.getInt("numero"));
		sse.setIniciales(rs.getString("iniciales"));
		sse.setAnio(rs.getInt("anio"));
		sse.setFecha_alta(rs.getDate("fecha_alta"));
		sse.setDescripcion(rs.getString("descripcion"));
		sse.setMonto(rs.getInt("monto"));
		sse.setMoneda(rs.getString("moneda"));
		sse.setMes_estimado(rs.getInt("mes_estimado"));
		sse.setAño_estimado(rs.getInt("año_estimado"));
		sse.setActivo(rs.getInt("activo"));
		sse.setStatus(rs.getString("status"));
		sse.setFecha_baja(rs.getDate("fecha_baja"));
		sse.setFecha_detenido(rs.getDate("fecha_detenido"));
		sse.setProbabilidad(rs.getString("probabilidad"));
		sse.setComentario(rs.getString("comentario"));
		sse.setFecha_cierre(rs.getDate("fecha_cierre"));
		sse.setCreado_por(rs.getInt("creado_por"));
		sse.setCreado(rs.getDate("creado"));
		sse.setModificado_por(rs.getInt("modificado_por"));
		sse.setModificado(rs.getDate("modificado"));
		sse.setClientes_id(rs.getInt("clientes_id"));
		return sse;
	}

}
