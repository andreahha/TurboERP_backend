package com.turbomaquinas.service.inventarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.inventarios.CatalogoArticulosDAO;
import com.turbomaquinas.POJO.inventarios.CatalogoArticulosVista;

@Service
public class LogicaCatalogoArticulos implements CatalogoArticulosService{
	
	@Autowired
	CatalogoArticulosDAO repositorio;

	@Override
	public List<CatalogoArticulosVista> consultarArtPorAlmacen(int id) throws DataAccessException{
		return repositorio.consultarArtPorAlmacen(id);
	}

	@Override
	public void actualizarExistenciaFisica(int articulo_id, int almacen_id, float cantidad) {
		repositorio.actualizarExistenciaFisica(articulo_id, almacen_id, cantidad);
	}

	@Override
	public CatalogoArticulosVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<CatalogoArticulosVista> consultarSubindicesAlmacen(int id, int agrupa_id) {
		return repositorio.consultarSubindicesAlmacen(id, agrupa_id);
	}
	
	@Override
	public void actualizarUbicacion(int articulo_id, int almacen_id, String ubicaciones[]) {
		repositorio.actualizarUbicacion(articulo_id, almacen_id, ubicaciones);
	}

	@Override
	public List<CatalogoArticulosVista> consultarArtPorGrupo(int almacen_id,int grupo_id) {
		return repositorio.consultarArtPorGrupo(almacen_id, grupo_id);
	}

}
