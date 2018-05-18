package com.turbomaquinas.DAO.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.ConceptosNotasCredito;
import com.turbomaquinas.POJO.comercial.ConceptosNotasCreditoVista;

@Repository
public class JDBCConceptosNotasCredito implements ConceptosNotasCreditoDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public ConceptosNotasCreditoVista buscar(int id) throws DataAccessException {
		ConceptosNotasCreditoVista cncv = jdbcTemplate.queryForObject("SELECT * FROM CONCEPTOS_NOTAS_CREDITO_V"
				+ " WHERE id= ?", new ConceptosNotasCreditoVistaRM(), id);
		return cncv;
	}
	
	@Override
	public List<ConceptosNotasCredito> consultar() throws DataAccessException {
		List<ConceptosNotasCredito> cnc = jdbcTemplate.query("SELECT * FROM CONCEPTOS_NOTAS_CREDITO WHERE activo = 1", 
				new ConceptosNotasCreditoRM());
		return cnc;
	}

	

}
