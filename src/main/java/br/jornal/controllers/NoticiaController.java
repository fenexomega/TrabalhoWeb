package br.jornal.controllers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.jornal.dao.interfaces.INoticiasDAO;
import br.jornal.dao.interfaces.ISecaoDAO;
import br.jornal.models.Noticia;
import br.jornal.models.Secao;
import br.jornal.util.AulaFileUtil;

@Controller
public class NoticiaController {
	
	@Autowired
	private INoticiasDAO noticiasDAO;
	
	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private ISecaoDAO secaoDAO;

	
	@RequestMapping("/InserirNoticiaFormulario")
	public String insertNoticiaFormulario(Model model)
	{
		List<Secao> secoes = secaoDAO.findAll();
		model.addAttribute("secoes",secoes); 
		return "inserir_noticia";
	}
	
	
//	TODO: Consertar a view
// http://stackoverflow.com/questions/17218693/how-to-pass-data-from-formselect-spring-mvc
	@RequestMapping(value="/InserirNoticia",method=RequestMethod.POST)
	public String insertNoticia(Noticia noticia, BindingResult result,
			@RequestParam MultipartFile imagem,
			@RequestParam Secao secoes)
	{
	
		noticia = noticiasDAO.save(noticia);
		noticia.setSecao(secoes);
		
		if(imagem != null && imagem.isEmpty() == false)
		{
			String pathname = servletContext.getRealPath("/") + "images/noticias" + noticia.getId() + ".png";
			
			AulaFileUtil.saveImage(pathname, imagem);
		}
		return "redirect:/home";
	}
}
