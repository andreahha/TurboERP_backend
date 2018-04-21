package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.MedidasSat;

public interface MedidasSatService {
	
	public MedidasSat buscar(String clave);
	public List<MedidasSat> consultar();

}
