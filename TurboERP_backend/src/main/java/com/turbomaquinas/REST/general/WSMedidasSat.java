package com.turbomaquinas.REST.general;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.general.MedidasSat;
import com.turbomaquinas.service.general.MedidasSatService;

@RestController
@RequestMapping("/general/medidassat")
public class WSMedidasSat {
	
	private static final Log bitacora = LogFactory.getLog(WSMedidasSat.class);
	
	@Autowired
	MedidasSatService mss;
	
	@GetMapping("/{clave}")
	public ResponseEntity<MedidasSat> buscar(@PathVariable String clave){
		MedidasSat ms = null;
		try {
			ms = mss.buscar(clave);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<MedidasSat>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<MedidasSat>(ms, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<MedidasSat>> consultar() {
		
		List<MedidasSat> lms = mss.consultar();
		if (lms == null)
			return new ResponseEntity<List<MedidasSat>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<MedidasSat>>(lms, HttpStatus.OK);
	}

}
