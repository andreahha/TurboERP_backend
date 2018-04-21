package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.AutorizacionDAO;
import com.turbomaquinas.POJO.general.Autorizacion;

@Service
public class LogicaAutorizacion implements AutorizacionService{

	@Autowired
	AutorizacionDAO repositorio;
	
	@Override
	public Autorizacion buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<Autorizacion> consultarPorOrdenid(int id) throws DataAccessException{
		return repositorio.consultarPorOrdenid(id);
	}

}
