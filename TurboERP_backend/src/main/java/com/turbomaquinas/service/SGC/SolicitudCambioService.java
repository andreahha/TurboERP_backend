package com.turbomaquinas.service.SGC;

import java.util.List;

import com.turbomaquinas.POJO.SGC.SolicitudCambio;
import com.turbomaquinas.POJO.SGC.SolicitudCambioVista;

public interface SolicitudCambioService {
	public SolicitudCambioVista crear(SolicitudCambio solicitud);
	public SolicitudCambioVista buscar(int id);
	public List<SolicitudCambioVista> consultar();
	public List<SolicitudCambioVista> consultarporEstado(String estado, String rol);
	public void actualizarEvaluacion(SolicitudCambio solicitud);
	public void actualizarResolucion(SolicitudCambio solicitud);
	public void actualizarVerificacion(SolicitudCambio solicitud);
}
