package com.turbomaquinas.DAO.general;

import java.math.BigDecimal;
import java.util.List;

import com.turbomaquinas.POJO.general.ActividadAutorizadaVista;
import com.turbomaquinas.POJO.general.SolicitudDesautorizacionAA;

public interface SolicitudDesautorizacionAADAO {
	public int crear(int ordenId, String motivo, String tipo, int creadoPor);
	public SolicitudDesautorizacionAA buscar(int id);
	public void actualizarAlfrescoID(int id, String alfresco_id);
	public SolicitudDesautorizacionAA buscarPorFolio(int numero);
	public List<ActividadAutorizadaVista> consultarActividades(int id);
	public void actualizarEstado(int id, String estado);
	public List<SolicitudDesautorizacionAA> consultarPorOrden(int id);
	public List<SolicitudDesautorizacionAA> consultarPorOrdenEstado(int id, String estado);
	public BigDecimal consultarImporteAutorizado(int idSolicitud);
}
