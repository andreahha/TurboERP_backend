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

import com.turbomaquinas.POJO.comercial.Pedido;

@Repository
public class JDBCPedido implements PedidoDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(Pedido p) throws DataAccessException {
		
		
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		List<String> columnas = new ArrayList<>();
		
		columnas.add("numero");
		columnas.add("fecha_pedido");
		columnas.add("comentarios");
		columnas.add("importe");
		columnas.add("revision");
		columnas.add("activo");
		columnas.add("creado_por");
		columnas.add("alfresco_id");
		columnas.add("CLIENTES_id");
		
		insert.setTableName("PEDIDOS");
		insert.setColumnNames(columnas);
		
		Map<String, Object> datos = new HashMap<>();
		
		datos.put("numero", p.getNumero());
		datos.put("fecha_pedido", p.getFecha_pedido());
		datos.put("comentarios", p.getComentarios());
		datos.put("importe", p.getImporte());
		datos.put("revision", p.getRevision());
		datos.put("activo", p.getActivo());
		datos.put("creado_por", p.getCreado_por());
		datos.put("alfresco_id", p.getAlfresco_id());
		datos.put("CLIENTES_id", p.getClientes_id());
		
		insert.setGeneratedKeyName("id");
		Number id = insert.executeAndReturnKey(datos);
		
		return id.intValue();
	}

	@Override
	public Pedido actualizar(Pedido p) throws DataAccessException {
		jdbcTemplate.update("UPDATE PEDIDOS SET comentarios = ?, sustituye_id = ?, modificado_por = ?, alfresco_id = ? "
				+ "WHERE id = ?",p.getComentarios(), p.getSustituye_id(), p.getModificado_por(), p.getAlfresco_id(), p.getId());
		return p;
	}

	@Override
	public Pedido buscar(int id) throws DataAccessException {
		Pedido pb = jdbcTemplate.queryForObject("SELECT * FROM PEDIDOS WHERE id = ?", 
				new PedidoRM(), id);
		return pb;
	}

	@Override
	public List<Pedido> consultar() throws DataAccessException {
		List<Pedido> pl = jdbcTemplate.query("SELECT * FROM PEDIDOS", new PedidoRM());
		return pl;
	}

	@Override
	public List<Integer> anioPedidos(int clienteId) throws DataAccessException {
		List<Integer> o = jdbcTemplate.queryForList("SELECT DISTINCT(YEAR(fecha_pedido)) anio FROM PEDIDOS WHERE CLIENTES_id = ? ORDER BY anio DESC", 
				Integer.class, clienteId);
		return o;
	}

	@Override
	public List<Pedido> pedidosAnio(int clienteId, int anio) throws DataAccessException {
		List<Pedido> p = jdbcTemplate.query("SELECT * FROM PEDIDOS WHERE CLIENTES_id =? AND YEAR(fecha_pedido) =?", 
				new PedidoRM(), clienteId, anio);
		return p;
	}

	@Override
	public List<Pedido> pedidosAAPorOrden(int id) throws DataAccessException{
		String sql = "SELECT * FROM PEDIDOS P WHERE P.id IN "
				+ "(SELECT PEDIDOS_id FROM ACTIVIDADES_AUTORIZADAS AA WHERE (AA.AUTORIZACIONES_id IN "
				+ "(SELECT id FROM AUTORIZACIONES WHERE ORDENES_id=?)) AND (AA.PEDIDOS_id>0))";
		List<Pedido> p = jdbcTemplate.query(sql, new PedidoRM(), id);
		return p;
	}

}
