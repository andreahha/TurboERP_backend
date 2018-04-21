package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.SubindiceCotizacion;
import com.turbomaquinas.POJO.comercial.SubindiceCotizacionVista;

public interface SubindiceCotizacionDAO {
	public int crear(SubindiceCotizacion sc);
	public void actualizar(SubindiceCotizacion sc);
	public SubindiceCotizacionVista buscar(int id);
	public List<SubindiceCotizacionVista> consultar(); 
	public int recuperarUltimoLugar(int detalleID);
	public List<SubindiceCotizacionVista> consultarPorCotizacion(int id);
	public int consultarCantidadPorDetalle(int id);
	public void reordenar_actualiza(int detalle_cotizaciones_id, int lugarDestino, int lugarOrigen);
	public void reordenar_elimina(int detalle_cotizaciones_id, int lugarOrigen);
	public List<SubindiceCotizacionVista> consultarPorDetalle(int id);
}
