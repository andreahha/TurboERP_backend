package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.GiroDAO;
import com.turbomaquinas.POJO.comercial.Giro;

@Service
public class LogicaGiro implements GiroService {

	
	@Autowired
	GiroDAO giro;
	
	
	@Override
	public void crear(Giro g) throws DataAccessException{
		giro.Crear(g);
	}

	@Override
	public Giro buscar(int id) throws DataAccessException{
		return giro.Buscar(id);
	}

	@Override
	public List<Giro> consultar() throws DataAccessException{
		return giro.Consultar();
	}

	@Override
	public void actualizar(Giro g) throws DataAccessException{
		giro.actualizar(g);		
	}
	
}
