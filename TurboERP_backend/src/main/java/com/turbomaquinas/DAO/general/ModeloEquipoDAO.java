package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.ModeloEquipo;

public interface ModeloEquipoDAO {
	
	public ModeloEquipo buscar(int id);
	public List<ModeloEquipo> consultar();
	public ModeloEquipo crear(ModeloEquipo md);
	public ModeloEquipo actualizar(ModeloEquipo md);
}
