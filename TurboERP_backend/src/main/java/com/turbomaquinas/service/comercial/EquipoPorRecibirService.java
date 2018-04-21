package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.EquipoPorRecibir;
import com.turbomaquinas.POJO.comercial.EquipoPorRecibirVista;

public interface EquipoPorRecibirService {
	public void crear(EquipoPorRecibir epr);
	public void actualizar(EquipoPorRecibir epr);
	public EquipoPorRecibirVista buscar(int id);
	public List<EquipoPorRecibirVista> consultar();
	public List<EquipoPorRecibirVista> ConsultarPorCliente(int id);
	public boolean borrar(EquipoPorRecibir epr);
}
