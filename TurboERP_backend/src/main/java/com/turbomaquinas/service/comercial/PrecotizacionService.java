package com.turbomaquinas.service.comercial;

import java.util.List;

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

public interface PrecotizacionService {
	
	public PrecotizacionVista buscar(int id);
	public List<PrecotizacionVista> consultar();
	public PrecotizacionVista crear(Precotizacion pc);
	public Precotizacion actualizar(Precotizacion pc);
	public DTPrecotizacion buscarDatosTecnicos(int id);
	public List<EncabezadoPrecotizacionVista> consultarEncabezados(int id);
	public List<DetallePrecotizacionVista> consultarDetalles(int id);
	public List<SubindicePrecotizacionVista> consultarSubindices(int id);
	public int consultarCantidadEncabezados(int id);
	public ContactoVista buscarContacto(int id);
	public ModeloEquipo buscarModeloPorPrecotizacion(int id);
	public MarcaEquipo buscarMarcaPorPrecotizacion(int id);
	public List<Integer> aniosPrec();
	public List<PrecotizacionVista> precAnio(int anio);
	public PrecotizacionVista buscarPrecotizacion(String numeroPrecotizacion);
	public List<DiasPrecotizacion> buscarDiasPorPrecotizacion(int id);	
}
