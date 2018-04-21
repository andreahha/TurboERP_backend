package com.turbomaquinas.service.diagnostico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.diagnostico.EquipoRecibidoDAO;
import com.turbomaquinas.POJO.diagnostico.EquipoRecibido;
import com.turbomaquinas.POJO.diagnostico.EquipoRecibidoVista;

@Service
public class LogicaEquipoRecibido implements EquipoRecibidoService {
	
	@Autowired
	EquipoRecibidoDAO repERecibido;

	@Override
	public EquipoRecibidoVista crear(EquipoRecibido er) throws DataAccessException {
		int id = repERecibido.crear(er);
		return repERecibido.buscar(id);
	}

	@Override
	public EquipoRecibidoVista actualizar(EquipoRecibido er) throws DataAccessException {
		repERecibido.actualizar(er);
		return repERecibido.buscar(er.getId());
	}

	@Override
	public EquipoRecibidoVista buscar(int id) throws DataAccessException {
		return repERecibido.buscar(id);
	}

	@Override
	public List<EquipoRecibidoVista> consultar() throws DataAccessException {
		return repERecibido.consultar();
	}

	@Override
	public boolean borrar(EquipoRecibido er) throws DataAccessException{
			er.setActivo(0);
			repERecibido.actualizar(er);
			return true;
	}

	@Override
	public int consultarCantidad(int orden_id, int ES_Recibir_Equipo_id) throws DataAccessException{
		return repERecibido.consultarCantidad(orden_id, ES_Recibir_Equipo_id);
	}

	@Override
	public List<EquipoRecibidoVista> consultarPorOrden(int id) throws DataAccessException{
		return repERecibido.consultarPorOrden(id);
	}
}
