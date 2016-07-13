<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
  <title>Jornal jornal:Home</title>
  <%@include file="common/metatags.jsp" %> 
  </head>
<body>
	<%@include file="common/navbar.jsp" %>
 
   <section id="content">
 
      <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12">
				<!-- start featured slider -->
				<div class="featured_slider">
				   <!-- Set up your HTML -->
				   <h2 class="featured_title">Últimas notícias</h2>
				  <div class="slick_slider">
				  <c:forEach items="${ noticias }" var="noticia">
					  <div class="single_iteam">
						  <img src="images/noticia/${ noticia.id }.png" alt="img">
						  <h2><a class="slider_tittle" href="/MostrarNoticia?id=${ noticia.id }">${noticia.titulo}</a></h2>
						</div>
				  </c:forEach>
				  </div>
				</div><!-- End featured slider -->
        </div>
      </div>  
    <div class="container">	  
      <div class="row">
        <div class="col-lg-3 col-md-3 col-sm-4">
          <div class="left_sidebar">
            <!-- start single widget -->
            <div class="single_widget">
              <h2>Classificados</h2>
              <ul class="post_nav">
              <c:forEach items="${ classificados }" var="classificado">
                <li>
                  <figure class="effect-lily">
                    <a href="/VisualizarClassificado?id=${ classificado.id }"><img src="images/classificado/${ classificado.id }.png"  alt="img"></a>
                    <figcaption>
                      <a href="/VisualizarClassificado?id=${ classificado.id }">${ classificado.titulo } - R$ ${ classificado.preco }</a>
                    </figcaption>     
                  </figure>
                </li>
              </c:forEach>
              </ul>
            </div><!-- End single widget -->
            <!-- start single widget -->
            <div class="single_widget">
              <h2>Popular Post</h2>
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
              </ul>
            </div><!-- End single widget -->
          </div>
        </div>
        <div class="col-lg-6 col-md-6 col-sm-8">
          <div class="middle_content">
            <h2>Notícias em Destaque</h2>

            <!-- start featured post -->
            <ul class="featured_nav">
            <c:forEach items="${ noticias_destaque }" var="noticia">
            	 <li class="wow fadeInDown">
	                <figure class="featured_img">
	                    <a href="#"><img src="images/noticia/${ noticia.id }.png" alt="img"></a>
	                </figure>
	                <article class="featured_article">
	                  <div class="article_category">
	                    <a href="#">${ noticia.secao.titulo }</a>
	                  </div>
	                  <h2 class="article_titile"><a href="#">${ noticia.titulo }</a></h2>
	                  <p>${ noticia.subtitulo }</p>
	                </article>
	              </li>
            </c:forEach>
             
           
            </ul><!-- End featured post -->
            <!-- start post pagination -->
            <nav>
              <ul class="pagination">
                <li><a href="#"><span aria-hidden="true">&laquo;</span><span class="sr-only">Previous</span></a></li>
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#"><span aria-hidden="true">&raquo;</span><span class="sr-only">Next</span></a></li>
              </ul>
            </nav>
            <!-- End post pagination -->
          </div>
        </div>
        <div class="col-lg-3 col-md-3 col-sm-12">
          <div class="right_sidebar">
            <!-- start single widget -->
            <div class="single_widget">
              <h2>Popular Post</h2>
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
            </div><!-- End single widget -->
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

  <%@include file="common/footer.jsp" %>

  <!-- jQuery google CDN Library -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script> 
  <!-- For content animatin  -->
  <script src="js/wow.min.js"></script>
  <!-- bootstrap js file -->
  <script src="js/bootstrap.min.js"></script> 
  <!-- slick slider js file -->
  <script src="js/slick.min.js"></script> 
  
    <!-- custom js file include -->
  <script src="js/custom.js"></script> 

  <!-- =========================
        //////////////This Theme Design and Developed //////////////////////
        //////////// by www.wpfreeware.com======================-->
    
      
  </body>
</html>