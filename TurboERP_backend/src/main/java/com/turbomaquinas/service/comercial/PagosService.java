package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DocumentoAplicarPago;
import com.turbomaquinas.POJO.comercial.Pagos;
import com.turbomaquinas.POJO.comercial.PagosVista;

public interface PagosService {
	
	public Pagos actualizar(Pagos p);
	public PagosVista buscar(int id);
	public List<PagosVista> consultar();
	public void aplicarPagos(DocumentoAplicarPago doc);

}
