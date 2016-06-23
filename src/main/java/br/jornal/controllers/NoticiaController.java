package br.jornal.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.jornal.dao.interfaces.IComentarioDAO;
import br.jornal.dao.interfaces.INoticiasDAO;
import br.jornal.dao.interfaces.ISecaoDAO;
import br.jornal.models.Comentario;
import br.jornal.models.Noticia;
import br.jornal.models.Secao;
import br.jornal.models.Usuario;
import br.jornal.util.AulaFileUtil;

@Controller
public class NoticiaController {
	
	@Autowired
	private INoticiasDAO noticiasDAO;

	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private ISecaoDAO secaoDAO;
	
	@Autowired
	private IComentarioDAO comentarioDAO;

	
	@RequestMapping("/InserirNoticiaFormulario")
	public String insertNoticiaFormulario(Model model)
	{
		List<Secao> secoes = secaoDAO.findAll();
		model.addAttribute("secoes",secoes); 
		return "inserir_noticia";
	}
	
	
	@RequestMapping(value="/InserirNoticia",method=RequestMethod.POST)
	public String insertNoticia(Noticia noticia, BindingResult result,
			@RequestParam MultipartFile imagem,
			@RequestParam long id_secao, HttpSession session)
	{
		noticia.setSecao(secaoDAO.findOne(id_secao));
		Usuario autor = (Usuario) session.getAttribute("usuario_logado");
		noticia.setAutor(autor);
		noticia.setDataNoticia(new Date());
		noticia = noticiasDAO.save(noticia);
		
		
		if(imagem != null && imagem.isEmpty() == false)
		{
			String pathname = servletContext.getRealPath("/") + "images/noticia/" + noticia.getId() + ".png";
			AulaFileUtil.saveImage(pathname, imagem);
		}
		return "redirect:/";
	}
	
	@RequestMapping("/MostrarNoticia")
	public String mostrarNoticia(Model model,
								@RequestParam long id)
	{
		Noticia noticia = noticiasDAO.findById(id);
		List<Secao> secoes = secaoDAO.findAll();
		List<Comentario> comentarios = comentarioDAO.findByNoticia(noticia);
		if(noticia == null)
			return "redirect:/";
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		model.addAttribute("data_noticia",format.format(noticia.getDataNoticia()));
		model.addAttribute(noticia);
		model.addAttribute("secoes",secoes);
		model.addAttribute("comentarios",comentarios);
		return "visualizar_noticia";
	}
	
	@RequestMapping("/PainelControleNoticia")
	public String painelControleNoticia(Model model)
	{
		List<Noticia> noticias = noticiasDAO.findAll();
		model.addAttribute("noticias",noticias);
		return "painel_controle_noticia";
	}
	
	@RequestMapping(value="/AtualizarNoticia",method=RequestMethod.POST)
	public String atualizarNoticia(long noticia_id,boolean ativa)
	{
		Noticia noticia = noticiasDAO.findById(noticia_id);
		noticia.setAtiva(ativa);
		noticiasDAO.save(noticia);
		return "redirect:/PainelControleNoticia";
	}
	
	
}
