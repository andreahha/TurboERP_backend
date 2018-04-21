package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.FacturaAnticipo;

public interface FacturaAnticipoDAO {
	
	public int crear(FacturaAnticipo fa);
	public FacturaAnticipo actualizar(FacturaAnticipo fa);
	public FacturaAnticipo buscar(int id);
	public List<FacturaAnticipo> consultar();
}
