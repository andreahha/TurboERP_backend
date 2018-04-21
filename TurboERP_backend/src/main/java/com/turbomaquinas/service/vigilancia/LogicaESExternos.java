package com.turbomaquinas.service.vigilancia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.vigilancia.ESExternosDAO;
import com.turbomaquinas.POJO.vigilancia.ESExternos;
import com.turbomaquinas.POJO.vigilancia.ESExternosVista;

@Service
public class LogicaESExternos implements ESExternosService{
	
	@Autowired
	ESExternosDAO repESExternos;
	
	@Override
	public ESExternosVista buscar(int id) throws DataAccessException{
		return repESExternos.buscar(id);
	}

	@Override
	public List<ESExternosVista> consultar() throws DataAccessException{
		return repESExternos.consultar();
	}

	@Override
	public ESExternosVista crear(ESExternos ese)throws DataAccessException {
		int id = repESExternos.crear(ese);
		return repESExternos.buscar(id);
	}

	@Override
	public ESExternos actualizar(ESExternos ese) throws DataAccessException{
		return repESExternos.actualizar(ese);
	}

	@Override
	public List<ESExternosVista> consultarPorFecha(String fecha_entrada) throws DataAccessException{
		return repESExternos.consultarPorFecha(fecha_entrada);
	}

	@Override
	public void actualizarSalida(int id) throws DataAccessException{
		repESExternos.actualizarSalida(id);
	}
}
