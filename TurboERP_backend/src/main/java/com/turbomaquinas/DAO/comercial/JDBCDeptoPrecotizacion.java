package com.turbomaquinas.DAO.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.DeptoPrecotizacion;
import com.turbomaquinas.POJO.comercial.DeptoPrecotizacionVista;

@Repository
public class JDBCDeptoPrecotizacion implements DeptoPrecotizacionDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void crear(DeptoPrecotizacion dp) throws DataAccessException{
		jdbcTemplate.update("INSERT INTO DEPTOS_PRECOTIZACIONES("
				+ "creado_por, "
				+ "DETALLE_PRECOTIZACIONES_id, "
				+ "DEPARTAMENTOS_id) "
				+ "VALUES(?, ?, ?, ?)", 
				dp.getCreado_por(), 
				dp.getDetalle_precotizaciones_id(), 
				dp.getDepartamentos_id());
	}

	@Override
	public void actualizar(DeptoPrecotizacion dp) throws DataAccessException{
		jdbcTemplate.update("UPDATE DEPTOS_PRECOTIZACIONES SET "
				+ "DETALLE_PRECOTIZACIONES_id=?, "
				+ "DEPARTAMENTOS_id=? WHERE id=?", 
				dp.getDetalle_precotizaciones_id(), 
				dp.getDepartamentos_id(), 
				dp.getId());
	}
	
	@Override
	public DeptoPrecotizacionVista buscar(int id) throws DataAccessException{
		DeptoPrecotizacionVista dpv = jdbcTemplate.queryForObject("SELECT "
				+ "id, "
				+ "fechaRegistro, "
				+ "detalle_precotizaciones_id, "
				+ "detalle_precotizacion, "
				+ "departamentos_id, "
				+ "departamento "
				+ "FROM DEPTOS_PRECOTIZACIONES_V WHERE id=?", 
				new DeptoPrecotizacionVistaRM(), id);
		return dpv;
	}

	@Override
	public List<DeptoPrecotizacionVista> consultar() throws DataAccessException{
		List<DeptoPrecotizacionVista> dpv = jdbcTemplate.query("SELECT "
				+ "id, "
				+ "fechaRegistro, "
				+ "detalle_precotizaciones_id, "
				+ "detalle_precotizacion, "
				+ "departamentos_id, "
				+ "departamento "
				+ "FROM DEPTOS_PRECOTIZACIONES_V", 
				new DeptoPrecotizacionVistaRM());
		return dpv;
	}
}
