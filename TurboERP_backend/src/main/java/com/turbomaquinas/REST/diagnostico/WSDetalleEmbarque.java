package com.turbomaquinas.REST.diagnostico;

import java.util.List;

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

import com.turbomaquinas.POJO.diagnostico.DetalleRemisionEmbarqueVista;
import com.turbomaquinas.REST.comercial.WSPagos;
import com.turbomaquinas.service.diagnostico.DetalleEmbarqueService;

@RestController
@RequestMapping("/diagnostico/detalleembarque")
public class WSDetalleEmbarque {
	
	private static final Log bitacora = LogFactory.getLog(WSPagos.class);
	
	@Autowired
	DetalleEmbarqueService des;
	
	@GetMapping("/remisionembarque/{id}")
	public ResponseEntity<List<DetalleRemisionEmbarqueVista>> consultarDetallesPorRemision(@PathVariable int id) {
		List<DetalleRemisionEmbarqueVista> drev = null;
		try{
			drev = des.consultarDetallesPorRemision(id);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<DetalleRemisionEmbarqueVista>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DetalleRemisionEmbarqueVista>>(drev, HttpStatus.OK);
	}

}
