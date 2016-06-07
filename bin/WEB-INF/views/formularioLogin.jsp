<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <%@include file="common/metatags.jsp" %> 
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<form action="" method="post">
				<fieldset class="form-grup">
					<label for="inputEmail">Endereço de e-mail</label>
					<input type="email" class="form-control" id="email" placeholder="Digite o E-mail">
				</fieldset>
				<fieldset class="form-grup">
					<label for="inputPassword">Senha</label>
					<input type="password" class="form-control" id="password" placeholder="Digite a senha">
				</fieldset>
				<button type="submit" class="btn btn-primary">Submeter</button>
			</form>
		</div>
	</div>
	
</body>
</html>