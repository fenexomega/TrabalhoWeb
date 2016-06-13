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

	
	@RequestMapping("/inserirNoticiaFormulario")
	public String insertNoticiaFormulario(Model model)
	{
		List<Secao> secoes = secaoDAO.findAll();
		model.addAttribute("secoes",secoes); 
		return "inserir_noticia";
	}
	
	@RequestMapping(value="/inserirNoticia",method=RequestMethod.POST)
	public String insertNoticia(Noticia noticia, BindingResult result,
			@RequestParam(value="image",required=true) MultipartFile image,
			@RequestParam("secao") long secao)
	{
	
		noticia = noticiasDAO.save(noticia);
		noticia.setSecao(secaoDAO.findOne(secao));
		
		if(image != null && image.isEmpty() == false)
		{
			String pathname = servletContext.getRealPath("/") + "images/noticias" + noticia.getId() + ".png";
			
			AulaFileUtil.saveImage(pathname, image);
		}
		return "redirect:/home";
	}
}
