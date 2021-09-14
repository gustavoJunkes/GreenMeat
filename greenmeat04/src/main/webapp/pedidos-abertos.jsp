<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style type="text/css"> @import url("../css/texto.css"); </style>

</head>
<body>
  <div class="txt">
  <h2>Seus Pedidos</h2>
  </div>

<table>
  <tr>
    <th>ID do seu produto</th>
    <th>Nome</th>
    <th>Quantidade</th>
    <th>Preço</th>
    <th>Status</th>
  
   
   </tr>
      <c:forEach var="item" items="${itens}">
   
  
  <tr>
  	<td>value="<c:out value='${item.produto.id}'/></td>
    <td>value="<c:out value='${item.produto.nome}'/></td>
    <td>value="<c:out value='${item.produto.preco}'/></td>
    <td>value="<c:out value='${item.quantidade}'/></td>
    <td>value="<c:out value='${item.status}'/></td>
    
    
  </tr>
  </c:forEach>
</table>



</body>
</html>