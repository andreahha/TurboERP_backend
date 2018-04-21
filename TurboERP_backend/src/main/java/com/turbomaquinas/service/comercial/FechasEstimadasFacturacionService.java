package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.DAO.comercial.JDBCFechasEstimadasFacturacion.DatosFechas;
import com.turbomaquinas.POJO.comercial.FechasEstimadasFacturacion;

public interface FechasEstimadasFacturacionService {
	
	public void crear(FechasEstimadasFacturacion fef);
	public List<DatosFechas> consultarPorOrden(int idOrden);


}
