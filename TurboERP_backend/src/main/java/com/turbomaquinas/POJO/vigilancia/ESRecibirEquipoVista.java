package com.turbomaquinas.POJO.vigilancia;

public class ESRecibirEquipoVista {
	
	private int id;
	private String vehiculo;
	private String placas;
	private String tcir_alfresco_id;
	private int totalmente_recibido;
	private int activo;
	private int creado_por;
	private String creado;
	private int equipo_por_recibir_id;
	private String equipo_por_recibir;
	private int clientes_id;
	private String nombre_fiscal;
	private String nombre_comercial;
	private int giro;
	private int entradas_salidas_externos_id;
	private int personal_id_entrada;
	private String visitante;
	private String compania;	
	private int equipo_recibido_id;
	
	public ESRecibirEquipoVista() {
		super();
	}

	public ESRecibirEquipoVista(int id, String vehiculo, String placas, String tcir_alfresco_id,
			int totalmente_recibido, int activo, int creado_por, String creado, int equipo_por_recibir_id,
			String equipo_por_recibir, int clientes_id, String nombre_fiscal, String nombre_comercial, int giro,
			int entradas_salidas_externos_id, int personal_id_entrada, String visitante, String compania,
			int equipo_recibido_id) {
		super();
		this.id = id;
		this.vehiculo = vehiculo;
		this.placas = placas;
		this.tcir_alfresco_id = tcir_alfresco_id;
		this.totalmente_recibido = totalmente_recibido;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.equipo_por_recibir_id = equipo_por_recibir_id;
		this.equipo_por_recibir = equipo_por_recibir;
		this.clientes_id = clientes_id;
		this.nombre_fiscal = nombre_fiscal;
		this.nombre_comercial = nombre_comercial;
		this.giro = giro;
		this.entradas_salidas_externos_id = entradas_salidas_externos_id;
		this.personal_id_entrada = personal_id_entrada;
		this.visitante = visitante;
		this.compania = compania;
		this.equipo_recibido_id = equipo_recibido_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public String getTcir_alfresco_id() {
		return tcir_alfresco_id;
	}

	public void setTcir_alfresco_id(String tcir_alfresco_id) {
		this.tcir_alfresco_id = tcir_alfresco_id;
	}

	public int getTotalmente_recibido() {
		return totalmente_recibido;
	}

	public void setTotalmente_recibido(int totalmente_recibido) {
		this.totalmente_recibido = totalmente_recibido;
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

	public String getCreado() {
		return creado;
	}

	public void setCreado(String creado) {
		this.creado = creado;
	}

	public int getEquipo_por_recibir_id() {
		return equipo_por_recibir_id;
	}

	public void setEquipo_por_recibir_id(int equipo_por_recibir_id) {
		this.equipo_por_recibir_id = equipo_por_recibir_id;
	}

	public String getEquipo_por_recibir() {
		return equipo_por_recibir;
	}

	public void setEquipo_por_recibir(String equipo_por_recibir) {
		this.equipo_por_recibir = equipo_por_recibir;
	}

	public int getClientes_id() {
		return clientes_id;
	}

	public void setClientes_id(int clientes_id) {
		this.clientes_id = clientes_id;
	}

	public String getNombre_fiscal() {
		return nombre_fiscal;
	}

	public void setNombre_fiscal(String nombre_fiscal) {
		this.nombre_fiscal = nombre_fiscal;
	}

	public String getNombre_comercial() {
		return nombre_comercial;
	}

	public void setNombre_comercial(String nombre_comercial) {
		this.nombre_comercial = nombre_comercial;
	}

	public int getGiro() {
		return giro;
	}

	public void setGiro(int giro) {
		this.giro = giro;
	}

	public int getEntradas_salidas_externos_id() {
		return entradas_salidas_externos_id;
	}

	public void setEntradas_salidas_externos_id(int entradas_salidas_externos_id) {
		this.entradas_salidas_externos_id = entradas_salidas_externos_id;
	}

	public int getPersonal_id_entrada() {
		return personal_id_entrada;
	}

	public void setPersonal_id_entrada(int personal_id_entrada) {
		this.personal_id_entrada = personal_id_entrada;
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public int getEquipo_recibido_id() {
		return equipo_recibido_id;
	}

	public void setEquipo_recibido_id(int equipo_recibido_id) {
		this.equipo_recibido_id = equipo_recibido_id;
	}
}
