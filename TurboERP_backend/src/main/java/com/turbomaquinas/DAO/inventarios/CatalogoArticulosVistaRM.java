package com.turbomaquinas.DAO.inventarios;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.turbomaquinas.POJO.inventarios.CatalogoArticulosVista;
import com.turbomaquinas.POJO.inventarios.Existencia;
import com.turbomaquinas.POJO.inventarios.Existencia.SubindicesAgrupados;

public class CatalogoArticulosVistaRM implements RowMapper<CatalogoArticulosVista> {

	@Override
	public CatalogoArticulosVista mapRow(ResultSet rs, int i) throws SQLException {
		
		CatalogoArticulosVista cav = new CatalogoArticulosVista();
		cav.setId(rs.getInt("id"));
		cav.setCodigo(rs.getString("codigo"));
		cav.setSub_indice(rs.getString("sub_indice"));
		cav.setDescripcion_articulo(rs.getString("descripcion_articulo"));
		cav.setObsoleto(rs.getInt("obsoleto"));
		cav.setOrigen_turbomaquinas(rs.getInt("origen_turbomaquinas"));
		cav.setCatalogo_articulos_agrupa_id(rs.getInt("CATALOGO_ARTICULOS_agrupa_id"));
		
		String json=rs.getString("existencia");
		ObjectMapper mapper = new ObjectMapper();
		List<Existencia> exi=null;
		try {
			exi = mapper.readValue(json, new TypeReference<List<Existencia>>(){});
		} catch (IOException e) {}
		cav.setExistencia(exi);
		
		
		String jsonSub=rs.getString("sub_indices_agrupados");
		SubindicesAgrupados sub=null;
		try {
			sub = mapper.readValue(jsonSub, new TypeReference<SubindicesAgrupados>(){});
		} catch (IOException e) {}
		cav.setSub_indices_agrupados(sub);
		
		
		cav.setUnidades_de_medida_id(rs.getInt("UNIDADES_DE_MEDIDA_id"));
		cav.setGrupos_almacen_id(rs.getInt("GRUPOS_ALMACEN_id"));
		cav.setDescripcion_grupos_almacen(rs.getString("descripcion_grupos_almacen"));
		cav.setDescripcion_tipos_almacen(rs.getString("descripcion_tipos_almacen"));
		cav.setDescripcion_unidades_medida(rs.getString("descripcion_unidades_medida"));
		cav.setTipo(rs.getString("tipo"));		
		return cav;
	}

}
