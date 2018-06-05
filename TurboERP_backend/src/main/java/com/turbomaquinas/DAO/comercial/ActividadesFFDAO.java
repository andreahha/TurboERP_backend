package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.ActividadesFF;
import com.turbomaquinas.POJO.comercial.ActividadesFFVista;

public interface ActividadesFFDAO {

	public int crear(ActividadesFF aff);
	public ActividadesFF actualizar(ActividadesFF aff);
	public ActividadesFF buscar(int id);
	public List<ActividadesFF> consultar();
	public List<ActividadesFFVista> consultarPorFactura(int idFactura);
	
}
