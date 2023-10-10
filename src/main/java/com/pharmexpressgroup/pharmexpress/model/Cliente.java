package com.pharmexpressgroup.pharmexpress.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.time.LocalDateTime;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String sobrenome;

	@Column(nullable = false, unique = true)
	private Long cpf;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	private String senha;
	
	@Column(nullable = false, unique = true, name = "data_nasc")
	private LocalDateTime dataNasc;
	private String telefone;

	@Column(nullable = false, name = "status_cliente")
	private boolean codStatusCliente;
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Long getCpf() {
		return this.cpf;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return this.senha;
	}
	
	public void setDataNasc(LocalDateTime dataNasc) {
		this.dataNasc = dataNasc;
	}
	public LocalDateTime getDataNasc() {
		return this.dataNasc;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setCodStatusCliente(boolean codStatusCliente) {
		this.codStatusCliente = codStatusCliente;
	}
	public boolean getCodeStatusCliente() {
		return this.codStatusCliente;
	}
	
}
