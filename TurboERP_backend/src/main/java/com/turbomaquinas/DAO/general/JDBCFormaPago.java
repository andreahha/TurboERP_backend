package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.FormaPago;

@Repository
public class JDBCFormaPago implements FormaPagoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public FormaPago buscar(int id) throws DataAccessException{
		FormaPago fp = jdbcTemplate.queryForObject("SELECT id, descripcion, clave, activo, creado_por, creado, modificado_por, modificado FROM FORMAS_PAGO WHERE id=?", new FormaPagoRM(), id);
		return fp;
	}

	@Override
	public List<FormaPago> consultar() throws DataAccessException{
		List<FormaPago> fp = jdbcTemplate.query("SELECT id, descripcion, clave, activo, creado_por, creado, modificado_por, modificado FROM FORMAS_PAGO", new FormaPagoRM());
		return fp;
	}

	@Override
	public FormaPago buscarPorClave(String clave) throws DataAccessException {
		FormaPago fpc = jdbcTemplate.queryForObject("SELECT * FROM FORMAS_PAGO WHERE clave =?", new FormaPagoRM(), clave);
		return fpc;
	}

}
