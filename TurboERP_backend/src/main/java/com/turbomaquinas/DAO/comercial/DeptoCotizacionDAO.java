package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DeptoCotizacion;

public interface DeptoCotizacionDAO {
	
	public int crear(DeptoCotizacion dc);
	public DeptoCotizacion actualizar(DeptoCotizacion dc);
	public DeptoCotizacion buscar(int id);
	public List<DeptoCotizacion> consultar();

}
