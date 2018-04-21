package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.TipoCadenaPagoDAO;
import com.turbomaquinas.POJO.general.TipoCadenaPago;

@Service
public class LogicaTipoCadenaPago implements TipoCadenaPagoService{
	
	@Autowired
	TipoCadenaPagoDAO repositorio;

	@Override
	public void crear(TipoCadenaPago tcp) throws DataAccessException {
		repositorio.crear(tcp);
		
	}

	@Override
	public void actualizar(TipoCadenaPago tcp) throws DataAccessException {
		repositorio.actualizar(tcp);
		
	}

	@Override
	public TipoCadenaPago buscar(int id) throws DataAccessException {
		return repositorio.buscar(id);
	}

	@Override
	public List<TipoCadenaPago> consultar() throws DataAccessException {
		return repositorio.consultar();
	}

	@Override
	public TipoCadenaPago buscarClave(String clave) throws DataAccessException {
		return repositorio.buscarClave(clave);
	}

}
