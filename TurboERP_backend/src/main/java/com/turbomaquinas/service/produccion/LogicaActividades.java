package com.turbomaquinas.service.produccion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.produccion.ActividadesDAO;

@Service
public class LogicaActividades implements ActividadesService{
	
	@Autowired
	ActividadesDAO repositorio;

	@Override
	public Boolean deptosVacio(int id) {
		return repositorio.estaVacio(id);
	}
	
}
