package com.turbomaquinas.DAO.general;


import java.util.List;

import com.turbomaquinas.POJO.general.Departamento;
import com.turbomaquinas.POJO.general.DepartamentoVista;
import com.turbomaquinas.POJO.general.Personal;

public interface DepartamentoDAO {
	public void crear(Departamento d);
	public void actualizar(Departamento d);
	public DepartamentoVista buscar(String clave);
	public List<DepartamentoVista> consultar();
	public List<Personal> consultarEvaluadores(String clave);
}
