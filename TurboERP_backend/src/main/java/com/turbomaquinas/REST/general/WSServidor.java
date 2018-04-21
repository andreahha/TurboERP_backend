package com.turbomaquinas.REST.general;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.REST.comercial.WSPrecotizacion;
import com.turbomaquinas.service.general.ServidorService;

@RestController
@RequestMapping("/general/fecha")
public class WSServidor {

	private static final Log bitacora = LogFactory.getLog(WSPrecotizacion.class);
	
	@Autowired
	ServidorService s;
	
	@GetMapping()
	public ResponseEntity<String> obtener(){
		String fecha = null;
		try {
			fecha = s.obtenerfecha();
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<String> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<String> (fecha, HttpStatus.OK);
	}
}
