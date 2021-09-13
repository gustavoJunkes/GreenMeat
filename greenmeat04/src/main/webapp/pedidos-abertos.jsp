<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style type="text/css"> @import url("../css/texto.css"); </style>

</head>
<body>
  <div class="txt"><h2>Seus Pedidos</h2></div>

<table>
  <tr>
    <th>Nome do Produto</th>
    <th>Preço</th>
   
   
    <c:forEach var="produto" items="${produtos}">
   
  </tr>
  <tr>
    <td>value="<c:out value='${produto.nome}'/></td>
    <td>value="<c:out value='${produto.proço}'/></td>
    
  </tr>
 
</table>



</body>
</html>