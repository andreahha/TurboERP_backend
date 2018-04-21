package com.turbomaquinas.REST.produccion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.service.produccion.ActividadesService;

@RestController
@RequestMapping("/produccion/actividades")
public class WSActividadesProduccion {
	
	private static final Log bitacora = LogFactory.getLog(WSActividadesProduccion.class);

	@Autowired
	ActividadesService s;
	
	@GetMapping("/{id}/departamentos/vacio")
	public ResponseEntity<Boolean> deptosVacio(@PathVariable int id){
		Boolean vacio = null;
		try {
			vacio =  s.deptosVacio(id);
		} catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Boolean>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Boolean>(vacio, HttpStatus.OK);
	}

}
