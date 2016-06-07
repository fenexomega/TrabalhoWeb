package br.jornal.controllers;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.jornal.dao.interfaces.INoticiasDAO;
import br.jornal.models.Noticia;
import br.jornal.util.AulaFileUtil;

@Controller
public class NoticiaController {
	
	@Autowired
	private INoticiasDAO noticiasDAO;
	
	@Autowired
	private ServletContext servletContext;

	
	@RequestMapping("/inserirNoticiaForm")
	public String insertNoticiaFormulario()
	{
		return "noticia/inserir_noticia_formulario";
	}
	
	@RequestMapping(value="/inserirNoticia",method=RequestMethod.POST)
	public String insertNoticia(Noticia noticia,
			@RequestParam(value="image",required=true) MultipartFile image)
	{
	
		noticia = noticiasDAO.saveAndFlush(noticia);
		
		if(image != null && image.isEmpty() == false)
		{
			String extension = image.getOriginalFilename().split("\\.")[1];
			String pathname = servletContext.getRealPath("/") + "images/" + noticia.getId()
			+ extension;
			
			AulaFileUtil.saveImage(pathname, image);
		}
		return "redirect:/home";
	}
}
