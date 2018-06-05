package com.turbomaquinas.DAO.diagnostico;

import java.util.List;

import com.turbomaquinas.POJO.diagnostico.DetalleRemisionEmbarqueVista;

public interface DetalleEmbarqueDAO {
	
	public List<DetalleRemisionEmbarqueVista> detallesPorRemision (int id);

}
