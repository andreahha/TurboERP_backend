package com.turbomaquinas.REST.general;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.general.DiasPrecotizacion;
import com.turbomaquinas.service.general.DiasPrecotizacionService;

@RestController
@RequestMapping("/general/dprecotizacion")
public class WSDiasPrecotizacion {

	private static final Log bitacora = LogFactory.getLog(WSDiasPrecotizacion.class);
	
	@Autowired
	DiasPrecotizacionService s;
	
	@PostMapping
	public ResponseEntity<DiasPrecotizacion> crear(@RequestBody DiasPrecotizacion dp){
		DiasPrecotizacion respuesta = null;
		bitacora.info(dp);
		try {
			respuesta = s.crear(dp);
			return new ResponseEntity<DiasPrecotizacion>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DiasPrecotizacion>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping
	public ResponseEntity<Void> actualiza(@RequestBody DiasPrecotizacion dp) {
		bitacora.info(dp);
		try {
			s.actualizar(dp);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DiasPrecotizacion> buscar(@PathVariable int id) {
		DiasPrecotizacion dp = null;
		try {
			dp = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DiasPrecotizacion>(HttpStatus.NOT_FOUND);	
		}
		return new ResponseEntity<DiasPrecotizacion>(dp, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<DiasPrecotizacion>> consultar(){
		List<DiasPrecotizacion> dprec = null;
		dprec = s.consultar();
		if (dprec == null)
			return new ResponseEntity<List<DiasPrecotizacion>>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<DiasPrecotizacion>>(dprec, HttpStatus.OK);
	}
	
	@GetMapping("{id}/dias")
	public ResponseEntity<Integer> sumarDias(@PathVariable int id){
		int cantidad = 0;
			try{
				cantidad = s.sumarDias(id);
			}catch (DataAccessException e) {
				bitacora.error(e.getMessage());
				return new ResponseEntity<Integer>(HttpStatus.CONFLICT);
			}
		return new ResponseEntity<Integer>(cantidad, HttpStatus.OK);
	}

	@GetMapping("/precotizacion/{id}")
	public ResponseEntity<List<DiasPrecotizacion>> buscarDiasPorPrecotizacion(@PathVariable int id){
		List<DiasPrecotizacion> diasp = s.buscarDiasPorPrecotizacion(id);
		if (diasp == null)
			return new ResponseEntity<List<DiasPrecotizacion>> (HttpStatus.CONFLICT);
		return new ResponseEntity<List<DiasPrecotizacion>>(diasp, HttpStatus.OK);
	}
}
