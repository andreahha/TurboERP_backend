package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.OrdenesRequisicionesDAO;
import com.turbomaquinas.POJO.general.OrdenesRequisiciones;

@Service
public class LogicaOrdenesRequisiciones implements OrdenesRequisicionesService{

	@Autowired
	OrdenesRequisicionesDAO repositorio;
	
	@Override
	public List<OrdenesRequisiciones> consultar() {
		return repositorio.consultar();
	}

}
