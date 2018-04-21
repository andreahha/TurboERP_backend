package com.turbomaquinas.REST.comercial;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.NotaCredito;
import com.turbomaquinas.POJO.comercial.NotaCreditoVista;
import com.turbomaquinas.service.comercial.NotaCreditoService;

@RestController
@RequestMapping("/comercial/notacredito")
public class WSNotaCredito {
	
	private static final Log bitacora = LogFactory.getLog(WSNotaCredito.class);
	
	@Autowired
	NotaCreditoService s;
	
	@PostMapping
	public ResponseEntity<NotaCreditoVista> crear(@RequestBody NotaCredito nc){
		NotaCreditoVista respuesta = null;
		bitacora.info(nc);
		try {
			respuesta = s.crear(nc);
			return new ResponseEntity<NotaCreditoVista>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<NotaCreditoVista> (HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(NotaCredito nc){
		bitacora.info(nc);
		try {
			s.actualizar(nc);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void> (HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<NotaCreditoVista> buscar(@PathVariable int id){
		NotaCreditoVista nc = null;
		try {
			nc = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<NotaCreditoVista> (HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<NotaCreditoVista> (nc, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<NotaCreditoVista>> consultar(){
		
		List<NotaCreditoVista> lnc = s.consultar();
		if (lnc == null )
			return new ResponseEntity<List<NotaCreditoVista>> (HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<NotaCreditoVista>> (lnc, HttpStatus.OK);
	}

}
