package br.jornal.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.jornal.models.Noticia;

public interface INoticiasDAO  extends JpaRepository<Noticia, Long>{
	
	public Noticia findById(long id);
	
	public List<Noticia> findTop20ByOrderByDataNoticiaDesc();
	
}
