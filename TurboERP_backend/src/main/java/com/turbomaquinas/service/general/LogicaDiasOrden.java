package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.DiasOrdenDAO;
import com.turbomaquinas.POJO.general.DiasOrden;
import com.turbomaquinas.POJO.general.DiasOrdenVista;

@Service
public class LogicaDiasOrden implements DiasOrdenService{

	@Autowired
	DiasOrdenDAO repositorio;

	@Override
	public DiasOrdenVista crear(DiasOrden d) throws DataAccessException{
		int id = repositorio.crear(d);
		return repositorio.buscar(id);
	}

	@Override
	public void actualizar(DiasOrden d) throws DataAccessException{
		repositorio.actualizar(d);
	}

	@Override
	public DiasOrdenVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<DiasOrdenVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}
	
	@Override
	public List<DiasOrdenVista> buscarDiasPorOrden(int id) {
		return repositorio.buscarDiasPorOrden(id);
	}

	@Override
	public Integer sumarDias(int id) {
		return repositorio.sumarDias(id);
	}

}
