package br.jornal.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="classificado")
public class Classificado {

	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(nullable=false)
	private String titulo;
	@Column(columnDefinition="TEXT",nullable=false)
	private String texto;
	@Column(nullable=false)
	private float preco;
	@Column(nullable=false)
	private String telefone;
	@Column(nullable=false)
	private float melhor_oferta;
	private Date dataOferta;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="id_autor")
	private Usuario autor;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public float getMelhor_oferta() {
		return melhor_oferta;
	}
	public void setMelhor_oferta(float melhor_oferta) {
		this.melhor_oferta = melhor_oferta;
	}
	public Date getData_oferta() {
		return dataOferta;
	}
	public void setData_oferta(Date data_oferta) {
		this.dataOferta = data_oferta;
	}
	
	public Usuario getAutor() {
		return autor;
	}
	
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	
	
}
