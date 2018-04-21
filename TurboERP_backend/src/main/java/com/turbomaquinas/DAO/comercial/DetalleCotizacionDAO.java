package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.DAO.comercial.JDBCDetalleCotizacion.ActividadCotizacion;
import com.turbomaquinas.POJO.comercial.DetalleCotizacion;
import com.turbomaquinas.POJO.comercial.DetalleCotizacionVista;

public interface DetalleCotizacionDAO {	
	public int crear(DetalleCotizacion dc);
	public void actualizar(DetalleCotizacion dc);
	public DetalleCotizacionVista buscar(int id);
	public List<DetalleCotizacionVista> consultar();
	public int recuperarUltimoLugar(int encabezadoID);
	public List<DetalleCotizacionVista> consultarPorCotizacion(int id);
	public int consultarCantidadPorEncabezado(int id);
	public void reordenar_actualiza(int encabezados_cotizaciones_id, int lugarDestino, int lugarOrigen);
	public void reordenar_elimina(int encabezados_cotizaciones_id, int lugarOrigen);
	public List<DetalleCotizacionVista> consultarPorEncabezado(int id);
	public List<DetalleCotizacionVista> consultarSinAutorizar(int id);
	public boolean esPlanta(int detalleCotizacionId);
	public void actualizarImporte (int id, float importe);
	public List<ActividadCotizacion> consultarPorListaId(List<Integer> ids);

}
