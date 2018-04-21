package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.FacturaVariosDetalle;

public interface FacturaVariosDetalleDAO {
	public int crear(FacturaVariosDetalle fvd);
	public FacturaVariosDetalle actualizar(FacturaVariosDetalle fvd);
	public FacturaVariosDetalle buscar(int id);
	public List<FacturaVariosDetalle> consultar();
}
