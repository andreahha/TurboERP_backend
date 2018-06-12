package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DetalleFacturaVarios;
import com.turbomaquinas.POJO.comercial.DetalleFacturaVariosVista;

public interface DetalleFacturaVariosDAO {
	public int crear(DetalleFacturaVarios fvd);
	public void actualizar(DetalleFacturaVarios fvd);
	public DetalleFacturaVariosVista buscar(int id);
	public List<DetalleFacturaVariosVista> consultar();
	public List<DetalleFacturaVariosVista> consultarPorFacturaVarios(int id);
}
