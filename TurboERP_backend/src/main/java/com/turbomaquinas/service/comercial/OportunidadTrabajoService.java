package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.OportunidadTrabajo;

public interface OportunidadTrabajoService {
	public OportunidadTrabajo crear(OportunidadTrabajo o);
	public void actualizar(OportunidadTrabajo o);
	public OportunidadTrabajo buscar(int id);
	public List<OportunidadTrabajo> consultar();
}
