package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.Contacto;

public class ContactoRM implements RowMapper<Contacto> {

	@Override
	public Contacto mapRow(ResultSet rs, int i) throws SQLException {
		Contacto c = new Contacto();
		c.setId(rs.getInt("id"));
		c.setNombre_contacto(rs.getString("nombre_contacto"));
		c.setTelefono_contacto(rs.getString("telefono_contacto"));
		c.setExtension_contacto(rs.getString("extension_contacto"));
		c.setDireccion(rs.getString("direccion"));
		c.setMail(rs.getString("mail"));
		c.setNombre_asistente(rs.getString("nombre_asistente"));
		c.setTelefono_asistente(rs.getString("telefono_asistente"));
		c.setExtension_asistente(rs.getString("extension_asistente"));
		c.setActivo(rs.getInt("activo"));
		c.setCreado_por(rs.getInt("creado_por"));
		c.setCreado(rs.getTimestamp("creado"));
		c.setModificado_por(rs.getInt("modificado_por"));
		c.setModificado(rs.getTimestamp("modificado"));
		c.setDepartamentos_contactos_id(rs.getInt("departamentos_contactos_id"));
		c.setPuestos_contactos_id(rs.getInt("puestos_contactos_id"));
		c.setClientes_id(rs.getInt("clientes_id"));
		return c;
	}

}
