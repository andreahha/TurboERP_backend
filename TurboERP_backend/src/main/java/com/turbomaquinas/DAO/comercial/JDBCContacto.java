package com.turbomaquinas.DAO.comercial;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.Contacto;
import com.turbomaquinas.POJO.comercial.ContactoVista;

@Repository
public class JDBCContacto implements ContactoDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void crear(Contacto c) throws DataAccessException{
		jdbcTemplate.update("INSERT INTO CONTACTOS(nombre_contacto, telefono_contacto, extension_contacto, direccion, mail, nombre_asistente, telefono_asistente, extension_asistente, creado_por, DEPARTAMENTOS_CONTACTOS_id, PUESTOS_CONTACTOS_id, CLIENTES_id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
				c.getNombre_contacto(), c.getTelefono_contacto(), c.getExtension_contacto(), c.getDireccion(), c.getMail(), c.getNombre_asistente(), c.getTelefono_asistente(), c.getExtension_asistente(), c.getCreado_por(), c.getDepartamentos_contactos_id(), c.getPuestos_contactos_id(), c.getClientes_id());
	}

	@Override
	public void actualizar(Contacto c) throws DataAccessException{
		jdbcTemplate.update("UPDATE CONTACTOS SET nombre_contacto=?, telefono_contacto=?, extension_contacto=?, direccion=?, mail=?, nombre_asistente=?, telefono_asistente=?, extension_asistente=?, DEPARTAMENTOS_CONTACTOS_id=?, PUESTOS_CONTACTOS_id=?, CLIENTES_id=? WHERE id=?",
				c.getNombre_contacto(), c.getTelefono_contacto(), c.getExtension_contacto(), c.getDireccion(), c.getMail(), c.getNombre_asistente(), c.getTelefono_asistente(), c.getExtension_asistente(), c.getDepartamentos_contactos_id(), c.getPuestos_contactos_id(), c.getClientes_id(), c.getId());
	}
	
	@Override
	public ContactoVista buscar(int id) throws DataAccessException{
		ContactoVista cv = jdbcTemplate.queryForObject("SELECT * FROM CONTACTOS_V WHERE id = ?", 
				new ContactoVistaRM(), id);
		return cv;
	}

	@Override
	public List<ContactoVista> consultar() throws DataAccessException{
		List<ContactoVista> cv = jdbcTemplate.query("SELECT * FROM CONTACTOS_V", 
				new ContactoVistaRM());
		return cv;
	}
	
	@Override
	public List<ContactoVista> consultarContactos(int clienteID) throws DataAccessException{
		List<ContactoVista> contactosCliente = jdbcTemplate.query("SELECT * FROM CONTACTOS_V WHERE clientes_id=?", 
				new ContactoVistaRM(), clienteID);
		return contactosCliente;
	}

	@Override
	public ContactoVista buscarPorPrecotizacion(int id) throws DataAccessException{
		ContactoVista cvp = jdbcTemplate.queryForObject("SELECT * FROM CONTACTOS_V WHERE id IN (SELECT CONTACTOS_id FROM PRECOTIZACIONES WHERE id=?)", 
				new ContactoVistaRM(), id);
		return cvp;
	}
}
