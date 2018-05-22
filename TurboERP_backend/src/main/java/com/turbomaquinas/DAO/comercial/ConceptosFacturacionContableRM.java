package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.ConceptosFacturacionContable;

public class ConceptosFacturacionContableRM implements RowMapper<ConceptosFacturacionContable> {

	@Override
	public ConceptosFacturacionContable mapRow(ResultSet rs, int i) throws SQLException {
		ConceptosFacturacionContable cnc = new ConceptosFacturacionContable();
		cnc.setId(rs.getInt("id"));
		cnc.setDescripcion(rs.getString("descripcion"));
		cnc.setActivo(rs.getInt("activo"));
		cnc.setCreado_por(rs.getInt("creado_por"));
		cnc.setCreado(rs.getDate("creado"));
		cnc.setModificado_por(rs.getInt("modificado_por"));
		cnc.setModificado(rs.getDate("modificado"));
		cnc.setCatalogo_cuentas_id_nac(rs.getInt("catalogo_cuentas_id_nac"));
		cnc.setCatalogo_cuentas_id_ext(rs.getInt("catalogo_cuentas_id_ext"));
		cnc.setAplica_iva(rs.getInt("aplica_iva"));
		cnc.setTipo(rs.getString("tipo"));
		return cnc;
	}
}
