<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="UTF-8">

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
 <title>Exibição Produtos</title>
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