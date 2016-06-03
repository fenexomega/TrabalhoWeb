package br.jornal.models;

public class Comentario {
	
	private long id;
	private long id_noticia;
	private long id_autor;
	private String texto;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_noticia() {
		return id_noticia;
	}
	public void setId_noticia(long id_noticia) {
		this.id_noticia = id_noticia;
	}
	public long getId_autor() {
		return id_autor;
	}
	public void setId_autor(long id_autor) {
		this.id_autor = id_autor;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
}
