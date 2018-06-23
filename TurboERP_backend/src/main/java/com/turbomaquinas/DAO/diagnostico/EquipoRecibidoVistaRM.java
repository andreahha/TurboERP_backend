package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.EquipoRecibidoVista;

public class EquipoRecibidoVistaRM implements RowMapper<EquipoRecibidoVista> {

	@Override
	public EquipoRecibidoVista mapRow(ResultSet rs, int i) throws SQLException {
		
		EquipoRecibidoVista erv = new EquipoRecibidoVista();
		
		erv.setId(rs.getInt("id"));
		erv.setDescripcion_equipo(rs.getString("descripcion_equipo"));
		erv.setFecha_ingreso(rs.getDate("fecha_ingreso"));
		erv.setDescripcion_empaque(rs.getString("descripcion_empaque"));
		erv.setCantidad(rs.getInt("cantidad"));
		erv.setPeso(rs.getInt("peso"));
		erv.setUsuario_acepta(rs.getInt("usuario_acepta"));
		erv.setFecha_acepta(rs.getDate("fecha_acepta"));	
		erv.setOrdenes_id(rs.getInt("ordenes_id"));
		erv.setNumero_orden(rs.getString("numero_orden"));
		erv.setOrdenes_id_adonde(rs.getInt("ordenes_id_adonde"));
		erv.setNumero_orden_adonde(rs.getString("numero_orden_adonde"));
		erv.setEs_recibir_equipo(rs.getInt("es_recibir_equipo"));
		erv.setVehiculo(rs.getString("vehiculo"));
		erv.setPlacas(rs.getString("placas"));
		erv.setTipo(rs.getString("tipo"));
		return erv;
	}

}
