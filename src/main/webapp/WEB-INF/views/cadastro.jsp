<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Insert title here</title>
	<%@include file="common/metatags.jsp" %>
	<link href="css/cadastro.css" rel="stylsheet">
	<script type="text/javascript">
	
	</script>
</head>
<body>
	<div class="form_group container ">
		<div class="jumbotron">
			<form action="/CadastrarUsuario" method="POST" enctype="multipart/form-data">
				<fieldset class="form-group">
					<label for="inputNome">Nome</label>
					<input type="text" class="form-control" name="nome" placeholder="Digite seu Nome">
					<form:errors path="usuario.nome" />						
				</fieldset>
				<fieldset class="form-group">
					<label for="inputLogin">Login</label>
					<input type="text" class="form-control" name="login" placeholder="Digite seu Login">
					<form:errors path="usuario.login" />	
				</fieldset>
				<fieldset class="form-group">
					<label for="inputEmail">Endereço de e-mail</label>
					<input type="email" class="form-control" name="email" placeholder="Digite o E-mail">
					<form:errors path="usuario.email" />
				</fieldset>
				<fieldset class="form-group">
					<label for="inputPassword">Senha</label>
					<input type="password" class="form-control" name="senha" placeholder="Digite a senha">
					<form:errors path="usuario.senha" />					
				</fieldset>			
 				<fieldset class="form-group">
					<label for="passwordConfirm">Confirmar senha</label>
					<input type="password" class="form-control" name="confirmacaoSenha" placeholder="Digite a senha">
				</fieldset>		
				<fieldset class="form-group">
					<label for="inputImage" >Imagem de perfil</label>
					<input type="file"  name="imagem" >
				</fieldset>
				<button type="submit" class="btn btn-primary pull-right">Submeter</button>
				<a class="btn btn-danger pull-left" role="button" href="/" >Voltar</a>
			</form>
		</div>
	</div>
	
</body>
</html>