package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.PuestoContacto;

public interface PuestoContactoDAO {
	public void crear(PuestoContacto pc);
	public void actualizar(PuestoContacto pc) ;
	public PuestoContacto buscar(int id);
	public List<PuestoContacto> consultar();
	
}
