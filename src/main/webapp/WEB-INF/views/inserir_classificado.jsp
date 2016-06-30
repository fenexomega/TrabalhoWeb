<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${ classificado.titulo }</title>
<%@include file="common/metatags.jsp" %>
</head>
<body>
	<div class="container-fluid">
		<div class="jumbotron">
			<form action="/InserirClassificado" method="post" enctype="multipart/form-data">
				<fieldset class="form-group">
					<label>Título</label>
					<input type="text" class="form-control" name="titulo">
				</fieldset>
				<fieldset class="form-group">
					<label>Texto</label>
					<textarea rows="20"  style="width: 100%;" name="texto"  ></textarea>
				</fieldset>
				<fieldset class="form-group">
					<label>Telefone</label>
					<input type="text" class="form-control" name="telefone">
				</fieldset>
				<fieldset class="form-group">
					<label>Preço Inicial</label>
					<input type="number" class="form-control" name="preco">
				</fieldset>
				<fieldset>
					<label>Foto</label>
					<input type="file" name="photo">
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