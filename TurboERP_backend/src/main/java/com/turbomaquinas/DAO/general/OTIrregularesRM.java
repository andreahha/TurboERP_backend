package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.OTIrregular;

public class OTIrregularesRM implements RowMapper<OTIrregular>{

	@Override
	public OTIrregular mapRow(ResultSet rs, int i) throws SQLException {

		OTIrregular oti = new OTIrregular();
		oti.setId(rs.getInt("id"));
		oti.setNumero(rs.getInt("numero"));
		oti.setIniciales(rs.getString("iniciales"));
		oti.setAnio(rs.getInt("anio"));
		oti.setFecha_solicitud(rs.getDate("fecha_solicitud"));
		oti.setFecha_regularizacion(rs.getDate("fecha_regularizacion"));
		oti.setComentarios(rs.getString("comentarios"));
		oti.setProceso(rs.getString("proceso"));
		oti.setEstado(rs.getString("estado"));
		oti.setUsuario_acepta(rs.getInt("usuario_acepta"));
		oti.setFecha_acepta(rs.getDate("fecha_acepta"));
		oti.setActivo(rs.getInt("activo"));
		oti.setCreado_por(rs.getInt("creado_por"));
		oti.setCreado(rs.getDate("creado"));
		oti.setModificado_por(rs.getInt("modificado_por"));
		oti.setModificado(rs.getDate("modificado"));
		oti.setOrdenes_id(rs.getInt("ordenes_id"));
		oti.setContactos_id(rs.getInt("contactos_id"));
		return oti;

	}

}
