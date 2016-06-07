package br.jornal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController 
{
	
	@RequestMapping("/loginFormulario")
	public String loginFormulario()
	{
		return "formularioLogin";
	}

	@RequestMapping("/login")
	public String login()
	{
		
		return "";
	}
}
