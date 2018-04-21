package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.ActividadesFA;

public class ActividadesFARM implements RowMapper<ActividadesFA>{

	@Override
	public ActividadesFA mapRow(ResultSet rs, int i) throws SQLException {
		
		ActividadesFA afa = new ActividadesFA();
		afa.setId(rs.getInt("id"));
		afa.setImporte(rs.getFloat("importe"));
		afa.setActivo(rs.getInt("activo"));
		afa.setCreado_por(rs.getInt("creado_por"));
		afa.setCreado(rs.getDate("creado"));
		afa.setModificado_por(rs.getInt("modificado_por"));
		afa.setModificado(rs.getDate("modificado"));
		afa.setActividades_autorizadas_id(rs.getInt("actividades_autorizadas_id"));
		afa.setFacturas_anticipo_id(rs.getInt("facturas_anticipo_id"));
		return afa;
	}

}
