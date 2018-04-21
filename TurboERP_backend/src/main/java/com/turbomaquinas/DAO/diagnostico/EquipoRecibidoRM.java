package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.EquipoRecibido;

public class EquipoRecibidoRM implements RowMapper<EquipoRecibido>{

	@Override
	public EquipoRecibido mapRow(ResultSet rs, int i) throws SQLException {
		
		EquipoRecibido er = new EquipoRecibido();
		er.setId(rs.getInt("id"));
		er.setDescripcion_equipo(rs.getString("descripcion_equipo"));
		er.setFecha_ingreso(rs.getDate("fecha_ingreso"));
		er.setDescripcion_empaque(rs.getString("descripcion_empaque"));
		er.setCantidad(rs.getInt("cantidad"));
		er.setPeso(rs.getInt("peso"));
		er.setUsuario_acepta(rs.getInt("usuario_acepta"));
		er.setFecha_acepta(rs.getDate("fecha_acepta"));	
		er.setActivo(rs.getInt("activo"));
		er.setCreado_por(rs.getInt("creado_por"));
		er.setCreado(rs.getDate("creado"));
		er.setModificado_por(rs.getInt("modificado_por"));
		er.setModificado(rs.getDate("modificado"));
		er.setOrdenes_id(rs.getInt("ordenes_id"));
		er.setOrdenes_id_adonde(rs.getInt("ordenes_id"));
		er.setEs_recibir_equipo(rs.getInt("es_recibir_equipo"));
		return er;
	}

}
