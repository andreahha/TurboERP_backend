package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.ClienteDAO;
import com.turbomaquinas.POJO.comercial.Cliente;
import com.turbomaquinas.POJO.comercial.ClienteVista;

@Service
public class LogicaCliente implements ClienteService {
	
	@Autowired
	ClienteDAO repCliente;
	

	@Override
	public ClienteVista crear(Cliente c) throws DataAccessException{
		int id = repCliente.crear(c);
		return repCliente.buscar(id);
	}
	
	@Override
	public Cliente actualizar(Cliente c) throws DataAccessException{
		return repCliente.actualizar(c);
	}

	@Override
	public ClienteVista buscar(int id) throws DataAccessException {
		return repCliente.buscar(id);	
	}

	@Override
	public List<ClienteVista> consultar() throws DataAccessException {
		return repCliente.consultar();
	}

	@Override
	public ClienteVista buscar(int numero_giro, int numero) {
		return repCliente.buscar(numero_giro, numero);
	}
	
	@Override
	public ClienteVista buscarClientePorPrecotizacion(int id) throws DataAccessException{
		return repCliente.buscarClientePorPrecotizacion(id);
	}

	@Override
	public ClienteVista buscarClientePorOrden(int id) throws DataAccessException{
		return repCliente.buscarClientePorOrden(id);
	}

	
}
