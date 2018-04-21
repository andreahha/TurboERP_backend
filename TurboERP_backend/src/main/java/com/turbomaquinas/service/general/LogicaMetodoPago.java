package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.MetodoPagoDAO;
import com.turbomaquinas.POJO.general.MetodoPago;

@Service
public class LogicaMetodoPago implements MetodoPagoService{

	@Autowired
	MetodoPagoDAO repositorio;
	
	@Override
	public MetodoPago buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<MetodoPago> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public MetodoPago buscarPorClave(String clave) throws DataAccessException {
		return repositorio.buscarPorClave(clave);
	}
}
