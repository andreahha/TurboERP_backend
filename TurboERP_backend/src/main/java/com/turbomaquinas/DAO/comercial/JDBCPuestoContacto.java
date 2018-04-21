package com.turbomaquinas.DAO.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.PuestoContacto;

@Repository
public class JDBCPuestoContacto implements PuestoContactoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void crear(PuestoContacto pc) throws DataAccessException{
		jdbcTemplate.update("INSERT INTO PUESTOS_CONTACTOS (descripcion, creado_por) VALUES(?, ?)", pc.getDescripcion(), pc.getCreado_por());
	}

	@Override
	public void actualizar(PuestoContacto pc) throws DataAccessException{
		jdbcTemplate.update("UPDATE PUESTOS_CONTACTOS SET descripcion=? WHERE id=?", pc.getDescripcion(), pc.getId());
	}

	@Override
	public PuestoContacto buscar(int id) throws DataAccessException{
		PuestoContacto pc = jdbcTemplate.queryForObject("SELECT "
				+ "id, "
				+ "descripcion, "
				+ "activo, "
				+ "creado_por, "
				+ "creado, "
				+ "modificado_por, "
				+ "modificado " 
				+ "FROM PUESTOS_CONTACTOS "
				+ "WHERE id=?", 
				new PuestoContactoRM(), id);
		return pc;
	}

	@Override
	public List<PuestoContacto> consultar() throws DataAccessException{
		List<PuestoContacto> pc = jdbcTemplate.query("SELECT "
				+ "id, "
				+ "descripcion, "
				+ "activo, "
				+ "creado_por, "
				+ "creado, "
				+ "modificado_por, "
				+ "modificado " 
				+ "FROM PUESTOS_CONTACTOS ", 
				new PuestoContactoRM());
		return pc;
	}

}
