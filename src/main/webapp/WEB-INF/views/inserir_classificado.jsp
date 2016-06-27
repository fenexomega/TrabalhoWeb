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
	<form action="" method="post" enctype="">
		<fieldset class="form-control">
			<label>Título</label>
			<input type="text" name="titulo">
		</fieldset>
		<fieldset class="form-control">
			<label>Texto</label>
			<input type="text" name="texto">
		</fieldset>
		<fieldset class="form-control">
			<label>Telefone</label>
			<input type="text" name="telefone">
		</fieldset>
		<fieldset class="form-control">
			<label>Preço Inicial</label>
			<input type="number" name="preco">
		</fieldset>
		<fieldset>
			<label>Foto</label>
			
		</fieldset>
		<div class="row pull-right">
			<a class="btn btn-danger  col-md4" href="/" >Cancelar</a>
			<input class="btn btn-primary col-md4" type="submit" value="Confirmar">			
		</div>
	</form>

</body>
</html>