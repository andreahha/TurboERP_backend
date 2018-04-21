package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.SolicitudDesautorizacionAA;

public class SolicitudDesautorizacionAARM implements RowMapper<SolicitudDesautorizacionAA>{

	@Override
	public SolicitudDesautorizacionAA mapRow(ResultSet rs, int i) throws SQLException {
		SolicitudDesautorizacionAA s = new SolicitudDesautorizacionAA();
		s.setId(rs.getInt("id"));
		s.setFolio(rs.getInt("folio"));
		s.setMotivo(rs.getString("motivo"));
		s.setFecha_aceptacion(rs.getDate("fecha_aceptacion"));
		s.setTipo(rs.getString("tipo"));
		s.setEstado(rs.getString("estado"));
		s.setActivo(rs.getInt("activo"));
		s.setCreado_por(rs.getInt("creado_por"));
		s.setCreado(rs.getDate("creado"));
		s.setModificado_por(rs.getInt("modificado_por"));
		s.setModificado(rs.getDate("modificado"));
		s.setAlfresco_id(rs.getString("alfresco_id"));
		s.setOrdenes_id(rs.getInt("ordenes_id"));
		return s;
	}

}
