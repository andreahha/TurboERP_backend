package com.turbomaquinas.DAO.SGC;


import com.turbomaquinas.POJO.SGC.SolicitudCambio;

public interface SolicitudCambioDAO {
	public int crear(SolicitudCambio solicitud);
	public void actualizarEvaluacion(SolicitudCambio solicitud);
	public void actualizarResolucion(SolicitudCambio solicitud);
	public void actualizarVerificacion(SolicitudCambio solicitud);
}
