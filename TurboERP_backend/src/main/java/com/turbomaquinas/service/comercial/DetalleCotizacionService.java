package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.DAO.comercial.JDBCDetalleCotizacion.ActividadCotizacion;
import com.turbomaquinas.POJO.comercial.DetalleCotizacion;
import com.turbomaquinas.POJO.comercial.DetalleCotizacionVista;

public interface DetalleCotizacionService {
	public DetalleCotizacionVista crear(DetalleCotizacion dc);
	public DetalleCotizacionVista actualizar(DetalleCotizacion dc);
	public DetalleCotizacionVista buscar(int id);
	public List<DetalleCotizacionVista> consultar();
	public int consultarCantidadSubindices(int id);
	public boolean borrar(DetalleCotizacion dc);
	public List<DetalleCotizacionVista> consultarSinAutorizar(int id);	
	public void actualizarImporte (int id, float importe);
	public List<ActividadCotizacion> consultarPorListaId(List<Integer> ids);
}
