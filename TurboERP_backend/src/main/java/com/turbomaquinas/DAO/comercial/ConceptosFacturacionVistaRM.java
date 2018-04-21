package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.ConceptosFacturacionVista;

public class ConceptosFacturacionVistaRM implements RowMapper<ConceptosFacturacionVista>{

	@Override
	public ConceptosFacturacionVista mapRow(ResultSet rs, int rowNum) throws SQLException {
		ConceptosFacturacionVista cfv = new ConceptosFacturacionVista();
		cfv.setId(rs.getInt("id"));
		cfv.setDescripcion(rs.getString("descripcion"));
		cfv.setActivo(rs.getInt("activo"));
		cfv.setCreado_por(rs.getInt("creado_por"));
		cfv.setModificado_por(rs.getInt("modificado_por"));
		cfv.setProductos_sat_id(rs.getInt("productos_sat_id"));
		cfv.setMedidas_sat_id(rs.getInt("medidas_sat_id"));
		cfv.setPs_clave(rs.getString("ps_clave"));
		cfv.setPs_descripcion(rs.getString("ps_descripcion"));
		cfv.setMs_clave(rs.getString("ms_clave"));
		cfv.setMs_descripcion(rs.getString("ms_descripcion"));
		return cfv;
	}

}
