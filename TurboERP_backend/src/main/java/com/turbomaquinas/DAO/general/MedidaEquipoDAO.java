package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.MedidaEquipo;

public interface MedidaEquipoDAO {
	
	public MedidaEquipo buscar(int id);
	public List<MedidaEquipo> consultar();
	public int crear(MedidaEquipo me);
	public MedidaEquipo actualizar(MedidaEquipo me);
}
