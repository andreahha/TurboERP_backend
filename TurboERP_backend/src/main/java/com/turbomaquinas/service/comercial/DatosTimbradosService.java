package com.turbomaquinas.service.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DatosTimbrados;

public interface DatosTimbradosService {
	
	public DatosTimbrados crear(DatosTimbrados dt);
	public DatosTimbrados actualizar(DatosTimbrados dt);
	public DatosTimbrados buscar(int id);
	public List<DatosTimbrados> consultar();
	public void actualizarIdsAlfresco(int id, String alfresco_id_pdf, String alfresco_id_xml);

}
