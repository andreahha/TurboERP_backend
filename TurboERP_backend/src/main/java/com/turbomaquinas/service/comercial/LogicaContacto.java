package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.ContactoDAO;
import com.turbomaquinas.POJO.comercial.Contacto;
import com.turbomaquinas.POJO.comercial.ContactoVista;

@Service
public class LogicaContacto implements ContactoService {

	@Autowired
	ContactoDAO repositorio;
	
	@Override
	public void crear(Contacto c) throws DataAccessException{
		repositorio.crear(c);
	}
	
	@Override
	public void actualizar(Contacto c) throws DataAccessException{
		repositorio.actualizar(c);		
	}

	@Override
	public ContactoVista buscar(int id)throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<ContactoVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public List<ContactoVista> consultarContactos(int clienteID) throws DataAccessException{
		return repositorio.consultarContactos(clienteID);
	}

	
}
