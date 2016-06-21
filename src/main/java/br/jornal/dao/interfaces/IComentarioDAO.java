package br.jornal.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jornal.models.Comentario;
import br.jornal.models.Noticia;

public interface IComentarioDAO  extends JpaRepository<Comentario, Long>
{
	public List<Comentario> findByNoticia(Noticia noticia);
}
