package com.turbomaquinas.DAO.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.DeptoContacto;

@Repository
public class JDBCDeptoContacto implements DeptoContactoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void crear(DeptoContacto dc) throws DataAccessException{
		jdbcTemplate.update("INSERT INTO DEPARTAMENTOS_CONTACTOS (descripcion, creado_por) VALUES(?, ?)", dc.getDescripcion(), dc.getCreado_por());
	}

	@Override
	public void actualizar(DeptoContacto dc) throws DataAccessException{
		jdbcTemplate.update("UPDATE DEPARTAMENTOS_CONTACTOS SET descripcion=? WHERE id=?", dc.getDescripcion(), dc.getId());
	}

	@Override
	public DeptoContacto buscar(int id) throws DataAccessException{
		DeptoContacto dc = jdbcTemplate.queryForObject("SELECT "
				+ "id, "
				+ "descripcion, "
				+ "activo, "
				+ "creado_por, "
				+ "creado, "
				+ "modificado_por, "
				+ "modificado "
				+ "FROM DEPARTAMENTOS_CONTACTOS "
				+ "WHERE id=?", 
				new DeptoContactoRM(), id);
		return dc;
	}

	@Override
	public List<DeptoContacto> consultar() throws DataAccessException{
		List<DeptoContacto> dc = jdbcTemplate.query("SELECT "
				+ "id, "
				+ "descripcion, "
				+ "activo, "
				+ "creado_por, "
				+ "creado, "
				+ "modificado_por, "
				+ "modificado "
				+ "FROM DEPARTAMENTOS_CONTACTOS", 
				new DeptoContactoRM());
		return dc;
	}

}
