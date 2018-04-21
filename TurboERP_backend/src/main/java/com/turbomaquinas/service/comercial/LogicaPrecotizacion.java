package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.ContactoDAO;
import com.turbomaquinas.DAO.comercial.DTPrecotizacionDAO;
import com.turbomaquinas.DAO.comercial.DetallePrecotizacionDAO;
import com.turbomaquinas.DAO.comercial.EncabezadoPrecotizacionDAO;
import com.turbomaquinas.DAO.comercial.PrecotizacionDAO;
import com.turbomaquinas.DAO.comercial.SubindicePrecotizacionDAO;
import com.turbomaquinas.DAO.general.DiasPrecotizacionDAO;
import com.turbomaquinas.POJO.comercial.ContactoVista;
import com.turbomaquinas.POJO.comercial.DTPrecotizacion;
import com.turbomaquinas.POJO.comercial.DetallePrecotizacionVista;
import com.turbomaquinas.POJO.comercial.EncabezadoPrecotizacionVista;
import com.turbomaquinas.POJO.comercial.Precotizacion;
import com.turbomaquinas.POJO.comercial.PrecotizacionVista;
import com.turbomaquinas.POJO.comercial.SubindicePrecotizacionVista;
import com.turbomaquinas.POJO.general.DiasPrecotizacion;
import com.turbomaquinas.POJO.general.MarcaEquipo;
import com.turbomaquinas.POJO.general.ModeloEquipo;

@Service
public class LogicaPrecotizacion implements PrecotizacionService{
	
	@Autowired
	PrecotizacionDAO repPrecotiza;
	@Autowired
	DTPrecotizacionDAO repoDT;
	@Autowired
	EncabezadoPrecotizacionDAO repoEncabezados;
	@Autowired
	DetallePrecotizacionDAO repoDetalles;
	@Autowired
	SubindicePrecotizacionDAO repoSubindices;
	@Autowired
	ContactoDAO repoContacto;
	@Autowired
	DiasPrecotizacionDAO repoDiasPrecotiza;
	
	@Override
	public PrecotizacionVista buscar(int id) throws DataAccessException {
		return repPrecotiza.buscar(id);
	}

	@Override
	public List<PrecotizacionVista> consultar() throws DataAccessException {
		return repPrecotiza.consultar();
	}

	@Override
	public PrecotizacionVista crear(Precotizacion pc) throws DataAccessException {
		int id = repPrecotiza.crear(pc);
		return repPrecotiza.buscar(id);
	}

	@Override
	public Precotizacion actualizar(Precotizacion pc) throws DataAccessException {
		return repPrecotiza.actualizar(pc);
	}

	@Override
	public DTPrecotizacion buscarDatosTecnicos(int id) throws DataAccessException {
		return repoDT.buscarPorPrecotizacion(id);
	}

	@Override
	public List<EncabezadoPrecotizacionVista> consultarEncabezados(int id) {
		return repoEncabezados.consultarPorPrecotizacion(id);
	}

	@Override
	public List<DetallePrecotizacionVista> consultarDetalles(int id) {
		return repoDetalles.consultarPorPrecotizacion(id);
	}

	@Override
	public List<SubindicePrecotizacionVista> consultarSubindices(int id) {
		return repoSubindices.consultarPorPrecotizacion(id);
	}

	@Override
	public int consultarCantidadEncabezados(int id) {
		return repoEncabezados.consultarCantidadporPrecotizacion(id);
	}

	@Override
	public ModeloEquipo buscarModeloPorPrecotizacion(int id) {
		return repPrecotiza.buscarModeloPorPrecotizacion(id);
	}

	@Override
	public MarcaEquipo buscarMarcaPorPrecotizacion(int id) {
		return repPrecotiza.buscarMarcaPorPrecotizacion(id);
	}

	@Override
	public ContactoVista buscarContacto(int id) {
		return repoContacto.buscarPorPrecotizacion(id);
	}

	@Override
	public List<Integer> aniosPrec() throws DataAccessException{
		return repPrecotiza.aniosPrec();
	}

	@Override
	public List<PrecotizacionVista> precAnio(int anio) throws DataAccessException{
		return repPrecotiza.precAnio(anio);
	}

	@Override
	public PrecotizacionVista buscarPrecotizacion(String numeroPrecotizacion) throws DataAccessException{
		return repPrecotiza.buscarPrecotizacion(numeroPrecotizacion);
	}

	@Override
	public List<DiasPrecotizacion> buscarDiasPorPrecotizacion(int id) {
		return repoDiasPrecotiza.buscarDiasPorPrecotizacion(id);
	}

}
