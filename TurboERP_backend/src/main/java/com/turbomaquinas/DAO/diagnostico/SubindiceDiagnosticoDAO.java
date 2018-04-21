package com.turbomaquinas.DAO.diagnostico;

import java.util.List;

import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnostico;
import com.turbomaquinas.POJO.diagnostico.SubindiceDiagnosticoVista;

public interface SubindiceDiagnosticoDAO {
	public int crear(SubindiceDiagnostico sd);
	public void actualizar(SubindiceDiagnostico sd);
	public SubindiceDiagnosticoVista buscar(int id);
	public List<SubindiceDiagnosticoVista> consultar();
	public int recuperarUltimoLugar(int detalleID);
	public List<SubindiceDiagnosticoVista> consultarPorDetalle(int id);
	public List<SubindiceDiagnosticoVista> consultarPorDiagnostico(int id);
	public int consultarCantidadPorDetalle(int id);
	public void reordenar_actualiza(int detalle_diagnostico_id, int lugarDestino, int lugarOrigen);
	public void reordenar_elimina(int detalle_diagnostico_id, int lugarOrigen);
}
