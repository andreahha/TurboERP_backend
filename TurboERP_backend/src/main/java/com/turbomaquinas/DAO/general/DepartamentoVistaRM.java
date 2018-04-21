package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.DepartamentoVista;

public class DepartamentoVistaRM implements RowMapper<DepartamentoVista> {

	@Override
	public DepartamentoVista mapRow(ResultSet rs, int i) throws SQLException {
		DepartamentoVista dv = new DepartamentoVista();
		dv.setId(rs.getInt("id"));
		dv.setClave(rs.getString("clave"));
		dv.setDescripcion(rs.getString("descripcion"));
		dv.setJefeId(rs.getInt("jefe_id"));
		dv.setNombreJefe(rs.getString("nombre"));
		dv.setPaternoJefe(rs.getString("paterno"));
		dv.setMaternoJefe(rs.getString("materno"));
		return dv;
	}

}
