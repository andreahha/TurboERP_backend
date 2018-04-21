package com.turbomaquinas.REST.general;

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

import com.turbomaquinas.POJO.general.OrdenesRequisiciones;
import com.turbomaquinas.service.general.OrdenesRequisicionesService;

@RestController
@RequestMapping("/general/ordenesrequisiciones")
public class WSOrdenesRequisiciones {
	
	private static final Log bitacora = LogFactory.getLog(WSOrdenesRequisiciones.class);
	
	@Autowired
	OrdenesRequisicionesService os;
	
	@GetMapping()
	public ResponseEntity<List<OrdenesRequisiciones>> consultar(){
		List<OrdenesRequisiciones> ov = null;
		try{
			ov = os.consultar();
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<OrdenesRequisiciones>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<OrdenesRequisiciones>>(ov, HttpStatus.OK);
	}

}
