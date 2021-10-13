<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Opções de compra</title>


<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>

</head>
<body>

<div class= "descricao-produto">

<p>
			<td><c:out value="${produtos.id}" />
    <h3>      <c:out value="${produtos.nome}" /> 			<br>
              <c:out value="${produtos.descricao}" />		<br>
              <c:out value="${produtos.tipoCarne }" /> 		<br>   </h3>
</p>
</div>

    <div class="opcoes_vendas">
        <h4>Informe a quantidade do produto</h4>
    <div class="input">
        <form action="/action_page.php">
          <input type="number" id="quantity" name="quantity" min="1" max="1000000">   
        </form> 
      </div>
          
      <div class="botao_comprar">
      <button type="button" onclick="alert('Item adicionado a lista de pedidos!')">Comprar</button>
    </div>
</div>

</body>
</html>