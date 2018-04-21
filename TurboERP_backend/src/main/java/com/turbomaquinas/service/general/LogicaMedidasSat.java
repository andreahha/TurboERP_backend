package com.turbomaquinas.service.general;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.general.MedidasSatDAO;
import com.turbomaquinas.POJO.general.MedidasSat;

@Service
public class LogicaMedidasSat implements MedidasSatService{
	
	@Autowired
	MedidasSatDAO repMS;

	@Override
	public MedidasSat buscar(String clave) {
		return repMS.buscar(clave);
	}

	@Override
	public List<MedidasSat> consultar() {
		return repMS.consultar();
	}

}
