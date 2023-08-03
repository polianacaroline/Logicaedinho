package br.com.paperbook.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcontato;

	@Column(length = 20, unique = true)
	private String telefonecelular;

	@Column(length = 20, nullable = true)
	private String telefoneresidencial;

	@Column(length = 50, unique = true)
	private String email;

	public Contato() {
	}

	public Contato(Integer idcontato, String telefonecelular, String telefoneresidencial, String email) {
		this.idcontato = idcontato;
		this.telefonecelular = telefonecelular;
		this.telefoneresidencial = telefoneresidencial;
		this.email = email;
	}

	public Integer getIdcontato() {
		return idcontato;
	}

	public String getTelefonecelular() {
		return telefonecelular;
	}

	public String getTelefoneresidencial() {
		return telefoneresidencial;
	}

	public String getEmail() {
		return email;
	}

	public void setIdcontato(Integer idcontato) {
		this.idcontato = idcontato;
	}

	public void setTelefonecelular(String telefonecelular) {
		this.telefonecelular = telefonecelular;
	}

	public void setTelefoneresidencial(String telefoneresidencial) {
		this.telefoneresidencial = telefoneresidencial;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
