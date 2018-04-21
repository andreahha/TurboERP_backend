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

import com.turbomaquinas.POJO.general.MedidaEquipo;
import com.turbomaquinas.service.general.MedidaEquipoService;

@RestController
@RequestMapping("/general/medidas")


public class WSMedidaEquipo {
	
	private static final Log bitacora = LogFactory.getLog(WSMedidaEquipo.class);

	@Autowired
	MedidaEquipoService s;
	
	@GetMapping("/{id}")
	public ResponseEntity<MedidaEquipo> buscar(@PathVariable int id){
		MedidaEquipo med = null;
		try {
			med = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<MedidaEquipo> (HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<MedidaEquipo> (med, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<MedidaEquipo>> consultar(){
		List<MedidaEquipo> mdas = s.consultar();
		if (mdas == null)
			return new ResponseEntity<List<MedidaEquipo>>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<MedidaEquipo>> (mdas, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<MedidaEquipo> crear(@RequestBody MedidaEquipo md){
		MedidaEquipo respuesta = null;
		bitacora.info(md);
		try {
			respuesta = s.crear(md);
			return new ResponseEntity<MedidaEquipo>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<MedidaEquipo>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody MedidaEquipo me){
		s.actualizar(me);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	

}
