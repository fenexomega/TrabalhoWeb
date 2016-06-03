package br.jornal.models;

import java.sql.Date;

public class Classificado {
	private long id;
	private String titulo;
	private String texto;
	private float preco;
	private String telefone;
	private float melhor_oferta;
	private Date data_oferta;
	private long id_autor;
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
		return data_oferta;
	}
	public void setData_oferta(Date data_oferta) {
		this.data_oferta = data_oferta;
	}
	public long getId_autor() {
		return id_autor;
	}
	public void setId_autor(long id_autor) {
		this.id_autor = id_autor;
	}
	
	
}
