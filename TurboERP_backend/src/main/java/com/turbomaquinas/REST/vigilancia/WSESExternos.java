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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.vigilancia.ESExternos;
import com.turbomaquinas.POJO.vigilancia.ESExternosVista;
import com.turbomaquinas.service.vigilancia.ESExternosService;

@RestController
@RequestMapping("/vigilancia/esexternos")

public class WSESExternos {
	
	private static final Log bitacora = LogFactory.getLog(WSESExternos.class);
	
	@Autowired
	ESExternosService s;
	
	@PostMapping
	public ResponseEntity<ESExternosVista> crear(@RequestBody ESExternos ese){
		ESExternosVista respuesta = null;
		bitacora.info(ese);
		try {
			respuesta = s.crear(ese);
			return new ResponseEntity<ESExternosVista>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e);
			return new ResponseEntity<ESExternosVista>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody ESExternos ese){
		bitacora.info(ese);
		try {
			s.actualizar(ese);
		} catch (Exception e) {
			bitacora.error(e);
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ESExternosVista> buscar(@PathVariable int id){
		ESExternosVista eseb = null;
		try {
			eseb = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e);
			return new ResponseEntity<ESExternosVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<ESExternosVista>(eseb, HttpStatus.OK);
	}
	
	@GetMapping()
	public ResponseEntity<List<ESExternosVista>> consultar() {
		List<ESExternosVista> esel = s.consultar();
		if (esel == null)
			return new ResponseEntity<List<ESExternosVista>>(HttpStatus.CONFLICT);
		return new ResponseEntity<List<ESExternosVista>>(esel, HttpStatus.OK);
	}
	
	@GetMapping("/fechaentrada")
	public ResponseEntity<List<ESExternosVista>> consultarPorFecha(@RequestParam String fecha_entrada) {
		List<ESExternosVista> e = s.consultarPorFecha(fecha_entrada);
		if (e == null)
			return new ResponseEntity<List<ESExternosVista>>(HttpStatus.CONFLICT);
		return new ResponseEntity<List<ESExternosVista>>(e, HttpStatus.OK);
	}
	
	@PutMapping("/{id}/salida")
	public ResponseEntity<Void> actualizarSalida(@PathVariable int id){
		bitacora.info(id);
		try{
			s.actualizarSalida(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
