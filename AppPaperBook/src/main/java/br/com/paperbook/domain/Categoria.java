package br.com.paperbook.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Categoria")


public class Categoria {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer idcategoria;

	@Column(nullable = false)

	private String categoria;

	@Column(nullable = false)

	private String descricaocategoria;
	
	@Column(nullable = false)

	private String departamento;

	public Categoria() {

	}

	public Categoria(Integer idcategoria, String categoria, String descricao, String departamento) {
		

		this.idcategoria = idcategoria;
		this.categoria = categoria;
		this.descricaocategoria = descricao;
		this.departamento = departamento;
		

	}

	public Integer getIdcategoria() {
		return idcategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getDescricaocategoria() {
		return descricaocategoria;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setDescricaocategoria(String descricaocategoria) {
		this.descricaocategoria = descricaocategoria;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	}