package com.turbomaquinas.POJO.inventarios;

import java.util.List;

public class CatalogoArticulosVista {

	private int id;
	private String codigo;
	private String sub_indice;
	private String descripcion_articulo;
	private int obsoleto;
	private int origen_turbomaquinas;
	private int catalogo_articulos_agrupa_id;
	private List<Existencia> existencia;
	private Existencia.SubindicesAgrupados sub_indices_agrupados;
	private int unidades_de_medida_id;
	private int grupos_almacen_id;
	private String descripcion_tipos_almacen;
	private String descripcion_grupos_almacen;
	private String descripcion_unidades_medida;
	private String tipo;
	
	public CatalogoArticulosVista() {
		super();
	}

	public CatalogoArticulosVista(int id, String codigo, String sub_indice, String descripcion_articulo,
			String ubicacion, int obsoleto, int origen_turbomaquinas, int catalogo_articulos_agrupa_id,
			List<Existencia> existencia, Existencia.SubindicesAgrupados sub_indices_agrupados, int unidades_de_medida_id, int grupos_almacen_id,
			String descripcion_tipos_almacen, String descripcion_grupos_almacen, String descripcion_unidades_medida,
			String tipo) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.sub_indice = sub_indice;
		this.descripcion_articulo = descripcion_articulo;
		this.obsoleto = obsoleto;
		this.origen_turbomaquinas = origen_turbomaquinas;
		this.catalogo_articulos_agrupa_id = catalogo_articulos_agrupa_id;
		this.existencia = existencia;
		this.sub_indices_agrupados = sub_indices_agrupados;
		this.unidades_de_medida_id = unidades_de_medida_id;
		this.grupos_almacen_id = grupos_almacen_id;
		this.descripcion_tipos_almacen = descripcion_tipos_almacen;
		this.descripcion_grupos_almacen = descripcion_grupos_almacen;
		this.descripcion_unidades_medida = descripcion_unidades_medida;
		this.tipo = tipo;
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

	public String getSub_indice() {
		return sub_indice;
	}

	public void setSub_indice(String sub_indice) {
		this.sub_indice = sub_indice;
	}

	public String getDescripcion_articulo() {
		return descripcion_articulo;
	}

	public void setDescripcion_articulo(String descripcion_articulo) {
		this.descripcion_articulo = descripcion_articulo;
	}

	public int getObsoleto() {
		return obsoleto;
	}

	public void setObsoleto(int obsoleto) {
		this.obsoleto = obsoleto;
	}

	public int getOrigen_turbomaquinas() {
		return origen_turbomaquinas;
	}

	public void setOrigen_turbomaquinas(int origen_turbomaquinas) {
		this.origen_turbomaquinas = origen_turbomaquinas;
	}

	public int getCatalogo_articulos_agrupa_id() {
		return catalogo_articulos_agrupa_id;
	}

	public void setCatalogo_articulos_agrupa_id(int catalogo_articulos_agrupa_id) {
		this.catalogo_articulos_agrupa_id = catalogo_articulos_agrupa_id;
	}

	public List<Existencia> getExistencia() {
		return existencia;
	}

	public void setExistencia(List<Existencia> existencia) {
		this.existencia = existencia;
	}

	public Existencia.SubindicesAgrupados getSub_indices_agrupados() {
		return sub_indices_agrupados;
	}

	public void setSub_indices_agrupados(Existencia.SubindicesAgrupados sub_indices_agrupados) {
		this.sub_indices_agrupados = sub_indices_agrupados;
	}

	public int getUnidades_de_medida_id() {
		return unidades_de_medida_id;
	}

	public void setUnidades_de_medida_id(int unidades_de_medida_id) {
		this.unidades_de_medida_id = unidades_de_medida_id;
	}

	public int getGrupos_almacen_id() {
		return grupos_almacen_id;
	}

	public void setGrupos_almacen_id(int grupos_almacen_id) {
		this.grupos_almacen_id = grupos_almacen_id;
	}

	public String getDescripcion_tipos_almacen() {
		return descripcion_tipos_almacen;
	}

	public void setDescripcion_tipos_almacen(String descripcion_tipos_almacen) {
		this.descripcion_tipos_almacen = descripcion_tipos_almacen;
	}

	public String getDescripcion_grupos_almacen() {
		return descripcion_grupos_almacen;
	}

	public void setDescripcion_grupos_almacen(String descripcion_grupos_almacen) {
		this.descripcion_grupos_almacen = descripcion_grupos_almacen;
	}

	public String getDescripcion_unidades_medida() {
		return descripcion_unidades_medida;
	}

	public void setDescripcion_unidades_medida(String descripcion_unidades_medida) {
		this.descripcion_unidades_medida = descripcion_unidades_medida;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "CatalogoArticulosVista [id=" + id + ", codigo=" + codigo + ", sub_indice=" + sub_indice
				+ ", descripcion_articulo=" + descripcion_articulo + ", obsoleto="
				+ obsoleto + ", origen_turbomaquinas=" + origen_turbomaquinas + ", catalogo_articulos_agrupa_id="
				+ catalogo_articulos_agrupa_id + ", existencia=" + existencia + ", sub_indices_agrupados="
				+ sub_indices_agrupados + ", unidades_de_medida_id=" + unidades_de_medida_id + ", grupos_almacen_id="
				+ grupos_almacen_id + ", descripcion_tipos_almacen=" + descripcion_tipos_almacen
				+ ", descripcion_grupos_almacen=" + descripcion_grupos_almacen + ", descripcion_unidades_medida="
				+ descripcion_unidades_medida + ", tipo=" + tipo + "]";
	}

		

}
