<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exibição Produtos</title>
 <style><%@include file="/resources/css/estilo.css"%></style>

</head>

<body>

<% out.print("welcome to jsp"); %>  

<% String nome = request.getParameter("nomeProduto");
out.print(nome);		
%>  

<c:out value="${produto.nome}"/>

<div>
	
	
   </div>
   
	<a href="<%=request.getContextPath()%>/listar-produtos">Produtos</a>
	<c:out value="${produto.precoCusto}"/>
	<form method="post" action="listar-produtos">
		<table>
			<thead>
				<tr>
					<th>Preço</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="produto" items="${produtos}">
					<tr>
						<td><c:out value="${produto.precoCusto}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>