package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.UsoCfdiDAO;
import com.turbomaquinas.POJO.general.UsoCfdi;

@Service
public class LogicaUsoCfdi implements UsoCfdiService {
	
	@Autowired
	UsoCfdiDAO repUso;
	

	@Override
	public UsoCfdi buscar(String clave) {
		return repUso.buscar(clave);
	}

	@Override
	public List<UsoCfdi> consultar() {
		return repUso.consultar();
	}

}
