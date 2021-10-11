<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
<title>Produtos Cadastrados</title>
</head>

<body>
<div>
	<%if(request.getSession().getAttribute("usuario") instanceof Cliente){%>
		<jsp:include page="../menu-lateral-cliente.jsp"/>
	<%} %>
	<%if(request.getSession().getAttribute("usuario") instanceof Funcionario){%>
		<jsp:include page="../menu-lateral-funcionario.jsp"/>
	<%}%>
	<%if(request.getSession().getAttribute("usuario") instanceof Fornecedor){%>	
	<jsp:include page="../menu-lateral-fornecedor.jsp"/>
	<%}%>
	</div>


  <div id="tabela_exibir_perfil">
  	<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Status</th>
					<th>Data de entrega</th>
					<th>Valor total</th>	
					<th>Editar</th>							
				</tr>
			</thead>
			<tbody>
				<c:forEach var="pedido" items="${pedidos}">
					<tr>
						<td><c:out value="${pedido.id}"/></td>
						<td><c:out value="${pedido.status}"/></td>
						<td><c:out value="${pedido.dataEntrega}"/></td>
						<td><c:out value="${pedido.valorTotal}"/></td>
						<a href=""></a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>