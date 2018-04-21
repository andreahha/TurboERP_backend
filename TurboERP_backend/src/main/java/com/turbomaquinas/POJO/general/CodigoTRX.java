package com.turbomaquinas.POJO.general;

public class CodigoTRX {
	private int id;
	private String codigo;
	private String titulo;
	private String uri;
	
	
	public CodigoTRX() {
		super();
	}


	public CodigoTRX(int id, String codigo, String titulo, String uri) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.titulo = titulo;
		this.uri = uri;
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


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getUri() {
		return uri;
	}


	public void setUri(String uri) {
		this.uri = uri;
	}


	@Override
	public String toString() {
		return "CodigoTRX [id=" + id + ", codigo=" + codigo + ", titulo=" + titulo + ", uri=" + uri + "]";
	}

}
