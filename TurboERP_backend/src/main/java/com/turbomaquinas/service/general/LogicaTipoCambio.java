package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.TipoCambioDAO;
import com.turbomaquinas.POJO.general.TipoCambio;

@Service
public class LogicaTipoCambio implements TipoCambioService{
	
	@Autowired
	TipoCambioDAO repositorio;
	
	@Override
	public void crear(TipoCambio t) throws DataAccessException{
		repositorio.crear(t);
	}

	@Override
	public void actualizar(TipoCambio t) throws DataAccessException{
		repositorio.actualizar(t);
	}

	@Override
	public TipoCambio buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<TipoCambio> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public TipoCambio aldia() throws DataAccessException {
		return repositorio.aldia();
	}
	
	@Override
	public TipoCambio buscarPorFecha(String fecha) throws DataAccessException {
		return repositorio.buscarPorFecha(fecha);
	}

}
