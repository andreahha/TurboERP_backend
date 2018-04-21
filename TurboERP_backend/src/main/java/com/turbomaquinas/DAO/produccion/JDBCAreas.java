package com.turbomaquinas.DAO.produccion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.produccion.Area;
import com.turbomaquinas.POJO.produccion.AreasVista;

@Repository
public class JDBCAreas implements AreasVistaDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Area actualizar(Area a) throws DataAccessException{
		jdbcTemplate.update("UPDATE AREAS SET modificado_por=?, ORDENES_id=? WHERE id=?", 
				a.getModificado_por(), a.getOrdenes_id(), a.getId());
		return a;		
	}

	@Override
	public AreasVista buscar(int id) throws DataAccessException {
		AreasVista av = jdbcTemplate.queryForObject("SELECT * FROM AREAS_V WHERE id = ? ", new AreasVistaRM(),id);
		return av;
	}

	@Override
	public List<AreasVista> consultar()throws DataAccessException {
		List<AreasVista> avl = jdbcTemplate.query("SELECT * FROM AREAS_V", new AreasVistaRM());
		return avl;
	}

	@Override
	public List<AreasVista> buscarPorOrden(int id) throws DataAccessException {
		List<AreasVista> diov = jdbcTemplate.query("SELECT * FROM AREAS_V "
				+ "WHERE ordenes_id = ? ",new AreasVistaRM(), id);
		return diov;
	}

	@Override
	public List<AreasVista> consultarAreasLibres() throws DataAccessException {
		List<AreasVista> al = jdbcTemplate.query("SELECT * FROM AREAS_V WHERE ordenes_id IS NULL", new AreasVistaRM());
		return al;
	}
}
