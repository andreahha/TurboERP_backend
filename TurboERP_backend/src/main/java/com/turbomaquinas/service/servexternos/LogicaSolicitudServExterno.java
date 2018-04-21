package com.turbomaquinas.service.servexternos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.servexternos.SolicitudServExternoDAO;
import com.turbomaquinas.POJO.servexternos.SolicitudServExterno;

@Service
public class LogicaSolicitudServExterno implements SolicitudServExternoService{

	@Autowired
	SolicitudServExternoDAO repositorio;
	
	@Override
	public SolicitudServExterno crear(SolicitudServExterno sol) throws DataAccessException{
		int id = repositorio.crear(sol);
		return repositorio.buscar(id);
	}

	@Override
	public void actualizar(SolicitudServExterno sol) throws DataAccessException{
		repositorio.actualizar(sol);
	}

	@Override
	public SolicitudServExterno buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<SolicitudServExterno> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

}
