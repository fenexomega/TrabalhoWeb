package br.jornal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jornal.models.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	public List<Usuario> findByLoginLike(String login);
}
