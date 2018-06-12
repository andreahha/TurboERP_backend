package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.DetalleFacturaVariosVista;

public class DetalleFacturaVariosVistaRM implements RowMapper<DetalleFacturaVariosVista>{

	@Override
	public DetalleFacturaVariosVista mapRow(ResultSet rs, int i) throws SQLException {
		DetalleFacturaVariosVista fv = new DetalleFacturaVariosVista();
		fv.setId(rs.getInt("id"));
		fv.setCantidad(rs.getInt("cantidad"));
		fv.setDescripcion(rs.getString("descripcion"));
		fv.setPrecio_unitario(rs.getBigDecimal("precio_unitario"));
		fv.setCuota_iva(rs.getFloat("cuota_iva"));
		fv.setIva(rs.getBigDecimal("iva"));
		fv.setImporte(rs.getBigDecimal("importe"));
		fv.setActivo(rs.getInt("activo"));
		fv.setConceptos_facturacion_id(rs.getInt("conceptos_facturacion_id"));
		fv.setCve_producto(rs.getString("cve_producto"));
		fv.setDes_producto(rs.getString("des_producto"));
		fv.setCve_medida(rs.getString("cve_medida"));
		fv.setDes_medida(rs.getString("des_medida"));
		fv.setFactura_varios_id(rs.getInt("factura_varios_id"));
		return fv;
	}

}
