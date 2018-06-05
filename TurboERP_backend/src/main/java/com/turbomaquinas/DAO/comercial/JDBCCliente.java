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

import com.turbomaquinas.POJO.comercial.Cliente;
import com.turbomaquinas.POJO.comercial.ClienteVista;

@Repository
public class JDBCCliente implements ClienteDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int crear(Cliente c) throws DataAccessException {
		SimpleJdbcInsert insert = new  SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		columnas.add("nombre_fiscal");
		columnas.add("direccion_fiscal");
		columnas.add("colonia_fiscal");
		columnas.add("codigo_postal_fiscal");
		columnas.add("rfc");
		columnas.add("dias_credito");
		columnas.add("nombre_comercial");
		columnas.add("direccion_planta");
		columnas.add("colonia_planta");
		columnas.add("creado_por");
		columnas.add("CIUDADES_id");
		columnas.add("GIROS_id");
		columnas.add("PERSONAL_id");
		columnas.add("CIUDAD_COMERCIAL_id");
		
		insert.setTableName("CLIENTES");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		datos.put("nombre_fiscal", c.getNombre_fiscal());
		datos.put("direccion_fiscal", c.getDireccion_fiscal());
		datos.put("colonia_fiscal", c.getColonia_fiscal());
		datos.put("codigo_postal_fiscal", c.getCodigo_postal_fiscal());
		datos.put("rfc", c.getRfc());
		datos.put("dias_credito", c.getDias_credito());
		datos.put("nombre_comercial", c.getNombre_comercial());
		datos.put("direccion_planta", c.getDireccion_planta());
		datos.put("colonia_planta", c.getColonia_planta());
		datos.put("creado_por", c.getCreado_por());
		datos.put("CIUDADES_id", c.getCiudades_id());
		datos.put("GIROS_id", c.getGiros_id());
		datos.put("PERSONAL_id", c.getPersonal_id());
		datos.put("CIUDAD_COMERCIAL_id", c.getCiudad_comercial_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public Cliente actualizar(Cliente c) throws DataAccessException {
		jdbcTemplate.update("UPDATE CLIENTES set nombre_fiscal = ?, direccion_fiscal = ?, colonia_fiscal = ?,"
				+ "codigo_postal_fiscal = ?, rfc = ?, dias_credito = ?, nombre_comercial = ?, direccion_planta = ?, "
				+ "colonia_planta = ?, modificado_por = ?, PERSONAL_id = ?, GIROS_id = ?, CIUDADES_id =?, CIUDAD_COMERCIAL_id = ? "
				+ "WHERE id = ?", c.getNombre_fiscal(),
				c.getDireccion_fiscal(), c.getColonia_fiscal(),	c.getCodigo_postal_fiscal(), c.getRfc(), c.getDias_credito(), 
				c.getNombre_comercial(), c.getDireccion_planta(), c.getColonia_planta(), c.getModificado_por(), c.getPersonal_id(), 
				c.getGiros_id(), c.getCiudades_id(), c.getCiudad_comercial_id(), c.getId());
		return c;
	}
	
	@Override
	public ClienteVista buscar(int id) throws DataAccessException {
		ClienteVista cbv = jdbcTemplate.queryForObject("SELECT * FROM CLIENTES_V WHERE id = ?",
				new ClienteVistaRM(), id);
		return cbv;
	}

	@Override
	public List<ClienteVista> consultar() throws DataAccessException{
		List<ClienteVista> ctesv = jdbcTemplate.query("SELECT * FROM CLIENTES_V",
				new ClienteVistaRM());
		return ctesv;
	}

	@Override
	public ClienteVista buscar(int numero_giro, int numero) throws DataAccessException {
		ClienteVista c = jdbcTemplate.queryForObject("SELECT * FROM CLIENTES_V WHERE num_giro = ? AND numero = ?",
				new ClienteVistaRM(), numero_giro, numero);
		return c;
	}
	
	@Override
	public ClienteVista buscarClientePorPrecotizacion(int id) throws DataAccessException{
		ClienteVista cv = jdbcTemplate.queryForObject("SELECT * FROM CLIENTES_V WHERE id = (SELECT CLIENTES_id FROM PRECOTIZACIONES WHERE id = "
				+ "(SELECT PRECOTIZACIONES_id FROM COTIZACIONES WHERE id = ?))", new ClienteVistaRM(), id);
		return cv;
	}

	@Override
	public ClienteVista buscarClientePorOrden(int id) throws DataAccessException {
		ClienteVista cv = jdbcTemplate.queryForObject("SELECT * FROM CLIENTES_V WHERE id = (SELECT CLIENTES_id FROM ORDENES WHERE id = "
				+ "(SELECT ORDENES_id FROM COTIZACIONES WHERE id = ?))", new ClienteVistaRM(), id);
		return cv;
	}

	@Override
	public String buscarTipoCliente(int id) throws DataAccessException {
		String tipo = jdbcTemplate.queryForObject("SELECT TIPOFACTURA_CLIENTE(?)", String.class, id);
		return tipo;
	}
}
