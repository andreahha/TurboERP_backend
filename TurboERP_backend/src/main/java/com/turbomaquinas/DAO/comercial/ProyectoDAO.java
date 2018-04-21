package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.Proyecto;

public interface ProyectoDAO {
	public int crear(Proyecto proyecto);
	public void actualizar(Proyecto proyecto);
	public Proyecto buscar(int id);
	public List<Proyecto> consultar();
}
