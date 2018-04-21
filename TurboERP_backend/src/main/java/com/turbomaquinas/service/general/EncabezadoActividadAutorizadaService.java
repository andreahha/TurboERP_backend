package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.EncabezadoActividadAutorizada;
import com.turbomaquinas.POJO.general.EncabezadoActividadAutorizadaVista;

public interface EncabezadoActividadAutorizadaService {
	public EncabezadoActividadAutorizadaVista crear(EncabezadoActividadAutorizada e);
	public void actualizar(EncabezadoActividadAutorizada e);
	public EncabezadoActividadAutorizadaVista buscar(int id);
	public List<EncabezadoActividadAutorizadaVista> consultar();
}
