<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ver todas as notícias</title>
<%@include file="common/metatags.jsp"%>
</head>
<body>


	<div class="container-fluid">
	<ul class="nav nav-tabs">
	  <li role="presentation" class=""><a href="/PainelControleUsuario">Usuários</a></li>
	  <li role="presentation" class="active"><a href="/PainelControleNoticia">Notícias</a></li>
	</ul>
		<div class="jumbotron">
			<table class="table table-bordered">
				<tr>
					<td>Id</td>
					<td>Título</td>
					<td>Data</td>
					<td>Mostrar</td>
					<td>Destaque</td>
					<td>Atualizar</td>
				</tr>
				<c:forEach items="${ noticias }" var="noticia">
					<tr>
						<td>${ noticia.id }</td>
						<td>${ noticia.titulo }</td>
						<td>${ noticia.dataNoticia }</td>
						<form action="/AtualizarNoticia" method="post">
							<td><c:choose>
									<c:when test="${ noticia.ativa == true }">
										<input type="checkbox" name="ativa" checked="checked">
									</c:when>
									<c:otherwise>
										<input type="checkbox" name="ativa">
									</c:otherwise>
								</c:choose>
							</td>
							<td>
								<c:choose>
									<c:when test="${ noticia.emDestaque == true }">
										<input type="checkbox" name="emDestaque" checked="checked">
									</c:when>
									<c:otherwise>
										<input type="checkbox" name="emDestaque">
									</c:otherwise>
								</c:choose>
							</td> 
							<input type="hidden" name="noticia_id" value=${ noticia.id }>
							<td><button type="submit" class="btn btn-primary">Atualizar</button></td>
						</form>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>