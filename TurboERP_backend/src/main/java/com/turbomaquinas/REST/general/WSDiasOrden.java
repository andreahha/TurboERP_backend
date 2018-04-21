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

import com.turbomaquinas.POJO.general.DiasOrden;
import com.turbomaquinas.POJO.general.DiasOrdenVista;
import com.turbomaquinas.service.general.DiasOrdenService;

@RestController
@RequestMapping("/general/diasorden")
public class WSDiasOrden {
	
	private static final Log bitacora = LogFactory.getLog(WSDiasOrden.class);

	@Autowired
	DiasOrdenService s;
	
	@PostMapping()
	public ResponseEntity<DiasOrdenVista> crear(@RequestBody DiasOrden diasOrden){
		DiasOrdenVista respuesta = null;
		bitacora.info(diasOrden);
		try{
			 respuesta = s.crear(diasOrden);	
			return new ResponseEntity<DiasOrdenVista>(respuesta, HttpStatus.CREATED);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<DiasOrdenVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping()
	public ResponseEntity<Void> actualizar(@RequestBody DiasOrden diasOrden){
		bitacora.info(diasOrden);
		try{
			s.actualizar(diasOrden);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}	
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DiasOrdenVista> buscar(@PathVariable("id") int id){
		DiasOrdenVista d = null;
		try{
			d = s.buscar(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<DiasOrdenVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<DiasOrdenVista>(d, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<DiasOrdenVista>> consultar(){
		List<DiasOrdenVista> d = null;
		try{
			d = s.consultar();
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<DiasOrdenVista>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<DiasOrdenVista>>(d, HttpStatus.OK);
	}

	@GetMapping("/orden/{id}")
	public ResponseEntity<List<DiasOrdenVista>> buscarDiasPorOrden(@PathVariable int id){
		List<DiasOrdenVista> diaso = s.buscarDiasPorOrden(id);
		if (diaso == null)
			return new ResponseEntity<List<DiasOrdenVista>> (HttpStatus.CONFLICT);
		return new ResponseEntity<List<DiasOrdenVista>>(diaso, HttpStatus.OK);
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
}
