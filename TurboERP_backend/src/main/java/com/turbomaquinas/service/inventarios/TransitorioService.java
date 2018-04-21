package com.turbomaquinas.service.inventarios;

import java.util.List;

import com.turbomaquinas.POJO.inventarios.TransitorioVista;

public interface TransitorioService {
	
	public List<TransitorioVista> consultarArticulosTransitorios(int almacen);
	public void actualizarExistenciaFisica(int articulo_id, int almacen_id,float cantidad);
	public TransitorioVista buscar(int id);
	public void actualizarUbicacion(int articulo_id, int almacen_id, String ubicaciones[]);
}
