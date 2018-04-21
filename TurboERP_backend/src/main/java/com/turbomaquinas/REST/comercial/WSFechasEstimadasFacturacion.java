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

import com.turbomaquinas.DAO.comercial.JDBCFechasEstimadasFacturacion.DatosFechas;
import com.turbomaquinas.POJO.comercial.FechasEstimadasFacturacion;
import com.turbomaquinas.service.comercial.FechasEstimadasFacturacionService;

@RestController
@RequestMapping("/comercial/fechasestimadasfacturacion")
public class WSFechasEstimadasFacturacion {
	
	private static final Log bitacora = LogFactory.getLog(WSFechasEstimadasFacturacion.class);
	
	@Autowired
	FechasEstimadasFacturacionService fefs;
	
	@PostMapping()
	public ResponseEntity<Void> crear(@RequestBody FechasEstimadasFacturacion fef){
		bitacora.info(fef);
		try{
			fefs.crear(fef);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@GetMapping("/orden/{id}")
	public ResponseEntity<List<DatosFechas>> consultarPorOrden(@PathVariable int id){
		List<DatosFechas> fef = null;
		try {
			fef = fefs.consultarPorOrden(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<DatosFechas>> (HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DatosFechas>> (fef, HttpStatus.OK);
	}
	


}
