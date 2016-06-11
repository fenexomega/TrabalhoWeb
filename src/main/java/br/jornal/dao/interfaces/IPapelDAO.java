package br.jornal.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jornal.models.Papel;

public interface IPapelDAO extends JpaRepository<Papel, Long>{

	public Papel findByPapelLike(String papel);
}
