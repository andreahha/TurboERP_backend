package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.ModeloEquipo;

public interface ModeloEquipoService {
	
	public ModeloEquipo buscar(int id);
	public List<ModeloEquipo> consultar();
	public ModeloEquipo crear(ModeloEquipo md);
	public ModeloEquipo actualizar(ModeloEquipo md);
}
