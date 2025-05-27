package br.com.cotiinformatica.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contatos")
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idContato;
	@Column(name="nome_contato")
	private String nome;
	@Column(name="email_contato")
	private String email;
	@Column(name="telefone_contato")
	private String telefone;
	
	public Contato() {
		// TODO Auto-generated constructor stub
	}
	
	public Contato(Integer idContato, String nome, String email, String telefone) {
		super();
		this.idContato = idContato;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	public Integer getIdContato() {
		return idContato;
	}
	public void setIdContato(Integer idContato) {
		this.idContato = idContato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
