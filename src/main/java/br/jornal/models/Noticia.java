package br.jornal.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="noticia")
public class Noticia {
	
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String titulo;
	private String subtitulo;
	private String texto;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="id_autor")
	private Usuario autor;
	
	@Column(name="data_noticia")
	private Date dataNoticia;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="id_secao")
	private Secao secao;
	private boolean ativa;
	private String imagePath;
	
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
	public String getSubtitulo() {
		return subtitulo;
	}
	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}


	public Date getDataNoticia() {
		return dataNoticia;
	}
	public void setDataNoticia(Date dataNoticia) {
		this.dataNoticia = dataNoticia;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public Usuario getAutor() {
		return autor;
	}
	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	public Secao getSecao() {
		return secao;
	}
	public void setSecao(Secao secao) {
		this.secao = secao;
	}
	
}
