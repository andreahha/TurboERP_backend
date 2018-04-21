package com.turbomaquinas.DAO.diagnostico;

import java.util.List;

import com.turbomaquinas.POJO.diagnostico.InspeccionEquipo;
import com.turbomaquinas.POJO.diagnostico.InspeccionEquipoVista;

public interface InspeccionEquipoDAO {
	public int crear(InspeccionEquipo ins);
	public InspeccionEquipo actualizar(InspeccionEquipo ins);
	public InspeccionEquipoVista buscar(int id);
	public List<InspeccionEquipoVista> consultar();
	public List<Integer> anioInspeccionEquipo();
	public List<InspeccionEquipoVista> inspeccionEquipoAnio(int anio);
	public List<InspeccionEquipoVista> consultaPorOrden(int id);
}
