package com.turbomaquinas.service.produccion;

import java.util.List;

import com.turbomaquinas.POJO.produccion.Area;
import com.turbomaquinas.POJO.produccion.AreasVista;

public interface AreasService {
	public AreasVista actualizar(Area a);
	public AreasVista buscar(int id);
	public List<AreasVista> consultar();
	public List<AreasVista> consultarAreasLibres();

}
