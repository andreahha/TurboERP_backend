package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.Parametro;

@Repository
public class JDBCParametro implements ParametroDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Parametro> consultar() {
		String sql = "select * from PARAMETROS";
		List<Parametro> pa = jdbcTemplate.query(sql,
				new ParametroRM());
		return pa;
	}
	
	@Override
	public Parametro buscar(int id) throws DataAccessException{
		Parametro p = jdbcTemplate.queryForObject("SELECT * FROM PARAMETROS WHERE id=?", new ParametroRM(), id);
		return p;
	}

	@Override
	public Parametro cierreMes(Parametro parametro) throws DataAccessException{
		jdbcTemplate.update("UPDATE PARAMETROS SET mes_proceso_co=?, anio_proceso_co=?, usuario_ultimo_cierre_co=? "
				+ "WHERE id=?", parametro.getMes_proceso_co(), parametro.getAnio_proceso_co(), 
				parametro.getUsuario_ultimo_cierre_co(), parametro.getId());
		return parametro;		
	}

	
}
