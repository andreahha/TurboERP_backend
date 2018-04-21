package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.ContactoVista;

public class ContactoVistaRM implements RowMapper<ContactoVista>{

	@Override
	public ContactoVista mapRow(ResultSet rs, int i) throws SQLException{
		ContactoVista cv = new ContactoVista();
		cv.setId(rs.getInt("id"));
		cv.setNombreContacto(rs.getString("nombreContacto"));
		cv.setTelefonoContacto(rs.getString("telefonoContacto"));
		cv.setExtensionContacto(rs.getString("extensionContacto"));
		cv.setDireccion(rs.getString("direccion"));
		cv.setMail(rs.getString("mail"));
		cv.setNombreAsistente(rs.getString("nombreAsistente"));
		cv.setTelefonoAsistente(rs.getString("telefonoAsistente"));
		cv.setExtensionAsistente(rs.getString("extensionAsistente"));
		cv.setDepartamentos_contactos_id(rs.getInt("departamentos_contactos_id"));
		cv.setDepartamento_contacto(rs.getString("departamento_contacto"));
		cv.setPuestos_contactos_id(rs.getInt("puestos_contactos_id"));
		cv.setPuesto_contacto(rs.getString("puesto_contacto"));
		cv.setClientes_id(rs.getInt("clientes_id"));
		cv.setNumero_cliente(rs.getInt("numero_cliente"));
		cv.setNombre_fiscal(rs.getString("nombre_fiscal"));
		cv.setNombre_comercial(rs.getString("nombre_comercial"));
		cv.setGiro(rs.getInt("giro"));
		return cv;
	}

}
