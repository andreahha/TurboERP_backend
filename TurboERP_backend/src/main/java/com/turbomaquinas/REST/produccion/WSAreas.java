package com.turbomaquinas.REST.produccion;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.produccion.Area;
import com.turbomaquinas.POJO.produccion.AreasVista;
import com.turbomaquinas.REST.comercial.WSCliente;
import com.turbomaquinas.service.produccion.AreasService;

@RestController
@RequestMapping("/produccion/areas")
public class WSAreas {
	
	private static final Log bitacora = LogFactory.getLog(WSCliente.class);

	@Autowired
	AreasService s;
	
	@PutMapping
	public ResponseEntity<AreasVista> actualizar(@RequestBody Area area) {
		AreasVista respuesta = null;
		bitacora.info(area);
		try{
			respuesta = s.actualizar(area);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<AreasVista>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<AreasVista>(respuesta, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AreasVista> buscar(@PathVariable int id){
		AreasVista av = null;
		try {
			av =  s.buscar(id);
		} catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<AreasVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<AreasVista>(av, HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<AreasVista>> consultar() {
		List<AreasVista> areas = s.consultar();
		if (areas == null)
			return new ResponseEntity<List<AreasVista>>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<AreasVista>>(areas, HttpStatus.OK);
	}
	
	@GetMapping("/libres")
	public ResponseEntity<List<AreasVista>> consultarAreasLibres() {
		List<AreasVista> areasl = s.consultarAreasLibres();
		if (areasl == null)
			return new ResponseEntity<List<AreasVista>>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<AreasVista>>(areasl, HttpStatus.OK);
	}

}
