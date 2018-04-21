package com.turbomaquinas.DAO.produccion;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.produccion.AreasVista;

public class AreasVistaRM implements RowMapper<AreasVista> {

	@Override
	public AreasVista mapRow(ResultSet rs, int i) throws SQLException {
		
		AreasVista av = new AreasVista();
		av.setId(rs.getInt("id"));
		av.setNumero(rs.getInt("numero"));
		av.setSubindice(rs.getString("subindice"));
		av.setFecha_ingreso(rs.getDate("fecha_ingreso"));
		av.setHora_ingreso(rs.getTime("hora_ingreso"));
		av.setActivo(rs.getInt("activo"));
		av.setOrdenes_id(rs.getInt("ordenes_id"));
		av.setNumero_orden(rs.getString("numero_orden"));
		av.setDescripcion(rs.getString("descripcion"));
		av.setEstado(rs.getString("estado"));
		return av;
	}
}
