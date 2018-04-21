package com.turbomaquinas.DAO.vigilancia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.vigilancia.ESExternosVista;

public class ESExternosVistaRM implements RowMapper<ESExternosVista>{

	@Override
	public ESExternosVista mapRow(ResultSet rs, int i) throws SQLException {
		
		ESExternosVista esev =  new ESExternosVista();
		esev.setId(rs.getInt("id"));
		esev.setNombre_persona(rs.getString("nombre_persona"));
		esev.setCompania(rs.getString("compania"));;
		esev.setFecha_entrada(rs.getDate("fecha_entrada"));
		esev.setHora_entrada(rs.getTime("hora_entrada"));
		esev.setTipo(rs.getString("tipo"));
		esev.setDescripcion_visita(rs.getString("descripcion_visita"));
		esev.setFecha_salida(rs.getDate("fecha_salida"));
		esev.setHora_salida(rs.getTime("hora_salida"));
		esev.setActivo(rs.getInt("activo"));
		esev.setCreado_por(rs.getInt("creado_por"));
		esev.setCreado(rs.getDate("creado"));
		esev.setModificado_por(rs.getInt("modificado_por"));
		esev.setModificado(rs.getDate("modificado"));
		esev.setPersonal_id_visita(rs.getInt("personal_id_visita"));
		esev.setPersonal_visita(rs.getString("personal_visita"));
		esev.setPersonal_id_entrada(rs.getInt("personal_id_entrada"));
		esev.setPersonal_entrada(rs.getString("personal_entrada"));
		esev.setIden_alfreco_id(rs.getString("iden_alfreco_id"));
		return esev;
	}
	
}
