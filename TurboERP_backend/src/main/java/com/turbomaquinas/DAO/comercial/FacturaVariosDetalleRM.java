package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.FacturaVariosDetalle;

public class FacturaVariosDetalleRM implements RowMapper<FacturaVariosDetalle>{

	@Override
	public FacturaVariosDetalle mapRow(ResultSet rs, int i) throws SQLException {
		FacturaVariosDetalle f = new FacturaVariosDetalle();
		f.setId(rs.getInt("id"));
		f.setDescripcion(rs.getString("descripcion"));
		f.setImporte(rs.getFloat("importe"));
		f.setActivo(rs.getInt("activo"));
		f.setCreado_por(rs.getInt("creado_por"));
		f.setCreado(rs.getDate("creado"));
		f.setModificado_por(rs.getInt("modificado_por"));
		f.setModificado(rs.getDate("modificado"));
		f.setProductos_sat_id(rs.getInt("productos_sat_id"));
		f.setFactura_varios_id(rs.getInt("factura_varios_id"));
		return f;
	}

}
