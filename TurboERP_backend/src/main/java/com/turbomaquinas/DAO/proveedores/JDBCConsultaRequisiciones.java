package com.turbomaquinas.DAO.proveedores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.proveedores.ConsultaRequisiciones;

@Repository
public class JDBCConsultaRequisiciones implements ConsultaRequisicionesDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<ConsultaRequisiciones> consultar() throws DataAccessException{
		List<ConsultaRequisiciones> codigo = jdbcTemplate.query("SELECT * FROM CONSULTA_REQUISICIONES", 
				new ConsultaRequisicionesRM());
		return codigo;
	}

	@Override
	public List<ConsultaRequisiciones> consultarPorOrden(int id) throws DataAccessException{
		List<ConsultaRequisiciones> codigo = jdbcTemplate.query("SELECT * FROM CONSULTA_REQUISICIONES WHERE ORDENES_REQUISICIONES_id = ? order by fecha_requisicion and numero_requisicion ", 
				new ConsultaRequisicionesRM(), id);
		return codigo;
	}

	
}
