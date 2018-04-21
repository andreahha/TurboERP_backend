package com.turbomaquinas.DAO.vigilancia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.vigilancia.ESRecibirEquipo;

public class ESRecibirEquipoRM implements RowMapper<ESRecibirEquipo>{

	@Override
	public ESRecibirEquipo mapRow(ResultSet rs, int rowNum) throws SQLException {
		ESRecibirEquipo esr = new ESRecibirEquipo();
		esr.setId(rs.getInt("id"));
		esr.setVehiculo(rs.getString("vehiculo"));
		esr.setPlacas(rs.getString("placas"));
		esr.setTcir_alfresco_id(rs.getString("tcir_alfresco_id"));
		esr.setTotalmente_recibido(rs.getInt("totalmente_recibido"));
		esr.setActivo(rs.getInt("activo"));
		esr.setCreado_por(rs.getInt("creado_por"));
		esr.setCreado(rs.getDate("creado"));
		esr.setModificado_por(rs.getInt("modificado_por"));
		esr.setModificado(rs.getDate("modificado"));
		esr.setEquipo_por_recibir_id(rs.getInt("EQUIPO_POR_RECIBIR_id"));
		esr.setClientes_id(rs.getInt("CLIENTES_id"));
		esr.setEntradas_salidas_externos_id(rs.getInt("ENTRADAS_SALIDAS_EXTERNOS_id"));
		return esr;
	}
}
