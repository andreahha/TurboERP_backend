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

import com.turbomaquinas.POJO.comercial.FacturaAnticipo;
import com.turbomaquinas.service.comercial.FacturaAnticipoService;

@RestController
@RequestMapping("/comercial/facturaanticipo")
public class WSFacturaAnticipo {
	
	private static final Log bitacora = LogFactory.getLog(WSFacturaAnticipo.class);
	
	@Autowired
	FacturaAnticipoService s;
	
	@PostMapping
	public ResponseEntity<FacturaAnticipo> crear(@RequestBody FacturaAnticipo fa){
		
		bitacora.info(fa.toString());
//		bitacora.info(fa);
		FacturaAnticipo respuesta = null;
		try {
			respuesta = s.crear(fa);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<FacturaAnticipo>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<FacturaAnticipo>(respuesta, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody FacturaAnticipo fa){
		bitacora.info(fa);
		try {
			s.actualizar(fa);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<FacturaAnticipo> buscar(@PathVariable int id){

		FacturaAnticipo fab = null;
		try {
			fab = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<FacturaAnticipo>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<FacturaAnticipo>(fab, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<FacturaAnticipo>> consultar(){
		
		List<FacturaAnticipo> fal = s.consultar();
		if ( fal == null)
			return new ResponseEntity<List<FacturaAnticipo>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<FacturaAnticipo>>(fal, HttpStatus.OK);
	}
	
}
