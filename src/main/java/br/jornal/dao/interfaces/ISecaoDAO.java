package br.jornal.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jornal.models.Secao;

public interface ISecaoDAO extends JpaRepository<Secao, Long>
{

}
