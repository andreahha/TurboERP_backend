package com.turbomaquinas.service.diagnostico;

import java.util.List;

import com.turbomaquinas.DAO.diagnostico.JDBCDiagnostico.ActividadProduccion;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnosticoVista;
import com.turbomaquinas.POJO.diagnostico.Diagnostico;
import com.turbomaquinas.POJO.diagnostico.DiagnosticoVista;
import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnosticoVista;
import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnosticoVista;

public interface DiagnosticoService {
	
	public DiagnosticoVista crear(Diagnostico d);
	public Diagnostico actualizar(Diagnostico d);
	public DiagnosticoVista buscar(int id);
	public List<DiagnosticoVista> consultar();
	public List<EncabezadoDiagnosticoVista> consultarEncabezados(int id);
	public List<DetalleDiagnosticoVista> consultarDetalles(int id);
	public List<SubindiceDiagnosticoVista> consultarSubindices(int id);
	public int consultarCantidadEncabezados(int id);
	public DiagnosticoVista buscarDiagnostico(String numeroOrden);
	public List<Integer> aniosRecomendaciones();
	public List<DiagnosticoVista> recomendacionesAnio(int anio);
	public List<DiagnosticoVista> buscarDiagnosticoPorOrdenSinAutorizar(int id);
	public List<DiagnosticoVista> buscarPorOrden(int id);
	public List<DetalleDiagnosticoVista> consultarActividadesPendientesAutorizar(int id);
	public List<ActividadProduccion> consultarActividadesProduccion(int id);

}
