package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.PagosDetalle;
import com.turbomaquinas.POJO.comercial.PagosDetalleVista;

public interface PagosDetalleService {
	
	public PagosDetalleVista crear(PagosDetalle pd);
	public PagosDetalle actualizar(PagosDetalle pd);
	public PagosDetalleVista buscar(int id);
	public List<PagosDetalleVista> consultar();

}
