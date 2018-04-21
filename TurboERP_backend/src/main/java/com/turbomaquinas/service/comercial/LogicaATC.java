package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.ATCDAO;
import com.turbomaquinas.POJO.general.Personal;

@Service
public class LogicaATC implements ATCService {

	@Autowired
	ATCDAO repositorio;
	
	@Override
	public List<Personal> consultarATC() throws DataAccessException {
		return repositorio.consultar();
	}

}
