package com.turbomaquinas.service.general;

import java.util.List;

import com.turbomaquinas.POJO.general.DocumentoOTIrregular;
import com.turbomaquinas.POJO.general.OTIrregular;
import com.turbomaquinas.POJO.general.OTIrregularVista;

public interface OTIrregularService {
	public OTIrregularVista crearOTIrregular(DocumentoOTIrregular doc);
	public void actualizar(OTIrregular oti);
	public OTIrregularVista buscar(int id);
	public List<OTIrregularVista> consultar();
	public OTIrregularVista buscarOTIrregular(String Folio);
	public void aceptaOTI(int id, int usuarioAcepta,String estado);
}
