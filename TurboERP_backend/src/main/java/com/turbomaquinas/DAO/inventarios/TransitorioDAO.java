package com.turbomaquinas.DAO.inventarios;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.turbomaquinas.POJO.inventarios.TransitorioVista;

public interface TransitorioDAO {
	
	public List<TransitorioVista> consultarArticulosTransitorios(int almacen) throws DataAccessException;
	public void actualizarExistenciaFisica(int articulo_id, int almacen_id,float cantidad);
	public TransitorioVista buscar(int id);
	public void actualizarUbicacion(int articulo_id, int almacen_id, String ubicaciones[]);
}
