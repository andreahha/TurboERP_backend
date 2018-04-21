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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turbomaquinas.POJO.comercial.ContactoVista;
import com.turbomaquinas.POJO.comercial.DTPrecotizacion;
import com.turbomaquinas.POJO.comercial.DetallePrecotizacionVista;
import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacionVista;
import com.turbomaquinas.POJO.comercial.Precotizacion;
import com.turbomaquinas.POJO.comercial.PrecotizacionVista;
import com.turbomaquinas.POJO.comercial.SubindicePrecotizacionVista;
import com.turbomaquinas.POJO.general.MarcaEquipo;
import com.turbomaquinas.POJO.general.ModeloEquipo;
import com.turbomaquinas.service.comercial.PrecotizacionService;

@RestController
@RequestMapping("comercial/precotizacion")

public class WSPrecotizacion {
	
	private static final Log bitacora = LogFactory.getLog(WSPrecotizacion.class);
	
	@Autowired
	PrecotizacionService s;
	
	@PostMapping
	public ResponseEntity<PrecotizacionVista> crear(@RequestBody Precotizacion pc){
		
		PrecotizacionVista respuesta = null;
		bitacora.info(pc);
		try {
			respuesta = s.crear(pc);
			return new ResponseEntity<PrecotizacionVista>(respuesta, HttpStatus.CREATED);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<PrecotizacionVista> (HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping
	public ResponseEntity<Void> actualizar(@RequestBody Precotizacion pc){
		bitacora.info(pc);
		try {
			s.actualizar(pc);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<Void> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void> (HttpStatus.OK);
		
	}

	@GetMapping("/{id}")
	public ResponseEntity<PrecotizacionVista> buscar(@PathVariable int id){
		PrecotizacionVista pv = null;
		try {
			pv = s.buscar(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<PrecotizacionVista> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<PrecotizacionVista> (pv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/dtprecotizacion")
	public ResponseEntity<DTPrecotizacion> consultarDatosTecnicos(@PathVariable int id){
		DTPrecotizacion dtp = null;
		try {
			dtp = s.buscarDatosTecnicos(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<DTPrecotizacion> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<DTPrecotizacion> (dtp, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/encabezados")
	public ResponseEntity<List<EncabezadoPrecotizacionVista>> consultarEncabezados(@PathVariable int id){
		List<EncabezadoPrecotizacionVista> epv = null;
		try {
			epv = s.consultarEncabezados(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<EncabezadoPrecotizacionVista>> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<List<EncabezadoPrecotizacionVista>> (epv, HttpStatus.OK);
	}

	@GetMapping("/{id}/detalles")
	public ResponseEntity<List<DetallePrecotizacionVista>> consultarDetalles(@PathVariable int id){
		List<DetallePrecotizacionVista> dpv = null;
		try {
			dpv = s.consultarDetalles(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<DetallePrecotizacionVista>> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<List<DetallePrecotizacionVista>> (dpv, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/subindices")
	public ResponseEntity<List<SubindicePrecotizacionVista>> consultarSubindices(@PathVariable int id){
		List<SubindicePrecotizacionVista> spv = null;
		try {
			spv = s.consultarSubindices(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<List<SubindicePrecotizacionVista>> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<List<SubindicePrecotizacionVista>> (spv, HttpStatus.OK);
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

	@GetMapping
	public ResponseEntity<List<PrecotizacionVista>> consultar(){
		List<PrecotizacionVista> precos = s.consultar();
		if (precos == null)
			return new ResponseEntity<List<PrecotizacionVista>> (HttpStatus.CONFLICT);
		return new ResponseEntity<List<PrecotizacionVista>>(precos, HttpStatus.OK);
	}

	@GetMapping("/{id}/modelo")
	public ResponseEntity<ModeloEquipo> buscarModeloPorPrecotizacion(@PathVariable int id){
		ModeloEquipo mep = null;
		try {
			mep = s.buscarModeloPorPrecotizacion(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<ModeloEquipo> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<ModeloEquipo> (mep, HttpStatus.OK);
	}

	@GetMapping("/{id}/marca")
	public ResponseEntity<MarcaEquipo> buscarMarcaPorPrecotizacion(@PathVariable int id){
		MarcaEquipo map = null;
		try {
			map = s.buscarMarcaPorPrecotizacion(id);
		} catch (Exception e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<MarcaEquipo> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<MarcaEquipo> (map, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/contacto")
	public ResponseEntity<ContactoVista> buscarContacto(@PathVariable int id){
		ContactoVista cv = null;
		try {
			cv = s.buscarContacto(id);
		} catch (DataAccessException e) {
			bitacora.error(e.getMessage());
			return new ResponseEntity<ContactoVista> (HttpStatus.CONFLICT);
		}
		return new ResponseEntity<ContactoVista> (cv, HttpStatus.OK);
	}
	
	@GetMapping("/años")
	public ResponseEntity<List<Integer>> aniosPrecot(){
		List<Integer> anios = s.aniosPrec();
		if (anios == null)
			return new ResponseEntity<List<Integer>> (HttpStatus.CONFLICT);
		return new ResponseEntity<List<Integer>>(anios, HttpStatus.OK);
	}
	
	@GetMapping("/filtradas/{anio}")
	public ResponseEntity<List<PrecotizacionVista>> PrecsAnio(@PathVariable int anio){
		List<PrecotizacionVista> pv = s.precAnio(anio);
		if (pv == null)
			return new ResponseEntity<List<PrecotizacionVista>> (HttpStatus.CONFLICT);
		return new ResponseEntity<List<PrecotizacionVista>>(pv, HttpStatus.OK);
	}
	
	@GetMapping("/numero")
	public ResponseEntity<PrecotizacionVista> buscarPrecotizacion(@RequestParam String numeroPrecotizacion){
		PrecotizacionVista pv = null;
		try{
			pv = s.buscarPrecotizacion(numeroPrecotizacion);
		}catch(DataAccessException e){
			bitacora.error(e.getMessage());
			return new ResponseEntity<PrecotizacionVista>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<PrecotizacionVista>(pv, HttpStatus.OK);
	}
}
