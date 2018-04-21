package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.CtasbanVista;

public class CtasbanVistaRM implements RowMapper<CtasbanVista>{

	@Override
	public CtasbanVista mapRow(ResultSet rs, int i) throws SQLException {
		
		CtasbanVista cbv = new CtasbanVista();
		cbv.setId(rs.getInt("id"));
		cbv.setNumero(rs.getString("numero"));
		cbv.setDolares(rs.getInt("dolares"));
		cbv.setDescripcion(rs.getString("descripcion"));
		cbv.setActivo(rs.getInt("activo"));
		cbv.setCatalogo_cuentas_id(rs.getInt("catalogo_cuentas_id"));
		cbv.setCuenta_contable(rs.getString("cuenta_contable"));
		cbv.setNombre_cuenta(rs.getString("nombre_cuenta"));
		cbv.setBancos_id(rs.getInt("bancos_id"));
		cbv.setClave_bco(rs.getString("clave_bco"));
		cbv.setRfc_bco(rs.getString("rfc_bco"));
		cbv.setNombre_bco(rs.getString("nombre_banco"));
		return cbv;
	}

}
