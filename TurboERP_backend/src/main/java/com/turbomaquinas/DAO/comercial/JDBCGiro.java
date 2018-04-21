package com.turbomaquinas.DAO.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.Giro;

@Repository
public class JDBCGiro implements GiroDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void Crear(Giro giro) throws DataAccessException{
		jdbcTemplate.update("INSERT INTO GIROS(descripcion, extranjero, creado_por) VALUES(?, ?, ?)", 
				giro.getDescripcion(), giro.getExtranjero(), giro.getCreado_por());
	}

	@Override
	public Giro Buscar(int id) throws DataAccessException{
		Giro giro = jdbcTemplate.queryForObject("SELECT "
				+ "id, "
				+ "numero, "
				+ "descripcion, "
				+ "extranjero, "
				+ "activo, "
				+ "creado_por, "
				+ "creado, "
				+ "modificado_por, "
				+ "modificado "
				+ "FROM GIROS "
				+ "WHERE id = ?", 
				new GiroRM(), id);
		return giro;
	}

	@Override
	public List<Giro> Consultar() throws DataAccessException{
		List<Giro> giro = jdbcTemplate.query("SELECT "
				+ "id, "
				+ "numero, "
				+ "descripcion, "
				+ "extranjero, "
				+ "activo, "
				+ "creado_por, "
				+ "creado, "
				+ "modificado_por, "
				+ "modificado "
				+ "FROM GIROS ",
				new GiroRM());
		return giro;
	}

	@Override
	public void actualizar(Giro giro) throws DataAccessException{
		jdbcTemplate.update("UPDATE GIROS SET descripcion=?, extranjero=? WHERE id=?", 
				giro.getDescripcion(), giro.getExtranjero(), giro.getId());
	}
	

}
