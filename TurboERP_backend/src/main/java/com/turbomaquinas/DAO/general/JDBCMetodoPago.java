package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.MetodoPago;

@Repository
public class JDBCMetodoPago implements MetodoPagoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public MetodoPago buscar(int id) throws DataAccessException{
		MetodoPago mp = jdbcTemplate.queryForObject("SELECT id, descripcion, clave, activo, creado_por, creado, modificado_por, modificado FROM METODOS_PAGO WHERE id=?", new MetodoPagoRM(), id);
		return mp;
	}

	@Override
	public List<MetodoPago> consultar() throws DataAccessException{
		List<MetodoPago> mp = jdbcTemplate.query("SELECT id, descripcion, clave, activo, creado_por, creado, modificado_por, modificado FROM METODOS_PAGO", new MetodoPagoRM());
		return mp;
	}

	@Override
	public MetodoPago buscarPorClave(String clave) throws DataAccessException {
		MetodoPago mpc = jdbcTemplate.queryForObject("SELECT * FROM METODOS_PAGO WHERE clave = ?", new MetodoPagoRM(), clave);
		return mpc;
	}

}
