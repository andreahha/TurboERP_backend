package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.OportunidadTrabajo;

public interface OportunidadTrabajoDAO {
	public int crear(OportunidadTrabajo o);
	public void actualizar(OportunidadTrabajo o);
	public OportunidadTrabajo buscar(int id);
	public List<OportunidadTrabajo> consultar();
}
