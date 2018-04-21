package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.CronologiaOT;

public interface CronologiaOTDAO {
	public List<CronologiaOT> consultarPorOrden(int id); 
}
