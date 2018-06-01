package com.turbomaquinas.service.timbrado;

import org.springframework.http.ResponseEntity;

public interface TimbradoService {
	public String obtenerJSONFacturaFinal(int idFactura);
	public ResponseEntity<String> timbrarFactura(String factura);
}
