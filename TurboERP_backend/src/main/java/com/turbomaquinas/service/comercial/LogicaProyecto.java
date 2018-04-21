package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.ProyectoDAO;
import com.turbomaquinas.POJO.comercial.Proyecto;

@Service
public class LogicaProyecto implements ProyectoService{

	 @Autowired
	 ProyectoDAO repositorio;
	
	@Override
	public Proyecto crear(Proyecto proyecto) throws DataAccessException{
		int id = repositorio.crear(proyecto);
		return repositorio.buscar(id);
	}

	@Override
	public void actualizar(Proyecto proyecto) throws DataAccessException{
		repositorio.actualizar(proyecto);		
	}

	@Override
	public Proyecto buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<Proyecto> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

}
