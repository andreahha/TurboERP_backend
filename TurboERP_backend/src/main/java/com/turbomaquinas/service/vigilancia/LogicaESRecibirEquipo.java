package com.turbomaquinas.service.vigilancia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.vigilancia.ESRecibirEquipoDAO;
import com.turbomaquinas.POJO.vigilancia.ESRecibirEquipo;
import com.turbomaquinas.POJO.vigilancia.ESRecibirEquipoVista;

@Service
public class LogicaESRecibirEquipo implements ESRecibirEquipoService {
	
	@Autowired
	ESRecibirEquipoDAO repESRecibir;
	
	@Override
	public ESRecibirEquipoVista buscar(int id) throws DataAccessException {
		return repESRecibir.buscar(id);
	}

	@Override
	public List<ESRecibirEquipoVista> consultar() throws DataAccessException {
		return repESRecibir.consultar();
	}

	@Override
	public ESRecibirEquipoVista crear(ESRecibirEquipo esr) throws DataAccessException {
		int id = repESRecibir.crear(esr);
		return repESRecibir.buscar(id);
	}

	@Override
	public ESRecibirEquipo actualizar(ESRecibirEquipo esr) throws DataAccessException {
		return repESRecibir.actualizar(esr);
	}

	@Override
	public List<ESRecibirEquipoVista> PendientePorRecibir(int id) throws DataAccessException{
		return repESRecibir.PendientePorRecibir(id);
	}

	@Override
	public List<ESRecibirEquipoVista> recibidosPorOrden(int id) throws DataAccessException{
		return repESRecibir.recibidosPorOrden(id);
	}

	@Override
	public List<ESRecibirEquipoVista> noRecibidosPorCliente(int id) throws DataAccessException{
		return repESRecibir.noRecibidosPorCliente(id);
	}

	@Override
	public List<ESRecibirEquipoVista> PendienteRegularizar() throws DataAccessException{
		return repESRecibir.PendienteRegularizar();
	}

}
