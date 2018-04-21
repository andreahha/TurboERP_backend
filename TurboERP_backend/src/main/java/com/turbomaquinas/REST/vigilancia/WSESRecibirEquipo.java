package com.turbomaquinas.REST.vigilancia;

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

import com.turbomaquinas.POJO.vigilancia.ESRecibirEquipo;
import com.turbomaquinas.POJO.vigilancia.ESRecibirEquipoVista;
import com.turbomaquinas.service.vigilancia.ESRecibirEquipoService;

@RestController
@RequestMapping("/vigilancia/esrecibirequipo")

public class WSESRecibirEquipo {
	
	private static final Log bitacora = LogFactory.getLog(WSESRecibirEquipo.class);
	
	@Autowired
	ESRecibirEquipoService s;
	
	@PostMapping
	public ResponseEntity<ESRecibirEquipoVista> crear(@RequestBody ESRecibirEquipo esr){
		ESRecibirEquipoVista respuesta = null;
		bitacora.info(esr);
		try {
			respuesta = s.crear(esr);
			return new ResponseEntity<ESRecibirEquipoVista> (respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e);
			return new ResponseEntity<ESRecibirEquipoVista> (HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody ESRecibirEquipo esr){
		bitacora.info(esr);
		try {
			s.actualizar(esr);
		} catch (Exception e) {
			bitacora.error(e);
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void> (HttpStatus.OK);
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<ESRecibirEquipoVista> buscar(@PathVariable int id) {
		ESRecibirEquipoVista esrb = null;
		try {
			esrb = s.buscar(id);
		} catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<ESRecibirEquipoVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<ESRecibirEquipoVista> (esrb, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<ESRecibirEquipoVista>> consultar(){
		List<ESRecibirEquipoVista> esrl = s.consultar();
		if (esrl == null)
			return new ResponseEntity<List<ESRecibirEquipoVista>>(HttpStatus.CONFLICT);
		return new ResponseEntity<List<ESRecibirEquipoVista>>(esrl, HttpStatus.OK);
	}
	
	@GetMapping("/cliente/{id}")
	public ResponseEntity<List<ESRecibirEquipoVista>> PendientePorRecibir(@PathVariable int id){
		List<ESRecibirEquipoVista> respuesta = null;
		try {
			respuesta = s.PendientePorRecibir(id);
		} catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<ESRecibirEquipoVista>>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<List<ESRecibirEquipoVista>> (respuesta, HttpStatus.OK);
	}
	
	@GetMapping("/recibidos/orden/{id}")
	public ResponseEntity<List<ESRecibirEquipoVista>> RecibidosEnDiagnostico(@PathVariable int id){
		List<ESRecibirEquipoVista> respuesta = null;
		try {
			respuesta = s.recibidosPorOrden(id);
		} catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<ESRecibirEquipoVista>>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<List<ESRecibirEquipoVista>> (respuesta, HttpStatus.OK);
	}
	
	@GetMapping("/norecibidos/cliente/{id}")
	public ResponseEntity<List<ESRecibirEquipoVista>> NoRecibidosEnDiagnostico(@PathVariable int id){
		List<ESRecibirEquipoVista> respuesta = null;
		try {
			respuesta = s.noRecibidosPorCliente(id);
		} catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<ESRecibirEquipoVista>>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<List<ESRecibirEquipoVista>> (respuesta, HttpStatus.OK);
	}
	
	@GetMapping("/pendientesregularizar")
	public ResponseEntity<List<ESRecibirEquipoVista>> consultarSinRegularizar(){
		List<ESRecibirEquipoVista> esrl = s.PendienteRegularizar();
		if (esrl == null)
			return new ResponseEntity<List<ESRecibirEquipoVista>>(HttpStatus.CONFLICT);
		return new ResponseEntity<List<ESRecibirEquipoVista>>(esrl, HttpStatus.OK);
	}
}
