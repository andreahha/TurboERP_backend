package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.FormaPagoDAO;
import com.turbomaquinas.POJO.general.FormaPago;

@Service
public class LogicaFormaPago implements FormaPagoService{

	@Autowired
	FormaPagoDAO repositorio;
	
	@Override
	public FormaPago buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<FormaPago> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public FormaPago buscarPorClave(String clave) throws DataAccessException {
		return repositorio.buscarPorClave(clave);
	}

}
