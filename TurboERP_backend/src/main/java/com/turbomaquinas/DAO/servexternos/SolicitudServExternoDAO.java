package com.turbomaquinas.DAO.servexternos;

import java.util.List;

import com.turbomaquinas.POJO.servexternos.SolicitudServExterno;

public interface SolicitudServExternoDAO {
	public int crear(SolicitudServExterno sol);
	public void actualizar(SolicitudServExterno sol);
	public SolicitudServExterno buscar(int id);
	public List<SolicitudServExterno> consultar();
}
