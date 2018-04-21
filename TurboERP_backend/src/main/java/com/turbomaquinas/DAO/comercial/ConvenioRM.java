package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.Convenio;

public class ConvenioRM implements RowMapper<Convenio>{

	@Override
	public Convenio mapRow(ResultSet rs, int i) throws SQLException {
		Convenio c = new Convenio();
		c.setId(rs.getInt("id"));
		c.setComentarios(rs.getString("comentarios"));
		c.setRevision(rs.getInt("revision"));
		c.setSustituye_id(rs.getInt("sustituye_id"));
		c.setActivo(rs.getInt("activo"));
		c.setCreado_por(rs.getInt("creado_por"));
		c.setCreado(rs.getDate("creado"));
		c.setModificado_por(rs.getInt("modificado_por"));
		c.setModificado(rs.getDate("modificado"));
		c.setOrdenes_id(rs.getInt("ordenes_id"));
		return c;
	}
}
