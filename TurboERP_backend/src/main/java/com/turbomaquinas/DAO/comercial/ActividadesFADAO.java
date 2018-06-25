package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.ActividadesFA;

public interface ActividadesFADAO {
	
	public int crear(ActividadesFA afa);
	public ActividadesFA actualizar(ActividadesFA afa);
	public ActividadesFA buscar(int id);
	public List<ActividadesFA> consultar();

}
