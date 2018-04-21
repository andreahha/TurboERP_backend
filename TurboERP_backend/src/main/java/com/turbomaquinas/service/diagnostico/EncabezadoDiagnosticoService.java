package com.turbomaquinas.service.diagnostico;

import java.util.List;

import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnostico;
import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnosticoVista;

public interface EncabezadoDiagnosticoService {
	public EncabezadoDiagnosticoVista crear(EncabezadoDiagnostico ed);
	public EncabezadoDiagnosticoVista actualizar(EncabezadoDiagnostico ed);
	public EncabezadoDiagnosticoVista buscar(int id);
	public List<EncabezadoDiagnosticoVista> consultar();
	public int consultarCantidadDetalles(int id);
	public boolean borrar(EncabezadoDiagnostico ed);
}
