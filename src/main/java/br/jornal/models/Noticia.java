package br.jornal.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="noticia")
public class Noticia {
	
	@Id
	@Column(nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String titulo;
	private String subtitulo;
	private String texto;
	private long id_autor;
	private Date data_noticia;
	private long id_sessao;
	private boolean ativa;
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
	public long getId_autor() {
		return id_autor;
	}
	public void setId_autor(long id_autor) {
		this.id_autor = id_autor;
	}
	public Date getData_noticia() {
		return data_noticia;
	}
	public void setData_noticia(Date data_noticia) {
		this.data_noticia = data_noticia;
	}
	public long getId_sessao() {
		return id_sessao;
	}
	public void setId_sessao(long id_sessao) {
		this.id_sessao = id_sessao;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	
	
}
