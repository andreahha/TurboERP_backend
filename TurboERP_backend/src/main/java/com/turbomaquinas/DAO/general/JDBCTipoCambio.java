package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.TipoCambio;

@Repository
public class JDBCTipoCambio implements TipoCambioDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void crear(TipoCambio t) throws DataAccessException{
		jdbcTemplate.update("INSERT INTO TIPOS_CAMBIO(fecha, tipo_cambio, creado_por) VALUES(?, ?, ?)",
				t.getFecha(), t.getTipo_cambio(), t.getCreado_por());
	}

	@Override
	public void actualizar(TipoCambio t) throws DataAccessException{
		jdbcTemplate.update("UPDATE TIPOS_CAMBIO SET fecha=?, tipo_cambio=?, activo=?, modificado_por=? WHERE id=?", 
				t.getFecha(), t.getTipo_cambio(), t.getActivo(), t.getModificado_por(), t.getId());
	}

	@Override
	public TipoCambio buscar(int id) throws DataAccessException{
		TipoCambio t = jdbcTemplate.queryForObject("SELECT id, fecha, tipo_cambio, activo, creado_por, creado, modificado_por, modificado FROM TIPOS_CAMBIO WHERE id=?", new TipoCambioRM(), id);
		return t;
	}

	@Override
	public List<TipoCambio> consultar() throws DataAccessException{
		List<TipoCambio> t = jdbcTemplate.query("SELECT id, fecha, tipo_cambio, activo, creado_por, creado, modificado_por, modificado FROM TIPOS_CAMBIO", new TipoCambioRM());
		return t;
	}

	@Override
	public TipoCambio aldia() throws DataAccessException {
		TipoCambio t = jdbcTemplate.queryForObject("SELECT * FROM TIPOS_CAMBIO WHERE fecha = CURRENT_DATE()", new TipoCambioRM());
		return t;
	}

	@Override
	public TipoCambio buscarPorFecha(String fecha) {
		TipoCambio t = jdbcTemplate.queryForObject("SELECT * FROM TIPOS_CAMBIO WHERE fecha = '"+fecha+"'", new TipoCambioRM());
		return t;
	}

}
