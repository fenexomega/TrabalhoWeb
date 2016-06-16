package br.jornal.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.jornal.dao.interfaces.IUsuarioDAO;
import br.jornal.forms.LoginForm;
import br.jornal.models.Usuario;
import br.jornal.util.Encoder;

@Controller
public class LoginController 
{
	@Autowired
	private IUsuarioDAO usuarioDAO;
	
	@RequestMapping("/FormularioLogin")
	public String formularioLogin()
	{
		return "formulario_login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(LoginForm form, HttpSession session)
	{
		String login = form.getLogin();
		String senha = form.getSenha();
		Usuario usuario = usuarioDAO.findByEmailLike(login);
		
		if(usuario == null)
			usuario = usuarioDAO.findByLoginLike(login);
		
		if(usuario == null)
			return "redirect:/FormularioLogin";
		
		
		if(usuario.getSenha().equals(Encoder.encode(senha)))
			session.setAttribute("usuario_logado", usuario);
		else
			return "redirect:/FormularioLogin";

				
		return "redirect:/";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:/";
	}
}
