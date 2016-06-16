package br.jornal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.jornal.dao.interfaces.INoticiasDAO;
import br.jornal.dao.interfaces.ISecaoDAO;
import br.jornal.models.Noticia;
import br.jornal.models.Secao;

@Controller
public class SecaoController {

	
	@Autowired
	INoticiasDAO dao;
	
	@Autowired
	ISecaoDAO sDao;
	
	@RequestMapping("/secao")
	public String getNoticiasDaSecao(@RequestParam long id, Model model)
	{
		Secao secao = sDao.findOne(id);
		if(secao == null)
			return "redirect:404.html";
		List<Noticia> noticias = dao.findBySecao(secao); 
		model.addAttribute("noticias",noticias);
		
		return "";
	}
}
