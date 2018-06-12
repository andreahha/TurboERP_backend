package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.FacturaVariosDetalle;
import com.turbomaquinas.POJO.comercial.FacturaVariosDetalleVista;

public interface FacturaVariosDetalleDAO {
	public int crear(FacturaVariosDetalle fvd);
	public void actualizar(FacturaVariosDetalle fvd);
	public FacturaVariosDetalleVista buscar(int id);
	public List<FacturaVariosDetalleVista> consultar();
	public List<FacturaVariosDetalleVista> consultarPorFacturaVarios(int id);
}
