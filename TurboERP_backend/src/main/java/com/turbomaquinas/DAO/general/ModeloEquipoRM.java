package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.ModeloEquipo;


public class ModeloEquipoRM implements RowMapper<ModeloEquipo>{

	@Override
	public ModeloEquipo mapRow(ResultSet rs, int i) throws SQLException {
		ModeloEquipo me = new ModeloEquipo();
		me.setId(rs.getInt("id"));
		me.setDescripcion(rs.getString("descripcion"));
		me.setActivo(rs.getInt("activo"));
		me.setCreado_por(rs.getInt("creado_por"));
		me.setCreado(rs.getDate("creado"));
		me.setModificado_por(rs.getInt("modificado_por"));
		me.setModificado(rs.getDate("modificado"));
		return me;
	}

}
