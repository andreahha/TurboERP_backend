package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.MarcaEquipo;

public interface MarcaEquipoDAO {
	
	public MarcaEquipo buscar (int id);
	public List<MarcaEquipo> consultar();
	public MarcaEquipo crear (MarcaEquipo m);
	public MarcaEquipo actualizar (MarcaEquipo m);

}
