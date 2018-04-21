package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.MedidaEquipoDAO;
import com.turbomaquinas.POJO.general.MedidaEquipo;

@Service
public class LogicaMedidaEquipo implements MedidaEquipoService {

	@Autowired
	MedidaEquipoDAO respMedida;
	
	@Override
	public MedidaEquipo buscar(int id) throws DataAccessException {
		return respMedida.buscar(id);
	}

	@Override
	public List<MedidaEquipo> consultar() throws DataAccessException {
		return respMedida.consultar();
	}

	@Override
	public MedidaEquipo crear(MedidaEquipo me) throws DataAccessException {
		int id = respMedida.crear(me);
		return respMedida.buscar(id);
	}

	@Override
	public MedidaEquipo actualizar(MedidaEquipo me) throws DataAccessException {
		return respMedida.actualizar(me);
	}

}
