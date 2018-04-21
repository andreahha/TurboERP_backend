package com.turbomaquinas.service.diagnostico;

import java.util.List;

import com.turbomaquinas.DAO.diagnostico.JDBCDetalleDiagnostico.Deptos;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnostico;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnostico.ListaDeptos;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnosticoVista;

public interface DetalleDiagnosticoService {	
	public DetalleDiagnosticoVista crear(DetalleDiagnostico dd);
	public DetalleDiagnosticoVista actualizar(DetalleDiagnostico dd);
	public DetalleDiagnosticoVista buscar(int id);
	public List<DetalleDiagnosticoVista> consultar();
	public int consultarCantidadSubindices(int id);
	public boolean borrar(DetalleDiagnostico dd);
	public List<DetalleDiagnosticoVista> consultarPorListaId(List<Integer> ids);
	public List<DetalleDiagnosticoVista> consultarAutorizadosPorDetalleCO(int id);
	public List<DetalleDiagnosticoVista> consultarAutorizadosPorDetalleDI(int id);
	public void asignarDeptos(int id, ListaDeptos lista);
	public List<Deptos> consultarDeptos(int id);
}
