package com.turbomaquinas.service.timbrado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.timbrado.TimbradoDAO;


@Service
public class LogicaTimbrado implements TimbradoService{
	
	@Autowired
	TimbradoDAO repositorio;
	
	@Override
	public String timbrarFactura(int idFactura) throws DataAccessException {
		return repositorio.timbrarFactura(idFactura);
	}
}
