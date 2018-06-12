package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DetalleFacturaVarios;
import com.turbomaquinas.POJO.comercial.DetalleFacturaVariosVista;

public interface DetalleFacturaVariosService {
	public DetalleFacturaVariosVista crear(DetalleFacturaVarios fvd);
	public void actualizar(DetalleFacturaVarios fvd);
	public DetalleFacturaVariosVista buscar(int id);
	public List<DetalleFacturaVariosVista> consultar();
}
