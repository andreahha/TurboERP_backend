package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.CubreDAO;
import com.turbomaquinas.DAO.general.PuestoDAO;
import com.turbomaquinas.POJO.general.Cubre;

@Service
public class LogicaCubre implements CubreService{

	@Autowired
	CubreDAO repositorio;
	@Autowired
	PuestoDAO repoPuesto;
	
	@Override
	public Cubre crear(Cubre cubre) throws DataAccessException{
		if(!repoPuesto.esJefe(cubre.getPuestos_id())){
			int id = repositorio.crear(cubre);
			return repositorio.buscar(id);
		} else {
			if(repositorio.estaDisponible(cubre.getPuestos_id())){
				int id = repositorio.crear(cubre);
				return repositorio.buscar(id);
			}
		}
		return null;		
	}

	@Override
	public Cubre actualizar(Cubre cubre) throws DataAccessException{
		repositorio.actualizar(cubre);	
		return repositorio.buscar(cubre.getId());
	}

	@Override
	public Cubre buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<Cubre> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public Cubre buscarporPersonal(int id) throws DataAccessException {
		return repositorio.buscarporPersonal(id);
	}
}
