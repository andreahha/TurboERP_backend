package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.ActividadesFF;

public interface ActividadesFFDAO {

	public int crear(ActividadesFF aff);
	public ActividadesFF actualizar(ActividadesFF aff);
	public ActividadesFF buscar(int id);
	public List<ActividadesFF> consultar();
	
}
