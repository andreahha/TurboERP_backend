package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.SubindicePrecotizacion;
import com.turbomaquinas.POJO.comercial.SubindicePrecotizacionVista;

public interface SubindicePrecotizacionDAO {
	public int crear(SubindicePrecotizacion sp);
	public void actualizar(SubindicePrecotizacion sp);
	public SubindicePrecotizacionVista buscar(int id);
	public List<SubindicePrecotizacionVista> consultar();
	public int recuperarUltimoLugar(int detalleID);
	public List<SubindicePrecotizacionVista> consultarPorPrecotizacion(int id);
	public int consultarCantidadPorDetalle(int id);
	public void reordenar_actualiza(int detalle_precotizaciones_id, int lugarDestino, int lugarOrigen);
	public void reordenar_elimina(int detalle_precotizaciones_id, int lugarOrigen);
	public List<SubindicePrecotizacionVista> consultarPorDetalle(int id);

}
