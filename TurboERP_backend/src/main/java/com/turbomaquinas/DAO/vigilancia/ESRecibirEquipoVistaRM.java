package com.turbomaquinas.DAO.vigilancia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.vigilancia.ESRecibirEquipoVista;

public class ESRecibirEquipoVistaRM implements RowMapper<ESRecibirEquipoVista>{

	@Override
	public ESRecibirEquipoVista mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ESRecibirEquipoVista e = new ESRecibirEquipoVista();
		e.setId(rs.getInt("id"));
		e.setVehiculo(rs.getString("vehiculo"));
		e.setPlacas(rs.getString("placas"));
		e.setTcir_alfresco_id(rs.getString("tcir_alfresco_id"));		
		e.setTotalmente_recibido(rs.getInt("totalmente_recibido"));
		e.setActivo(rs.getInt("activo"));
		e.setCreado_por(rs.findColumn("creado_por"));
		e.setCreado(rs.getString("creado"));
		e.setEquipo_por_recibir_id(rs.getInt("equipo_por_recibir_id"));
		e.setEquipo_por_recibir(rs.getString("equipo_por_recibir"));
		e.setClientes_id(rs.getInt("clientes_id"));
		e.setNombre_fiscal(rs.getString("nombre_fiscal"));
		e.setNombre_comercial(rs.getString("nombre_comercial"));
		e.setGiro(rs.getInt("giro"));
		e.setEntradas_salidas_externos_id(rs.getInt("entradas_salidas_externos_id"));
		e.setPersonal_id_entrada(rs.getInt("personal_id_entrada"));
		e.setVisitante(rs.getString("visitante"));
		e.setCompania(rs.getString("compania"));
		e.setEquipo_recibido_id(rs.getInt("equipo_recibido_id"));
		return e;
	}
}
