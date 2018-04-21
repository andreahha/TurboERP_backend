package com.turbomaquinas.DAO.diagnostico;

import java.util.List;

import com.turbomaquinas.DAO.diagnostico.JDBCDiagnostico.ActividadProduccion;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnosticoVista;
import com.turbomaquinas.POJO.diagnostico.Diagnostico;
import com.turbomaquinas.POJO.diagnostico.DiagnosticoVista;

public interface DiagnosticoDAO {
	
	public int crear(Diagnostico d);
	public Diagnostico actualizar(Diagnostico d);
	public DiagnosticoVista buscar(int id);
	public List<DiagnosticoVista> consultar();
	public DiagnosticoVista buscarDiagnostico(String numeroOrden);
	public List<Integer> aniosRecomendaciones();
	public List<DiagnosticoVista> recomendacionesAnio(int anio);
	public List<DiagnosticoVista> buscarDiagnosticoPorOrdenSinAutorizar(int id);
	public List<DiagnosticoVista> buscarPorOrden(int id);
	public List<DetalleDiagnosticoVista> consultarActividadesPendientesAutorizar(int id);
	public List<ActividadProduccion> consultarActividadesProduccion(int id);
}
