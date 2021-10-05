<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="ISO-8859-1">
<<<<<<< Updated upstream

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
 <title>Exibi��o Produtos</title>
=======
<title>Exibi��o Produtos</title>

<style><%@include file="/resources/css/estilo.css"%></style>

>>>>>>> Stashed changes
</head>
<body>

<div>
	<jsp:include page="menu-lateral.jsp"/>
	</div>


  <div class="gallery1">
        
        <c:forEach var="produto" items="${produtos}">
        
        <div class="desc1"> <c:out value="${produto.nome}" /> -
      <c:out value="${produto.preco}" /></div>
         </c:forEach>
       
         
          <br> 
           
           
           <!--sobre a quantidade do produto a ser escolhido-->
          <div class="input">
            <form action="/action_page.php">
              <input type="number" id="quantity" name="quantity" min="1" max="1000000">   
          </form>
          </div>
          
          
          
          
         <button type="button" onclick="alert('Item adicionado ao seu pedido!')">Comprar</button>
       </div>
</body>
</html>	