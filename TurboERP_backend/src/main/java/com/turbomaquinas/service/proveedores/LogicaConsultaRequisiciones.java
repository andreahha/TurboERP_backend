package com.turbomaquinas.service.proveedores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.proveedores.ConsultaRequisicionesDAO;
import com.turbomaquinas.POJO.proveedores.ConsultaRequisiciones;

@Service
public class LogicaConsultaRequisiciones implements  ConsultaRequisicionesService{
	

	@Autowired
	ConsultaRequisicionesDAO cr;

	@Override
	public List<ConsultaRequisiciones> consultar() {
		return cr.consultar();
	}

	@Override
	public List<ConsultaRequisiciones> consultarPorOrden(int id) {
		return cr.consultarPorOrden(id);
	}

}
