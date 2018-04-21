package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.PuestoContacto;

public interface PuestoContactoService {
	
	public void crear(PuestoContacto pc);
	public void actualizar(PuestoContacto pc) ;
	public PuestoContacto buscar(int id);
	public List<PuestoContacto> consultar();
}
