package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Puesto;

public interface PuestoService {
	public List<Puesto> consultar();
	public Puesto crear(Puesto p);
	public Puesto actualizar(Puesto p);
	public Puesto buscar(int id);
}
