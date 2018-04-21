package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DetallePrecotizacion;
import com.turbomaquinas.POJO.comercial.DetallePrecotizacionVista;

public interface DetallePrecotizacionDAO {
	public int crear(DetallePrecotizacion dp);
	public void actualizar(DetallePrecotizacion dp);
	public DetallePrecotizacionVista buscar(int id);
	public List<DetallePrecotizacionVista> consultar();
	public int recuperarUltimoLugar(int encabezadoID);
	public List<DetallePrecotizacionVista> consultarPorPrecotizacion(int id);
	public int consultarCantidadPorEncabezado(int id);
	public void reordenar_actualiza(int encabezados_precotizaciones_id, int lugarDestino, int lugarOrigen);
	public void reordenar_elimina(int encabezados_precotizaciones_id, int lugarOrigen);
	public List<DetallePrecotizacionVista> consultarPorEncabezado(int id);
}
