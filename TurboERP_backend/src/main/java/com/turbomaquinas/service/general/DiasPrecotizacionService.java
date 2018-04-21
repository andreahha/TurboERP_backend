package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.DiasPrecotizacion;

public interface DiasPrecotizacionService {
	
	public DiasPrecotizacion crear(DiasPrecotizacion dp);
	public DiasPrecotizacion actualizar(DiasPrecotizacion dp);
	public DiasPrecotizacion buscar(int id);
	public List<DiasPrecotizacion> consultar();
	public Integer sumarDias(int id);
	public List<DiasPrecotizacion> buscarDiasPorPrecotizacion(int id);	
}
