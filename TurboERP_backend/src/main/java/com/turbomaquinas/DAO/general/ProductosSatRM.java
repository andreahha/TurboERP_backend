package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.ProductosSat;

public class ProductosSatRM implements RowMapper<ProductosSat> {

	@Override
	public ProductosSat mapRow(ResultSet rs, int i) throws SQLException {
		
		ProductosSat ps = new ProductosSat();
		ps.setId(rs.getInt("id"));
		ps.setCodigo(rs.getString("codigo"));
		ps.setDescripcion(rs.getString("descripcion"));
		ps.setActivo(rs.getInt("activo"));
		ps.setCreado_por(rs.getInt("creado_por"));
		ps.setCreado(rs.getDate("creado"));
		ps.setModificado_por(rs.getInt("modificado_por"));
		ps.setModificado(rs.getDate("modificado"));
		return ps;
	}
	

}
