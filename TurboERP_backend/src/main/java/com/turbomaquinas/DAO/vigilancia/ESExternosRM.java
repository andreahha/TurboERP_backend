package com.turbomaquinas.DAO.vigilancia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.vigilancia.ESExternos;

public class ESExternosRM implements RowMapper<ESExternos>{

	@Override
	public ESExternos mapRow(ResultSet rs, int i) throws SQLException {
		
		ESExternos ese = new ESExternos();
		ese.setId(rs.getInt("id"));
		ese.setNombre_persona(rs.getString("nombre_persona"));
		ese.setCompania(rs.getString("compania"));
		ese.setFecha_entrada(rs.getDate("fecha_entrada"));
		ese.setHora_entrada(rs.getTime("hora_entrada"));
		ese.setTipo(rs.getString("tipo"));
		ese.setDescripcion_visita(rs.getString("descripcion_visita"));
		ese.setFecha_salida(rs.getDate("fecha_salida"));
		ese.setHora_salida(rs.getTime("hora_salida"));
		ese.setActivo(rs.getInt("activo"));
		ese.setCreado_por(rs.getInt("creado_por"));
		ese.setCreado(rs.getDate("creado"));
		ese.setModificado_por(rs.getInt("modificado_por"));
		ese.setModificado(rs.getDate("modificado"));
		ese.setPersonal_id_visita(rs.getInt("personal_id_visita"));
		ese.setPersonal_id_entrada(rs.getInt("personal_id_entrada"));
		ese.setIden_alfresco_id(rs.getString("iden_alfresco_id"));
		return ese;
	}
}
