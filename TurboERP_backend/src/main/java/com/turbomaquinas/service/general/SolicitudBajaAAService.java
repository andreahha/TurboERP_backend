package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.ActividadAutorizadaVista;
import com.turbomaquinas.POJO.general.SolicitudDesautorizacionAA;

public interface SolicitudBajaAAService {
	
	public void actualizarAlfresco(int id, String alfresco_id);
	public SolicitudDesautorizacionAA buscar(int id);
	public SolicitudDesautorizacionAA buscarFolio(int numero);
	public List<ActividadAutorizadaVista> consultarActividades(int id);
	public void actualizarEstado(int id, String estado);
	public List<SolicitudDesautorizacionAA> consultarPorOrden(int id);
	public List<SolicitudDesautorizacionAA> consultarPorOrdenEstado(int id, String estado);
}
