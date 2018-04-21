package com.turbomaquinas.service.comercial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.turbomaquinas.DAO.comercial.DepositoRecibidoDAO;
import com.turbomaquinas.POJO.comercial.DepositoRecibido;
import com.turbomaquinas.POJO.comercial.DepositoRecibidoVista;

@Service
public class LogicaDepositoRecibido implements DepositoRecibidoService{

	@Autowired
	DepositoRecibidoDAO repositorio;
	
	@Override
	public DepositoRecibidoVista crear(DepositoRecibido deposito) throws DataAccessException{
		int id = repositorio.crear(deposito);
		return repositorio.buscar(id);
	}

	@Override
	public void actualizar(DepositoRecibido deposito) throws DataAccessException{
		repositorio.actualizar(deposito);
	}

	@Override
	public DepositoRecibidoVista buscar(int id) throws DataAccessException{
		return repositorio.buscar(id);
	}

	@Override
	public List<DepositoRecibidoVista> consultar() throws DataAccessException{
		return repositorio.consultar();
	}

	@Override
	public List<DepositoRecibidoVista> depositosRecibidosFecha(String fechainicio,String fechafin) throws DataAccessException{
		
		return repositorio.depositoRecibidoRangoFecha(fechainicio,fechafin);
	}

	@Override
	public void borrarDR(int id,int modificado_por) throws DataAccessException{
		repositorio.eliminar(id,modificado_por);
		
	}

	@Override
	public boolean consultarMonedaDepositoRecibido(int id) {
		int valor = repositorio.monedaDepositoRecibido(id);
		if (valor==1)
			return false;
		return true;
	}

	

}
