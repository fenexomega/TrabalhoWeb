package br.jornal.controllers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.jornal.dao.interfaces.IPapelDAO;
import br.jornal.dao.interfaces.IUsuarioDAO;
import br.jornal.models.Usuario;
import br.jornal.util.AulaFileUtil;
import br.jornal.util.Encoder;

@Controller
public class UsuarioController {

	@Autowired
	private IUsuarioDAO usuarioDAO;
	
	@Autowired
	private IPapelDAO papelDAO;
	
	@Autowired
	private ServletContext servletContext;
	
	@RequestMapping("/Cadastro")
	public String cadastrarUsuarioFormulario()
	{
		return "cadastro";
	}
	
	@RequestMapping(value="/CadastrarUsuario", method=RequestMethod.POST)
	public String cadastrarUsuario(@Valid Usuario usuario, BindingResult result,
			@RequestParam(value="imagem",required=true) MultipartFile imagem, HttpServletRequest request)
	{
		String senha = request.getParameter("senha");
		String confirmacaoSenha = request.getParameter("confirmacaoSenha");
		
		if(result.hasFieldErrors())
		{
			return "cadastro";
		}
		
		if(senha.equals(confirmacaoSenha) == false)
		{
			return "redirect:Cadastro";
		}
		
		
		System.out.println(usuario.getEmail());
		usuario.setSenha(Encoder.encode(usuario.getSenha()));
		usuario.setPapel(papelDAO.findByPapelLike("usuario"));
		usuario = usuarioDAO.save(usuario);

		//salvar imagem
		if(imagem != null)
		{
			String pathname = servletContext.getRealPath("/") + "images/usuarios/" + usuario.getId() + ".png";
			AulaFileUtil.saveImage(pathname, imagem);
		}



		return "redirect:/";
	}
}
