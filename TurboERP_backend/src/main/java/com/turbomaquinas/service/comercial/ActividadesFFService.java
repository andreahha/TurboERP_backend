package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.ActividadesFF;

public interface ActividadesFFService {
	
	public ActividadesFF crear(ActividadesFF aff);
	public ActividadesFF actualizar(ActividadesFF aff);
	public ActividadesFF buscar(int id);
	public List<ActividadesFF> consultar();

}
