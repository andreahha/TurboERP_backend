package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DeptoPrecotizacion;
import com.turbomaquinas.POJO.comercial.DeptoPrecotizacionVista;

public interface DeptoPrecotizacionDAO {
	public void crear(DeptoPrecotizacion dp);
	public void actualizar(DeptoPrecotizacion dp);
	public DeptoPrecotizacionVista buscar(int id);
	public List<DeptoPrecotizacionVista> consultar(); 
}
