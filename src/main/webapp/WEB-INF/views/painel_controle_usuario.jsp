<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Painel de controle de usuários</title>
<%@include file="common/metatags.jsp" %>
</head>
<body>
	<div class="container-fluid">
		<ul class="nav nav-tabs">
		  <li role="presentation" class="active"><a href="/PainelControleUsuario">Usuários</a></li>
		  <li role="presentation" class=""><a href="/PainelControleNoticia">Notícias</a></li>
		</ul>
		 <form class="navbar-form" role="search">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search" name="termo">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                    </div>
                </div>
          </form>
          <div class="jumbotron">
			<table class="table table-bordered">
				<tr>
					<td>Id</td>
					<td>Nome</td>
					<td>Email</td>
					<td>Login</td>
					<td>Papel</td>
					<td>Atualizar</td>
				</tr>
				<c:forEach items="${ usuarios }" var="usuario">
					<tr>
						<td>${ usuario.id }</td>
						<td>${ usuario.nome }</td>
						<td>${ usuario.email }</td>
						<td>${ usuario.login }</td>
						<form action="/AtualizarUsuario" method="post">
						<td>
							<input type="hidden" name="id_usuario" value="${ usuario.id }">
							<select name="papel">
								<option value="1" id="${ usuario.id }_op1">Usuário</option>
								<option value="2" id="${ usuario.id }_op2">Jornalista</option>
								<option value="3" id="${ usuario.id }_op3">Editor</option>
							</select>
						</td>
						
						
						<td><button type="submit" class="btn btn-success">Atualizar</button></td>
						
						</form>
					</tr>
				</c:forEach>
			</table>
			
	</div>
	
	
						<!-- gambiarra haha -->
						<script type="text/javascript">
						<c:forEach items="${ usuarios }" var="usuario">
							document.getElementById("${ usuario.id }_op${ usuario.papel.id}").selected = true;
						</c:forEach>
						</script>

</body>
</html>