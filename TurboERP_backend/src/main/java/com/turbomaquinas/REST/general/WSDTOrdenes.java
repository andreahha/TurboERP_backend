package com.turbomaquinas.REST.general;

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

import com.turbomaquinas.POJO.general.DTOrdenes;
import com.turbomaquinas.service.general.DTOrdenesService;

@RestController
@RequestMapping("/general/dtordenes")
public class WSDTOrdenes {
	
	private static final Log bitacora = LogFactory.getLog(WSDTOrdenes.class);
	
	@Autowired
	DTOrdenesService s;
	
	@PostMapping
	public ResponseEntity<DTOrdenes> crear(@RequestBody DTOrdenes dto) {
		DTOrdenes respuesta = null;
//		bitacora.info(dto);
		bitacora.info(dto.toString());

		try {
			respuesta = s.crear(dto);
			return new ResponseEntity<DTOrdenes>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DTOrdenes> (HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody DTOrdenes dto){
		bitacora.info(dto);
		try {
			s.actualizar(dto);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DTOrdenes> buscar(@PathVariable int id){
		DTOrdenes dto = null;
		try {
			dto = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DTOrdenes>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<DTOrdenes>(dto, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<DTOrdenes>> consultar(){
		List<DTOrdenes> dtorde = s.consultar();
		if (dtorde == null)
			return new ResponseEntity<List<DTOrdenes>>(HttpStatus.CONFLICT);
		return new ResponseEntity<List<DTOrdenes>>(dtorde, HttpStatus.OK);
		
	}
}
