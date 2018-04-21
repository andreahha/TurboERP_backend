package com.turbomaquinas.REST.comercial;

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

import com.turbomaquinas.POJO.comercial.PagosDetalle;
import com.turbomaquinas.POJO.comercial.PagosDetalleVista;
import com.turbomaquinas.service.comercial.PagosDetalleService;

@RestController
@RequestMapping("/comercial/pagosdetalle")
public class WSPagosDetalle {

	private static final Log bitacora = LogFactory.getLog(WSPagosDetalle.class);
	
	@Autowired
	PagosDetalleService s;
	
	@PostMapping
	public ResponseEntity<PagosDetalleVista> crear(@RequestBody PagosDetalle pd){
		
		bitacora.info(pd);
		PagosDetalleVista respuesta = null;
		try {
			respuesta = s.crear(pd);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<PagosDetalleVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<PagosDetalleVista>(respuesta, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody PagosDetalle pd){
		bitacora.info(pd);
		try {
			s.actualizar(pd);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			// TODO: handle exception
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<PagosDetalleVista> buscar(@PathVariable int id){

		PagosDetalleVista pdb = null;
		try {
			pdb = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<PagosDetalleVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<PagosDetalleVista>(pdb, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<PagosDetalleVista>> consultar(){
		
		List<PagosDetalleVista> pdl = s.consultar();
		if (pdl == null)
			return new ResponseEntity<List<PagosDetalleVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<PagosDetalleVista>>(pdl, HttpStatus.OK);
	}

}
