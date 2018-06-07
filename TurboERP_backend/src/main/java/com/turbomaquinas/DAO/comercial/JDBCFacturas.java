package com.turbomaquinas.DAO.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.FacturaFinalVista;
import com.turbomaquinas.POJO.comercial.Facturas;

@Repository
public class JDBCFacturas implements FacturasDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Facturas> consultarFacturasPendientesPorCliente(int id, String moneda) {
		String filtradoMoneda = "";		
	   	if(!moneda.equals("*")){
			filtradoMoneda = "and moneda = ?";
		}	   	
		String sql = "SELECT * "
				+ "FROM FACTURAS_V fv "
				+ "WHERE saldo > 0 AND estado='T' AND clientes_id=? "+filtradoMoneda;
		List<Facturas> fv = null;
	    
	    if(moneda.equals("*")){
	    	 fv = jdbcTemplate.query(sql,new FacturasRM(), id);
		}
	    else{
			fv = jdbcTemplate.query(sql,new FacturasRM(), id, moneda);
	    }			
		return fv;
	}

	@Override
	public Facturas buscar(int id, String tipo) {
		String sql = "SELECT * FROM turbomaquinas.FACTURAS_V where id = ? and tipo = ?;";
		Facturas fb = jdbcTemplate.queryForObject(sql, new FacturasRM(), id, tipo);
		return fb;
	}

}
