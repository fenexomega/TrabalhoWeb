<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@include file="common/metatags.jsp" %>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<form action="/InserirNoticia">
				<fieldset class="form-group">
					<label>Título</label>
					<input class="form-control" type="text" name="titulo">
				</fieldset>
				<fieldset class="form-group">
					<label>Subtitulo</label>
					<input class="form-control" type="text" name="subtitulo">
				</fieldset>
				<fieldset class="form-group">
					<label>Texto</label>
					<textarea class="form-control noticia-text" type="text" name="texto" ></textarea>
				</fieldset>
				<fieldset class="form-group">
					<label>Foto</label>
					<input class="" type="file" name="imagem">
				</fieldset>
				<fieldset class="form-group">
					<label>Seção</label>
					<select>
						<c:forEach var="secao" items="${ secoes } name="secao"">
							<option value="${ secao.id }">${ secao.titulo }</option>
						</c:forEach>
					</select>
				</fieldset>
				<div class="row pull-right">
					<a class="btn btn-danger  col-md4" href="/" >Cancelar</a>
					<input class="btn btn-primary col-md4" type="submit" value="Confirmar">			
				</div>
				
				
			</form>
		</div>
	</div>
</body>
</html>