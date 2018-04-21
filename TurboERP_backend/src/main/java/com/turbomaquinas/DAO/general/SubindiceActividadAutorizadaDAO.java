package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.SubindiceActividadAutorizada;
import com.turbomaquinas.POJO.general.SubindiceActividadAutorizadaVista;

public interface SubindiceActividadAutorizadaDAO {
	public int crear(SubindiceActividadAutorizada s);
	public void actualizar(SubindiceActividadAutorizada s);
	public SubindiceActividadAutorizadaVista buscar(int id);
	public List<SubindiceActividadAutorizadaVista> consultar();
	public int recuperarUltimoLugar(int actividadID);
	public void reordenar(int actividadID, int lugar, int id);
}
