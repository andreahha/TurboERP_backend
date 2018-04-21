package com.turbomaquinas.service.proveedores;

import java.util.List;

import com.turbomaquinas.POJO.proveedores.ConsultaRequisiciones;

public interface ConsultaRequisicionesService {
	
	public List<ConsultaRequisiciones> consultar();	
	public List<ConsultaRequisiciones> consultarPorOrden(int id);	

}
