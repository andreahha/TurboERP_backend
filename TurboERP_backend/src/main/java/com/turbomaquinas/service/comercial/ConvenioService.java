package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.Convenio;

public interface ConvenioService {
	public Convenio crear(Convenio convenio);
	public void actualizar(Convenio convenio);
	public Convenio buscar(int id);
	public List<Convenio> consultar();
}
