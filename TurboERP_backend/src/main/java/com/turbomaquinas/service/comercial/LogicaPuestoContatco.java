package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.PuestoContactoDAO;
import com.turbomaquinas.POJO.comercial.PuestoContacto;

@Service
public class LogicaPuestoContatco implements PuestoContactoService{

	@Autowired
	PuestoContactoDAO repositorio;
	
	@Override
	public void crear(PuestoContacto pc) throws DataAccessException{
		repositorio.crear(pc);
	}

	@Override
	public void actualizar(PuestoContacto pc) throws DataAccessException{
		repositorio.actualizar(pc);
	}

	@Override
	public PuestoContacto buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<PuestoContacto> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

}
