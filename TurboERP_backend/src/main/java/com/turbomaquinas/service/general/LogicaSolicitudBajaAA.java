package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.SolicitudDesautorizacionAADAO;
import com.turbomaquinas.POJO.general.ActividadAutorizadaVista;
import com.turbomaquinas.POJO.general.SolicitudDesautorizacionAA;

@Service
public class LogicaSolicitudBajaAA implements SolicitudBajaAAService {

	@Autowired
	SolicitudDesautorizacionAADAO repositorio;
	
	@Override
	public void actualizarAlfresco(int id, String alfresco_id) throws DataAccessException{
		repositorio.actualizarAlfrescoID(id, alfresco_id);
	}

	@Override
	public SolicitudDesautorizacionAA buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public SolicitudDesautorizacionAA buscarFolio(int numero) throws DataAccessException{
		return repositorio.buscarPorFolio(numero);
	}

	@Override
	public List<ActividadAutorizadaVista> consultarActividades(int id) throws DataAccessException{
		return repositorio.consultarActividades(id);
	}

	@Override
	public void actualizarEstado(int id, String estado) throws DataAccessException{
		repositorio.actualizarEstado(id, estado);
	}

	@Override
	public List<SolicitudDesautorizacionAA> consultarPorOrden(int id) throws DataAccessException{
		return repositorio.consultarPorOrden(id);
	}

	@Override
	public List<SolicitudDesautorizacionAA> consultarPorOrdenEstado(int id, String estado) throws DataAccessException{
		return repositorio.consultarPorOrdenEstado(id, estado);
	}

}
