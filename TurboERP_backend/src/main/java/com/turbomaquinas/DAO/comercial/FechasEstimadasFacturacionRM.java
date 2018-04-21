package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.FechasEstimadasFacturacion;

public class FechasEstimadasFacturacionRM implements RowMapper<FechasEstimadasFacturacion>{

	@Override
	public FechasEstimadasFacturacion mapRow(ResultSet rs, int i) throws SQLException {
		FechasEstimadasFacturacion fef= new FechasEstimadasFacturacion();
		fef.setId(rs.getInt("id"));
		fef.setFecha_estimada(rs.getDate("fecha_estimada"));
		fef.setComentario(rs.getString("comentario"));
		fef.setIndefinida(rs.getInt("indefinida"));
		fef.setActivo(rs.getInt("activo"));
		fef.setCreado_por(rs.getInt("creado_por"));
		fef.setCreado(rs.getTimestamp("creado"));
		fef.setModificado_por(rs.getInt("modificado_por"));
		fef.setModificado(rs.getTimestamp("modificado"));
		fef.setOrdenes_id(rs.getInt("ordenes_id"));
		return fef;
	}

}
