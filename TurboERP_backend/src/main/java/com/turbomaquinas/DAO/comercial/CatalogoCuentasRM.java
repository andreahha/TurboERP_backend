package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.CatalogoCuentas;

public class CatalogoCuentasRM implements RowMapper<CatalogoCuentas> {

	@Override
	public CatalogoCuentas mapRow(ResultSet rs, int i) throws SQLException {
		CatalogoCuentas cc = new CatalogoCuentas();
		        
		cc.setId(rs.getInt("id"));
		cc.setCuenta(rs.getString("cuenta"));
		cc.setNombre_cuenta(rs.getString("nombre_cuenta"));
		cc.setId_sat(rs.getString("id_sat"));
		cc.setActivo(rs.getInt("activo"));
		cc.setCreado_por(rs.getInt("creado_por"));
		cc.setCreado(rs.getDate("creado"));
		cc.setModificado_por(rs.getInt("modificado_por"));
		cc.setModificado(rs.getDate("modificado"));
		return cc;
		
	}

}
