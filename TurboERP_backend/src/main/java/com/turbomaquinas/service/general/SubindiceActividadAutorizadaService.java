package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.SubindiceActividadAutorizada;
import com.turbomaquinas.POJO.general.SubindiceActividadAutorizadaVista;

public interface SubindiceActividadAutorizadaService {
	public SubindiceActividadAutorizadaVista crear(SubindiceActividadAutorizada s);
	public void actualizar(SubindiceActividadAutorizada s);
	public SubindiceActividadAutorizadaVista buscar(int id);
	public List<SubindiceActividadAutorizadaVista> consultar();
}
