package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.FechasEstimadasCobro;

public class FechasEstimadasCobroRM implements RowMapper<FechasEstimadasCobro>{
	
	@Override
	public FechasEstimadasCobro mapRow(ResultSet rs, int i) throws SQLException {
		FechasEstimadasCobro fec= new FechasEstimadasCobro();
		fec.setId(rs.getInt("id"));
		fec.setFecha_cobro(rs.getDate("fecha_cobro"));
		fec.setComentario(rs.getString("comentario"));
		fec.setIndefinida(rs.getInt("indefinida"));
		fec.setNegociacion(rs.getInt("negociacion"));
		fec.setActivo(rs.getInt("activo"));
		fec.setCreado_por(rs.getInt("creado_por"));
		fec.setCreado(rs.getTimestamp("creado"));
		fec.setModificado_por(rs.getInt("modificado_por"));
		fec.setModificado(rs.getTimestamp("modificado"));
		fec.setFactura_final_id(rs.getInt("factura_final_id"));
		return fec;
	}

}
