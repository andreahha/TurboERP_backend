package com.turbomaquinas.DAO.diagnostico;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.diagnostico.InspeccionEquipoVista;

public class InspeccionEquipoVistaRM implements RowMapper<InspeccionEquipoVista>{

	@Override
	public InspeccionEquipoVista mapRow(ResultSet rs, int i) throws SQLException {
		InspeccionEquipoVista iev = new InspeccionEquipoVista();
		iev.setId(rs.getInt("id"));
		iev.setComentarios(rs.getString("comentarios"));
		iev.setConsecutivo(rs.getInt("consecutivo"));
		iev.setSustituye_id(rs.getInt("sustituye_id"));
		iev.setCreado_por(rs.getInt("creado_por"));
		iev.setCreado(rs.getDate("creado"));
		iev.setModificado_por(rs.getInt("modificado_por"));
		iev.setModificado(rs.getDate("modificado"));
		iev.setAlfresco_id(rs.getString("alfresco_id"));
		iev.setOrdenes_id(rs.getInt("ordenes_id"));
		iev.setAnio(rs.getString("anio"));
		iev.setNumero_orden(rs.getString("numero_orden"));
		iev.setPersonal_id(rs.getInt("personal_id"));
		iev.setPersonal(rs.getString("personal"));
		return iev;
	}

}
