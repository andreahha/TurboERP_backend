package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Cubre;

public interface CubreDAO {
	public int crear (Cubre cubre);
	public void actualizar (Cubre cubre);
	public Cubre buscar (int id);
	public List<Cubre> consultar();
	public boolean estaDisponible(int puestos_id);
	public Cubre buscarporPersonal(int id);
}
