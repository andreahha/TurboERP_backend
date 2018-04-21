package com.turbomaquinas.DAO.general;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.general.OrdenVista;

public class OrdenVistaRM implements RowMapper<OrdenVista>{

	@Override
	public OrdenVista mapRow(ResultSet rs, int i) throws SQLException {
		OrdenVista ov = new OrdenVista();
		ov.setId(rs.getInt("id"));
		ov.setNumero(rs.getInt("numero"));
		ov.setAnio(rs.getInt("anio"));
		ov.setNumero_orden(rs.getString("numero_orden"));
		ov.setDescripcion(rs.getString("descripcion"));
		ov.setEstado(rs.getString("estado"));
		ov.setTipo(rs.getString("tipo"));
		ov.setMoneda(rs.getString("moneda"));
		ov.setCreado_por(rs.getInt("creado_por"));
		ov.setCreado(rs.getDate("creado"));
		ov.setImporte_cotizado(rs.getFloat("importe_cotizado"));
		ov.setImporte_autorizado(rs.getFloat("importe_autorizado"));
		ov.setImporte_bajas(rs.getFloat("importe_bajas"));
		ov.setImporte_facturado(rs.getFloat("importe_facturado"));
		ov.setImporte_descuento(rs.getFloat("importe_descuento"));
		ov.setImporte_pedido(rs.getFloat("importe_pedido"));
		ov.setAlfresco_id_OIT(rs.getString("alfresco_id_OIT"));
		ov.setClientes_id(rs.getInt("clientes_id"));
		ov.setCliente_no(rs.getInt("cliente_no"));
		ov.setNombre_fiscal(rs.getString("nombre_fiscal"));
		ov.setNombre_comercial(rs.getString("nombre_comercial"));
		ov.setGiro(rs.getString("giro"));
		ov.setMarcas_equipos_id(rs.getInt("marcas_equipos_id"));
		ov.setMarca_equipo(rs.getString("marca_equipo"));
		ov.setModelos_equipos_id(rs.getInt("modelos_equipos_id"));
		ov.setModelo_equipo(rs.getString("modelo_equipo"));
		ov.setCliente(rs.getString("cliente"));
		return ov;
	}

}
