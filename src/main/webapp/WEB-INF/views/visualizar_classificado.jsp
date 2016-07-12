<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Jornal jornal - ${ classificado.titulo }</title>
    <%@ include file="common/metatags.jsp" %>
    <script type="text/javascript" src="js/showdown.min.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="common/navbar.jsp" %>
  <section id="content">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-3 col-sm-4">
				</div>
				<div class="col-lg-3 col-md-3 col-sm-4">
					<h1>${ classificado.titulo }</h1>
					<img alt="" src="images/classificado/${ classificado.id }.png">
					<div class="single_content" id="classificado-text" >
					</div>
			
					
		              
				
				</div>
			</div>
			
			
		</div>
	</section>
	
	<%@include file="common/end_scripts.jsp" %>
</body>
</html>