package br.jornal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.jornal.dao.interfaces.ISecaoDAO;
import br.jornal.models.Secao;

@Controller
public class MainController {

	@Autowired
	private ISecaoDAO secaoDAO;
	
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
	
}
