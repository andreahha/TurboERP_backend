package com.turbomaquinas.REST.inventarios;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.inventarios.TransitorioVista;
import com.turbomaquinas.service.inventarios.TransitorioService;

@RestController
@RequestMapping("/inventarios/transitorios")
public class WSTransitorio {
	
	private static final Log bitacora = LogFactory.getLog(WSTransitorio.class);
	
	@Autowired
	TransitorioService ts;
	

	@GetMapping("/almacen/{id}")
	public ResponseEntity<List<TransitorioVista>> consultarArticulosTransitorios(@PathVariable ("id") int id){
		List<TransitorioVista> ca = null;
		try{
			ca = ts.consultarArticulosTransitorios(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<TransitorioVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<TransitorioVista>>(ca, HttpStatus.OK);
	}
	
	@PutMapping("/{id}/existencia")
	public ResponseEntity<Void> actualizarExistenciaFisica(@PathVariable int id,@RequestParam int almacen_id,@RequestParam float cantidad){
		try{
			ts.actualizarExistenciaFisica(id, almacen_id, cantidad);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TransitorioVista> buscar(@PathVariable int id){
		TransitorioVista articulo = null;
		try {
			articulo = ts.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<TransitorioVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<TransitorioVista>(articulo, HttpStatus.OK);
	}
	
	@PutMapping("/{id}/ubicacion")
	public ResponseEntity<Void> actualizarUbicacion(@PathVariable int id,@RequestParam int almacen_id,@RequestParam String ubicaciones[]){
		try{
			ts.actualizarUbicacion(id, almacen_id, ubicaciones);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	

}
