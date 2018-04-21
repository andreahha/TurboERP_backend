package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class FacturaFinal {

	public int id;
	public String tipo;
	public int numero;
	public Date fecha_factura;
	public Date fecha_vencimiento;
	public float subtotal;
	public float descuento;
	public float iva;
	public float importe_anticipo;
	public float iva_retenido;
	public float total;
	public float importe_pagado;
	public float saldo;
	public String moneda;
	public float tipo_cambio;
	public String condiciones_pago;
	public Date fecha_baja;
	public int mes_baja;
	public int anio_baja;
	public int activo;
	public int creado_por;
	public Date creado;
	public int modificado_por;
	public Date modificado;
	public int factura_final_id_sust;
	public int datos_timbrado_id;
	public int formas_pago_id;
	public int metodos_pago_id;
	public int uso_cfdi_id;
	private int clientes_id;
	
	public FacturaFinal() {
		super();
	}

	public FacturaFinal(int id, String tipo, int numero, Date fecha_factura, Date fecha_vencimiento, float subtotal,
			float descuento, float iva, float importe_anticipo, float iva_retenido, float total, float importe_pagado,
			float saldo, String moneda, float tipo_cambio, String condiciones_pago, Date fecha_baja, int mes_baja,
			int anio_baja, int activo, int creado_por, Date creado, int modificado_por, Date modificado,
			int factura_final_id_sust, int datos_timbrado_id, int formas_pago_id, int metodos_pago_id, int uso_cfdi_id,
			int clientes_id) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.numero = numero;
		this.fecha_factura = fecha_factura;
		this.fecha_vencimiento = fecha_vencimiento;
		this.subtotal = subtotal;
		this.descuento = descuento;
		this.iva = iva;
		this.importe_anticipo = importe_anticipo;
		this.iva_retenido = iva_retenido;
		this.total = total;
		this.importe_pagado = importe_pagado;
		this.saldo = saldo;
		this.moneda = moneda;
		this.tipo_cambio = tipo_cambio;
		this.condiciones_pago = condiciones_pago;
		this.fecha_baja = fecha_baja;
		this.mes_baja = mes_baja;
		this.anio_baja = anio_baja;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.factura_final_id_sust = factura_final_id_sust;
		this.datos_timbrado_id = datos_timbrado_id;
		this.formas_pago_id = formas_pago_id;
		this.metodos_pago_id = metodos_pago_id;
		this.uso_cfdi_id = uso_cfdi_id;
		this.clientes_id = clientes_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getFecha_factura() {
		return fecha_factura;
	}

	public void setFecha_factura(Date fecha_factura) {
		this.fecha_factura = fecha_factura;
	}

	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public float getImporte_anticipo() {
		return importe_anticipo;
	}

	public void setImporte_anticipo(float importe_anticipo) {
		this.importe_anticipo = importe_anticipo;
	}

	public float getIva_retenido() {
		return iva_retenido;
	}

	public void setIva_retenido(float iva_retenido) {
		this.iva_retenido = iva_retenido;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getImporte_pagado() {
		return importe_pagado;
	}

	public void setImporte_pagado(float importe_pagado) {
		this.importe_pagado = importe_pagado;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public float getTipo_cambio() {
		return tipo_cambio;
	}

	public void setTipo_cambio(float tipo_cambio) {
		this.tipo_cambio = tipo_cambio;
	}

	public String getCondiciones_pago() {
		return condiciones_pago;
	}

	public void setCondiciones_pago(String condiciones_pago) {
		this.condiciones_pago = condiciones_pago;
	}

	public Date getFecha_baja() {
		return fecha_baja;
	}

	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}

	public int getMes_baja() {
		return mes_baja;
	}

	public void setMes_baja(int mes_baja) {
		this.mes_baja = mes_baja;
	}

	public int getAnio_baja() {
		return anio_baja;
	}

	public void setAnio_baja(int anio_baja) {
		this.anio_baja = anio_baja;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getCreado_por() {
		return creado_por;
	}

	public void setCreado_por(int creado_por) {
		this.creado_por = creado_por;
	}

	public Date getCreado() {
		return creado;
	}

	public void setCreado(Date creado) {
		this.creado = creado;
	}

	public int getModificado_por() {
		return modificado_por;
	}

	public void setModificado_por(int modificado_por) {
		this.modificado_por = modificado_por;
	}

	public Date getModificado() {
		return modificado;
	}

	public void setModificado(Date modificado) {
		this.modificado = modificado;
	}

	public int getFactura_final_id_sust() {
		return factura_final_id_sust;
	}

	public void setFactura_final_id_sust(int factura_final_id_sust) {
		this.factura_final_id_sust = factura_final_id_sust;
	}

	public int getDatos_timbrado_id() {
		return datos_timbrado_id;
	}

	public void setDatos_timbrado_id(int datos_timbrado_id) {
		this.datos_timbrado_id = datos_timbrado_id;
	}

	public int getFormas_pago_id() {
		return formas_pago_id;
	}

	public void setFormas_pago_id(int formas_pago_id) {
		this.formas_pago_id = formas_pago_id;
	}

	public int getMetodos_pago_id() {
		return metodos_pago_id;
	}

	public void setMetodos_pago_id(int metodos_pago_id) {
		this.metodos_pago_id = metodos_pago_id;
	}

	public int getUso_cfdi_id() {
		return uso_cfdi_id;
	}

	public void setUso_cfdi_id(int uso_cfdi_id) {
		this.uso_cfdi_id = uso_cfdi_id;
	}

	public int getClientes_id() {
		return clientes_id;
	}

	public void setClientes_id(int clientes_id) {
		this.clientes_id = clientes_id;
	}
}
