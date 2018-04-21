package com.turbomaquinas.DAO.produccion;

import java.util.List;

import com.turbomaquinas.POJO.produccion.Area;
import com.turbomaquinas.POJO.produccion.AreasVista;

public interface AreasVistaDAO {
	public Area actualizar(Area a);
	public AreasVista buscar(int id);
	public List<AreasVista> consultar();
	public List<AreasVista> buscarPorOrden(int id);
	public List<AreasVista> consultarAreasLibres();
}
