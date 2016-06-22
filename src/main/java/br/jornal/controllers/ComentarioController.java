package br.jornal.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.jornal.dao.interfaces.IComentarioDAO;
import br.jornal.dao.interfaces.INoticiasDAO;
import br.jornal.models.Comentario;
import br.jornal.models.Noticia;
import br.jornal.models.Usuario;


@Controller
public class ComentarioController {

	@Autowired
	private IComentarioDAO comentarioDAO;
	
	@Autowired
	private INoticiasDAO noticiaDAO;
	
	
	@RequestMapping(value="/InserirComentario",method=RequestMethod.POST)
	public String inserirComentario(String coment,long id_noticia,HttpSession session)
	{
		Comentario c = new Comentario();
		c.setTexto(coment);
		Noticia noticia = noticiaDAO.findOne(id_noticia);
		if(noticia == null)
		{
			//TODO: erro caso o número da notícia não exista
			throw new RuntimeException("Notícia nao existe!");
			
		}
		c.setNoticia(noticia);
		Usuario autor = (Usuario) session.getAttribute("usuario_logado");
		c.setAutor(autor);
		comentarioDAO.save(c);
		
		return "redirect:MostrarNoticia?id=" + id_noticia;
	}
	
}


	


