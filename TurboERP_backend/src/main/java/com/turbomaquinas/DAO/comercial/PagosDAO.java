package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.Pagos;
import com.turbomaquinas.POJO.comercial.PagosVista;

public interface PagosDAO {
	
	public int crear(Pagos p);
	public Pagos actualizar(Pagos p);
	public PagosVista buscar(int id);
	public List<PagosVista> consultar();
	
	public void AplicarPagos(String doc);

}
