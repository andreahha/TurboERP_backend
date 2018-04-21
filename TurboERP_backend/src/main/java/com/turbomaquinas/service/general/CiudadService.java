package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Ciudad;
import com.turbomaquinas.POJO.general.CiudadVista;

public interface CiudadService {
	
	public CiudadVista buscar(int id);
	public List<CiudadVista> consultar();
	public CiudadVista crear(Ciudad c);
	public Ciudad actualizar(Ciudad c);
}
