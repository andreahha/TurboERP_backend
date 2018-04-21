package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.PrecotizacionVista;

public class PrecotizacionVistaRM implements RowMapper<PrecotizacionVista>{

	@Override
	public PrecotizacionVista mapRow(ResultSet rs, int i) throws SQLException {
		
		PrecotizacionVista pcv = new PrecotizacionVista();
		pcv.setId(rs.getInt("id"));
		pcv.setOrigen(rs.getString("origen"));
		pcv.setNumero(rs.getInt("numero"));
		pcv.setAnio(rs.getInt("anio"));
		pcv.setNumero_precotizacion(rs.getString("numero_precotizacion"));
		pcv.setFecha_pre(rs.getDate("fecha_pre"));
		pcv.setDescripcion(rs.getString("descripcion"));
		pcv.setComentarios(rs.getString("comentarios"));
		pcv.setFecha_requiere_cotizacion(rs.getDate("fecha_requiere_cotizacion"));
		pcv.setFecha_estimada_logro(rs.getDate("fecha_estimada_logro"));
		pcv.setFecha_junta_aclara(rs.getDate("fecha_junta_aclara"));
		pcv.setFecha_propuesta(rs.getDate("fecha_propuesta"));
		pcv.setFecha_fallo(rs.getDate("fecha_fallo"));
		pcv.setFecha_llegada_equipo(rs.getDate("fecha_llegada_equipo"));
		pcv.setLicitacion(rs.getInt("licitacion"));
		pcv.setEstado(rs.getString("estado"));
		pcv.setActivo(rs.getInt("activo"));
		pcv.setMarcas_equipos_id(rs.getInt("marcas_equipos_id"));
		pcv.setMarca(rs.getString("marca"));
		pcv.setModelos_equipos_id(rs.getInt("modelos_equipos_id"));
		pcv.setModelo(rs.getString("modelo"));
		pcv.setClientes_id(rs.getInt("clientes_id"));
		pcv.setNombre_fiscal(rs.getString("nombre_fiscal"));
		pcv.setNombre_comercial(rs.getString("nombre_comercial"));
		pcv.setGiro(rs.getString("giro"));
		pcv.setContactos_id(rs.getInt("contactos_id"));
		pcv.setContacto(rs.getString("contacto"));
		return pcv;
	}

}
