package br.jornal.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jornal.models.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	public Usuario findByLoginLike(String login);
	
	public Usuario findByEmailLike(String email);
}
