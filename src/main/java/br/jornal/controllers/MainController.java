package br.jornal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.jornal.dao.interfaces.IClassificadoDAO;
import br.jornal.dao.interfaces.INoticiasDAO;
import br.jornal.dao.interfaces.ISecaoDAO;
import br.jornal.models.Classificado;
import br.jornal.models.Noticia;
import br.jornal.models.Secao;

@Controller
public class MainController {

	@Autowired
	private ISecaoDAO secaoDAO;
	
	@Autowired
	private INoticiasDAO noticiaDAO;
	
	@Autowired
	private IClassificadoDAO classificadoDAO;
	
	
	@RequestMapping("/")
	public String home(Model model)
	{
		List<Secao> secoes = secaoDAO.findAll();
		List<Noticia> noticias = noticiaDAO.findTop20ByAtivaTrueOrderByDataNoticiaDesc();
		List<Noticia> noticias_destaque = noticiaDAO.findTop5ByAtivaTrueAndEmDestaqueTrueOrderByDataNoticiaDesc();
		List<Classificado> classificados = classificadoDAO.findTop5ByOrderByDataOfertaDesc();	
		model.addAttribute("secoes", secoes);
		model.addAttribute("noticias", noticias);
		model.addAttribute("noticias_destaque",noticias_destaque);
		model.addAttribute("classificados", classificados);
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
