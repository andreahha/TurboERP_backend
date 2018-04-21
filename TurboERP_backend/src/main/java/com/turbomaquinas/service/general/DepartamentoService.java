package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.SGC.SolicitudCambioVista;
import com.turbomaquinas.POJO.general.Departamento;
import com.turbomaquinas.POJO.general.DepartamentoVista;
import com.turbomaquinas.POJO.general.Personal;

public interface DepartamentoService {
	public List<DepartamentoVista> consultar();
	public DepartamentoVista buscar(String clave);
	public List<SolicitudCambioVista> consultar(String clave);
	public List<Personal> consultarEvaluadores(String clave);
	public void crear(Departamento d);
	public void actualizar(Departamento d);
}
