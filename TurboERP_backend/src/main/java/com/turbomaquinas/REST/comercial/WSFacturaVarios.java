package com.turbomaquinas.REST.comercial;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.DocumentoFacturaVarios;
import com.turbomaquinas.POJO.comercial.FacturaVarios;
import com.turbomaquinas.service.comercial.DocFacturaVariosService;
import com.turbomaquinas.service.comercial.FacturaVariosService;

@RestController
@RequestMapping("/comercial/facturavarios")
public class WSFacturaVarios {

	private static final Log bitacora = LogFactory.getLog(WSFacturaVarios.class);
	
	@Autowired
	FacturaVariosService s;
	@Autowired
	DocFacturaVariosService ds;
	
	@PostMapping
	public ResponseEntity<DocumentoFacturaVarios> crear(@RequestBody DocumentoFacturaVarios documento){
		
		DocumentoFacturaVarios respuesta = null;
		bitacora.info(documento);
		try {
			respuesta = ds.crear(documento);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DocumentoFacturaVarios>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<DocumentoFacturaVarios>(respuesta, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody FacturaVarios fv){

		bitacora.info(fv);
		try {
			s.actualizar(fv);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<FacturaVarios> buscar(@PathVariable int id){
		
		FacturaVarios fvb = null;
		try {
			fvb = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<FacturaVarios>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<FacturaVarios>(fvb, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<FacturaVarios>> consultar(){
		
		List<FacturaVarios> fvl = s.consultar();
		if (fvl == null)
			return new ResponseEntity<List<FacturaVarios>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<FacturaVarios>>(fvl,HttpStatus.OK);
	}

	@DeleteMapping()
	public ResponseEntity<Void> cancelar(@RequestBody FacturaVarios fv){
		try{
			s.cancelar(fv);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
			return new ResponseEntity<Void>(HttpStatus.OK);		
	}
	
}
