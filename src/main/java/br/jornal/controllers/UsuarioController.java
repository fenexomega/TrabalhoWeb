package br.jornal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.jornal.models.Usuario;

@Controller
public class UsuarioController {

	@RequestMapping("/Cadastro")
	public String cadastrarUsuarioFormulario()
	{
		return "cadastro";
	}
	
	@RequestMapping("/CadastrarUsuario")
	public String cadastrarUsuario(Usuario usuario)
	{
		return "redirect:home";
	}
}
