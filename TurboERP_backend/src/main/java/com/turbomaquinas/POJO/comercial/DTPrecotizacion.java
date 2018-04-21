package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class DTPrecotizacion {
	
	private int id;
	private String presion_de_entrada;
	private String presion_de_salida;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private String temperatura_salida;
	private String temperatura_entrada;
	private float capacidad_hp;
	private float capacida_mw;
	private String velocidad_critica;
	private String velocidad_operacion;
	private String velocidad_disparo;
	private String capacidad_flujo;
	private String serie;
	private String peso_rotor;
	private String fluido;
	private int precotizaciones_id;
	
	public DTPrecotizacion() {
		super();
	}

	public DTPrecotizacion(int id, String presion_de_entrada, String presion_de_salida, int activo, int creado_por,
			Date creado, int modificado_por, Date modificado, String temperatura_salida, String temperatura_entrada,
			int capacidad_hp, int capacida_mw, String velocidad_critica, String velocidad_operacion,
			String velocidad_disparo, String capacidad_flujo, String serie, String peso_rotor, String fluido,
			int precotizaciones_id) {
		this.id = id;
		this.presion_de_entrada = presion_de_entrada;
		this.presion_de_salida = presion_de_salida;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.temperatura_salida = temperatura_salida;
		this.temperatura_entrada = temperatura_entrada;
		this.capacidad_hp = capacidad_hp;
		this.capacida_mw = capacida_mw;
		this.velocidad_critica = velocidad_critica;
		this.velocidad_operacion = velocidad_operacion;
		this.velocidad_disparo = velocidad_disparo;
		this.capacidad_flujo = capacidad_flujo;
		this.serie = serie;
		this.peso_rotor = peso_rotor;
		this.fluido = fluido;
		this.precotizaciones_id = precotizaciones_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPresion_de_entrada() {
		return presion_de_entrada;
	}

	public void setPresion_de_entrada(String presion_de_entrada) {
		this.presion_de_entrada = presion_de_entrada;
	}

	public String getPresion_de_salida() {
		return presion_de_salida;
	}

	public void setPresion_de_salida(String presion_de_salida) {
		this.presion_de_salida = presion_de_salida;
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

	public String getTemperatura_salida() {
		return temperatura_salida;
	}

	public void setTemperatura_salida(String temperatura_salida) {
		this.temperatura_salida = temperatura_salida;
	}

	public String getTemperatura_entrada() {
		return temperatura_entrada;
	}

	public void setTemperatura_entrada(String temperatura_entrada) {
		this.temperatura_entrada = temperatura_entrada;
	}

	public float getCapacidad_hp() {
		return capacidad_hp;
	}

	public void setCapacidad_hp(float capacidad_hp) {
		this.capacidad_hp = capacidad_hp;
	}

	public float getCapacida_mw() {
		return capacida_mw;
	}

	public void setCapacida_mw(float capacida_mw) {
		this.capacida_mw = capacida_mw;
	}

	public String getVelocidad_critica() {
		return velocidad_critica;
	}

	public void setVelocidad_critica(String velocidad_critica) {
		this.velocidad_critica = velocidad_critica;
	}

	public String getVelocidad_operacion() {
		return velocidad_operacion;
	}

	public void setVelocidad_operacion(String velocidad_operacion) {
		this.velocidad_operacion = velocidad_operacion;
	}

	public String getVelocidad_disparo() {
		return velocidad_disparo;
	}

	public void setVelocidad_disparo(String velocidad_disparo) {
		this.velocidad_disparo = velocidad_disparo;
	}

	public String getCapacidad_flujo() {
		return capacidad_flujo;
	}

	public void setCapacidad_flujo(String capacidad_flujo) {
		this.capacidad_flujo = capacidad_flujo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getPeso_rotor() {
		return peso_rotor;
	}

	public void setPeso_rotor(String peso_rotor) {
		this.peso_rotor = peso_rotor;
	}

	public String getFluido() {
		return fluido;
	}

	public void setFluido(String fluido) {
		this.fluido = fluido;
	}

	public int getPrecotizaciones_id() {
		return precotizaciones_id;
	}

	public void setPrecotizaciones_id(int precotizaciones_id) {
		this.precotizaciones_id = precotizaciones_id;
	}

	@Override
	public String toString() {
		return "DTPrecotizacion [id=" + id + ", presion_de_entrada=" + presion_de_entrada + ", presion_de_salida="
				+ presion_de_salida + ", activo=" + activo + ", creado_por=" + creado_por + ", creado=" + creado
				+ ", modificado_por=" + modificado_por + ", modificado=" + modificado + ", temperatura_salida="
				+ temperatura_salida + ", temperatura_entrada=" + temperatura_entrada + ", capacidad_hp=" + capacidad_hp
				+ ", capacida_mw=" + capacida_mw + ", velocidad_critica=" + velocidad_critica + ", velocidad_operacion="
				+ velocidad_operacion + ", velocidad_disparo=" + velocidad_disparo + ", capacidad_flujo="
				+ capacidad_flujo + ", serie=" + serie + ", peso_rotor=" + peso_rotor + ", fluido=" + fluido
				+ ", precotizaciones_id=" + precotizaciones_id + "]";
	}

	
}
