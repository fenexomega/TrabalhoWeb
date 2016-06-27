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
 
    <div class="container">	  
        <div class="">
          <div class="">
            <!-- start single widget -->
            <div class="single_widget">
              <h2>Classificados</h2>
              <ul class="post_nav">
              <c:forEach items="${ classificados }" var="classificado">
                <li>
                  <figure class="effect-lily">
                    <a href="single_page.html"><img src="images/classificado/${ classificado.id }.png" alt="img"></a>
                    <figcaption>
                      <a href="single_page.html"></a>
                    </figcaption>     
                  </figure>
                </li>
              </c:forEach>
              </ul>
            </div><!-- End single widget -->
            <!-- start single widget -->
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