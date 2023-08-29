package br.com.schooldb.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcurso;

	@Column(nullable = false)
	private String titulocurso;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	private String cargahoraria;

	@ManyToOne
	@JoinColumn(name = "idarea")
	private Area area;

	@ManyToOne
	@JoinColumn(name = "idunidade")
	private Unidade unidade;

	/**
	 * 
	 */
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idcurso
	 * @param titulocurso
	 * @param descricao
	 * @param cargahoraria
	 * @param area
	 * @param unidade
	 */
	public Curso(Integer idcurso, String titulocurso, String descricao, String cargahoraria, Area area,
			Unidade unidade) {
		this.idcurso = idcurso;
		this.titulocurso = titulocurso;
		this.descricao = descricao;
		this.cargahoraria = cargahoraria;
		this.area = area;
		this.unidade = unidade;
	}

	public Integer getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public String getTitulocurso() {
		return titulocurso;
	}

	public void setTitulocurso(String titulocurso) {
		this.titulocurso = titulocurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(String cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

}
