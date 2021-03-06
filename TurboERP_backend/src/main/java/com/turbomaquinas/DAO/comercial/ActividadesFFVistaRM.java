package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.ActividadesFFVista;

public class ActividadesFFVistaRM implements RowMapper<ActividadesFFVista>{
	
	@Override
	public ActividadesFFVista mapRow(ResultSet rs, int i) throws SQLException {
		
		ActividadesFFVista aff = new ActividadesFFVista();
		aff.setId(rs.getInt("id"));
		aff.setDescripcion(rs.getString("descripcion"));
		aff.setCantidad(rs.getInt("cantidad"));
		aff.setPrecio_unitario(rs.getBigDecimal("precio_unitario"));
		aff.setImporte(rs.getBigDecimal("importe"));
		aff.setDescuento(rs.getBigDecimal("descuento"));
		aff.setCuota_iva(rs.getFloat("cuota_iva"));
		aff.setCuota_iva_retenido(rs.getFloat("cuota_iva_retenido"));
		aff.setTipo_actividad(rs.getString("tipo_actividad"));
		aff.setActivo(rs.getInt("activo"));
		aff.setCreado_por(rs.getInt("creado_por"));
		aff.setCreado(rs.getDate("creado"));
		aff.setModificado_por(rs.getInt("modificado_por"));
		aff.setModificado(rs.getDate("modificado"));
		aff.setFactura_final_id(rs.getInt("FACTURA_FINAL_id"));
		aff.setConceptos_facturacion_id(rs.getInt("CONCEPTOS_FACTURACION_id"));
		aff.setUm_sat(rs.getString("um_sat"));
		aff.setDesc_um_sat(rs.getString("desc_um_sat"));
		aff.setCodigo_sat(rs.getString("codigo_sat"));
		aff.setDesc_codigo_sat(rs.getString("desc_codigo_sat"));
		aff.setIva(rs.getBigDecimal("iva"));
		aff.setIva_retenido(rs.getBigDecimal("iva_retenido"));
		return aff;
	}

}
