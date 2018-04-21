package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.ConceptosFacturacion;

public class ConceptosFacturacionRM implements RowMapper<ConceptosFacturacion> {

	@Override
	public ConceptosFacturacion mapRow(ResultSet rs, int i) throws SQLException {
		ConceptosFacturacion cf = new ConceptosFacturacion();
		cf.setId(rs.getInt("id"));
		cf.setDescripcion(rs.getString("descripcion"));
		cf.setActivo(rs.getInt("activo"));
		cf.setCreado_por(rs.getInt("creado_por"));
		cf.setCreado(rs.getDate("creado"));
		cf.setModificado_por(rs.getInt("modificado_por"));
		cf.setModificado(rs.getDate("modificado"));
		cf.setProductos_sat_id(rs.getInt("productos_sat_id"));
		cf.setMedidas_sat_id(rs.getInt("medidas_sat_id"));
		return cf;
	}
	
	

}
