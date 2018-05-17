package com.turbomaquinas.DAO.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.CatalogoCuentas;

@Repository
public class JDBCCatalogoCuentas implements CatalogoCuentasDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<CatalogoCuentas> consultar() {
		List<CatalogoCuentas> cc = jdbcTemplate.query("SELECT * FROM CATALOGO_CUENTAS WHERE activo = 1",
				new CatalogoCuentasRM());
		return cc;
	}
	
	
	

}
