package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.SubindicePrecotizacion;
import com.turbomaquinas.POJO.comercial.SubindicePrecotizacionVista;

public interface SubindicePrecotizacionService {
	public SubindicePrecotizacionVista crear(SubindicePrecotizacion sp);
	public SubindicePrecotizacionVista actualizar(SubindicePrecotizacion sp);
	public SubindicePrecotizacionVista buscar(int id);
	public List<SubindicePrecotizacionVista> consultar();
	public boolean borrar(SubindicePrecotizacion sp);
}
