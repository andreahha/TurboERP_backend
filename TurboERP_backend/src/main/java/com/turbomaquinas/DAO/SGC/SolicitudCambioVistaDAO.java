package com.turbomaquinas.DAO.SGC;

import java.util.List;

import com.turbomaquinas.POJO.SGC.SolicitudCambioVista;

public interface SolicitudCambioVistaDAO {
	public List<SolicitudCambioVista> consultar();
	public SolicitudCambioVista buscar(int id);
	public List<SolicitudCambioVista> consultar(String claveDepto);
	public List<SolicitudCambioVista> consultarporEstado(String estado, String rol);
}
