package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.ConceptosNotasCreditoVista;

public class ConceptosNotasCreditoVistaRM implements RowMapper<ConceptosNotasCreditoVista>{

	@Override
	public ConceptosNotasCreditoVista mapRow(ResultSet rs, int i) throws SQLException {
		
		ConceptosNotasCreditoVista cncv = new ConceptosNotasCreditoVista();
		cncv.setId(rs.getInt("id"));
		cncv.setDescripcion(rs.getString("descripcion"));
		cncv.setActivo(rs.getInt("activo"));
		cncv.setCreado_por(rs.getInt("creado_por"));
		cncv.setModificado_por(rs.getInt("modificado_por"));
		cncv.setCatalogo_cuentas_id_nac(rs.getInt("catalogo_cuentas_id_nac"));
		cncv.setCatalogo_cuentas_id_ext(rs.getInt("catalogo_cuentas_id_ext"));
		cncv.setAplica_iva(rs.getInt("aplica_iva"));
		cncv.setCuenta_nac(rs.getString("cuenta_nac"));
		cncv.setNombre_cuenta_nac(rs.getString("nombre_cuenta_nac"));
		cncv.setId_sat_nac(rs.getString("id_sat_nac"));
		cncv.setCuenta_ext(rs.getString("cuenta_ext"));
		cncv.setNombre_cuenta_ext(rs.getString("nombre_cuenta_ext"));
		cncv.setId_sat_ext(rs.getString("id_sat_ext"));
		return cncv;
	}

}
