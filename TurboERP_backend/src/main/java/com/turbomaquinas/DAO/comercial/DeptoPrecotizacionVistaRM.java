package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.DeptoPrecotizacionVista;

public class DeptoPrecotizacionVistaRM implements RowMapper<DeptoPrecotizacionVista>{

	@Override
	public DeptoPrecotizacionVista mapRow(ResultSet rs, int i) throws SQLException {
		DeptoPrecotizacionVista dpv = new DeptoPrecotizacionVista();
		dpv.setId(rs.getInt("id"));
		dpv.setFechaRegistro(rs.getDate("fechaRegistro"));
		dpv.setDetalle_precotizaciones_id(rs.getInt("detalle_precotizaciones_id"));
		dpv.setDetalle_precotizacion(rs.getString("detalle_precotizacion"));
		dpv.setDepartamentos_id(rs.getInt("departamentos_id"));
		dpv.setDepartamento(rs.getString("departamento"));
		return dpv;
	}

}
