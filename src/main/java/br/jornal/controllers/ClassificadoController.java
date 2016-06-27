package br.jornal.controllers;

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
		Usuario usuario = (Usuario) request.getAttribute("usuario_logado");
		Classificado classificado = new Classificado();
		classificado.setTitulo(titulo);
		classificado.setTexto(texto);
		classificado.setPreco(preco);
		classificado.setTelefone(telefone);
		classificado.setAutor(usuario);
		classificado = classificadoDAO.save(classificado);
		
		
		AulaFileUtil.saveImage("image/classificado/" + classificado.getId() + ".png", photo);
		
		return "";
	}
}
