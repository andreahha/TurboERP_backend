package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.EquipoPorRecibirVista;

public class EquipoPorRecibirVistaRM implements RowMapper<EquipoPorRecibirVista>{

	@Override
	public EquipoPorRecibirVista mapRow(ResultSet rs, int i) throws SQLException {
		EquipoPorRecibirVista erv = new EquipoPorRecibirVista();
		erv.setId(rs.getInt("id"));
		erv.setDescripcion(rs.getString("descripcion"));
		erv.setFecha_estimada_llegada(rs.getDate("fecha_estimada_llegada"));
		erv.setTransporte(rs.getString("transporte"));
		erv.setComentarios(rs.getString("comentarios"));
		erv.setSoportes(rs.getString("soportes"));
		erv.setSoporte_turbomaquinas(rs.getInt("soporte_turbomaquinas"));
		erv.setPeso(rs.getFloat("peso"));
		erv.setFlete(rs.getInt("flete"));
		erv.setOrdenes_id(rs.getInt("ordenes_id"));
		erv.setOrden_no(rs.getInt("orden_no"));
		erv.setAnio(rs.getInt("anio"));
		erv.setNumero_orden(rs.getString("numero_orden"));
		erv.setClientes_id(rs.getInt("clientes_id"));
		erv.setCliente_no(rs.getInt("cliente_no"));		
		erv.setNombre_fiscal(rs.getString("nombre_fiscal"));
		erv.setNombre_comercial(rs.getString("nombre_comercial"));
		erv.setGiro(rs.getInt("giro"));
		erv.setCiudad_origen(rs.getString("ciudad_origen"));
		erv.setMedidas_equipos_id(rs.getInt("medidas_equipos_id"));
		erv.setMedida_equipo(rs.getString("medida_equipo"));
		erv.setEs_recibir_equipo_id(rs.getInt("es_recibir_equipo_id"));
		return erv;
	}
		

	
}
