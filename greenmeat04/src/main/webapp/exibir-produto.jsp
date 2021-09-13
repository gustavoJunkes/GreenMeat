<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div class="gallery1">
        <a target="_blank" href="">
          <img src="" alt="" width="600" height="400">
        </a>
        <c:forEach var="produto" items="${​​​​​produtos}​​​​​">
        <div class="desc1"> <c:out value="${​​​​​produto.nome}​​​​​" /> -
      <c:out value="${​​​​​produto.preco}​​​​​" /> <br>  <button type="button" onclick="alert('Item adicionado ao seu pedido!')">Comprar</button>
           </c:forEach>
        </div>

</body>
</html>