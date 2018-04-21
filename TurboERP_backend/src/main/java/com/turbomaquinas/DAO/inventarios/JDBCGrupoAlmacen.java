package com.turbomaquinas.DAO.inventarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.turbomaquinas.POJO.inventarios.GrupoAlmacen;

@Repository
public class JDBCGrupoAlmacen implements GrupoAlmacenDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<GrupoAlmacen> consultar() {
		String sql = "SELECT * FROM GRUPOS_ALMACEN";
		List<GrupoAlmacen> gm = jdbcTemplate.query(sql, new GrupoAlmacenRM());
		return gm;
	}

}
