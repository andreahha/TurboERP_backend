package com.turbomaquinas.DAO.diagnostico;

import java.util.List;

import com.turbomaquinas.DAO.diagnostico.JDBCDetalleDiagnostico.Deptos;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnostico;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnostico.ListaDeptos;
import com.turbomaquinas.POJO.diagnostico.DetalleDiagnosticoVista;


public interface DetalleDiagnosticoDAO {	
	public int crear(DetalleDiagnostico dd);
	public void actualizar(DetalleDiagnostico dd);
	public DetalleDiagnosticoVista buscar(int id);
	public List<DetalleDiagnosticoVista> consultar();
	public int recuperarUltimoLugar(int encabezadoID);
	public List<DetalleDiagnosticoVista> consultarPorDiagnostico(int id);
	public int consultarCantidadPorEncabezado(int id);
	public void reordenar_actualiza(int encabezados_diagnostico_id, int lugarDestino, int lugarOrigen);
	public void reordenar_elimina(int encabezados_diagnostico_id, int lugarOrigen);
	public List<DetalleDiagnosticoVista> consultarPorEncabezado(int id);	
	public List<DetalleDiagnosticoVista> consultarPorListaId(List<Integer> ids);
	public DetalleDiagnostico obtener(int id);
	public List<DetalleDiagnosticoVista> consultarAutorizadosPorDetalleCO(int id);	
	public List<DetalleDiagnosticoVista> consultarAutorizadosPorDetalleDI(int id);
	public void asignarDeptos(int id, ListaDeptos lista);
	public List<Deptos> consultarDeptos(int id);
}

