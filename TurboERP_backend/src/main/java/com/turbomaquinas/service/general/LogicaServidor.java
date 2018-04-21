package com.turbomaquinas.service.general;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.ServidorDAO;

@Service
public class LogicaServidor implements ServidorService{

	@Autowired
	ServidorDAO repositorio;
	
	@Override
	public String obtenerfecha() throws DataAccessException{
		return repositorio.obtenerfecha();
	}
}
