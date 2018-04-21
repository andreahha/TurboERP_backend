package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.EstadoDAO;
import com.turbomaquinas.DAO.general.PaisDAO;
import com.turbomaquinas.POJO.general.Estado;
import com.turbomaquinas.POJO.general.Pais;

@Service
public class LogicaPais implements PaisService{
	
	@Autowired
	PaisDAO repPais;
	@Autowired
	EstadoDAO repositorioEdo;
	
	@Override
	public Pais buscar(String clave) throws DataAccessException  {
		return repPais.buscar(clave);
	}

	@Override
	public List<Pais> consultar() throws DataAccessException {
		return repPais.consultar();
	}

	@Override
	public List<Estado> consultarEstados(int id) throws DataAccessException {
			return repositorioEdo.consultarPorPais(id);
	}
	
	
	
	

}
