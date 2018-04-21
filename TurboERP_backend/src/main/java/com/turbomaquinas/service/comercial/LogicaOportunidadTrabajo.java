package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.OportunidadTrabajoDAO;
import com.turbomaquinas.POJO.comercial.OportunidadTrabajo;

@Service
public class LogicaOportunidadTrabajo implements OportunidadTrabajoService{

	@Autowired
	OportunidadTrabajoDAO repositorio;
	
	@Override
	public OportunidadTrabajo crear(OportunidadTrabajo o) throws DataAccessException{
		int id = repositorio.crear(o);
		return repositorio.buscar(id);
	}

	@Override
	public void actualizar(OportunidadTrabajo o) throws DataAccessException{
		repositorio.actualizar(o);
	}

	@Override
	public OportunidadTrabajo buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<OportunidadTrabajo> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

}
