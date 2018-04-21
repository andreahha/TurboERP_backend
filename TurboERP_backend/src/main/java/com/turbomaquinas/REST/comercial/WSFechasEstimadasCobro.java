package com.turbomaquinas.REST.comercial;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.FechasEstimadasCobro;
import com.turbomaquinas.service.comercial.FechasEstimadasCobroService;

@RestController
@RequestMapping("/comercial/fechasestimadascobro")
public class WSFechasEstimadasCobro {
	
	private static final Log bitacora = LogFactory.getLog(WSFechasEstimadasCobro.class);
	
	@Autowired
	FechasEstimadasCobroService fecs;
	
	@PostMapping()
	public ResponseEntity<Void> crear(@RequestBody FechasEstimadasCobro fec){
		bitacora.info(fec);
		try{
			fecs.crear(fec);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	
	@GetMapping("/facturafinal/{id}")
	public ResponseEntity<List<FechasEstimadasCobro>> consultarPorFactura(@PathVariable ("id") int id){
		List<FechasEstimadasCobro> fec = null;
		try{
			fec = fecs.consultarPorFactura(id);
		}catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<FechasEstimadasCobro>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<FechasEstimadasCobro>>(fec, HttpStatus.OK);
	}
	

}
