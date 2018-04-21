package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.EncabezadoActividadAutorizada;
import com.turbomaquinas.POJO.general.EncabezadoActividadAutorizadaVista;

public interface EncabezadoActividadAutorizadaDAO {
	public int crear(EncabezadoActividadAutorizada e);
	public void actualizar(EncabezadoActividadAutorizada e);
	public EncabezadoActividadAutorizadaVista buscar(int id);
	public List<EncabezadoActividadAutorizadaVista> consultar();
	public int recuperarUltimoLugar(int ordenesID);
	public void reordenar(int ordenesID, int lugar, int id);
	public int buscarPorEncabezadoDiagnostico(int id_encabezado_diagnostico);
}
