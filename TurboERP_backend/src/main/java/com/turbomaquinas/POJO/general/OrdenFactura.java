package com.turbomaquinas.POJO.general;

import java.math.BigDecimal;

public class OrdenFactura {
	public int id_orden;
	public String numero_orden;
	public String descripcion;
	public int id_cliente;
	public String nombre_fiscal;
	public int id_cliente_facturar;
	public String nombre_fiscal_facturar;
	public String moneda_facturar;
	public BigDecimal importe_cotizado_facturar;
	public BigDecimal importe_autorizado_facturar;
	public BigDecimal importe_bajas_facturar;
	public BigDecimal importe_anticipo_facturar;
	public BigDecimal importe_facturado_facturar;
	public BigDecimal importe_descuento_facturar;
	public BigDecimal importe_pagado_facturar;
	public BigDecimal importe_pedido_facturar;
	public BigDecimal importe_pendiente_facturar;
	public BigDecimal tipo_cambio;
	public BigDecimal tipo_cambio_calculado;
	public BigDecimal importe_pendiente_pago_facturar;
	
	public OrdenFactura() {
		super();
	}

	public OrdenFactura(int id_orden, String numero_orden, String descripcion, int id_cliente, String nombre_fiscal,
			int id_cliente_facturar, String nombre_fiscal_facturar, String moneda_facturar,
			BigDecimal importe_cotizado_facturar, BigDecimal importe_autorizado_facturar,
			BigDecimal importe_bajas_facturar, BigDecimal importe_anticipo_facturar,
			BigDecimal importe_facturado_facturar, BigDecimal importe_descuento_facturar,
			BigDecimal importe_pagado_facturar, BigDecimal importe_pedido_facturar,
			BigDecimal importe_pendiente_facturar, BigDecimal tipo_cambio, BigDecimal tipo_cambio_calculado,
			BigDecimal importe_pendiente_pago_facturar) {
		super();
		this.id_orden = id_orden;
		this.numero_orden = numero_orden;
		this.descripcion = descripcion;
		this.id_cliente = id_cliente;
		this.nombre_fiscal = nombre_fiscal;
		this.id_cliente_facturar = id_cliente_facturar;
		this.nombre_fiscal_facturar = nombre_fiscal_facturar;
		this.moneda_facturar = moneda_facturar;
		this.importe_cotizado_facturar = importe_cotizado_facturar;
		this.importe_autorizado_facturar = importe_autorizado_facturar;
		this.importe_bajas_facturar = importe_bajas_facturar;
		this.importe_anticipo_facturar = importe_anticipo_facturar;
		this.importe_facturado_facturar = importe_facturado_facturar;
		this.importe_descuento_facturar = importe_descuento_facturar;
		this.importe_pagado_facturar = importe_pagado_facturar;
		this.importe_pedido_facturar = importe_pedido_facturar;
		this.importe_pendiente_facturar = importe_pendiente_facturar;
		this.tipo_cambio = tipo_cambio;
		this.tipo_cambio_calculado = tipo_cambio_calculado;
		this.importe_pendiente_pago_facturar = importe_pendiente_pago_facturar;
	}

	public int getId_orden() {
		return id_orden;
	}

	public void setId_orden(int id_orden) {
		this.id_orden = id_orden;
	}

	public String getNumero_orden() {
		return numero_orden;
	}

	public void setNumero_orden(String numero_orden) {
		this.numero_orden = numero_orden;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre_fiscal() {
		return nombre_fiscal;
	}

	public void setNombre_fiscal(String nombre_fiscal) {
		this.nombre_fiscal = nombre_fiscal;
	}

	public int getId_cliente_facturar() {
		return id_cliente_facturar;
	}

	public void setId_cliente_facturar(int id_cliente_facturar) {
		this.id_cliente_facturar = id_cliente_facturar;
	}

	public String getNombre_fiscal_facturar() {
		return nombre_fiscal_facturar;
	}

	public void setNombre_fiscal_facturar(String nombre_fiscal_facturar) {
		this.nombre_fiscal_facturar = nombre_fiscal_facturar;
	}

	public String getMoneda_facturar() {
		return moneda_facturar;
	}

	public void setMoneda_facturar(String moneda_facturar) {
		this.moneda_facturar = moneda_facturar;
	}

	public BigDecimal getImporte_cotizado_facturar() {
		return importe_cotizado_facturar;
	}

	public void setImporte_cotizado_facturar(BigDecimal importe_cotizado_facturar) {
		this.importe_cotizado_facturar = importe_cotizado_facturar;
	}

	public BigDecimal getImporte_autorizado_facturar() {
		return importe_autorizado_facturar;
	}

	public void setImporte_autorizado_facturar(BigDecimal importe_autorizado_facturar) {
		this.importe_autorizado_facturar = importe_autorizado_facturar;
	}

	public BigDecimal getImporte_bajas_facturar() {
		return importe_bajas_facturar;
	}

	public void setImporte_bajas_facturar(BigDecimal importe_bajas_facturar) {
		this.importe_bajas_facturar = importe_bajas_facturar;
	}

	public BigDecimal getImporte_anticipo_facturar() {
		return importe_anticipo_facturar;
	}

	public void setImporte_anticipo_facturar(BigDecimal importe_anticipo_facturar) {
		this.importe_anticipo_facturar = importe_anticipo_facturar;
	}

	public BigDecimal getImporte_facturado_facturar() {
		return importe_facturado_facturar;
	}

	public void setImporte_facturado_facturar(BigDecimal importe_facturado_facturar) {
		this.importe_facturado_facturar = importe_facturado_facturar;
	}

	public BigDecimal getImporte_descuento_facturar() {
		return importe_descuento_facturar;
	}

	public void setImporte_descuento_facturar(BigDecimal importe_descuento_facturar) {
		this.importe_descuento_facturar = importe_descuento_facturar;
	}

	public BigDecimal getImporte_pagado_facturar() {
		return importe_pagado_facturar;
	}

	public void setImporte_pagado_facturar(BigDecimal importe_pagado_facturar) {
		this.importe_pagado_facturar = importe_pagado_facturar;
	}

	public BigDecimal getImporte_pedido_facturar() {
		return importe_pedido_facturar;
	}

	public void setImporte_pedido_facturar(BigDecimal importe_pedido_facturar) {
		this.importe_pedido_facturar = importe_pedido_facturar;
	}

	public BigDecimal getImporte_pendiente_facturar() {
		return importe_pendiente_facturar;
	}

	public void setImporte_pendiente_facturar(BigDecimal importe_pendiente_facturar) {
		this.importe_pendiente_facturar = importe_pendiente_facturar;
	}

	public BigDecimal getTipo_cambio() {
		return tipo_cambio;
	}

	public void setTipo_cambio(BigDecimal tipo_cambio) {
		this.tipo_cambio = tipo_cambio;
	}

	public BigDecimal getTipo_cambio_calculado() {
		return tipo_cambio_calculado;
	}

	public void setTipo_cambio_calculado(BigDecimal tipo_cambio_calculado) {
		this.tipo_cambio_calculado = tipo_cambio_calculado;
	}

	public BigDecimal getImporte_pendiente_pago_facturar() {
		return importe_pendiente_pago_facturar;
	}

	public void setImporte_pendiente_pago_facturar(BigDecimal importe_pendiente_pago_facturar) {
		this.importe_pendiente_pago_facturar = importe_pendiente_pago_facturar;
	}
		
}
