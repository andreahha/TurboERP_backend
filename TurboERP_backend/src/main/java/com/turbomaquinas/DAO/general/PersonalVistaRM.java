package com.turbomaquinas.DAO.general;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.PersonalVista;

public class PersonalVistaRM implements RowMapper<PersonalVista>{
	
	@Override
	public PersonalVista mapRow(ResultSet rs, int rowNum) throws SQLException {

		PersonalVista pv = new PersonalVista();
		pv.setId(rs.getInt("id"));
		pv.setNumero(rs.getInt("numero"));
		pv.setNombre(rs.getString("nombre"));
		pv.setPaterno(rs.getString("paterno"));
		pv.setMaterno(rs.getString("materno"));
		pv.setKeycloak_id(rs.getString("keycloak_id"));
		pv.setActivo(rs.getInt("activo"));
		pv.setDepartamentos_id(rs.getInt("departamentos_id"));
		pv.setClave_depto(rs.getString("clave_depto"));
		pv.setDesc_depto(rs.getString("desc_depto"));
		pv.setPuestos_id(rs.getInt("puestos_id"));
		pv.setClave_puesto(rs.getString("clave_puesto"));
		pv.setDesc_puesto(rs.getString("desc_puesto"));
		pv.setNivel(rs.getString("nivel"));
		pv.setIniciales(rs.getString("iniciales"));
		pv.setTipo(rs.getString("tipo"));
		return pv;
	}
	

}
