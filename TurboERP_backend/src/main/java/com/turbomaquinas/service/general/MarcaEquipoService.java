package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.MarcaEquipo;

public interface MarcaEquipoService {
	
	public MarcaEquipo buscar (int id);
	public List<MarcaEquipo> consultar();
	public MarcaEquipo crear (MarcaEquipo m);
	public MarcaEquipo actualizar (MarcaEquipo m);

}
