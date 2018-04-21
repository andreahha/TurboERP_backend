package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.DeptoContactoDAO;
import com.turbomaquinas.POJO.comercial.DeptoContacto;

@Service
public class LogicaDeptoContacto implements DeptoContactoService {
	
	@Autowired
	DeptoContactoDAO repositorio;

	@Override
	public void crear(DeptoContacto dc) throws DataAccessException{
		repositorio.crear(dc);
		
	}

	@Override
	public void actualizar(DeptoContacto dc) throws DataAccessException{
		repositorio.actualizar(dc);
	}

	@Override
	public DeptoContacto buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<DeptoContacto> consultar() throws DataAccessException{
		return repositorio.consultar();
	}
	
	

}
