package com.turbomaquinas.REST.servexternos;

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

import com.turbomaquinas.POJO.servexternos.SolicitudServExterno;
import com.turbomaquinas.service.servexternos.SolicitudServExternoService;

@RestController
@RequestMapping("/servexternos/solicitudservexterno")
public class WSSolicitudServExterno {

	public static Log bitacora = LogFactory.getLog(WSSolicitudServExterno.class);
	
	@Autowired
	SolicitudServExternoService s;
	
	@PostMapping
	public ResponseEntity<SolicitudServExterno> crear(@RequestBody SolicitudServExterno solicitud){
		SolicitudServExterno respuesta = null;
		bitacora.info(solicitud);
		try {
			respuesta = s.crear(solicitud);
			return new ResponseEntity<SolicitudServExterno>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<SolicitudServExterno> (HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody SolicitudServExterno solicitud){
		bitacora.info(solicitud);
		try {
			s.actualizar(solicitud);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void> (HttpStatus.OK);
	
	}

	@GetMapping("/{id}")
	public ResponseEntity<SolicitudServExterno> buscar(@PathVariable int id){
		SolicitudServExterno solicitud = null;
		try {
			solicitud = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<SolicitudServExterno> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<SolicitudServExterno> (solicitud, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<SolicitudServExterno>> consultar(){
		List<SolicitudServExterno> solicitud = s.consultar();
		if (solicitud == null)
			return new ResponseEntity<List<SolicitudServExterno>> (HttpStatus.CONFLICT);
		return new ResponseEntity<List<SolicitudServExterno>>(solicitud, HttpStatus.OK);
	}
}
