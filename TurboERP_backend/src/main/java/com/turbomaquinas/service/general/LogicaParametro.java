package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.ParametroDAO;
import com.turbomaquinas.POJO.general.Parametro;

@Service
public class LogicaParametro implements ParametroService{
	
	@Autowired
	ParametroDAO repParametro;

	@Override
	public List<Parametro> consultar() throws DataAccessException{
		return repParametro.consultar();
	}

}
