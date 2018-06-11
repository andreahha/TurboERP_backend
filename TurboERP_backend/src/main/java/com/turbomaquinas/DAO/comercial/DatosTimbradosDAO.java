package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.DatosTimbrados;

public interface DatosTimbradosDAO {
	
	public int crear(DatosTimbrados dt);
	public DatosTimbrados actualizar(DatosTimbrados dt);
	public DatosTimbrados buscar(int id);
	public List<DatosTimbrados> consultar();
	public void actualizarIdsAlfresco(int id, String alfresco_id_pdf, String alfresco_id_xml);
	public void actualizarIdsAlfrescoCancelado(int id, String alfresco_id_pdf_cancelacion, String alfresco_id_xml_cancelacion);
}
