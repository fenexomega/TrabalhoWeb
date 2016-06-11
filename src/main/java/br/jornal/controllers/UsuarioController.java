package br.jornal.controllers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.jornal.dao.interfaces.IPapelDAO;
import br.jornal.dao.interfaces.IUsuarioDAO;
import br.jornal.models.Usuario;

@Controller
public class UsuarioController {

	@Autowired
	private IUsuarioDAO usuarioDAO;
	
	@Autowired
	private IPapelDAO papelDAO;
	
	@RequestMapping("/Cadastro")
	public String cadastrarUsuarioFormulario()
	{
		return "cadastro";
	}
	
	@RequestMapping(value="/CadastrarUsuario",method=RequestMethod.POST)
	public String cadastrarUsuario(@Valid Usuario usuario, BindingResult result, HttpServletRequest request)
	{
		System.out.println("Entrou aqui");
		String senha = request.getParameter("senha");
//		String confirmacaoSenha = request.getParameter("confirmacaoSenha");
		
//		if(senha != confirmacaoSenha)
//		{
//			return "redirect:Cadastro";
//		}
		
		
		System.out.println(usuario.getEmail());
		try {
			byte[] digest = MessageDigest.getInstance("MD5").digest(usuario.getSenha().getBytes());
			usuario.setSenha(MD5Encoder.encode(digest));
			usuario.setPapel(papelDAO.findByPapelLike("usuario"));
			usuarioDAO.save(usuario);
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "redirect:/";
	}
}
