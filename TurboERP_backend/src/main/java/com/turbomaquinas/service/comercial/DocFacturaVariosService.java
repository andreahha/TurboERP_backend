package com.turbomaquinas.service.comercial;

import com.turbomaquinas.POJO.comercial.DocumentoFacturaVarios;

public interface DocFacturaVariosService {
	
	public DocumentoFacturaVarios crear(DocumentoFacturaVarios dfv);
	public void cancelar(DocumentoFacturaVarios dfv);

}
