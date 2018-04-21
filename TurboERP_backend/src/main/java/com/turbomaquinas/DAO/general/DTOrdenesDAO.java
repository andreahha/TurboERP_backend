package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.DTOrdenes;

public interface DTOrdenesDAO {
	
	public int crear (DTOrdenes dto);
	public DTOrdenes actualizar(DTOrdenes dto);
	public DTOrdenes buscar(int id);
	public List<DTOrdenes> consultar();
	public DTOrdenes buscarPorOrden(int id);


}
