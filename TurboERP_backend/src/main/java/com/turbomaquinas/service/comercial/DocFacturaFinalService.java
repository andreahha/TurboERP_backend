package com.turbomaquinas.service.comercial;

import com.turbomaquinas.POJO.comercial.DocumentoFacturaFinal;
import com.turbomaquinas.POJO.comercial.FacturaFinalVista;

public interface DocFacturaFinalService {
	
	public FacturaFinalVista crear(DocumentoFacturaFinal dff);
	public void cancelar(DocumentoFacturaFinal dff);
}
