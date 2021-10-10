<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>" resources/css/mystyle.css />
<style>
<%@ include file="/resources/css/mystyles.css"%>
</style>
<title>Pedido</title>
</head>
<body>
	<div>
	<%if(request.getSession().getAttribute("usuario") instanceof Cliente){%>
		<jsp:include page="menu-lateral-cliente.jsp"/>
	<%} %>
	<%if(request.getSession().getAttribute("usuario") instanceof Funcionario){%>
		<jsp:include page="menu-lateral-funcionario.jsp"/>
	<%}%>
	<%if(request.getSession().getAttribute("usuario") instanceof Fornecedor){%>	
	<jsp:include page="menu-lateral-fornecedor.jsp"/>
	<%}%>
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
						<td><a href="editar?id=<c:out value='${item.id}'/>">Editar</a>	<a href="deletar?id=<c:out value='${item.id}'/>">Deletar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<form action="finalizar-pedido" method="post">
			<input type="hidden" value="${pedido.id}" name="idPedido">
			<input type="submit" value="Finalizar pedido">
		</form>
		
	</div>


</body>
</html>