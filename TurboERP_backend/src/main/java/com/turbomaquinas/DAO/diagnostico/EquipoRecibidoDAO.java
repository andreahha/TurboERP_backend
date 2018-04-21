package com.turbomaquinas.DAO.diagnostico;

import java.util.List;

import com.turbomaquinas.POJO.diagnostico.EquipoRecibido;
import com.turbomaquinas.POJO.diagnostico.EquipoRecibidoVista;

public interface EquipoRecibidoDAO {
	
	public int crear(EquipoRecibido er);
	public EquipoRecibido actualizar(EquipoRecibido er);
	public EquipoRecibidoVista buscar(int id);
	public List<EquipoRecibidoVista> consultar();
	public int consultarCantidad(int orden_id, int ES_Recibir_Equipo_id);
	public List<EquipoRecibidoVista> consultarPorOrden(int id);
}
