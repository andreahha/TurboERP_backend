package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DeptoPrecotizacion;
import com.turbomaquinas.POJO.comercial.DeptoPrecotizacionVista;

public interface DeptoPrecotizacionService {
	public void crear(DeptoPrecotizacion dp);
	public void actualizar(DeptoPrecotizacion dp);
	public DeptoPrecotizacionVista buscar(int id);
	public List<DeptoPrecotizacionVista> consultar(); 
}
