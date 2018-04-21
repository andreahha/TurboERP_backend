package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DTPrecotizacion;

public interface DTPrecotizacionDAO {
	
	public int crear (DTPrecotizacion dtp);
	public DTPrecotizacion actualizar(DTPrecotizacion dtp);
	public DTPrecotizacion buscar(int id);
	public List<DTPrecotizacion> consultar();
	public DTPrecotizacion buscarPorPrecotizacion(int id);

}
