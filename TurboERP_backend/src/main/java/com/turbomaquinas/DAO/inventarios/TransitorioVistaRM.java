package com.turbomaquinas.DAO.inventarios;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.turbomaquinas.POJO.inventarios.Existencia;
import com.turbomaquinas.POJO.inventarios.TransitorioVista;

public class TransitorioVistaRM implements RowMapper<TransitorioVista> {

	@Override
	public TransitorioVista mapRow(ResultSet rs, int i) throws SQLException {
		TransitorioVista tv = new TransitorioVista();
		ObjectMapper om = new ObjectMapper();
		List<Existencia> existencia = null;
		tv.setId(rs.getInt("id"));
		tv.setCodigo(rs.getString("codigo"));
		tv.setNumero_entrada(rs.getInt("numero_entrada"));
		tv.setNumero_transitorio(rs.getString("numero_transitorio"));
		tv.setDescripcion(rs.getString("descripcion"));
		String json = rs.getString("existencia");
		try {
			existencia = om.readValue(json, new TypeReference<List<Existencia>>(){});
		} catch (IOException e) {
			e.printStackTrace();
		}
		tv.setExistencia(existencia);
		tv.setEntradas_id(rs.getInt("ENTRADAS_id"));
		tv.setTipo(rs.getString("tipo"));
		tv.setUnidades_de_medida_id(rs.getInt("UNIDADES_DE_MEDIDA_id"));
		tv.setDescripcion_unidades_medida(rs.getString("descripcion_unidades_medida"));
		return tv;
	}

}
