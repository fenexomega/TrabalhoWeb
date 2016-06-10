package br.jornal.controllers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.jornal.dao.interfaces.ISecaoDAO;
import br.jornal.models.Secao;
import br.jornal.models.Usuario;
import br.jornal.util.AulaFileUtil;

@Controller
public class MainController {

	@Autowired
	private ISecaoDAO secaoDAO;
	
	@Autowired
	private ServletContext servletContext;
	
	@RequestMapping("/")
	public String home(Model model)
	{
		List<Secao> secoes = secaoDAO.findAll(); 
		model.addAttribute("secoes", secoes);
		return "home";
	}
	
	@RequestMapping("/index.html")
	public String index()
	{
		return "redirect:/";
	}
	
	public String inserirImagem(Usuario user,
			@RequestParam(value="image",required=false) MultipartFile image)
	{
		if(image != null && image.isEmpty() == false)
		{
			String extension = image.getOriginalFilename().split("\\.")[1];
			String pathname = servletContext.getRealPath("/") + "images/" + user.getId()
			+ extension;
			
			AulaFileUtil.saveImage(pathname, image);
		}
		return "";
	}
	
	@RequestMapping("/404")
	public String notFound()
	{
		return "404";
	}
	
}
