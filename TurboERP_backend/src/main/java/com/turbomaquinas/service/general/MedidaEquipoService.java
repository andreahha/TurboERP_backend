package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.MedidaEquipo;

public interface MedidaEquipoService {
	
	public MedidaEquipo buscar(int id);
	public List<MedidaEquipo> consultar();
	public MedidaEquipo crear (MedidaEquipo me);
	public MedidaEquipo actualizar(MedidaEquipo me);

}
