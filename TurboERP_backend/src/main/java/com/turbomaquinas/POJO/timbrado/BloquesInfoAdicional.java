package com.turbomaquinas.POJO.timbrado;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BloquesInfoAdicional{
	private BloqueSuperior BloqueSuperior;
	private BloqueInferior BloqueInferior;
	
	public BloquesInfoAdicional() {
		super();
	}

	public BloquesInfoAdicional(com.turbomaquinas.POJO.timbrado.BloquesInfoAdicional.BloqueSuperior bloqueSuperior,
			com.turbomaquinas.POJO.timbrado.BloquesInfoAdicional.BloqueInferior bloqueInferior) {
		super();
		BloqueSuperior = bloqueSuperior;
		BloqueInferior = bloqueInferior;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonProperty("BloqueSuperior")
	public BloqueSuperior getBloqueSuperior() {
		return BloqueSuperior;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setBloqueSuperior(BloqueSuperior bloqueSuperior) {
		BloqueSuperior = bloqueSuperior;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@JsonProperty("BloqueInferior")
	public BloqueInferior getBloqueInferior() {
		return BloqueInferior;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	public void setBloqueInferior(BloqueInferior bloqueInferior) {
		BloqueInferior = bloqueInferior;
	}



	public class BloqueSuperior{
		private String titulo;
		private List<String> TextoRenglones;
		
		public BloqueSuperior() {
			super();
		}

		public BloqueSuperior(String titulo, List<String> textoRenglones) {
			super();
			this.titulo = titulo;
			TextoRenglones = textoRenglones;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		@JsonInclude(JsonInclude.Include.NON_NULL) 
		@JsonProperty("TextoRenglones")
		public List<String> getTextoRenglones() {
			return TextoRenglones;
		}

		@JsonInclude(JsonInclude.Include.NON_NULL) 
		public void setTextoRenglones(List<String> textoRenglones) {
			TextoRenglones = textoRenglones;
		}
		
		
	}

	public class BloqueInferior{
		private String titulo;
		private List<String> TextoRenglones;
		
		public BloqueInferior() {
			super();
		}

		public BloqueInferior(String titulo, List<String> textoRenglones) {
			super();
			this.titulo = titulo;
			TextoRenglones = textoRenglones;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		@JsonInclude(JsonInclude.Include.NON_NULL) 
		@JsonProperty("TextoRenglones")
		public List<String> getTextoRenglones() {
			return TextoRenglones;
		}

		@JsonInclude(JsonInclude.Include.NON_NULL) 
		public void setTextoRenglones(List<String> textoRenglones) {
			TextoRenglones = textoRenglones;
		}
		
	}
}

