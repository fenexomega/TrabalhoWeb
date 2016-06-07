package br.jornal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ComentarioController {

	@RequestMapping("/getComentarios")
	public @ResponseBody JsonComentario getComentarios(@RequestParam("idNoticia") int idNoticia)
	{
	
		return new JsonComentario("João Ninguém","Blábláblá","123.jpg");
	}
	
	
	
}

class JsonComentario{
	private final String autorNome;
	private final String texto;
	private final String autorImagePath;
	
	public JsonComentario(String autorNome, String texto, String autorImagePath) {
		super();
		this.autorNome = autorNome;
		this.texto = texto;
		this.autorImagePath = autorImagePath;
	}
	public String getAutorNome() {
		return autorNome;
	}
	public String getTexto() {
		return texto;
	}
	public String getAutorImagePath() {
		return autorImagePath;
	}
	
	


}