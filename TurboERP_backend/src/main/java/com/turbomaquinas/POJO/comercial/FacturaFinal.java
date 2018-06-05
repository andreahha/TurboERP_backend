package com.turbomaquinas.POJO.comercial;

import java.math.BigDecimal;
import java.util.Date;

public class FacturaFinal {

	private int id;
	private String tipo;
	private int numero;
	private Date fecha_factura;
	private Date fecha_vencimiento;
	private BigDecimal subtotal;
	private BigDecimal descuento;
	private BigDecimal iva;
	private BigDecimal importe_anticipo;
	private BigDecimal iva_retenido;
	private BigDecimal total;
	private BigDecimal importe_pagado;
	private BigDecimal saldo;
	private String comentario;
	private String moneda;
	private float tipo_cambio;
	private String condiciones_pago;
	private Date fecha_baja;
	private int mes_baja;
	private int anio_baja;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private ComprobanteRelacionado comprobantes_relacionados;
	private int datos_timbrado_id;
	private int formas_pago_id;
	private int metodos_pago_id;
	private int uso_cfdi_id;
	private int clientes_id;
	private Orden ordenes;
	private String estado;
	private int descuento_neto;

	public FacturaFinal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FacturaFinal(int id, String tipo, int numero, Date fecha_factura, Date fecha_vencimiento,
			BigDecimal subtotal, BigDecimal descuento, BigDecimal iva, BigDecimal importe_anticipo,
			BigDecimal iva_retenido, BigDecimal total, BigDecimal importe_pagado, BigDecimal saldo, String comentario,
			String moneda, float tipo_cambio, String condiciones_pago, Date fecha_baja, int mes_baja, int anio_baja,
			int activo, int creado_por, Date creado, int modificado_por, Date modificado,
			ComprobanteRelacionado comprobantes_relacionados, int datos_timbrado_id, int formas_pago_id,
			int metodos_pago_id, int uso_cfdi_id, int clientes_id, Orden ordenes, String estado, int descuento_neto) {
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
		this.comentario = comentario;
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
		this.comprobantes_relacionados = comprobantes_relacionados;
		this.datos_timbrado_id = datos_timbrado_id;
		this.formas_pago_id = formas_pago_id;
		this.metodos_pago_id = metodos_pago_id;
		this.uso_cfdi_id = uso_cfdi_id;
		this.clientes_id = clientes_id;
		this.ordenes = ordenes;
		this.estado = estado;
		this.descuento_neto = descuento_neto;
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

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	public BigDecimal getIva() {
		return iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	public BigDecimal getImporte_anticipo() {
		return importe_anticipo;
	}

	public void setImporte_anticipo(BigDecimal importe_anticipo) {
		this.importe_anticipo = importe_anticipo;
	}

	public BigDecimal getIva_retenido() {
		return iva_retenido;
	}

	public void setIva_retenido(BigDecimal iva_retenido) {
		this.iva_retenido = iva_retenido;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
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

	public ComprobanteRelacionado getComprobantes_relacionados() {
		return comprobantes_relacionados;
	}

	public void setComprobantes_relacionados(ComprobanteRelacionado comprobantes_relacionados) {
		this.comprobantes_relacionados = comprobantes_relacionados;
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

	public Orden getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(Orden ordenes) {
		this.ordenes = ordenes;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getDescuento_neto() {
		return descuento_neto;
	}

	public void setDescuento_neto(int descuento_neto) {
		this.descuento_neto = descuento_neto;
	}

	public static class ComprobanteRelacionado {
		private String tipo_relacion;
		private int comprobantes [];
		
		public ComprobanteRelacionado() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ComprobanteRelacionado(String tipo_relacion, int[] comprobantes) {
			super();
			this.tipo_relacion = tipo_relacion;
			this.comprobantes = comprobantes;
		}

		public String getTipo_relacion() {
			return tipo_relacion;
		}

		public void setTipo_relacion(String tipo_relacion) {
			this.tipo_relacion = tipo_relacion;
		}

		public int[] getComprobantes() {
			return comprobantes;
		}

		public void setComprobantes(int[] comprobantes) {
			this.comprobantes = comprobantes;
		}
	
	}
	
	public static class Orden {
		private int id;
		private float tipo_cambio;
		private float tipo_cambio_calculado;
	
		public Orden() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Orden(int id, float tipo_cambio, float tipo_cambio_calculado) {
			super();
			this.id = id;
			this.tipo_cambio = tipo_cambio;
			this.tipo_cambio_calculado = tipo_cambio_calculado;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public float getTipo_cambio() {
			return tipo_cambio;
		}

		public void setTipo_cambio(float tipo_cambio) {
			this.tipo_cambio = tipo_cambio;
		}

		public float getTipo_cambio_calculado() {
			return tipo_cambio_calculado;
		}

		public void setTipo_cambio_calculado(float tipo_cambio_calculado) {
			this.tipo_cambio_calculado = tipo_cambio_calculado;
		}
		
	}
		
}
