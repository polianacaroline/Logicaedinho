package br.com.paperbook.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cliente {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcliente;
	
	@Column(length = 45, nullable = false)
	private String nomecliente;
	
	@Column(length = 15, nullable = false, unique=true)
	private String cpfcliente;
	
	@Column(length = 45, nullable = false, unique=true)
	private String rgcliente;
	
	@Column(length = 15,nullable = false)
	private String sexocliente;
	
	@Column(nullable = false)
	private Date datanascimentocliente;
	
	@ManyToOne
	@JoinColumn(name="idendereco")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name="idcontato")
	private Contato contato;
	
	@ManyToOne
	@JoinColumn(name="idusuario")
	private Usuario usuario;

	public Cliente() {
	}

	public Cliente(Integer idcliente, String nomecliente, String cpfcliente, String rgcliente, String sexocliente,
			Date datanascimentocliente, Endereco endereco, Contato contato, Usuario usuario) {
		this.idcliente = idcliente;
		this.nomecliente = nomecliente;
		this.cpfcliente = cpfcliente;
		this.rgcliente = rgcliente;
		this.sexocliente = sexocliente;
		this.datanascimentocliente = datanascimentocliente;
		this.endereco = endereco;
		this.contato = contato;
		this.usuario = usuario;
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public String getCpfcliente() {
		return cpfcliente;
	}

	public String getRgcliente() {
		return rgcliente;
	}

	public String getSexocliente() {
		return sexocliente;
	}

	public Date getDatanascimentocliente() {
		return datanascimentocliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public void setCpfcliente(String cpfcliente) {
		this.cpfcliente = cpfcliente;
	}

	public void setRgcliente(String rgcliente) {
		this.rgcliente = rgcliente;
	}

	public void setSexocliente(String sexocliente) {
		this.sexocliente = sexocliente;
	}

	public void setDatanascimentocliente(Date datanascimentocliente) {
		this.datanascimentocliente = datanascimentocliente;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
