package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.DetalleRemisionEmbarqueVista;

public class DetalleEmbarqueVistaRM implements RowMapper<DetalleRemisionEmbarqueVista>{
	
	@Override
	public DetalleRemisionEmbarqueVista mapRow(ResultSet rs, int i) throws SQLException {
		DetalleRemisionEmbarqueVista drev = new DetalleRemisionEmbarqueVista();
		drev.setId(rs.getInt("id"));
		drev.setComentarios(rs.getString("comentarios"));
		drev.setStatus_reparacion(rs.getString("status_reparacion"));
		drev.setActivo(rs.getInt("activo"));
		drev.setCreado_por(rs.getInt("creado_por"));
		drev.setCreado(rs.getDate("creado"));
		drev.setModificado_por(rs.getInt("modificado_por"));
		drev.setModificado(rs.getDate("modificado"));
		drev.setRemisiones_embarque_id(rs.getInt("remisiones_embarque_id"));
		drev.setEquipo_recibido_id(rs.getInt("equipo_recibido_id"));
		drev.setDescripcion_equipo(rs.getString("descripcion_equipo"));
		drev.setDescripcion_empaque(rs.getString("descripcion_empaque"));
		drev.setPeso(rs.getFloat("peso"));
		drev.setFecha_ingreso(rs.getDate("fecha_ingreso"));
		
		return drev;
	}

}
