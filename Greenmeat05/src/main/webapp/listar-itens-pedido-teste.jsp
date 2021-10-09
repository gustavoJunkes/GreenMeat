<%@page import="java.util.List"%>
<%@page import="modelo.entidade.produto.Item"%>
<%@page import="modelo.entidade.produto.Produto"%>
<%@page import="modelo.dao.produto.ProdutoDAO"%>
<%@page import="modelo.dao.produto.ProdutoDAOImpl"%>
<%@page import="modelo.dao.item.ItemDAOImpl"%>
<%@page import="modelo.dao.item.ItemDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
<title>Pedido</title>
</head>
<body>
	<div>
		<jsp:include page="menu-lateral.jsp"/>
    </div>
	
  <div id="tabela_exibir_perfil">
	<table>
		<thead>
			<tr>
				<th scope="col">Produto</th>
				<th scope="col">Quantidade</th>
				<th scope="col">Valor</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="item" items="${itens}">
			<tr>
				<td><c:out value="${item.produto.nome}" /></td>
				<td><c:out value="${item.quantidade}" /></td>
				<td><c:out value="${item.valorTotal}" /></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>


</body>
</html>