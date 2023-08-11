package br.com.paperbook.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idendereco;

	@Column(length = 20, nullable = false)
	private String tipo;

	@Column(length = 50, nullable = false)
	private String logradouro;

	@Column(length = 10, nullable = false)
	private String numero;

	@Column(length = 45, nullable = true)
	private String complemento;

	@Column(length = 10, nullable = false)
	private String cep;

	@Column(length = 45, nullable = false)
	private String referencia;

	@Column(length = 45, nullable = false)
	private String bairro;

	@Column(length = 45, nullable = false)
	private String cidade;

	@Column(length = 45, nullable = false)
	private String estado;

	public Endereco() {
	}

	public Endereco(Integer idendereco, String tipo, String logradouro, String numero, String complemento, String cep,
			String referencia, String bairro, String cidade, String estado) {
		this.idendereco = idendereco;
		this.tipo = tipo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.referencia = referencia;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Integer getIdendereco() {
		return idendereco;
	}

	public String getTipo() {
		return tipo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getCep() {
		return cep;
	}

	public String getReferencia() {
		return referencia;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setIdendereco(Integer idendereco) {
		this.idendereco = idendereco;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
