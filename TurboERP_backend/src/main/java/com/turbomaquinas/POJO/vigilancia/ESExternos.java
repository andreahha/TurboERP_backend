package com.turbomaquinas.POJO.vigilancia;

import java.sql.Date;
import java.sql.Time;

public class ESExternos {
	
	private int id;
	private String nombre_persona;
	private String compania;
	private Date fecha_entrada;
	private Time hora_entrada;
	private String tipo;
	private String descripcion_visita;
	private Date fecha_salida;
	private Time hora_salida;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int personal_id_visita;
	private int personal_id_entrada;
	private String iden_alfresco_id;

	public ESExternos() {
		super();
	}

	public ESExternos(int id, String nombre_persona, String compania, Date fecha_entrada, Time hora_entrada,
			String tipo, String descripcion_visita, Date fecha_salida, Time hora_salida, int activo, int creado_por,
			Date creado, int modificado_por, Date modificado, int personal_id_visita, int personal_id_entrada,
			String iden_alfresco_id) {
		super();
		this.id = id;
		this.nombre_persona = nombre_persona;
		this.compania = compania;
		this.fecha_entrada = fecha_entrada;
		this.hora_entrada = hora_entrada;
		this.tipo = tipo;
		this.descripcion_visita = descripcion_visita;
		this.fecha_salida = fecha_salida;
		this.hora_salida = hora_salida;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.personal_id_visita = personal_id_visita;
		this.personal_id_entrada = personal_id_entrada;
		this.iden_alfresco_id = iden_alfresco_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_persona() {
		return nombre_persona;
	}

	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public Date getFecha_entrada() {
		return fecha_entrada;
	}

	public void setFecha_entrada(Date fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}

	public Time getHora_entrada() {
		return hora_entrada;
	}

	public void setHora_entrada(Time hora_entrada) {
		this.hora_entrada = hora_entrada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion_visita() {
		return descripcion_visita;
	}

	public void setDescripcion_visita(String descripcion_visita) {
		this.descripcion_visita = descripcion_visita;
	}

	public Date getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public Time getHora_salida() {
		return hora_salida;
	}

	public void setHora_salida(Time hora_salida) {
		this.hora_salida = hora_salida;
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

	public int getPersonal_id_visita() {
		return personal_id_visita;
	}

	public void setPersonal_id_visita(int personal_id_visita) {
		this.personal_id_visita = personal_id_visita;
	}

	public int getPersonal_id_entrada() {
		return personal_id_entrada;
	}

	public void setPersonal_id_entrada(int personal_id_entrada) {
		this.personal_id_entrada = personal_id_entrada;
	}

	public String getIden_alfresco_id() {
		return iden_alfresco_id;
	}

	public void setIden_alfresco_id(String iden_alfresco_id) {
		this.iden_alfresco_id = iden_alfresco_id;
	}
}
