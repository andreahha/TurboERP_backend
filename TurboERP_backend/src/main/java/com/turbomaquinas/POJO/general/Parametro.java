package com.turbomaquinas.POJO.general;

import java.util.Date;

public class Parametro {
	
	private int id;
	private int mes_proceso_co;
	private int anio_proceso_co;
	private int activo;
	private int usuario_ultimo_cierre_co;
	private Date fecha_ultimo_cierre_co;
	private float ajuste_total_tc;
	private float diferencia_tc_pagos;
	
	public Parametro() {
		super();
	}

	public Parametro(int id, int mes_proceso_co, int anio_proceso_co, int activo, int usuario_ultimo_cierre_co,
			Date fecha_ultimo_cierre_co, float ajuste_total_tc, float diferencia_tc_pagos) {
		super();
		this.id = id;
		this.mes_proceso_co = mes_proceso_co;
		this.anio_proceso_co = anio_proceso_co;
		this.activo = activo;
		this.usuario_ultimo_cierre_co = usuario_ultimo_cierre_co;
		this.fecha_ultimo_cierre_co = fecha_ultimo_cierre_co;
		this.ajuste_total_tc = ajuste_total_tc;
		this.diferencia_tc_pagos = diferencia_tc_pagos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMes_proceso_co() {
		return mes_proceso_co;
	}

	public void setMes_proceso_co(int mes_proceso_co) {
		this.mes_proceso_co = mes_proceso_co;
	}

	public int getAnio_proceso_co() {
		return anio_proceso_co;
	}

	public void setAnio_proceso_co(int anio_proceso_co) {
		this.anio_proceso_co = anio_proceso_co;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getUsuario_ultimo_cierre_co() {
		return usuario_ultimo_cierre_co;
	}

	public void setUsuario_ultimo_cierre_co(int usuario_ultimo_cierre_co) {
		this.usuario_ultimo_cierre_co = usuario_ultimo_cierre_co;
	}

	public Date getFecha_ultimo_cierre_co() {
		return fecha_ultimo_cierre_co;
	}

	public void setFecha_ultimo_cierre_co(Date fecha_ultimo_cierre_co) {
		this.fecha_ultimo_cierre_co = fecha_ultimo_cierre_co;
	}

	public float getAjuste_total_tc() {
		return ajuste_total_tc;
	}

	public void setAjuste_total_tc(float ajuste_total_tc) {
		this.ajuste_total_tc = ajuste_total_tc;
	}

	public float getDiferencia_tc_pagos() {
		return diferencia_tc_pagos;
	}

	public void setDiferencia_tc_pagos(float diferencia_tc_pagos) {
		this.diferencia_tc_pagos = diferencia_tc_pagos;
	}

	
}
