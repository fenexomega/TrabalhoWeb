package br.jornal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="comentario")
public class Comentario {
	
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="id_noticia")
	private Noticia noticia;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="id_autor")
	private Usuario autor;
	
	private String texto;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Noticia getNoticia() {
		return noticia;
	}
	public Usuario getAutor() {
		return autor;
	}
	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	
	
	
}
