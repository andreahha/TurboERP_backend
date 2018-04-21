package com.turbomaquinas.DAO.vigilancia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.vigilancia.ESExternos;
import com.turbomaquinas.POJO.vigilancia.ESExternosVista;

@Repository
public class JDBCESExternos implements ESExternosDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int crear(ESExternos ese) throws DataAccessException {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("nombre_persona");
		columnas.add("compania");
		columnas.add("tipo");
		columnas.add("descripcion_visita");
		columnas.add("creado_por");
		columnas.add("personal_id_visita");
		columnas.add("personal_id_entrada");
		columnas.add("iden_alfresco_id");
		
		insert.setTableName("ENTRADAS_SALIDAS_EXTERNOS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("nombre_persona", ese.getNombre_persona());
		datos.put("compania", ese.getCompania());
		datos.put("tipo", ese.getTipo());
		datos.put("descripcion_visita", ese.getDescripcion_visita());
		datos.put("creado_por", ese.getCreado_por());
		datos.put("personal_id_visita", ese.getPersonal_id_visita());
		datos.put("personal_id_entrada", ese.getPersonal_id_entrada());
		datos.put("iden_alfresco_id", ese.getIden_alfresco_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public ESExternos actualizar(ESExternos ese) throws DataAccessException {
		jdbcTemplate.update("UPDATE ENTRADAS_SALIDAS_EXTERNOS SET nombre_persona=?, compania=?, tipo=?, descripcion_visita=?, "
				+ "activo=?, modificado_por = ?, PERSONAL_id_visita=?, PERSONAL_id_entrada=?, iden_alfresco_id=? WHERE id = ?", 
				ese.getNombre_persona(), ese.getCompania(), ese.getTipo(), ese.getDescripcion_visita(), ese.getActivo(), 
				ese.getModificado_por(), ese.getPersonal_id_visita(), ese.getPersonal_id_entrada(), ese.getIden_alfresco_id(), ese.getId());
		return ese;
	}

	@Override
	public ESExternosVista buscar(int id) throws DataAccessException{
		ESExternosVista eseb = jdbcTemplate.queryForObject("SELECT * FROM ENTRADAS_SALIDAS_EXTERNOS_V "
				+ "WHERE id = ?", new ESExternosVistaRM(), id);
		return eseb;
	}

	@Override
	public List<ESExternosVista> consultar() throws DataAccessException{
		List<ESExternosVista> esev =jdbcTemplate.query("SELECT * FROM ENTRADAS_SALIDAS_EXTERNOS_V",
				new ESExternosVistaRM());
		return esev;
	}

	@Override
	public List<ESExternosVista> consultarPorFecha(String fecha_entrada) throws DataAccessException{
		List<ESExternosVista> ev =jdbcTemplate.query("SELECT * FROM ENTRADAS_SALIDAS_EXTERNOS_V WHERE fecha_entrada=? ",
				new ESExternosVistaRM(), fecha_entrada);
		return ev;
	}

	@Override
	public void actualizarSalida(int id) throws DataAccessException{
		jdbcTemplate.update("call ACTUALIZAR_SALIDA_ES_EXTERNOS(?)",
				id);
	}
}
