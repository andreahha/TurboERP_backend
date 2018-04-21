package com.turbomaquinas.service.vigilancia;

import java.util.List;

import com.turbomaquinas.POJO.vigilancia.ESExternos;
import com.turbomaquinas.POJO.vigilancia.ESExternosVista;

public interface ESExternosService {
	
	public ESExternosVista buscar(int id);
	public List<ESExternosVista> consultar();
	public ESExternosVista crear(ESExternos ese);
	public ESExternos actualizar(ESExternos ese);
	public List<ESExternosVista> consultarPorFecha(String fecha_entrada);
	public void actualizarSalida(int id);
}
