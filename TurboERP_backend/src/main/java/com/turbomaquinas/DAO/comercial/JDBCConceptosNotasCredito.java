package com.turbomaquinas.DAO.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.ConceptosNotasCredito;

@Repository
public class JDBCConceptosNotasCredito implements ConceptosNotasCreditoDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<ConceptosNotasCredito> consultar() {
		List<ConceptosNotasCredito> cnc = jdbcTemplate.query("SELECT * FROM CONCEPTOS_NOTAS_CREDITO WHERE activo = 1", 
				new ConceptosNotasCreditoRM());
		return cnc;
	}

}
