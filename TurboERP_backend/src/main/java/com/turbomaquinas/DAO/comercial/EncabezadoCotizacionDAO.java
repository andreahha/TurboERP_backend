package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.EncabezadoCotizacion;
import com.turbomaquinas.POJO.comercial.EncabezadoCotizacionVista;

public interface EncabezadoCotizacionDAO {
	public int crear(EncabezadoCotizacion ec);
	public void actualizar(EncabezadoCotizacion ec);
	public EncabezadoCotizacionVista buscar(int id);
	public List<EncabezadoCotizacionVista> consultar();
	public int recuperarUltimoLugar(int cotizacionesID);
	public List<EncabezadoCotizacionVista> consultarPorCotizacion(int id);
	public int consultarCantidadporCotizacion(int id);
	public void reordenar_actualiza(int cotizaciones_id, int lugarOrigen, int lugarDestino);
	public void reordenar_elimina(int cotizaciones_id, int lugarOrigen);
}
