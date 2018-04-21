package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.DTPrecotizacion;

public class DTPrecotizacionRM implements RowMapper<DTPrecotizacion>{

	@Override
	public DTPrecotizacion mapRow(ResultSet rs, int i) throws SQLException {
		
		DTPrecotizacion dtp = new DTPrecotizacion();
		dtp.setId(rs.getInt("id"));
		dtp.setPresion_de_entrada(rs.getString("presion_de_entrada"));
		dtp.setPresion_de_salida(rs.getString("presion_de_salida"));
		dtp.setActivo(rs.getInt("activo"));
		dtp.setCreado_por(rs.getInt("creado_por"));
		dtp.setCreado(rs.getDate("creado"));
		dtp.setModificado_por(rs.getInt("modificado_por"));
		dtp.setModificado(rs.getDate("modificado"));
		dtp.setTemperatura_salida(rs.getString("temperatura_salida"));
		dtp.setTemperatura_entrada(rs.getString("temperatura_entrada"));
		dtp.setCapacidad_hp(rs.getFloat("capacidad_hp"));
		dtp.setCapacida_mw(rs.getFloat("capacida_mw"));
		dtp.setVelocidad_critica(rs.getString("velocidad_critica"));
		dtp.setVelocidad_operacion(rs.getString("velocidad_operacion"));
		dtp.setVelocidad_disparo(rs.getString("velocidad_disparo"));
		dtp.setCapacidad_flujo(rs.getString("capacidad_flujo"));
		dtp.setSerie(rs.getString("serie"));
		dtp.setPeso_rotor(rs.getString("peso_rotor"));
		dtp.setFluido(rs.getString("fluido"));
		dtp.setPrecotizaciones_id(rs.getInt("PRECOTIZACIONES_id"));
		return dtp;
	}
}
