package com.turbomaquinas.service.timbrado;

import org.springframework.http.ResponseEntity;

public interface TimbradoService {
	public String obtenerJSONFacturaFinal(int idFactura,String modo);
	public ResponseEntity<String> timbrarFactura(String factura,int id,int numEmpleado,String modo);
}
