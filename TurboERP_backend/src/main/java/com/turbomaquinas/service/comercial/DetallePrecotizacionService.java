package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DetallePrecotizacion;
import com.turbomaquinas.POJO.comercial.DetallePrecotizacionVista;

public interface DetallePrecotizacionService {
	public DetallePrecotizacionVista crear(DetallePrecotizacion dp);
	public DetallePrecotizacionVista actualizar(DetallePrecotizacion dp);
	public DetallePrecotizacionVista buscar(int id);
	public List<DetallePrecotizacionVista> consultar();
	public int consultarCantidadSubindices(int id);
	public boolean borrar(DetallePrecotizacion dp);
}
