package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.DatosTimbrados;

public class DatosTimbradosRM implements RowMapper<DatosTimbrados>{

	@Override
	public DatosTimbrados mapRow(ResultSet rs, int i) throws SQLException {

		DatosTimbrados dt = new DatosTimbrados();
		dt.setId(rs.getInt("id"));
		dt.setFolio_fiscal(rs.getString("folio_fiscal"));
		dt.setFecha(rs.getString("fecha"));
		dt.setCadena_original(rs.getString("cadena_original"));
		dt.setSello_emisor(rs.getString("sello_emisor"));
		dt.setSello_sat(rs.getString("sello_sat"));
		dt.setLeyenda(rs.getString("leyenda"));
		dt.setActivo(rs.getInt("activo"));
		dt.setCreado_por(rs.getInt("creado_por"));
		dt.setCreado(rs.getDate("creado"));
		dt.setModificado_por(rs.getInt("modificado_por"));
		dt.setModificado(rs.getDate("modificado"));
		dt.setAlfresco_id_pdf(rs.getString("alfresco_id_pdf"));
		dt.setAlfresco_id_xml(rs.getString("alfresco_id_xml"));
		return dt;
	}

}
