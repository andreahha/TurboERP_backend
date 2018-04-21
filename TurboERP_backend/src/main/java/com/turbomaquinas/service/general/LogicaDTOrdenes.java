package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.DTOrdenesDAO;
import com.turbomaquinas.POJO.general.DTOrdenes;

@Service
public class LogicaDTOrdenes implements DTOrdenesService {
	
	@Autowired
	DTOrdenesDAO repDTord;

	@Override
	public DTOrdenes crear(DTOrdenes dto) throws DataAccessException {
		int id = repDTord.crear(dto);
		return repDTord.buscar(id);
	}

	@Override
	public DTOrdenes actualizar(DTOrdenes dto) throws DataAccessException {
		return repDTord.actualizar(dto);
	}

	@Override
	public DTOrdenes buscar(int id) throws DataAccessException {
		return repDTord.buscar(id);
	}

	@Override
	public List<DTOrdenes> consultar() throws DataAccessException {
		return repDTord.consultar();
	}

}
