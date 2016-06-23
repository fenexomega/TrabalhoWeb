package br.jornal.controllers;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
			String pathname = servletContext.getRealPath("/") + "images/usuario/" + usuario.getId() + ".png";
			AulaFileUtil.saveImage(pathname, imagem);
		}



		return "redirect:/";
	}
	
	@RequestMapping("/PainelControleUsuario")
	public String painelControleUsuario(Model model)
	{
		List<Usuario> usuarios = usuarioDAO.findAll();
		model.addAttribute("usuarios",usuarios);
		return "painel_controle_usuario";
	}
	
	@RequestMapping(value="/AtualizarUsuario",method=RequestMethod.POST)
	public String atualizarUsuario(long id_usuario, long papel, HttpServletRequest request)
	{
		Usuario usuario_logado = (Usuario) request.getSession().getAttribute("usuario_logado");
		//Se o usuário não for editor, ele não pode fazer essa operação!
		if(usuario_logado.getPapel().getId() != 3)
			return "redirect:/";
		Usuario usuario = usuarioDAO.findOne(id_usuario);
		usuario.setPapel(papelDAO.findOne(papel));
		usuarioDAO.save(usuario);
		return "redirect:/PainelControleUsuario";
	}
}
