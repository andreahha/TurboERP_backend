package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DepositoRecibido;
import com.turbomaquinas.POJO.comercial.DepositoRecibidoVista;

public interface DepositoRecibidoDAO {
	public int crear(DepositoRecibido deposito);
	public void actualizar(DepositoRecibido deposito);
	public DepositoRecibidoVista buscar(int id);
	public List<DepositoRecibidoVista> consultar();
	
	public List<DepositoRecibidoVista> depositoRecibidoRangoFecha(String fecha_depositoInicio,String fecha_depositoFin);
	
	public void eliminar(int id,int modificado_por);
	
	public int monedaDepositoRecibido(int id); 

}
