package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.EncabezadoCotizacion;
import com.turbomaquinas.POJO.comercial.EncabezadoCotizacionVista;

public interface EncabezadoCotizacionService {
	public EncabezadoCotizacionVista crear(EncabezadoCotizacion ec);
	public EncabezadoCotizacionVista actualizar(EncabezadoCotizacion ec);
	public EncabezadoCotizacionVista buscar(int id);
	public List<EncabezadoCotizacionVista> consultar();
	public int consultarCantidadDetalles(int id);
	public boolean borrar(EncabezadoCotizacion ep);
}
