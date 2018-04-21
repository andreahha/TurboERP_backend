package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.ProductosSat;

@Repository
public class JDBCProductosSat implements ProductosSatDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public ProductosSat buscar(String codigo) throws DataAccessException {
		ProductosSat ps = jdbcTemplate.queryForObject("SELECT * FROM PRODUCTOS_SAT WHERE codigo = ?", 
				new ProductosSatRM(), codigo );
		return ps;
	}

	@Override
	public List<ProductosSat> consultar() throws DataAccessException {
		List<ProductosSat> psl = jdbcTemplate.query("SELECT * FROM PRODUCTOS_SAT", 
				new ProductosSatRM());
		return psl;
	}

}
