package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DeptoCotizacion;

public interface DeptoCotizacionService {
	
	public DeptoCotizacion crear(DeptoCotizacion dc);
	public DeptoCotizacion actualizar(DeptoCotizacion dc);
	public DeptoCotizacion buscar(int id);
	public List<DeptoCotizacion> consultar();
}
