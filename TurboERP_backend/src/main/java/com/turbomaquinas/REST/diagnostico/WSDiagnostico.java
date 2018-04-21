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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.DAO.diagnostico.JDBCDiagnostico.ActividadProduccion;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnosticoVista;
import com.turbomaquinas.POJO.diagnostico.Diagnostico;
import com.turbomaquinas.POJO.diagnostico.DiagnosticoVista;
import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnosticoVista;
import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnosticoVista;
import com.turbomaquinas.service.diagnostico.DiagnosticoService;

@RestController
@RequestMapping("/diagnostico")

public class WSDiagnostico {
	
	private static final Log bitacora = LogFactory.getLog(WSDiagnostico.class);

	@Autowired
	DiagnosticoService s;
	
	@PostMapping
	public ResponseEntity<DiagnosticoVista> crear(@RequestBody Diagnostico d){
		
		DiagnosticoVista respuesta = null;
		bitacora.info(d);
		try {
			respuesta = s.crear(d);
			return new ResponseEntity<DiagnosticoVista>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DiagnosticoVista>(HttpStatus.CONFLICT);
		}
	}

	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody Diagnostico d){
		bitacora.info(d);
		try {
			s.actualizar(d);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void> (HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DiagnosticoVista> buscar(@PathVariable int id){
		
		DiagnosticoVista dv = null;
		try {
			dv = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new  ResponseEntity<DiagnosticoVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<DiagnosticoVista>(dv, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<DiagnosticoVista>> consultar(){
		
		List<DiagnosticoVista> dil = s.consultar();
		if (dil == null)
			return new ResponseEntity<List<DiagnosticoVista>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<DiagnosticoVista>>(dil, HttpStatus.OK);
		
	}
//
	@GetMapping("/{id}/encabezados")
	public ResponseEntity<List<EncabezadoDiagnosticoVista>> consultarEncabezados(@PathVariable int id){
		List<EncabezadoDiagnosticoVista> edv = null;
		try {
			edv = s.consultarEncabezados(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<EncabezadoDiagnosticoVista>> (HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EncabezadoDiagnosticoVista>> (edv, HttpStatus.OK);
	}

	@GetMapping("/{id}/detalles")
	public ResponseEntity<List<DetalleDiagnosticoVista>> consultarDetalles(@PathVariable int id){
		List<DetalleDiagnosticoVista> ddv = null;
		try {
			ddv = s.consultarDetalles(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<DetalleDiagnosticoVista>> (HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DetalleDiagnosticoVista>> (ddv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/subindices")
	public ResponseEntity<List<SubindiceDiagnosticoVista>> consultarSubindices(@PathVariable int id){
		List<SubindiceDiagnosticoVista> sdv = null;
		try {
			sdv = s.consultarSubindices(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SubindiceDiagnosticoVista>> (HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<SubindiceDiagnosticoVista>> (sdv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/cantidad")
	public ResponseEntity<Integer> contarEncabezados(@PathVariable int id){
		int cantidad = 0;
		try {
			cantidad = s.consultarCantidadEncabezados(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Integer> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Integer> (cantidad, HttpStatus.OK);
	}

	@GetMapping("/busqueda")
	public ResponseEntity<DiagnosticoVista> buscarPorOrden(@RequestParam String numeroOrden){
		DiagnosticoVista dv = null;
		try{
			dv = s.buscarDiagnostico(numeroOrden);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<DiagnosticoVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<DiagnosticoVista>(dv, HttpStatus.OK);
	}

	@GetMapping("/años")
	public ResponseEntity<List<Integer>> aniosRecomendaciones(){
		List<Integer> anios = s.aniosRecomendaciones();
		if (anios == null)
			return new ResponseEntity<List<Integer>> (HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<Integer>>(anios, HttpStatus.OK);
	}
	
	@GetMapping("/filtradas/{anio}")
	public ResponseEntity<List<DiagnosticoVista>> recomendacionesAnio(@PathVariable int anio){
		List<DiagnosticoVista> d = s.recomendacionesAnio(anio);
		if (d == null)
			return new ResponseEntity<List<DiagnosticoVista>> (HttpStatus.NOT_FOUND);
		return new ResponseEntity<List<DiagnosticoVista>>(d, HttpStatus.OK);
	}

	@GetMapping("/sinautorizar/orden/{id}")
	public ResponseEntity<List<DiagnosticoVista>> buscarDiagnosticoPorOrdenSinAutorizar(@PathVariable int id){
		List<DiagnosticoVista> ldv = null;
		try{
			ldv = s.buscarDiagnosticoPorOrdenSinAutorizar(id);
		}catch (DataAccessException e) {
				bitacora.error(e.getMessage());
				return new ResponseEntity<List<DiagnosticoVista>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<DiagnosticoVista>>(ldv, HttpStatus.OK);	
	}
	
	@GetMapping("/orden/{id}")
	public ResponseEntity<List<DiagnosticoVista>> buscarPorOrden(@PathVariable int id){
		List<DiagnosticoVista> ldvo = null;
		try{
			ldvo = s.buscarPorOrden(id);
		}catch (DataAccessException e) {
				bitacora.error(e.getMessage());
				return new ResponseEntity<List<DiagnosticoVista>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<DiagnosticoVista>>(ldvo, HttpStatus.OK);	
	}
	
	@GetMapping("/{id}/actividadespendientesautorizar")
	public ResponseEntity<List<DetalleDiagnosticoVista>> consultarActividadesPendientesAutorizar(@PathVariable int id){
		
		List<DetalleDiagnosticoVista> ddpa = null;
		try{
			ddpa = s.consultarActividadesPendientesAutorizar(id);
		}catch (DataAccessException e) {
				bitacora.error(e.getMessage());
				return new ResponseEntity<List<DetalleDiagnosticoVista>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<DetalleDiagnosticoVista>>(ddpa, HttpStatus.OK);	
	}
	
	@GetMapping("/{id}/actividadesproduccion")
	public ResponseEntity<List<ActividadProduccion>> consultarActividadesProduccion(@PathVariable int id){
		
		List<ActividadProduccion> actividades = null;
		try{
			actividades = s.consultarActividadesProduccion(id);
		}catch (DataAccessException e) {
				bitacora.error(e.getMessage());
				return new ResponseEntity<List<ActividadProduccion>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<ActividadProduccion>>(actividades, HttpStatus.OK);	
	}
}
