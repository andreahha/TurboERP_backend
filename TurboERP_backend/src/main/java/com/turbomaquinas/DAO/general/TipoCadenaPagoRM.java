package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.TipoCadenaPago;

public class TipoCadenaPagoRM implements RowMapper<TipoCadenaPago>{

	@Override
	public TipoCadenaPago mapRow(ResultSet rs, int i) throws SQLException {
		TipoCadenaPago tcp=new TipoCadenaPago();
		tcp.setId(rs.getInt("id"));
		tcp.setClave(rs.getString("clave"));
		tcp.setDescripcion(rs.getString("descripcion"));
		tcp.setActivo(rs.getInt("activo"));
		tcp.setCreado_por(rs.getInt("creado_por"));
		tcp.setCreado(rs.getDate("creado"));
		tcp.setModificado_por(rs.getInt("modificado_por"));
		tcp.setModificado(rs.getDate("modificado"));
		return tcp;
	}

}
