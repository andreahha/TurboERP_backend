package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacion;
import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacionVista;

public interface EncabezadoPrecotizacionService {
	public EncabezadoPrecotizacionVista crear(EncabezadoPrecotizacion ep);
	public EncabezadoPrecotizacionVista actualizar(EncabezadoPrecotizacion ep);
	public EncabezadoPrecotizacionVista buscar(int id);
	public List<EncabezadoPrecotizacionVista> consultar();
	public int consultarCantidadDetalles(int id);
	public boolean borrar(EncabezadoPrecotizacion ep);

}
