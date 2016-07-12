package br.jornal.controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import br.jornal.dao.interfaces.IClassificadoDAO;
import br.jornal.models.Classificado;
import br.jornal.models.Usuario;
import br.jornal.util.AulaFileUtil;

@Controller
public class ClassificadoController
{
	
	@Autowired
	IClassificadoDAO classificadoDAO;
	
	@Autowired
	private ServletContext servletContext;
	
	
	@RequestMapping("/Classificado")
	public String classificado(long id, Model model)
	{
		
		return "";
	}
	
	@RequestMapping("/InserirClassificadoFormulario")
	public String inserirClassificadoFormulario()
	{
		return "inserir_classificado";
	}
	
	@RequestMapping("/InserirClassificado")
	public String inserirClassificado(String titulo,String texto, MultipartFile photo, float preco, String telefone,
			HttpServletRequest request)
	{
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario_logado");
		Classificado classificado = new Classificado();
		classificado.setTitulo(titulo);
		classificado.setTexto(texto);
		classificado.setPreco(preco);
		classificado.setTelefone(telefone);
		classificado.setAutor(usuario);
		if(usuario == null)
		{
			throw new RuntimeException("[ERRO] Não há usuário logado em inserção de classificado.");
		}
		classificado = classificadoDAO.save(classificado);
		String filetype = photo.getOriginalFilename().split("\\.")[1];
		
		AulaFileUtil.saveImage(servletContext,"images/classificado/" + classificado.getId() + "." + filetype, photo);
		
		return "redirect:/";
	}
	
	@RequestMapping("/VisualizarClassificado")
	public String visualizarClassificado(long id,Model model)
	{
		Classificado classificado = classificadoDAO.findOne(id);
		model.addAttribute("classificado",classificado);
		
		return "visualizar_classificado";
	}
}
