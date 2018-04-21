package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.Proyecto;

public class ProyectoRM implements RowMapper<Proyecto>{

	@Override
	public Proyecto mapRow(ResultSet rs, int i) throws SQLException {
		Proyecto p = new Proyecto();
		p.setId(rs.getInt("id"));
		p.setNumero(rs.getInt("numero"));
		p.setIniciales(rs.getString("iniciales"));
		p.setAnio(rs.getInt("anio"));
		p.setFecha_alta(rs.getDate("fecha_alta"));
		p.setDescripcion(rs.getString("descripcion"));
		p.setMonto(rs.getInt("monto"));
		p.setMoneda(rs.getString("moneda"));
		p.setMes_estimado(rs.getFloat("mes_estimado"));
		p.setAño_estimado(rs.getFloat("año_estimado"));
		p.setActivo(rs.getInt("activo"));
		p.setStatus(rs.getString("status"));
		p.setFecha_baja(rs.getDate("fecha_baja"));
		p.setFecha_detenido(rs.getDate("fecha_detenido"));
		p.setProbabilidad(rs.getString("probabilidad"));
		p.setComentario(rs.getString("comentario"));
		p.setFecha_cierre(rs.getDate("fecha_cierre"));
		p.setCreado_por(rs.getInt("creado_por"));
		p.setCreado(rs.getDate("creado"));
		p.setModificado_por(rs.getInt("modificado_por"));
		p.setModificado(rs.getDate("modificado"));
		p.setClientes_id(rs.getInt("clientes_id"));
		return p;
	}

}
