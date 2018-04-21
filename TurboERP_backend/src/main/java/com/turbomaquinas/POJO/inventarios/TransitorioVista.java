package com.turbomaquinas.POJO.inventarios;

import java.util.List;

public class TransitorioVista {

	private int id;
	private String codigo;
	private int numero_entrada;
	private String numero_transitorio;
	private String descripcion;
	private List<Existencia> existencia;
	private int entradas_id;
	private String tipo;
	private int unidades_de_medida_id;
	private String descripcion_unidades_medida;
	

	public TransitorioVista() {
		super();
	}

	public TransitorioVista(int id, String codigo, int numero_entrada, String numero_transitorio, String descripcion,
			List<Existencia> existencia, int entradas_id, String tipo, int unidades_de_medida_id,
			String descripcion_unidades_medida) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.numero_entrada = numero_entrada;
		this.numero_transitorio = numero_transitorio;
		this.descripcion = descripcion;
		this.existencia = existencia;
		this.entradas_id = entradas_id;
		this.tipo = tipo;
		this.unidades_de_medida_id = unidades_de_medida_id;
		this.descripcion_unidades_medida = descripcion_unidades_medida;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public int getNumero_entrada() {
		return numero_entrada;
	}


	public void setNumero_entrada(int numero_entrada) {
		this.numero_entrada = numero_entrada;
	}


	public String getNumero_transitorio() {
		return numero_transitorio;
	}


	public void setNumero_transitorio(String numero_transitorio) {
		this.numero_transitorio = numero_transitorio;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public List<Existencia> getExistencia() {
		return existencia;
	}


	public void setExistencia(List<Existencia> existencia) {
		this.existencia = existencia;
	}


	public int getEntradas_id() {
		return entradas_id;
	}


	public void setEntradas_id(int entradas_id) {
		this.entradas_id = entradas_id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getUnidades_de_medida_id() {
		return unidades_de_medida_id;
	}


	public void setUnidades_de_medida_id(int unidades_de_medida_id) {
		this.unidades_de_medida_id = unidades_de_medida_id;
	}


	public String getDescripcion_unidades_medida() {
		return descripcion_unidades_medida;
	}


	public void setDescripcion_unidades_medida(String descripcion_unidades_medida) {
		this.descripcion_unidades_medida = descripcion_unidades_medida;
	}
}
