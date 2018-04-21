package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.Precotizacion;

public class PrecotizacionRM implements RowMapper<Precotizacion>{

	@Override
	public Precotizacion mapRow(ResultSet rs, int i) throws SQLException {
		Precotizacion pc = new Precotizacion();
		pc.setId(rs.getInt("id"));
		pc.setOrigen(rs.getString("origen"));
		pc.setNumero(rs.getInt("numero"));
		pc.setAnio(rs.getInt("anio"));
		pc.setFecha_pre(rs.getDate("fecha_pre"));
		pc.setDescripcion(rs.getString("descripcion"));
		pc.setComentarios(rs.getString("comentarios"));
		pc.setFecha_requiere_cotizacion(rs.getDate("fecha_requiere_cotizacion"));
		pc.setFecha_estimada_logro(rs.getDate("fecha_estimada_logro"));
		pc.setFecha_junta_aclara(rs.getDate("fecha_junta_aclara"));
		pc.setFecha_propuesta(rs.getDate("fecha_propuesta"));
		pc.setFecha_fallo(rs.getDate("fecha_fallo"));
		pc.setFecha_llegada_equipo(rs.getDate("fecha_llegada_equipo"));
		pc.setLicitacion(rs.getInt("licitacion"));
		pc.setEstado(rs.getString("estado"));
		pc.setActivo(rs.getInt("activo"));
		pc.setCreado_por(rs.getInt("creado_por"));
		pc.setCreado(rs.getDate("creado"));
		pc.setModificado_por(rs.getInt("modificado_por"));
		pc.setModificado(rs.getDate("modificado"));
		pc.setMarcas_equipos_id(rs.getInt("marcas_equipos_id"));
		pc.setModelos_equipos_id(rs.getInt("modelos_equipos_id"));
		pc.setClientes_id(rs.getInt("clientes_id"));
		pc.setContactos_id(rs.getInt("contactos_id"));
		return pc;
	}
}
