package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.OrdenFechasVista;

public class OrdenFechasRM implements RowMapper<OrdenFechasVista> {

	@Override
	public OrdenFechasVista mapRow(ResultSet rs, int i) throws SQLException {
		OrdenFechasVista ofv = new OrdenFechasVista();
		ofv.setOrdenes_id(rs.getInt("ordenes_id"));
		ofv.setNumero_orden(rs.getString("numero_orden"));
		ofv.setClientes_id(rs.getInt("clientes_id"));
		ofv.setImporte_pendiente(rs.getFloat("importe_pendiente"));
		ofv.setFecha_ingreso(rs.getDate("fecha_ingreso"));
		ofv.setFecha_autorizacion(rs.getDate("fecha_autorizacion"));
		ofv.setFecha_terminacion(rs.getDate("fecha_terminacion"));
		ofv.setFecha_embarque(rs.getDate("fecha_embarque"));
		return ofv;
	}
	
	
	
	

}
