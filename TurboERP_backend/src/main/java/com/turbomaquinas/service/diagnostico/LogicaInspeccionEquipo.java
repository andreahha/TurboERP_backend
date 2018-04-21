package com.turbomaquinas.service.diagnostico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.diagnostico.InspeccionEquipoDAO;
import com.turbomaquinas.POJO.diagnostico.InspeccionEquipo;
import com.turbomaquinas.POJO.diagnostico.InspeccionEquipoVista;

@Service
public class LogicaInspeccionEquipo implements InspeccionEquipoService{

	@Autowired
	InspeccionEquipoDAO repositorio;
	
	@Override
	public InspeccionEquipoVista crear(InspeccionEquipo ins) throws DataAccessException{
		int id = repositorio.crear(ins);
		return repositorio.buscar(id);
	}

	@Override
	public InspeccionEquipoVista actualizar(InspeccionEquipo ins) throws DataAccessException{
		repositorio.actualizar(ins);
		return repositorio.buscar(ins.getId());
	}

	@Override
	public InspeccionEquipoVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<InspeccionEquipoVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public List<Integer> anioInspeccionEquipo() throws DataAccessException{
		return repositorio.anioInspeccionEquipo();
	}

	@Override
	public List<InspeccionEquipoVista> inspeccionEquipoAnio(int anio) throws DataAccessException{
		return repositorio.inspeccionEquipoAnio(anio);
	}

	@Override
	public List<InspeccionEquipoVista> consultaPorOrden(int id) throws DataAccessException{
		return repositorio.consultaPorOrden(id);
	}
}
