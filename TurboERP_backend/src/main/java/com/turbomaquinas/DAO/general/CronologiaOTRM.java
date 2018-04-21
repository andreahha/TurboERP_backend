package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.CronologiaOT;

public class CronologiaOTRM implements RowMapper<CronologiaOT>{

	@Override
	public CronologiaOT mapRow(ResultSet rs, int i) throws SQLException {
		CronologiaOT c = new CronologiaOT();
		c.setOrdenes_id(rs.getInt("ordenes_id"));
		c.setFecha(rs.getDate("fecha"));
		c.setTipo(rs.getString("tipo"));
		c.setId(rs.getInt("id"));
		c.setCreado(rs.getString("creado"));
		c.setCreado_por(rs.getString("creado_por"));
		return c;
	}
}
