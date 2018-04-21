package com.turbomaquinas.service.servexternos;

import java.util.List;

import com.turbomaquinas.POJO.servexternos.SolicitudServExterno;

public interface SolicitudServExternoService {
	public SolicitudServExterno crear(SolicitudServExterno sol);
	public void actualizar(SolicitudServExterno sol);
	public SolicitudServExterno buscar(int id);
	public List<SolicitudServExterno> consultar();
}
