package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.BancosDAO;
import com.turbomaquinas.POJO.general.Bancos;

@Service
public class LogicaBancos implements BancosService {
	
	@Autowired
	BancosDAO repBco;

	@Override
	public Bancos buscar(String clave) throws DataAccessException {
		return repBco.buscar(clave);
	}

	@Override
	public List<Bancos> consultar() throws DataAccessException {
		return repBco.consultar();
	}

}
