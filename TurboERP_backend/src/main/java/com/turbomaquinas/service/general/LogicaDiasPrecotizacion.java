package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.DiasPrecotizacionDAO;
import com.turbomaquinas.POJO.general.DiasPrecotizacion;

@Service
public class LogicaDiasPrecotizacion implements DiasPrecotizacionService {

	@Autowired
	DiasPrecotizacionDAO repDias;
	
	@Override
	public DiasPrecotizacion crear(DiasPrecotizacion dp) throws DataAccessException {
		int id = repDias.crear(dp);
		return repDias.buscar(id);
	}

	@Override
	public DiasPrecotizacion actualizar(DiasPrecotizacion dp) throws DataAccessException {
		return repDias.actualizar(dp);
	}

	@Override
	public DiasPrecotizacion buscar(int id) throws DataAccessException {
		return repDias.buscar(id);
	}

	@Override
	public List<DiasPrecotizacion> consultar() throws DataAccessException {
		return repDias.consultar();
	}

	@Override
	public Integer sumarDias(int id) throws DataAccessException{
		return repDias.sumarDias(id);
	}

	@Override
	public List<DiasPrecotizacion> buscarDiasPorPrecotizacion(int id) throws DataAccessException{
		return repDias.buscarDiasPorPrecotizacion(id);
	}
}
