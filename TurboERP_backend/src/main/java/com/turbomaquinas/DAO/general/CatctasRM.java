package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.Catctas;

public class CatctasRM implements RowMapper<Catctas> {

	@Override
	public Catctas mapRow(ResultSet rs, int i) throws SQLException {
		
		Catctas cc = new Catctas();
		cc.setId(rs.getInt("id"));
		cc.setCuenta(rs.getString("cuenta"));
		cc.setNombre_cuenta(rs.getString("nombre_cuenta"));
		cc.setId_sat(rs.getString("id_sat"));
		cc.setActivo(rs.getInt("activo"));
		cc.setCreado_por(rs.getInt("creado"));
		cc.setCreado(rs.getDate("creado"));
		cc.setModificado_por(rs.getInt("modificado_por"));
		cc.setModificado(rs.getDate("modificado"));
		return cc;
	}

}
