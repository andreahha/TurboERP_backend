package com.turbomaquinas.DAO.general;

import java.util.Date;
import java.util.List;

import com.turbomaquinas.POJO.general.OTIrregular;
import com.turbomaquinas.POJO.general.OTIrregularVista;

public interface OTIrregularDAO {
	
	public int crear(String iniciales, Date fechaRegularizacion, String comentarios, String proceso, int creadoPor, int ordenId, int contactoID);
	public void actualizar(OTIrregular oti);
	public OTIrregularVista buscar(int id);
	public List<OTIrregularVista> consultar();
	public OTIrregularVista buscarOTIrregular(String Folio);
	public void aceptaOTI(int id, int usuarioAcepta,String estado);
}
