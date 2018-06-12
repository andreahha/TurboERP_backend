package com.turbomaquinas.service.timbrado;

import org.springframework.http.ResponseEntity;

public interface TimbradoService {
	public ResponseEntity<String> timbrarFacturaFinal(String factura,int id,int numEmpleado,String modo);
	public ResponseEntity<String> cancelarCFDiFacturaFinal(String jsonCancelarfactura);
}
