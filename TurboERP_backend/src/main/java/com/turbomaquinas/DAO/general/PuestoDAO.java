package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.Puesto;

public interface PuestoDAO {
	public List<Puesto> consultar();
	public boolean esJefe(int id);
	public int crear(Puesto p);
	public Puesto actualizar(Puesto p);
	public Puesto buscar(int id);
}
