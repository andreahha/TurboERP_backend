package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.Proyecto;

public interface ProyectoService {
	public Proyecto crear(Proyecto proyecto);
	public void actualizar(Proyecto proyecto);
	public Proyecto buscar(int id);
	public List<Proyecto> consultar();
}
