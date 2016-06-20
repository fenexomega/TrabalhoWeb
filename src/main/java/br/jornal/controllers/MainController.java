package br.jornal.controllers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.jornal.dao.interfaces.INoticiasDAO;
import br.jornal.dao.interfaces.ISecaoDAO;
import br.jornal.models.Noticia;
import br.jornal.models.Secao;
import br.jornal.models.Usuario;
import br.jornal.util.AulaFileUtil;

@Controller
public class MainController {

	@Autowired
	private ISecaoDAO secaoDAO;
	
	@Autowired
	private INoticiasDAO noticiaDAO;
	
	
	@RequestMapping("/")
	public String home(Model model)
	{
		List<Secao> secoes = secaoDAO.findAll();
		List<Noticia> noticias = noticiaDAO.findTop20ByOrderByDataNoticiaDesc();
		model.addAttribute("secoes", secoes);
		model.addAttribute("noticias", noticias);
		return "home";
	}
	
	@RequestMapping("/index.html")
	public String index()
	{
		return "redirect:/";
	}
	
	
	@RequestMapping("/404")
	public String notFound()
	{
		return "404";
	}
	
}
