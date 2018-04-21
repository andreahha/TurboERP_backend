package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.OTIrregularVista;

public class OTIrregularVistaRM implements RowMapper<OTIrregularVista> {

	@Override
	public OTIrregularVista mapRow(ResultSet rs, int i) throws SQLException {

		OTIrregularVista otiv = new OTIrregularVista();
		otiv.setId(rs.getInt("id"));
		otiv.setFolio(rs.getString("folio"));
		otiv.setNumero(rs.getInt("numero"));
		otiv.setAnio(rs.getInt("anio"));
		otiv.setIniciales(rs.getString("iniciales"));
		otiv.setFecha_solicitud(rs.getDate("fecha_solicitud"));
		otiv.setFecha_regularizacion(rs.getDate("fecha_regularizacion"));
		otiv.setComentarios(rs.getString("comentarios"));
		otiv.setProceso(rs.getString("proceso"));
		otiv.setEstado(rs.getString("estado"));
		otiv.setUsuario_acepta(rs.getInt("usuario_acepta"));
		otiv.setFecha_acepta(rs.getDate("fecha_acepta"));
		otiv.setOrdenes_id(rs.getInt("ordenes_id"));
		otiv.setNumero_orden(rs.getString("numero_orden"));
		otiv.setContactos_id(rs.getInt("contactos_id"));
		otiv.setContacto(rs.getString("contacto"));
		return otiv;
	}
}
