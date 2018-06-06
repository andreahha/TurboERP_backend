package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.PagosFacturas;

public class PagosFacturasRM implements RowMapper<PagosFacturas>{

	@Override
	public PagosFacturas mapRow(ResultSet rs, int i) throws SQLException {

		PagosFacturas pf = new PagosFacturas();
		pf.setPago_id(rs.getInt("pago_id"));
		pf.setTipo_cambio(rs.getBigDecimal("tipo_cambio"));
		pf.setFolio(rs.getInt("folio"));
		pf.setFactura_id(rs.getInt("factura_id"));
		pf.setTotal(rs.getBigDecimal("total"));
		pf.setTipo(rs.getString("tipo"));
		pf.setNumero(rs.getInt("numero"));
		pf.setMoneda(rs.getString("moneda"));
		pf.setImporte_pagado(rs.getBigDecimal("importe_pagado"));
		pf.setSaldo(rs.getBigDecimal("saldo"));
		pf.setCliente_id(rs.getInt("cliente_id"));
		
		return pf;
		
	}

}
