package br.jornal.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.jornal.models.Usuario;

@Component
public class AutorizadorInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario_logado");
		
		// Se for editor
		if(usuario != null && usuario.getPapel().getId() == 3)
			return true;
		
		String uri = request.getRequestURI();
		if(uri.equals("/") ||
			uri.endsWith("/login") ||
			uri.endsWith("Cadastro") || 
			uri.startsWith("/MostrarNoticia")||
			uri.endsWith("error") ||
			uri.endsWith("CadastrarUsuario") ||
			uri.startsWith("/FormularioLogin") ||
			uri.startsWith("/VisualizarClassificado"))
			return true;
		
		
//		TODO fazer a autorização das páginas para cada tipo de usuário (usuario,editor,jornalista)
		if(usuario != null)
			return true;
		
		response.sendRedirect("/");
		return false;
		
	}

	
}
