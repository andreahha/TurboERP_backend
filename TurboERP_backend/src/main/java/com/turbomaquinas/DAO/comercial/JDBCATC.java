package com.turbomaquinas.DAO.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.DAO.general.PersonalRM;
import com.turbomaquinas.POJO.general.Personal;

@Repository
public class JDBCATC implements ATCDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Personal> consultar() throws DataAccessException {
		List<Personal> atcs = jdbcTemplate.query("SELECT * FROM PERSONAL P JOIN `CUBRE` C ON (P.`id`=C.`PERSONAL_id`) JOIN `PUESTOS` PS ON (PS.`id`=C.`PUESTOS_id`) WHERE (P.`DEPARTAMENTOS_id` = (SELECT id FROM `DEPARTAMENTOS` WHERE clave = 'CO')) AND (PS.`clave`= '004')", new PersonalRM());
		return atcs;
	}

}
