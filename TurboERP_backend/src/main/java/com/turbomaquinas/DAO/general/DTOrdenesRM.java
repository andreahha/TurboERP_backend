package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.DTOrdenes;

public class DTOrdenesRM implements RowMapper<DTOrdenes> {

	@Override
	public DTOrdenes mapRow(ResultSet rs, int i) throws SQLException {
		
		DTOrdenes dto = new DTOrdenes();
		dto.setId(rs.getInt("id"));
		dto.setPresion_de_entrada(rs.getString("presion_de_entrada"));
		dto.setPresion_de_salida(rs.getString("presion_de_salida"));
		dto.setActivo(rs.getInt("activo"));
		dto.setCreado_por(rs.getInt("creado_por"));
		dto.setCreado(rs.getDate("creado"));
		dto.setModificado_por(rs.getInt("modificado_por"));
		dto.setModificado(rs.getDate("modificado"));
		dto.setTemperatura_salida(rs.getString("temperatura_salida"));
		dto.setTemperatura_entrada(rs.getString("temperatura_entrada"));
		dto.setCapacidad_hp(rs.getFloat("capacidad_hp"));
		dto.setCapacida_mw(rs.getFloat("capacida_mw"));
		dto.setVelocidad_critica(rs.getString("velocidad_critica"));
		dto.setVelocidad_operacion(rs.getString("velocidad_operacion"));
		dto.setVelocidad_disparo(rs.getString("velocidad_disparo"));
		dto.setCapacidad_flujo(rs.getString("capacidad_flujo"));
		dto.setSerie(rs.getString("serie"));
		dto.setPeso_rotor(rs.getString("peso_rotor"));
		dto.setFluido(rs.getString("fluido"));
		dto.setOrdenes_id(rs.getInt("ORDENES_id"));
		return dto;
	}

}
