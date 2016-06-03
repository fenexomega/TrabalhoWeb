package br.jornal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class NoticiaController {

	@RequestMapping("/getComentarios")
	public @ResponseBody JsonNoticia getComentarios(@RequestParam("idNoticia") int idNoticia)
	{
	
		return new JsonNoticia(idNoticia);
	}
	
	
	
}

class JsonNoticia{
	private final int numero;
	
	public JsonNoticia(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}


}