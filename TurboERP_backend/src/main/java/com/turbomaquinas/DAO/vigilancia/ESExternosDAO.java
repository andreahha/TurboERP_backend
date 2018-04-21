package com.turbomaquinas.DAO.vigilancia;

import java.util.List;

import com.turbomaquinas.POJO.vigilancia.ESExternos;
import com.turbomaquinas.POJO.vigilancia.ESExternosVista;

public interface ESExternosDAO {
	
	public int crear(ESExternos ese);
	public ESExternos actualizar(ESExternos ese);
	public ESExternosVista buscar(int id);
	public List<ESExternosVista> consultar();
	public List<ESExternosVista> consultarPorFecha(String fecha_entrada);
	public void actualizarSalida(int id);
}
