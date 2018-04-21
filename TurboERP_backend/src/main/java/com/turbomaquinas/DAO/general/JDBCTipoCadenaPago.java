package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.TipoCadenaPago;

@Repository
public class JDBCTipoCadenaPago implements TipoCadenaPagoDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void crear(TipoCadenaPago tcp) throws DataAccessException {
		jdbcTemplate.update("INSERT INTO TIPOS_CADENA_PAGO(clave, descripcion, creado_por) VALUES(?, ?, ?)",
				tcp.getClave(), tcp.getDescripcion(), tcp.getCreado_por());
		
	}

	@Override
	public void actualizar(TipoCadenaPago tcp) throws DataAccessException {
		jdbcTemplate.update("UPDATE TIPOS_CADENA_PAGO SET clave=?, descripcion=? WHERE id=?", 
				tcp.getClave(), tcp.getDescripcion(), tcp.getId());
		
	}

	@Override
	public TipoCadenaPago buscar(int id) throws DataAccessException {
		TipoCadenaPago tcp = jdbcTemplate.queryForObject("SELECT * FROM TIPOS_CADENA_PAGO WHERE id=?", new TipoCadenaPagoRM(), id);
		return tcp;
	}

	@Override
	public List<TipoCadenaPago> consultar() throws DataAccessException {
		List<TipoCadenaPago> tcp = jdbcTemplate.query("SELECT * FROM TIPOS_CADENA_PAGO", new TipoCadenaPagoRM());
		System.out.println(tcp);
		return tcp;
	}

	@Override
	public TipoCadenaPago buscarClave(String clave) throws DataAccessException {
		TipoCadenaPago tcp = jdbcTemplate.queryForObject("SELECT * FROM TIPOS_CADENA_PAGO WHERE clave = ?", 
				new TipoCadenaPagoRM(), clave);
		
		return tcp;
	}

}
