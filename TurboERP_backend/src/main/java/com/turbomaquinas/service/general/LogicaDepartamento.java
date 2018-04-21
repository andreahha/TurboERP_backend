package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.SGC.SolicitudCambioVistaDAO;
import com.turbomaquinas.DAO.general.DepartamentoDAO;
import com.turbomaquinas.POJO.SGC.SolicitudCambioVista;
import com.turbomaquinas.POJO.general.Departamento;
import com.turbomaquinas.POJO.general.DepartamentoVista;
import com.turbomaquinas.POJO.general.Personal;

@Service
public class LogicaDepartamento implements DepartamentoService {

	@Autowired
	DepartamentoDAO repositorio;
	
	@Autowired
	SolicitudCambioVistaDAO repositorioSolicitudes;
	
	@Override
	public List<DepartamentoVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public DepartamentoVista buscar(String clave) throws DataAccessException{
		return repositorio.buscar(clave);
	}

	@Override
	public List<SolicitudCambioVista> consultar(String clave) throws DataAccessException{
		return repositorioSolicitudes.consultar(clave);
	}

	@Override
	public List<Personal> consultarEvaluadores(String clave) throws DataAccessException{
		return repositorio.consultarEvaluadores(clave);
	}

	@Override
	public void crear(Departamento d) throws DataAccessException{
		repositorio.crear(d);
	}

	@Override
	public void actualizar(Departamento d) throws DataAccessException{
		repositorio.actualizar(d);
	}

}
