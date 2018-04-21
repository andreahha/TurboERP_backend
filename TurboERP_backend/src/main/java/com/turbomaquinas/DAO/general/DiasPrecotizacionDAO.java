package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.DiasPrecotizacion;

public interface DiasPrecotizacionDAO {
	
	public int crear(DiasPrecotizacion dp);
	public DiasPrecotizacion actualizar(DiasPrecotizacion dp);
	public DiasPrecotizacion buscar(int id);
	public List<DiasPrecotizacion> consultar();
	public List<DiasPrecotizacion> buscarDiasPorPrecotizacion(int id);
	public Integer sumarDias(int id);

}
