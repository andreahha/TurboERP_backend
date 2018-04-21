package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.Giro;

public interface GiroService {
	public void crear(Giro g);
	public Giro buscar(int id);
	public List<Giro> consultar();
	public void actualizar(Giro g);	
	
}
