package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.SubindiceCotizacion;
import com.turbomaquinas.POJO.comercial.SubindiceCotizacionVista;

public interface SubindiceCotizacionService {
	public SubindiceCotizacionVista crear(SubindiceCotizacion sc);
	public SubindiceCotizacionVista actualizar(SubindiceCotizacion sc);
	public SubindiceCotizacionVista buscar(int id);
	public List<SubindiceCotizacionVista> consultar();
	public boolean borrar(SubindiceCotizacion sc);
}
