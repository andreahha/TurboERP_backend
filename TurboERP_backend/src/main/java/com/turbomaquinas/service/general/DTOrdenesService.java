package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.DTOrdenes;

public interface DTOrdenesService {
	
	public DTOrdenes crear(DTOrdenes dto);
	public DTOrdenes actualizar(DTOrdenes dto);
	public DTOrdenes buscar(int id);
	public List<DTOrdenes> consultar();


}
