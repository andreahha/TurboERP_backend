package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.TipoCambio;

public class TipoCambioRM implements RowMapper<TipoCambio>{

	@Override
	public TipoCambio mapRow(ResultSet rs, int i) throws SQLException {
		TipoCambio tc = new TipoCambio();
		tc.setId(rs.getInt("id"));
		tc.setFecha(rs.getDate("fecha"));
		tc.setTipo_cambio(rs.getFloat("tipo_cambio"));
		tc.setActivo(rs.getInt("activo"));
		tc.setCreado_por(rs.getInt("creado_por"));
		tc.setCreado(rs.getDate("creado"));
		tc.setModificado_por(rs.getInt("modificado_por"));
		tc.setModificado(rs.getDate("modificado"));
		return tc;
	}

}
