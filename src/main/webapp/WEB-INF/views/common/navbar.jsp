<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <!-- =========================
    //////////////This Theme Design and Developed //////////////////////
    //////////// by www.wpfreeware.com======================-->

  <!-- Preloader -->
  <div id="preloader">
    <div id="status">&nbsp;</div>
  </div>
  <!-- End Preloader -->
   
  <a class="scrollToTop" href="#"><i class="fa fa-angle-up"></i></a>
  <!-- start header -->
  <header id="header">
    <!-- Static navbar -->
    <nav class="navbar navbar-default navbar-static-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
		  
          <a class="navbar-brand" href="index.html"><img src="img/logo.png" alt="logo"></a>
          
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav custom_nav">
            <li class="active"><a href="index.html">Home</a></li>
            <c:forEach items="${ secoes }" var="secao">
            	<li><a href="secao?id=${ secao.id }">${ secao.titulo }</a></li>
            </c:forEach>
          <!--  <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Mobile</a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#">Android</a></li>
                <li><a href="#">Samsung</a></li>
                <li><a href="#">Nokia</a></li>
                <li><a href="#">Walton Mobile</a></li>
                <li><a href="#">Sympony</a></li>               
              </ul>
            </li>  --> 
            <li><a href="contact.html">Contact Us</a></li>
            <li><a href="404.html">404 Page</a></li>
          </ul>           
          
          		<c:choose>
          			<c:when test="${ usuario_logado != null }" >
          				<ul class="nav navbar-nav navbar-right custom_nav pull-right">
         			 	<li>
							<a href="/logout" >Logout</a>
						</li>
        			</ul>
          			</c:when>
          			<c:otherwise>
          			<ul class="nav navbar-nav navbar-right custom_nav">
         			 	<li>
							<a href="#" data-toggle="modal" data-target="#login-modal">Login</a>
						</li>
        			</ul>
          			</c:otherwise>
          		</c:choose>
        </div><!--/.nav-collapse -->
        <div>
           <text class="" style="color: #fff">Bem-vindo, ${ usuario_logado.nome }</text>
        </div>
        
        <div class="search">
            <a class="search_icon" href="#"><i class="fa fa-search"></i></a>
            <form action="">
              <input class="search_bar" type="text" placeholder="Search here">
            </form>
          </div>
      </div>
    </nav>
    
  </header>
  <!-- End header -->  

  

      <!-- End top add place  -->  
      
       <div class="modal fade container" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
    	   <div class="modal-dialog jumbotron">
				<form action="/login" method="POST">
					<fieldset class="form-group">
						<label for="inputLogin">Login</label>
						<input type="text" class="form-control" name="login" id="login" placeholder="Login">
					</fieldset>
					<fieldset class="form-group">
						<label for="inputPassword">Senha</label>
						<input type="password" class="form-control" name="senha" id="senha" placeholder="Senha">
					</fieldset>
					<a href="/Cadastro" class="btn btn-success" role="button">Realizar Cadastro</a>
					<button type="submit" class="btn btn-primary pull-right">Logar</button>
				</form>
			</div>
		</div>
  