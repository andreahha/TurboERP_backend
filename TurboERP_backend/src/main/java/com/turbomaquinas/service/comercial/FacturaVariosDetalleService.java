package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.FacturaVariosDetalle;
import com.turbomaquinas.POJO.comercial.FacturaVariosDetalleVista;

public interface FacturaVariosDetalleService {
	public FacturaVariosDetalleVista crear(FacturaVariosDetalle fvd);
	public void actualizar(FacturaVariosDetalle fvd);
	public FacturaVariosDetalleVista buscar(int id);
	public List<FacturaVariosDetalleVista> consultar();
}
