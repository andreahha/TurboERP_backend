package com.turbomaquinas.DAO.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.general.OrdenesRequisiciones;

@Repository
public class JDBCOrdenesRequisiciones implements OrdenesRequisicionesDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<OrdenesRequisiciones> consultar() {
		List<OrdenesRequisiciones> o = jdbcTemplate.query("SELECT * FROM ORDENES_REQUISICIONES ", 
				new OrdenesRequisicionesRM());
			return o;
	}

}
