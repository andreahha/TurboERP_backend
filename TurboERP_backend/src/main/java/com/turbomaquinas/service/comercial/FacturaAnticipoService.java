package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.FacturaAnticipo;

public interface FacturaAnticipoService {
	
	public FacturaAnticipo crear(FacturaAnticipo fa);
	public FacturaAnticipo actualizar(FacturaAnticipo fa);
	public FacturaAnticipo buscar(int id);
	public List<FacturaAnticipo> consultar();

}
