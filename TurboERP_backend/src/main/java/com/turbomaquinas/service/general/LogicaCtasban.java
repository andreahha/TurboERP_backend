package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.CtasbanDAO;
import com.turbomaquinas.POJO.general.Ctasban;
import com.turbomaquinas.POJO.general.CtasbanVista;

@Service
public class LogicaCtasban implements CtasbanService {

	@Autowired
	CtasbanDAO repCB;
	
	@Override
	public CtasbanVista crear(Ctasban cb) throws DataAccessException {
		int id = repCB.crear(cb);
		return repCB.buscar(id);
	}

	@Override
	public void actualizar(Ctasban cb) throws DataAccessException {
		repCB.actualizar(cb);
	}

	@Override
	public CtasbanVista buscar(int id) throws DataAccessException {
		return repCB.buscar(id);
	}

	@Override
	public List<CtasbanVista> consultar() throws DataAccessException {
		return repCB.consultar();
	}

	@Override
	public CtasbanVista buscarporNumero(String numero) throws DataAccessException {
		
		return repCB.buscarporNumero(numero);
	}

}
