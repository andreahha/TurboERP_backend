package com.turbomaquinas.DAO.comercial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.DAO.general.MarcaEquipoRM;
import com.turbomaquinas.DAO.general.ModeloEquipoRM;
import com.turbomaquinas.POJO.comercial.Precotizacion;
import com.turbomaquinas.POJO.comercial.PrecotizacionVista;
import com.turbomaquinas.POJO.general.MarcaEquipo;
import com.turbomaquinas.POJO.general.ModeloEquipo;

@Repository
public class JDBCPrecotizacion implements PrecotizacionDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	@Override
	public int crear(Precotizacion pc) throws DataAccessException {
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("origen");
		columnas.add("descripcion");
		columnas.add("comentarios");
		columnas.add("fecha_requiere_cotizacion");
		columnas.add("fecha_estimada_logro");
		columnas.add("fecha_junta_aclara");
		columnas.add("fecha_propuesta");
		columnas.add("fecha_fallo");
		columnas.add("fecha_llegada_equipo");
		columnas.add("licitacion");
		columnas.add("creado_por");
		columnas.add("MARCAS_EQUIPOS_id");
		columnas.add("MODELOS_EQUIPOS_id");
		columnas.add("CLIENTES_id");
		columnas.add("CONTACTOS_id");
		
		insert.setTableName("PRECOTIZACIONES");;
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("origen", pc.getOrigen());
		datos.put("descripcion", pc.getDescripcion());
		datos.put("comentarios", pc.getComentarios());
		datos.put("fecha_requiere_cotizacion", pc.getFecha_requiere_cotizacion());
		datos.put("fecha_estimada_logro", pc.getFecha_estimada_logro());
		datos.put("fecha_junta_aclara", pc.getFecha_junta_aclara());
		datos.put("fecha_propuesta", pc.getFecha_propuesta());
		datos.put("fecha_fallo", pc.getFecha_fallo());
		datos.put("fecha_llegada_equipo", pc.getFecha_llegada_equipo());
		datos.put("licitacion", pc.getLicitacion());
		datos.put("creado_por", pc.getCreado_por());
		datos.put("MARCAS_EQUIPOS_id", pc.getMarcas_equipos_id());
		datos.put("MODELOS_EQUIPOS_id", pc.getModelos_equipos_id());
		datos.put("CLIENTES_id", pc.getClientes_id());		
		datos.put("CONTACTOS_id", pc.getContactos_id());

		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public Precotizacion actualizar(Precotizacion pc) throws DataAccessException {
		jdbcTemplate.update("UPDATE PRECOTIZACIONES SET  "
				+ "origen=?, descripcion = ?, comentarios = ?, fecha_requiere_cotizacion = ?, "
				+ "fecha_estimada_logro = ?, fecha_junta_aclara = ?, fecha_propuesta = ?, "
				+ "fecha_fallo = ?, fecha_llegada_equipo = ?, licitacion = ?, modificado_por = ?, MARCAS_EQUIPOS_id = ?, MODELOS_EQUIPOS_id = ?, "
				+ "CLIENTES_id = ?, CONTACTOS_id = ? WHERE id = ? ", pc.getOrigen(), pc.getDescripcion(), pc.getComentarios(),
				pc.getFecha_requiere_cotizacion(), pc.getFecha_estimada_logro(), pc.getFecha_junta_aclara(),
				pc.getFecha_propuesta(), pc.getFecha_fallo(), pc.getFecha_llegada_equipo(), pc.getLicitacion(),
				pc.getModificado_por(), pc.getMarcas_equipos_id(), pc.getModelos_equipos_id(), pc.getClientes_id(),
				pc.getContactos_id(), pc.getId());
		return pc;
	}
	
	@Override
	public PrecotizacionVista buscar(int id) throws DataAccessException {
		PrecotizacionVista pcv = jdbcTemplate.queryForObject("SELECT * FROM PRECOTIZACIONES_V WHERE id = ?",
				new PrecotizacionVistaRM(), id);
		return pcv;
	}

	@Override
	public List<PrecotizacionVista> consultar() throws DataAccessException {
		List<PrecotizacionVista> prec = jdbcTemplate.query("SELECT * FROM PRECOTIZACIONES_V", 
				new PrecotizacionVistaRM());
		return prec;
	}

	@Override
	public ModeloEquipo buscarModeloPorPrecotizacion(int id) {
		ModeloEquipo mepv = jdbcTemplate.queryForObject("SELECT * FROM MODELOS_EQUIPOS "
				+ "WHERE id = (SELECT MODELOS_EQUIPOS_id FROM PRECOTIZACIONES WHERE "
				+ "id =  ?)", new ModeloEquipoRM(), id);
		return mepv;
	}

	@Override
	public MarcaEquipo buscarMarcaPorPrecotizacion(int id) {
		MarcaEquipo mapv = jdbcTemplate.queryForObject("SELECT * FROM MARCAS_EQUIPOS "
				+ "WHERE id = (SELECT MARCAS_EQUIPOS_id FROM PRECOTIZACIONES WHERE "
				+ "id =  ?)", new MarcaEquipoRM(), id);
		return mapv;
	}

	@Override
	public List<Integer> aniosPrec() throws DataAccessException{
		List<Integer> p = jdbcTemplate.queryForList("SELECT DISTINCT(anio) FROM PRECOTIZACIONES ORDER BY anio DESC", 
				Integer.class);
		return p;
	}

	@Override
	public List<PrecotizacionVista> precAnio(int anio) throws DataAccessException{
		List<PrecotizacionVista> pa = jdbcTemplate.query("SELECT * FROM PRECOTIZACIONES_V WHERE anio=?", 
				new PrecotizacionVistaRM(), anio);
		return pa;
	}

	@Override
	public PrecotizacionVista buscarPrecotizacion(String numeroPrecotizacion) {
		PrecotizacionVista pv = jdbcTemplate.queryForObject("SELECT * FROM PRECOTIZACIONES_V WHERE numero_precotizacion=?", 
				new PrecotizacionVistaRM(), numeroPrecotizacion);
		return pv;
	}
}
