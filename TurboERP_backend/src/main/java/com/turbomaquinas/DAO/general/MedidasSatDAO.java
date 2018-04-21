package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.MedidasSat;

public interface MedidasSatDAO {
	
	public MedidasSat buscar(String clave);
	public List<MedidasSat> consultar();

}
