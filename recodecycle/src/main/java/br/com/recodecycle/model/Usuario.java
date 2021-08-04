package br.com.recodecycle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max =100, message = "Campo Obrigatório")
	private String nome;
	
	@NotNull
	@Size(min = 5, max =50, message = "Campo Obrigatório")
	private String email;
	
	@NotNull
	@Size(min = 5, message = "Campo Obrigatório")
	private String senha;
	
	@NotNull
	@Size(min = 5, message = "Campo Obrigatório")
	private String confirmacaoSenha;
	
	@Size(min = 5, max =500)
	private String biografia;
	
	@Size(min = 5, max =255)
	private String telefone;
	
	@Size(min = 5, max =255)
	private String recebaEmail;
	
	@Size(min = 5, max =255)
	private String fotoPerfil;
	
	private int nivel;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}

	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}

	public String getBios() {
		return biografia;
	}

	public void setBios(String bios) {
		this.biografia = bios;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRecebaEmail() {
		return recebaEmail;
	}

	public void setRecebaEmail(String recebaEmail) {
		this.recebaEmail = recebaEmail;
	}

	public String getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}