package com.turbomaquinas.REST.comercial;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.Facturas;
import com.turbomaquinas.service.comercial.FacturasService;

@RestController
@RequestMapping("/comercial/facturas")
public class WSFacturas {
	
	private static final Log bitacora = LogFactory.getLog(WSFacturaFinal.class);
	
	@Autowired
	FacturasService fs;
	
	@GetMapping("/cliente/{id}/{moneda}")
	public ResponseEntity<List<Facturas>> consultarFacturasPendientesPorCliente(@PathVariable int id,@PathVariable String moneda){
		List<Facturas> f = null;
		try{
			f = fs.consultarFacturasPendientesPorCliente(id,moneda);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<Facturas>>(HttpStatus.NOT_FOUND);
		}
		if (f.isEmpty()) {
			return new ResponseEntity<List<Facturas>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Facturas>>(f, HttpStatus.OK);
		
	}

}
