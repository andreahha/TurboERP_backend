package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.Convenio;

public interface ConvenioDAO {
	public int crear(Convenio convenio);
	public void actualizar(Convenio convenio);
	public Convenio buscar(int id);
	public List<Convenio> consultar();
}
