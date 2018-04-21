package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.ConvenioDAO;
import com.turbomaquinas.POJO.comercial.Convenio;

@Service
public class LogicaConvenio implements ConvenioService{

	@Autowired
	ConvenioDAO repositorio;
	
	@Override
	public Convenio crear(Convenio convenio) throws DataAccessException{
		int id = repositorio.crear(convenio);
		return repositorio.buscar(id);
	}

	@Override
	public void actualizar(Convenio convenio) throws DataAccessException{
		repositorio.actualizar(convenio);
	}

	@Override
	public Convenio buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<Convenio> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

}
