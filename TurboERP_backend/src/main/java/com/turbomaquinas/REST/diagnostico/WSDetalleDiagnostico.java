package com.turbomaquinas.REST.diagnostico;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.DAO.diagnostico.JDBCDetalleDiagnostico.Deptos;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnostico;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnostico.ListaDeptos;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnosticoVista;
import com.turbomaquinas.service.diagnostico.DetalleDiagnosticoService;

@RestController
@RequestMapping("/diagnostico/detallediagnostico")
public class WSDetalleDiagnostico {

	private static final Log bitacora = LogFactory.getLog(WSDetalleDiagnostico.class);
	
	@Autowired
	DetalleDiagnosticoService s;
	
	@PostMapping
	public ResponseEntity<DetalleDiagnosticoVista> crear(@RequestBody DetalleDiagnostico dd){
		
		DetalleDiagnosticoVista respuesta = null;
		bitacora.info(dd);
		try {
			respuesta = s.crear(dd);
			return new ResponseEntity<DetalleDiagnosticoVista>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DetalleDiagnosticoVista>(HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<DetalleDiagnosticoVista> actualizar(@RequestBody DetalleDiagnostico dd){
		DetalleDiagnosticoVista ddv = null;
		bitacora.info(dd);
		try {
			ddv = s.actualizar(dd);
			return new ResponseEntity<DetalleDiagnosticoVista>(ddv, HttpStatus.OK);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DetalleDiagnosticoVista>(HttpStatus.CONFLICT);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<DetalleDiagnosticoVista> buscar(@PathVariable int id){
		DetalleDiagnosticoVista ddv = null;
		try {
			ddv = s.buscar(id);
			return new ResponseEntity<DetalleDiagnosticoVista>(ddv, HttpStatus.OK);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DetalleDiagnosticoVista>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping
	public ResponseEntity<List<DetalleDiagnosticoVista>> consultar(){
		List<DetalleDiagnosticoVista> ddl = s.consultar();
		if (ddl == null)
			return new ResponseEntity<List<DetalleDiagnosticoVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<DetalleDiagnosticoVista>>(ddl, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/cantidad")
	public ResponseEntity<Integer> contarSubindices(@PathVariable int id){
		int cantidad = 0;
		try {
			cantidad = s.consultarCantidadSubindices(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Integer> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Integer> (cantidad, HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Void> borrar(@RequestBody DetalleDiagnostico dd){
		boolean borrado = false;
		try{
			borrado = s.borrar(dd);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		if(borrado){
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else return new ResponseEntity<Void>(HttpStatus.CONFLICT);		
	}
	
	@GetMapping("/detalles")
	public ResponseEntity<List<DetalleDiagnosticoVista>> consultarDetallePorIds(@RequestParam List<Integer> ids){
		List<DetalleDiagnosticoVista> detallediag = null;
		try {
			detallediag = s.consultarPorListaId(ids);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<DetalleDiagnosticoVista>> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<List<DetalleDiagnosticoVista>> (detallediag, HttpStatus.OK);
	}
	
	@GetMapping("/autorizados/detalleCotizacion/{id}")
	public ResponseEntity<List<DetalleDiagnosticoVista>> AutorizadosPorDetalleCotiza(@PathVariable int id){
		List<DetalleDiagnosticoVista> ddl = s.consultarAutorizadosPorDetalleCO(id);
		if (ddl == null)
			return new ResponseEntity<List<DetalleDiagnosticoVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<DetalleDiagnosticoVista>>(ddl, HttpStatus.OK);
	}
	
	@GetMapping("/autorizados/diagnostico/{id}")
	public ResponseEntity<List<DetalleDiagnosticoVista>> AutorizadosPorDetalleDiagnostico(@PathVariable int id){
		List<DetalleDiagnosticoVista> ddl = s.consultarAutorizadosPorDetalleDI(id);
		if (ddl == null)
			return new ResponseEntity<List<DetalleDiagnosticoVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<DetalleDiagnosticoVista>>(ddl, HttpStatus.OK);
	}
		
	@PutMapping("/{id}/departamentos")
	public ResponseEntity<Void> asignarDeptos(@PathVariable int id, @RequestBody ListaDeptos lista){
		bitacora.info(lista);
		try {
			   s.asignarDeptos(id, lista);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@GetMapping("/{id}/departamentos")
	public ResponseEntity<List<Deptos>> consultarDeptos(@PathVariable int id){
		List<Deptos> deptos = null;
		try {
		    deptos = s.consultarDeptos(id);
			return new ResponseEntity<List<Deptos>>(deptos, HttpStatus.OK);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<Deptos>>(HttpStatus.NOT_FOUND);
		}
	}

}
