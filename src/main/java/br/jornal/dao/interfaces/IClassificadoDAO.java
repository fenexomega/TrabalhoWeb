package br.jornal.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jornal.models.Classificado;

public interface IClassificadoDAO extends JpaRepository<Classificado, Long>
{
	List<Classificado> findTop5OrderByData_ofertaDesc();

}
