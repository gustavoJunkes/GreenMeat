<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="ISO-8859-1">
<<<<<<< Updated upstream
=======
<title>Exibição Produtos</title>

 <style><%@include file="/resources/css/estilo.css"%></style>
>>>>>>> Stashed changes

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
<title>Exibição Produtos</title>
</head>

<body>

<<<<<<< Updated upstream
<div>
	<jsp:include page="menu-lateral.jsp"/>
   </div>
   
=======

	<div>
	<jsp:include page="menu-lateral.jsp"/>
	
   </div>


>>>>>>> Stashed changes
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