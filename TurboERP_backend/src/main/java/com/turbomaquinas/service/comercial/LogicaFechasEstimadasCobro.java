package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.FechasEstimadasCobroDAO;
import com.turbomaquinas.POJO.comercial.FechasEstimadasCobro;

@Service
public class LogicaFechasEstimadasCobro implements FechasEstimadasCobroService{
	
	@Autowired
	FechasEstimadasCobroDAO repositorio;

	@Override
	public void crear(FechasEstimadasCobro fec) {
		repositorio.crear(fec);
		
	}

	@Override
	public List<FechasEstimadasCobro> consultarPorFactura(int id) {
		return repositorio.consultarPorFactura(id);
	}

}
