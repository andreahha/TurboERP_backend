package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.ActividadesFF;

public class ActividadesFFRM implements RowMapper<ActividadesFF>{

	@Override
	public ActividadesFF mapRow(ResultSet rs, int i) throws SQLException {

		ActividadesFF aff = new ActividadesFF();
		aff.setId(rs.getInt("id"));
		aff.setDescripcion(rs.getString("descripcion"));
		aff.setSubtotal(rs.getFloat("subtotal"));
		aff.setDescuento(rs.getFloat("descuento"));
		aff.setTipo_actividad(rs.getString("tipo_actividad"));
		aff.setActivo(rs.getInt("activo"));
		aff.setCreado_por(rs.getInt("creado_por"));
		aff.setCreado(rs.getDate("creado"));
		aff.setModificado_por(rs.getInt("modificado_por"));
		aff.setModificado(rs.getDate("modificado"));
		aff.setFactura_final_id(rs.getInt("factura_final_id"));
		aff.setProductos_sat_id(rs.getInt("productos_sat_id"));
		aff.setMedidas_sat_id(rs.getInt("medidas_sat_id"));
		aff.setConceptos_facturacion_id(rs.getInt("conceptos_facturacion_id"));
		return aff;
	}
	
	

}
