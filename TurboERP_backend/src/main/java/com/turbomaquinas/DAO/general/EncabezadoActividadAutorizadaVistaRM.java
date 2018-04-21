package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.EncabezadoActividadAutorizadaVista;

public class EncabezadoActividadAutorizadaVistaRM implements RowMapper<EncabezadoActividadAutorizadaVista>{

	@Override
	public EncabezadoActividadAutorizadaVista mapRow(ResultSet rs, int i) throws SQLException {
		EncabezadoActividadAutorizadaVista e = new EncabezadoActividadAutorizadaVista();
		e.setId(rs.getInt("id"));
		e.setDescripcion(rs.getString("descripcion"));
		e.setLugar(rs.getInt("lugar"));
		e.setActivo(rs.getInt("activo"));
		e.setOrdenes_id(rs.getInt("ordenes_id"));
		e.setNumero(rs.getInt("numero"));
		e.setAnio(rs.getInt("anio"));
		e.setOrden_descripcion(rs.getString("orden_descripcion"));
		e.setEncabezados_diagnostico_id(rs.getInt("encabezados_diagnostico_id"));
		return e;
	}

}
