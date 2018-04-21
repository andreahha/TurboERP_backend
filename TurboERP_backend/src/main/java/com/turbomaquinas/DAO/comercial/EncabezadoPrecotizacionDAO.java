package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacion;
import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacionVista;

public interface EncabezadoPrecotizacionDAO {
	public int crear(EncabezadoPrecotizacion ep);
	public void actualizar(EncabezadoPrecotizacion ep);
	public EncabezadoPrecotizacionVista buscar(int id);
	public List<EncabezadoPrecotizacionVista> consultar();
	public int recuperarUltimoLugar(int precotizacionesID);
	public List<EncabezadoPrecotizacionVista> consultarPorPrecotizacion(int id);
	public int consultarCantidadporPrecotizacion(int id);
	public void reordenar_actualiza(int precotizaciones_id, int lugarOrigen, int lugarDestino);
	public void reordenar_elimina(int precotizaciones_id, int lugarOrigen);
}
