<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Jornal jornal - ${ noticia.titulo }</title>
    <%@ include file="common/metatags.jsp" %>
  </head>
<body>
  <!-- =========================
    //////////////This Theme Design and Developed //////////////////////
    //////////// by www.wpfreeware.com======================-->

 <%@include file="common/navbar.jsp" %>
 
  <!-- start content section -->
  <section id="content">
    <div class="container">
      <!-- start top add place  -->
      
      <!-- End top add place  -->
      <div class="row">
        <div class="col-lg-3 col-md-3 col-sm-4">
          <div class="left_sidebar">
            <!-- start single widget -->
            <div class="single_widget">
              <h2>Post of the month</h2>
              <ul class="post_nav">
                <li>
                  <figure class="effect-lily">
                    <a href="single_page.html"><img src="img/270x150x4.jpg" alt="img"></a>
                    <figcaption>
                      <a href="single_page.html">Itâs Now An Android World- Feel The Power</a>
                    </figcaption>     
                  </figure>
                </li>
              
              </ul>
            </div><!-- End single widget -->
           
          </div>
        </div>
        <div class="col-lg-6 col-md-6 col-sm-8">
          <div class="middle_content">
            <ol class="breadcrumb">
              <li><a href="index.html">Home</a></li>
              <li><a href="#">Technology</a></li>
              <li class="active">Mobile</li>
            </ol>        
            <div class="single_page_area">
              <h1>${ noticia.titulo }</h1>
              <h2>${ noticia.subtitulo }</h2>
              <div class="post_commentbox">
                <a href="#"><i class="fa fa-user"></i>${ noticia.autor.nome }</a>
                <span><i class="fa fa-calendar"></i>${ data_noticia }</span>
                <a href="#"><i class="fa fa-tags"></i>${ noticia.secao.titulo }</a>
              </div>
              <div class="row">
              	<img alt="" class="" src="images/noticia/${ noticia.id }.png">
              </div>
              <div class="single_content">
              	<p>${ noticia.texto }</p>
              </div>
              
            </div>  

          </div>
          <div class="social_link">
            <ul class="social_nav">
              <li><a href="#"><i class="fa fa-facebook"></i></a></li>
              <li><a href="#"><i class="fa fa-twitter"></i></a></li>
              <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
              <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
              <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
            </ul>
          </div> 
          <!--  PARTE DOS COMENTÁRIOS  -->
          <div class="related_post">
            <h2>Comentários <i class="fa fa-thumbs-o-up"></i></h2>
            
            
           <c:if test="${ usuario_logado != null }">
	             <div class="container">
		        	<div class="jumbotron">
		              <form action="/InserirComentario" method="post">
		              <b>Deseja adicionar um comentário?</b>
		            	<fieldset class="form-group">
		            		<textarea name="coment" id="coment-text"></textarea>
		            	</fieldset>
		            		<input type="hidden" name="id_noticia" value="${ noticia.id }" >
		            	<button type="submit" class="btn btn-success pull-right">Comentar</button>
		            </form>
		            </div>
	            </div>
           </c:if> 
       
          
            <ul class="">
            <c:forEach items="${ comentarios }" var="comentario">
            	<li>
                  <div class="card card-block">
					  <div class="">
					    <h4 class="card-title">${ comentario.autor.nome }</h4>
					    <p class="card-text">${ comentario.texto }</p>
					  </div>
					</div>
					<hr>
                </li>
            </c:forEach>

              </ul>
          </div>
        </div>
     
            <!-- start single widget -->
            <div class="single_widget"> 
              <!-- tab section-->
              <ul class="nav nav-tabs custom-tabs" role="tablist">
                <li role="presentation" class="active"><a href="#recentPost" aria-controls="home" role="tab" data-toggle="tab" aria-expanded="true">Recent Post</a></li>
                <li role="presentation" class=""><a href="#recentComent" aria-controls="messages" role="tab" data-toggle="tab" aria-expanded="false">Recent Comment</a></li>
              </ul>
              <div class="tab-content">
                <div role="tabpanel" class="tab-pane fade active in" id="mostPopular">
                  <ul class="ppost_nav wow fadeInDown">
                    <li>
                      <div class="media">
                        <a class="media-left" href="single_page.html">
                          <img src="img/70x70.jpg" alt="img">
                        </a>
                        <div class="media-body">
                          <a class="catg_title" href="single_page.html"> Aliquam malesuada diam eget turpis varius</a>                        
                        </div>
                      </div>
                    </li>
                  </ul>
                </div>
                <div role="tabpanel" class="tab-pane fade" id="recentComent">
                  <ul class="ppost_nav wow fadeInDown">
                    <li>
                      <div class="media">
                        <a class="media-left" href="single_page.html">
                          <img src="img/70x70.jpg" alt="img">
                        </a>
                        <div class="media-body">
                          <a class="catg_title" href="single_page.html"> Aliquam malesuada diam eget turpis varius</a>                        
                        </div>
                      </div>
                    </li>
                     <li>
                      <div class="media">
                        <a class="media-left" href="single_page.html">
                          <img src="img/70x70.jpg" alt="img">
                        </a>
                        <div class="media-body">
                          <a class="catg_title" href="#"> Aliquam malesuada diam eget turpis varius</a>                                
                        </div>
                      </div>
                    </li>
                      <li>
                      <div class="media">
                        <a class="media-left" href="single_page.html">
                          <img src="img/70x70.jpg" alt="img">
                        </a>
                        <div class="media-body">
                          <a class="catg_title" href="#"> Aliquam malesuada diam eget turpis varius</a>                               
                        </div>
                      </div>
                    </li>
                      <li>
                      <div class="media">
                        <a class="media-left" href="#">
                          <img src="img/70x70.jpg" alt="img">
                        </a>
                        <div class="media-body">
                          <a class="catg_title" href="#"> Aliquam malesuada diam eget turpis varius</a>                         
                        </div>
                      </div>
                    </li>
                    <li>
                      <div class="media">
                        <a class="media-left" href="#">
                          <img src="img/70x70.jpg" alt="img">
                        </a>
                        <div class="media-body">
                          <a class="catg_title" href="#"> Aliquam malesuada diam eget turpis varius</a>                        
                        </div>
                      </div>
                    </li>
                     <li>
                      <div class="media">
                        <a class="media-left" href="#">
                          <img src="img/70x70.jpg" alt="img">
                        </a>
                        <div class="media-body">
                          <a class="catg_title" href="#"> Aliquam malesuada diam eget turpis varius</a>                                
                        </div>
                      </div>
                    </li>
                      <li>
                      <div class="media">
                        <a class="media-left" href="#">
                          <img src="img/70x70.jpg" alt="img">
                        </a>
                        <div class="media-body">
                          <a class="catg_title" href="#"> Aliquam malesuada diam eget turpis varius</a>                               
                        </div>
                      </div>
                    </li>
                      <li>
                      <div class="media">
                        <a class="media-left" href="#">
                          <img src="img/70x70.jpg" alt="img">
                        </a>
                        <div class="media-body">
                          <a class="catg_title" href="#"> Aliquam malesuada diam eget turpis varius</a>                         
                        </div>
                      </div>
                    </li>
                    <li>
                      <div class="media">
                        <a class="media-left" href="#">
                          <img src="img/70x70.jpg" alt="img">
                        </a>
                        <div class="media-body">
                          <a class="catg_title" href="#"> Aliquam malesuada diam eget turpis varius</a>
                          
                        </div>
                      </div>
                    </li>
                    <li>
                      <div class="media">
                        <a class="media-left" href="#">
                          <img src="img/70x70.jpg" alt="img">
                        </a>
                        <div class="media-body">
                          <a class="catg_title" href="#"> Aliquam malesuada diam eget turpis varius</a>                                
                        </div>
                      </div>
                    </li>                     
                  </ul>
                </div>                                   
              </div><!-- End tab section-->            
            </div><!-- End single widget -->
            <!-- start single widget -->
            <div class="single_widget"> 
             <h2>Categories</h2>
             <ul>
               <li class="cat-item"><a href="#">Technology</a></li>
               <li class="cat-item"><a href="#">Games</a></li>
               <li class="cat-item"><a href="#">Business</a></li>
               <li class="cat-item"><a href="#">Gallery</a></li>
               <li class="cat-item"><a href="#">Slider</a></li>
               <li class="cat-item"><a href="#">Life & Style</a></li>
               <li class="cat-item"><a href="#">Sports</a></li>
             </ul>          
            </div><!-- End single widget -->
             <!-- start single widget -->
            <div class="single_widget"> 
             <h2>Category Archive</h2>
             <select class="catgArchive">
                <option>Select Category</option>
                <option>Life styles</option>
                <option>Sports</option>
                <option>Technology</option>
                <option>Treads</option>
              </select>
                      
            </div><!-- End single widget -->
             <!-- start single widget -->
            <div class="single_widget"> 
             <h2>Links</h2>
             <ul>
               <li><a href="#">Log in</a></li>
               <li><a href="#">Entries RSS</a></li>
               <li><a href="#">Comment RSS</a></li>
               <li><a href="#">Wordpress.org</a></li>               
             </ul>          
            </div><!-- End single widget -->
          </div>
        </div>
      </div>
    </div>
  </section><!-- End content section -->
  <!-- start footer area -->
  <footer id="footer">
    <div class="footer_top">
      <div class="container">
        <div class="row">          
          <div class="col-lg-3 col-md-3 col-sm3">
            <div class="footer_widget wow fadeInLeftBig">
              <h2>Labels</h2>
              <ul class="labels_nav">
                <li><a href="#">Games</a></li>
                <li><a href="#">Gallery</a></li>
                <li><a href="#">Technology</a></li>
                <li><a href="#">Business</a></li>
                <li><a href="#">Slider</a></li>
                <li><a href="#">Life & Style</a></li>
                <li><a href="#">Ver</a></li>
                <li><a href="#">Sports</a></li>
              </ul>
            </div>
          </div>
          <div class="col-lg-3 col-md-3 col-sm3">
            <div class="footer_widget">
              <h2>Popular Post</h2>
              <ul class="ppost_nav wow fadeInLeftBig">
                <li>
                  <div class="media">
                    <a href="single_page.html" class="media-left">
                      <img alt="img" src="img/70x70.jpg">
                    </a>
                    <div class="media-body">
                      <a href="single_page.html" class="catg_title"> Aliquam malesuada diam eget turpis varius</a>                        
                    </div>
                  </div>
                </li>
                <li>
                  <div class="media">
                    <a href="single_page.html" class="media-left">
                      <img alt="img" src="img/70x70.jpg">
                    </a>
                    <div class="media-body">
                      <a href="#" class="catg_title"> Aliquam malesuada diam eget turpis varius</a>                                
                    </div>
                  </div>
                </li>
                <li>
                  <div class="media">
                    <a href="single_page.html" class="media-left">
                      <img alt="img" src="img/70x70.jpg">
                    </a>
                    <div class="media-body">
                      <a href="#" class="catg_title"> Aliquam malesuada diam eget turpis varius</a>                               
                    </div>
                  </div>
                </li>                            
              </ul>
            </div>
          </div>
          <div class="col-lg-3 col-md-3 col-sm3">
            <div class="footer_widget wow fadeInRightBig">
              <h2>Flickr Images</h2>
            </div>
          </div>
          <div class="col-lg-3 col-md-3 col-sm3">
            <div class="footer_widget wow fadeInRightBig">
              <h2>Jetpack Subscription Widget</h2>
              <form class="subscribe_form">
                <p id="subscribe-text">We promise, we will only send you awesome stuff which will make your day!</p>
                <p id="subscribe-email">
                  <input type="text" placeholder="Email Address" name="email">
                </p>
                <p id="subscribe-submit">
                  <input type="submit" value="Submit">
                </p>
              </form>
            </div>
          </div>
        </div>
      </div>  
    </div>
    <div class="footer_bottom">
      <div class="container">
        <p class="copyright">All rights reserved <a href="index.html">Cybar Tech</a></p>
        <p class="developer">Developed By <a href="http://www.wpfreeware.com/" rel="nofollow">Wpfreeware</a></p>
      </div>  
    </div>
  </footer>
  <!-- End footer area -->
  

	<%@include file="common/end_scripts.jsp" %>

  <!-- =========================
        //////////////This Theme Design and Developed //////////////////////
        //////////// by www.wpfreeware.com======================-->
    
      
  </body>
</html>