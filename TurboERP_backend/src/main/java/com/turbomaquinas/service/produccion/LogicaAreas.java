package com.turbomaquinas.service.produccion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.produccion.AreasVistaDAO;
import com.turbomaquinas.POJO.produccion.Area;
import com.turbomaquinas.POJO.produccion.AreasVista;

@Service
public class LogicaAreas implements AreasService{
	
	@Autowired
	AreasVistaDAO repAreas;

	@Override
	public AreasVista actualizar(Area a) throws DataAccessException{
		repAreas.actualizar(a);
		return repAreas.buscar(a.getId());
	}

	@Override
	public AreasVista buscar(int id) throws DataAccessException {
		return repAreas.buscar(id);
	}

	@Override
	public List<AreasVista> consultar() throws DataAccessException {
		return repAreas.consultar();
	}

	@Override
	public List<AreasVista> consultarAreasLibres() throws DataAccessException {
		return  repAreas.consultarAreasLibres();
	}
}
