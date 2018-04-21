package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.ClienteFacturar;

public class ClienteFacturarRM implements RowMapper<ClienteFacturar>{

	@Override
	public ClienteFacturar mapRow(ResultSet rs, int i) throws SQLException {
		ClienteFacturar ct = new ClienteFacturar();
		
		ct.setId(rs.getInt("id"));
		ct.setNumgiro(rs.getInt("numgiro"));
		ct.setNumcliente(rs.getInt("numcliente"));
		ct.setNombreCliente(rs.getString("nombreCliente"));
		
		return ct;
	}
	
}
