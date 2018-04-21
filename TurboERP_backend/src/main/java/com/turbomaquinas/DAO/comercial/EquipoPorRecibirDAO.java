package com.turbomaquinas.DAO.comercial;


import java.util.List;

import com.turbomaquinas.POJO.comercial.EquipoPorRecibir;
import com.turbomaquinas.POJO.comercial.EquipoPorRecibirVista;

public interface EquipoPorRecibirDAO {
	public void crear(EquipoPorRecibir epr);
	public void actualizar(EquipoPorRecibir epr);
	public EquipoPorRecibirVista buscar(int id);
	public List<EquipoPorRecibirVista> consultar();
	public List<EquipoPorRecibirVista> ConsultarPorCliente(int id);
}
