package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.FechasEstimadasCobro;

public interface FechasEstimadasCobroService {
	
	public void crear(FechasEstimadasCobro fec);
	public List<FechasEstimadasCobro> consultarPorFactura(int id);

}
