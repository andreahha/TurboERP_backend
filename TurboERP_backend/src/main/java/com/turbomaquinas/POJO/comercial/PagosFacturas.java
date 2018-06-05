package com.turbomaquinas.POJO.comercial;

import java.math.BigDecimal;

public class PagosFacturas {
	
	private int pago_id;
	private int folio;
	private int factura_id;
	private BigDecimal total;
	private String tipo;
	private int numero;
	private String moneda;
	private BigDecimal importe_pagado;
	private BigDecimal saldo;
	private int cliente_id;
	
	public PagosFacturas() {
		super();
	}

	public PagosFacturas(int pago_id, int folio, int factura_id, BigDecimal total, String tipo, int numero,
			String moneda, BigDecimal importe_pagado, BigDecimal saldo, int cliente_id) {
		super();
		this.pago_id = pago_id;
		this.folio = folio;
		this.factura_id = factura_id;
		this.total = total;
		this.tipo = tipo;
		this.numero = numero;
		this.moneda = moneda;
		this.importe_pagado = importe_pagado;
		this.saldo = saldo;
		this.cliente_id = cliente_id;
	}

	public int getPago_id() {
		return pago_id;
	}

	public void setPago_id(int pago_id) {
		this.pago_id = pago_id;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public int getFactura_id() {
		return factura_id;
	}

	public void setFactura_id(int factura_id) {
		this.factura_id = factura_id;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public BigDecimal getImporte_pagado() {
		return importe_pagado;
	}

	public void setImporte_pagado(BigDecimal importe_pagado) {
		this.importe_pagado = importe_pagado;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	
}
