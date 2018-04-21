package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.Parametro;

public class ParametroRM implements RowMapper<Parametro>{

	@Override
	public Parametro mapRow(ResultSet rs, int i) throws SQLException {
		Parametro p = new Parametro();
		p.setId(rs.getInt("id"));
		p.setMes_proceso_co(rs.getInt("mes_proceso_co"));
		p.setAnio_proceso_co(rs.getInt("anio_proceso_co"));
		p.setActivo(rs.getInt("activo"));
		p.setUsuario_ultimo_cierre_co(rs.getInt("usuario_ultimo_cierre_co"));
		p.setFecha_ultimo_cierre_co(rs.getDate("fecha_ultimo_cierre_co"));
		p.setAjuste_total_tc(rs.getFloat("ajuste_total_tc"));
		p.setDiferencia_tc_pagos(rs.getFloat("diferencia_tc_pagos"));
		return p;
	}

}
