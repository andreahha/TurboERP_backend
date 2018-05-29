package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.RemisionesEmbarqueVista;

public class RemisionesEmbarqueVistaRM implements RowMapper<RemisionesEmbarqueVista>{

	@Override
	public RemisionesEmbarqueVista mapRow(ResultSet rs, int i) throws SQLException {
		RemisionesEmbarqueVista rev = new RemisionesEmbarqueVista();
		rev.setId(rs.getInt("id"));
		rev.setNumero(rs.getInt("numero"));
		rev.setAnio(rs.getInt("anio"));
		rev.setFecha(rs.getDate("fecha"));
		rev.setVehiculo(rs.getString("vehiculo"));
		rev.setMarca(rs.getString("marca"));
		rev.setPlacas(rs.getString("placas"));
		rev.setChofer(rs.getString("chofer"));
		rev.setAtencion("atencion");
		rev.setFlete("flete");
		rev.setActivo(rs.getInt("activo"));
		rev.setCreado_por(rs.getInt("creado_por"));
		rev.setCreado(rs.getDate("creado"));
		rev.setModificado_por(rs.getInt("modificado_por"));
		rev.setModificado(rs.getDate("modificado"));
		rev.setOrdenes_id(rs.getInt("ORDENES_id"));
		rev.setDepartamentos_id(rs.getInt("DEPARTAMENTOS_id"));
		rev.setClave_depto(rs.getString("clave_depto"));
		rev.setDescripcion_depto(rs.getString("descripcion_depto"));
		rev.setNumero_orden(rs.getString("numero_orden"));
		
		return rev;
	}

}
