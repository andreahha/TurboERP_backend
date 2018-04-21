package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DeptoContacto;

public interface DeptoContactoService {
	
	public void crear(DeptoContacto dc);
	public void actualizar(DeptoContacto dc) ;
	public DeptoContacto buscar(int id);
	public List<DeptoContacto> consultar();
}
