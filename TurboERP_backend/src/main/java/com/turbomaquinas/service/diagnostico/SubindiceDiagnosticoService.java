package com.turbomaquinas.service.diagnostico;

import java.util.List;

import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnostico;
import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnosticoVista;

public interface SubindiceDiagnosticoService {
	public SubindiceDiagnosticoVista crear(SubindiceDiagnostico sd);
	public SubindiceDiagnosticoVista actualizar(SubindiceDiagnostico sd);
	public SubindiceDiagnosticoVista buscar(int id);
	public List<SubindiceDiagnosticoVista> consultar();
	public boolean borrar(SubindiceDiagnostico sd);
}
