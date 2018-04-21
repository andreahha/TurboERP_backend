package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.CodigoTRXDAO;
import com.turbomaquinas.POJO.general.CodigoTRX;

@Service
public class LogicaCodigoTRX implements CodigoTRXService {

	@Autowired
	CodigoTRXDAO repositorio;
	
	@Override
	public List<CodigoTRX> consultar(String clave) throws DataAccessException {
		if(clave.equals("*")){
			return repositorio.consultar();
		}
		else {
			return repositorio.consultar(clave);
		}
	}

	@Override
	public CodigoTRX buscarClave(String clave) throws DataAccessException {
		return repositorio.buscarClave(clave);
	}

}
