package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.ActividadesFA;

public interface ActividadesFAService {
	
	public ActividadesFA crear(ActividadesFA afa);
	public ActividadesFA actualizar(ActividadesFA afa);
	public ActividadesFA buscar(int id);
	public List<ActividadesFA> consultar();

}
