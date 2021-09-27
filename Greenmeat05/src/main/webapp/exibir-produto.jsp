<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exibição Produtos</title>
</head>
<body>

  <div class="gallery1">
        <a target="_blank" href="">
          <img src="" alt="" width="600" height="400">
        </a>
        <c:forEach var="produto" items="${produtos}">
        <div class="desc1"> <c:out value="${produto.nome}" /> -
      <c:out value="${produto.preco}" /> <br>  <!--sobre a quantidade do produto a ser escolhido-->
          <div class="input">
            <form action="/action_page.php">
              <input type="number" id="quantity" name="quantity" min="1" max="1000000">   
           
            </form> 
          </div> <button type="button" onclick="alert('Item adicionado ao seu pedido!')">Comprar</button> </div>
           </c:forEach>
        </div>
</body>
</html>	