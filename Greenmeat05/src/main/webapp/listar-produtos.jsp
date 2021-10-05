<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="ISO-8859-1">
	<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 	<style><%@include file="/resources/css/mystyles.css"%></style>
	<title>Produtos Cadastrados</title>
</head>
<body>
<div>
  <c:forEach var="produto" items="${produtos}">
	<div class="gallery1">
        <div class="desc1">
        	<p><c:out value="${produto.nome}"/> </p>
			<p><c:out value="${produto.descricao}"/> </p>
			<p><c:out value="${produto.preco}"/> </p>
		  	<br> 
        	<button type="button" onclick="alert('Item adicionado ao carrinho!')">Comprar</button>
   		</div>	
	</div>
  </c:forEach>
  	
 	<form method="post" action="listar-produtos">
		<table>
			<thead>
				<tr>
					<th>Nome</th>
					<th>Descrição</th>
					<th>Preço</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="produto" items="${produtos}">
					<tr>
						<td><c:out value="${produto.nome}"/></td>
						<td><c:out value="${produto.descricao}"/></td>
						<td><c:out value="${produto.preciVenda}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
	</div>
</body>
</html>