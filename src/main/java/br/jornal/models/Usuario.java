package br.jornal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name="usuario")
public class Usuario {
	
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull(message="{usuario.nome}")
	private String nome;
	
	
	@Column(unique=true)
	@NotNull(message="{usuario.login}")
	@Size(min=5,max=32,message="{usuario.login}")
	private String login;
	
	@NotNull(message="{usuario.senha}")
	@Size(min=5,max=32,message="{usuario.senha}")
	private String senha;
	
	@Column(unique=true)
	@NotNull(message="{usuario.email}")
	private String email;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="id_papel")
	private Papel papel;
	
	public long getId() {
		return id;
	}
	public Papel getPapel() {
		return papel;
	}
	public void setPapel(Papel papel) {
		this.papel = papel;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	 
}
