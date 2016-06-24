package br.jornal.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jornal.models.Noticia;
import br.jornal.models.Secao;

public interface INoticiasDAO  extends JpaRepository<Noticia, Long>{
	
	public Noticia findById(long id);
	
	public List<Noticia> findTop20ByOrderByDataNoticiaDesc();
	public List<Noticia> findTop20ByAtivaTrueOrderByDataNoticiaDesc();
	public List<Noticia> findTop5ByAtivaTrueAndEmDestaqueTrueOrderByDataNoticiaDesc();
	
	public List<Noticia> findBySecao(Secao secao);
	
}
