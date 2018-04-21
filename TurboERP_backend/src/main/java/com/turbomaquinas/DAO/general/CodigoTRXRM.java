package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.CodigoTRX;

public class CodigoTRXRM implements RowMapper<CodigoTRX> {

	@Override
	public CodigoTRX mapRow(ResultSet rs, int i) throws SQLException {
		CodigoTRX codigo = new CodigoTRX();
		codigo.setId(rs.getInt("id"));
		codigo.setCodigo(rs.getString("codigo"));
		codigo.setTitulo(rs.getString("titulo"));
		codigo.setUri(rs.getString("uri"));
		return codigo;
	}

}
