package com.turbomaquinas.DAO.proveedores;

import java.util.List;

import com.turbomaquinas.POJO.proveedores.ConsultaRequisiciones;

public interface ConsultaRequisicionesDAO {
	
	public List<ConsultaRequisiciones> consultar();	
	public List<ConsultaRequisiciones> consultarPorOrden(int id);	

}
