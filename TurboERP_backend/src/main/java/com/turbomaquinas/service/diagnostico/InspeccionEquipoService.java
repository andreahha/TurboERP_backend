package com.turbomaquinas.service.diagnostico;

import java.util.List;

import com.turbomaquinas.POJO.diagnostico.InspeccionEquipo;
import com.turbomaquinas.POJO.diagnostico.InspeccionEquipoVista;

public interface InspeccionEquipoService {
	public InspeccionEquipoVista crear(InspeccionEquipo ins);
	public InspeccionEquipoVista actualizar(InspeccionEquipo ins);
	public InspeccionEquipoVista buscar(int id);
	public List<InspeccionEquipoVista> consultar();
	public List<Integer> anioInspeccionEquipo();
	public List<InspeccionEquipoVista> inspeccionEquipoAnio(int anio);
	public List<InspeccionEquipoVista> consultaPorOrden(int id);
}
