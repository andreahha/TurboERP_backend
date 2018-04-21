package com.turbomaquinas.DAO.diagnostico;

import java.util.List;

import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnostico;
import com.turbomaquinas.POJO.diagnostico.EncabezadoDiagnosticoVista;

public interface EncabezadoDiagnosticoDAO {
	public int crear(EncabezadoDiagnostico ed);
	public void actualizar(EncabezadoDiagnostico ed);
	public EncabezadoDiagnosticoVista buscar(int id);
	public List<EncabezadoDiagnosticoVista> consultar();
	public int recuperarUltimoLugar(int diagnosticoID);
	public List<EncabezadoDiagnosticoVista> consultarPorDiagnostico(int id);
	public int consultarCantidadporDiagnostico(int id);
	public void reordenar_actualiza(int diagnostico_id, int lugarOrigen, int lugarDestino);
	public void reordenar_elimina(int diagnostico_id, int lugarOrigen);
	public EncabezadoDiagnostico obtener(int id);
}
