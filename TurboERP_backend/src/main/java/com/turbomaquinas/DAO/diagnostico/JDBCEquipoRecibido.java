package com.turbomaquinas.DAO.diagnostico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.diagnostico.EquipoRecibido;
import com.turbomaquinas.POJO.diagnostico.EquipoRecibidoVista;

@Repository
public class JDBCEquipoRecibido implements EquipoRecibidoDAO  {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int crear(EquipoRecibido er) throws DataAccessException {
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("descripcion_equipo");
		columnas.add("fecha_ingreso");
		columnas.add("descripcion_empaque");
		columnas.add("cantidad");
		columnas.add("peso");
		columnas.add("usuario_acepta");
		columnas.add("fecha_acepta");
		columnas.add("creado_por");
		columnas.add("ORDENES_id");
		columnas.add("ORDENES_id_adonde");
		columnas.add("ES_RECIBIR_EQUIPO");

		insert.setTableName("EQUIPO_RECIBIDO");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("descripcion_equipo", er.getDescripcion_equipo());
		datos.put("fecha_ingreso", er.getFecha_ingreso());
		datos.put("descripcion_empaque", er.getDescripcion_empaque());
		datos.put("cantidad", er.getCantidad());
		datos.put("peso", er.getPeso());
		datos.put("usuario_acepta", er.getUsuario_acepta());
		datos.put("fecha_acepta", er.getFecha_acepta());
		datos.put("creado_por", er.getCreado_por());
		datos.put("ORDENES_id", er.getOrdenes_id());
		datos.put("ORDENES_id_adonde", er.getOrdenes_id_adonde());
		datos.put("ES_RECIBIR_EQUIPO", er.getEs_recibir_equipo());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);

		return id.intValue();
	}

	@Override
	public EquipoRecibido actualizar(EquipoRecibido er) throws DataAccessException {
		jdbcTemplate.update("UPDATE EQUIPO_RECIBIDO SET descripcion_equipo=?, descripcion_empaque=?, cantidad=?, peso=?, "
				+ "usuario_acepta=?, fecha_acepta=?, activo=?, modificado_por=?, ORDENES_id=?, ORDENES_id_adonde=?, "
				+ "ES_RECIBIR_EQUIPO=? WHERE id=?",
				er.getDescripcion_equipo(), er.getDescripcion_empaque(), er.getCantidad(), er.getPeso(), er.getUsuario_acepta(), 
				er.getFecha_acepta(), er.getActivo(), er.getModificado_por(), er.getOrdenes_id(), er.getOrdenes_id_adonde(), 
				er.getEs_recibir_equipo(), er.getId());
			return er;
	}

	@Override
	public EquipoRecibidoVista buscar(int id) throws DataAccessException {
		EquipoRecibidoVista erv = jdbcTemplate.queryForObject("SELECT * FROM EQUIPO_RECIBIDO_V WHERE id=?", 
				new EquipoRecibidoVistaRM(), id);
		return erv;
	}

	@Override
	public List<EquipoRecibidoVista> consultar() throws DataAccessException {
		List<EquipoRecibidoVista> lerv = jdbcTemplate.query("SELECT * FROM EQUIPO_RECIBIDO_V",
				new EquipoRecibidoVistaRM());
		return lerv;
	}

	@Override
	public int consultarCantidad(int orden_id, int ES_Recibir_Equipo_id) throws DataAccessException{
		int cantidad = jdbcTemplate.queryForObject("SELECT COALESCE(COUNT(*), 0) FROM EQUIPO_RECIBIDO WHERE ORDENES_id=? AND ES_RECIBIR_EQUIPO=? AND activo=1", 
				Integer.class, orden_id, ES_Recibir_Equipo_id);
		return cantidad;
	}

	@Override
	public List<EquipoRecibidoVista> consultarPorOrden(int id) throws DataAccessException{
		List<EquipoRecibidoVista> lerv = jdbcTemplate.query("SELECT * FROM EQUIPO_RECIBIDO_V WHERE ordenes_id=?", 
				new EquipoRecibidoVistaRM(), id);
		return lerv;
	}

}
