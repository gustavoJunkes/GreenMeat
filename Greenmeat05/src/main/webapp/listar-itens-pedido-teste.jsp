<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>Pedido</title>
</head>
<body>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">Produto</th>
				<th scope="col">Quantidade</th>
				<th scope="col">Valor total</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="item" items="${itens}">
			<tr>
				<th scope="row">1</th>
				<td><c:out value="${item.produto.nome}" /></td>
				<td><c:out value="${item.quantidade}" /></td>
				<td><c:out value="${item.valorTotal}" /></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>



</body>
</html>