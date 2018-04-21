package com.turbomaquinas.POJO.SGC;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SolicitudCambio {	  
	private int id;
	private int numero;
	private Date fecha;
	private String titulo;
	private String descripcion;
	private String prioridad;
	private int tipo;
	private String proyecto;
	private int costo;
	private int dias;
	private Date fechaEvaluacion;
	private String afecta;
	private String trabajo;
	private int impactoEconomico;
	private int impactoTiempo;
	private String impactoAlcance;
	private String impactoCalidad;
	private String impactoRiesgo;
	private Date fechaResolucion;
	private String resolucion;
	private String comentarios;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale ="es_MX")
	private Date fechaTerminacion;
	private String completadoPor;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale ="es_MX")
	private Date fechaVerificacion;
	private int evaluadorId;
	private int activo;
	private String estado;
	private int creadoPor;
	private Date creado;
	private int modificadoPor;
	private Date modificado;
	private int departamentoId;
	private int solicitanteId;
	
	public SolicitudCambio() {
		super();
	}
	
	public SolicitudCambio(int id, int numero, Date fecha, String titulo, String descripcion, String prioridad,
			int tipo, String proyecto, int costo, int dias, Date fechaEvaluacion, String afecta, String trabajo,
			int impactoEconomico, int impactoTiempo, String impactoAlcance, String impactoCalidad, String impactoRiesgo,
			Date fechaResolucion, String resolucion, String comentarios, Date fechaTerminacion, String completadoPor,
			Date fechaVerificacion, int evaluadorId, int activo, String estado, int creadoPor, Date creado,
			int modificadoPor, Date modificado, int departamentoId, int solicitanteId) {
		super();
		this.id = id;
		this.numero = numero;
		this.fecha = fecha;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		this.tipo = tipo;
		this.proyecto = proyecto;
		this.costo = costo;
		this.dias = dias;
		this.fechaEvaluacion = fechaEvaluacion;
		this.afecta = afecta;
		this.trabajo = trabajo;
		this.impactoEconomico = impactoEconomico;
		this.impactoTiempo = impactoTiempo;
		this.impactoAlcance = impactoAlcance;
		this.impactoCalidad = impactoCalidad;
		this.impactoRiesgo = impactoRiesgo;
		this.fechaResolucion = fechaResolucion;
		this.resolucion = resolucion;
		this.comentarios = comentarios;
		this.fechaTerminacion = fechaTerminacion;
		this.completadoPor = completadoPor;
		this.fechaVerificacion = fechaVerificacion;
		this.evaluadorId = evaluadorId;
		this.activo = activo;
		this.estado = estado;
		this.creadoPor = creadoPor;
		this.creado = creado;
		this.modificadoPor = modificadoPor;
		this.modificado = modificado;
		this.departamentoId = departamentoId;
		this.solicitanteId = solicitanteId;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public Date getFechaEvaluacion() {
		return fechaEvaluacion;
	}

	public void setFechaEvaluacion(Date fechaEvaluacion) {
		this.fechaEvaluacion = fechaEvaluacion;
	}

	public String getAfecta() {
		return afecta;
	}

	public void setAfecta(String afecta) {
		this.afecta = afecta;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public int getImpactoEconomico() {
		return impactoEconomico;
	}

	public void setImpactoEconomico(int impactoEconomico) {
		this.impactoEconomico = impactoEconomico;
	}

	public int getImpactoTiempo() {
		return impactoTiempo;
	}

	public void setImpactoTiempo(int impactoTiempo) {
		this.impactoTiempo = impactoTiempo;
	}

	public String getImpactoAlcance() {
		return impactoAlcance;
	}

	public void setImpactoAlcance(String impactoAlcance) {
		this.impactoAlcance = impactoAlcance;
	}

	public String getImpactoCalidad() {
		return impactoCalidad;
	}

	public void setImpactoCalidad(String impactoCalidad) {
		this.impactoCalidad = impactoCalidad;
	}

	public String getImpactoRiesgo() {
		return impactoRiesgo;
	}

	public void setImpactoRiesgo(String impactoRiesgo) {
		this.impactoRiesgo = impactoRiesgo;
	}

	public Date getFechaResolucion() {
		return fechaResolucion;
	}

	public void setFechaResolucion(Date fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Date getFechaTerminacion() {
		return fechaTerminacion;
	}

	public void setFechaTerminacion(Date fechaTerminacion) {
		this.fechaTerminacion = fechaTerminacion;
	}

	public String getCompletadoPor() {
		return completadoPor;
	}

	public void setCompletadoPor(String completadoPor) {
		this.completadoPor = completadoPor;
	}

	public Date getFechaVerificacion() {
		return fechaVerificacion;
	}

	public void setFechaVerificacion(Date fechaVerificacion) {
		this.fechaVerificacion = fechaVerificacion;
	}

	public int getEvaluadorId() {
		return evaluadorId;
	}

	public void setEvaluadorId(int evaluadorId) {
		this.evaluadorId = evaluadorId;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCreadoPor() {
		return creadoPor;
	}

	public void setCreadoPor(int creadoPor) {
		this.creadoPor = creadoPor;
	}

	public Date getCreado() {
		return creado;
	}

	public void setCreado(Date creado) {
		this.creado = creado;
	}

	public int getModificadoPor() {
		return modificadoPor;
	}

	public void setModificadoPor(int modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	public Date getModificado() {
		return modificado;
	}

	public void setModificado(Date modificado) {
		this.modificado = modificado;
	}

	public int getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(int departamentoId) {
		this.departamentoId = departamentoId;
	}

	public int getSolicitanteId() {
		return solicitanteId;
	}

	public void setSolicitanteId(int solicitanteId) {
		this.solicitanteId = solicitanteId;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "SolicitudCambio [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", titulo=" + titulo
				+ ", descripcion=" + descripcion + ", prioridad=" + prioridad + ", tipo=" + tipo + ", proyecto="
				+ proyecto + ", costo=" + costo + ", dias=" + dias + ", fechaEvaluacion=" + fechaEvaluacion
				+ ", afecta=" + afecta + ", trabajo=" + trabajo + ", impactoEconomico=" + impactoEconomico
				+ ", impactoTiempo=" + impactoTiempo + ", impactoAlcance=" + impactoAlcance + ", impactoCalidad="
				+ impactoCalidad + ", impactoRiesgo=" + impactoRiesgo + ", fechaResolucion=" + fechaResolucion
				+ ", resolucion=" + resolucion + ", comentarios=" + comentarios + ", fechaTerminacion="
				+ fechaTerminacion + ", completadoPor=" + completadoPor + ", fechaVerificacion=" + fechaVerificacion
				+ ", evaluadorId=" + evaluadorId + ", activo=" + activo + ", estado=" + estado + ", creadoPor="
				+ creadoPor + ", creado=" + creado + ", modificadoPor=" + modificadoPor + ", modificado=" + modificado
				+ ", departamentoId=" + departamentoId + ", solicitanteId=" + solicitanteId + "]";
	}



	
}
