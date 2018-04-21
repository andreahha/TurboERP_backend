package com.turbomaquinas.REST.comercial;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.general.Personal;
import com.turbomaquinas.service.comercial.ATCService;

@RestController
@RequestMapping("comercial/personal")
public class WSATC {

	private static final Log bitacora = LogFactory.getLog(WSATC.class);

	@Autowired
	ATCService s; 
	
	@GetMapping()
	public ResponseEntity<List<Personal>> consultarATC() {
		List<Personal> atcs = null;
		try {
			atcs = s.consultarATC();
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<Personal>>(HttpStatus.NO_CONTENT);
		}	
		return new ResponseEntity<List<Personal>>(atcs, HttpStatus.OK);	
	}
}
