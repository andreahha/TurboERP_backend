package com.turbomaquinas.service.vigilancia;

import java.util.List;

import com.turbomaquinas.POJO.vigilancia.ESRecibirEquipo;
import com.turbomaquinas.POJO.vigilancia.ESRecibirEquipoVista;

public interface ESRecibirEquipoService {

	public ESRecibirEquipoVista buscar(int id);
	public List<ESRecibirEquipoVista> consultar();
	public ESRecibirEquipoVista crear(ESRecibirEquipo esr);
	public ESRecibirEquipo actualizar(ESRecibirEquipo esr);
	public List<ESRecibirEquipoVista> PendientePorRecibir(int id);
	public List<ESRecibirEquipoVista> recibidosPorOrden(int id);
	public List<ESRecibirEquipoVista> noRecibidosPorCliente(int id);
	public List<ESRecibirEquipoVista> PendienteRegularizar();
}
