package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.Precotizacion;
import com.turbomaquinas.POJO.comercial.PrecotizacionVista;
import com.turbomaquinas.POJO.general.MarcaEquipo;
import com.turbomaquinas.POJO.general.ModeloEquipo;

public interface PrecotizacionDAO {
	
	public int crear(Precotizacion pc);
	public Precotizacion actualizar(Precotizacion pc);
	public PrecotizacionVista buscar(int id);
	public List<PrecotizacionVista> consultar();
	public ModeloEquipo buscarModeloPorPrecotizacion(int id);
	public MarcaEquipo buscarMarcaPorPrecotizacion(int id);
	public List<Integer> aniosPrec();
	public List<PrecotizacionVista> precAnio(int anio);
	public PrecotizacionVista buscarPrecotizacion(String numeroPrecotizacion);
}
