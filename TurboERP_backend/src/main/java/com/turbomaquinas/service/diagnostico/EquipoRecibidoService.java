package com.turbomaquinas.service.diagnostico;

import java.util.List;

import com.turbomaquinas.POJO.diagnostico.EquipoRecibido;
import com.turbomaquinas.POJO.diagnostico.EquipoRecibidoVista;

public interface EquipoRecibidoService {
	
	public EquipoRecibidoVista crear(EquipoRecibido er);
	public EquipoRecibidoVista actualizar(EquipoRecibido er);
	public EquipoRecibidoVista buscar(int id);
	public List<EquipoRecibidoVista> consultar();
	public boolean borrar(EquipoRecibido er);
	public int consultarCantidad(int orden_id, int ES_Recibir_Equipo_id);
	public List<EquipoRecibidoVista> consultarPorOrden(int id);
}
