package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.PuestoDAO;
import com.turbomaquinas.POJO.general.Puesto;

@Service
public class LogicaPuesto implements PuestoService{

	@Autowired
	PuestoDAO repositorio;
	
	@Override
	public List<Puesto> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public Puesto crear(Puesto p) throws DataAccessException {
		int id = repositorio.crear(p);
		return repositorio.buscar(id);
	}

	@Override
	public Puesto actualizar(Puesto p) throws DataAccessException {
		return repositorio.actualizar(p);
	}

	@Override
	public Puesto buscar(int id) throws DataAccessException {
		return repositorio.buscar(id);
	}

}
