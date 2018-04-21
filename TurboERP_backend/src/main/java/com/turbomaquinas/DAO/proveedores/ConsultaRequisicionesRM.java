package com.turbomaquinas.DAO.proveedores;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.proveedores.ConsultaRequisiciones;

public class ConsultaRequisicionesRM  implements RowMapper<ConsultaRequisiciones> {
	
	public ConsultaRequisiciones mapRow(ResultSet rs, int i) throws SQLException {
		ConsultaRequisiciones cr = new ConsultaRequisiciones();
		cr.setId(rs.getInt("id"));
		cr.setDepartamento(rs.getString("departamento"));
		cr.setNumero_requisicion(rs.getInt("numero_requisicion"));
		cr.setDescripcion(rs.getString("descripcion"));
		cr.setFecha_requisicion(rs.getDate("fecha_requisicion"));
		cr.setFecha_cotizacion(rs.getDate("fecha_cotizacion"));
		cr.setDias_fecha_cot(rs.getInt("dias_fecha_cot"));
		cr.setAlerta_fecha_cot(rs.getInt("alerta_fecha_cot"));
		cr.setFecha_orden_compra(rs.getDate("fecha_orden_compra"));
		cr.setDias_fecha_ordenc(rs.getInt("dias_fecha_ordenc"));
		cr.setAlerta_fecha_ordenc(rs.getInt("alerta_fecha_ordenc"));
		cr.setFecha_requiere_prod(rs.getDate("fecha_requiere_prod"));
		cr.setDias_fecha_reqprod(rs.getInt("dias_fecha_reqprod"));
		cr.setAlerta_fecha_reqprod(rs.getInt("alerta_fecha_reqprod"));
		cr.setFecha_estimada_entrega(rs.getDate("fecha_estimada_entrega"));
		cr.setDias_fecha_estent(rs.getInt("dias_fecha_estent"));
		cr.setAlerta_fecha_estent(rs.getInt("alerta_fecha_estent"));
		cr.setFecha_recepcion(rs.getDate("fecha_recepcion"));
		cr.setEstado_recepcion_stock(rs.getInt("estado_recepcion_stock"));
		cr.setDias_fecha_recepcion(rs.getInt("dias_fecha_recepcion"));
		cr.setAlerta_fecha_recepcion(rs.getInt("alerta_fecha_recepcion"));
		cr.setFecha_lib_cuarentena(rs.getDate("fecha_lib_cuarentena"));
		cr.setDias_fecha_libcuarentena(rs.getInt("dias_fecha_libcuarentena"));
		cr.setAlerta_fecha_libcuarentena(rs.getInt("alerta_fecha_libcuarentena"));
		cr.setEstado_liberacion_cuarentena(rs.getInt("estado_liberacion_cuarentena"));
		cr.setFecha_entrada_almacen(rs.getDate("fecha_entrada_almacen"));
		cr.setDias_fecha_entradalm(rs.getInt("dias_fecha_entradalm"));
		cr.setAlerta_fecha_entradalm(rs.getInt("alerta_fecha_entradalm"));
		cr.setFecha_salida_almacen(rs.getDate("fecha_salida_almacen"));
		cr.setDias_fecha_salidalm(rs.getInt("dias_fecha_salidalm"));
		cr.setAlerta_fecha_salidalm(rs.getInt("alerta_fecha_salidalm"));
		cr.setOrdenes_requisiciones_id(rs.getInt("ORDENES_REQUISICIONES_id"));
		cr.setParcial_entradalm(rs.getString("parcial_entradalm"));
		cr.setParcial_libcuarentena(rs.getString("parcial_libcuarentena"));
		cr.setParcial_ordenc(rs.getString("parcial_ordenc"));
		cr.setParcial_recepcion(rs.getString("parcial_recepcion"));
		cr.setParcial_salidalm(rs.getString("parcial_salidalm"));
		return cr;
	}

}
