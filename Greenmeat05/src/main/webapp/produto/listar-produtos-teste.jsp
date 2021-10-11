<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>
	<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 	<style><%@include file="/resources/css/mystyles.css"%></style>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
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

	<c:forEach var="produto" items="${produtos}">
	
	<div class="gallery1">
      <div class="desc1"> 
      	<p><c:out value="${produto.nome}" /></p>
      	<p><c:out value="${produto.precoCusto}"/></p>
      </div>
      <%if(request.getSession().getAttribute("usuario") instanceof Cliente){ %>
      <form action="adicionar-produto-pedido" method="post">
      	<input type="hidden" name="idProduto" value='<c:out value="${produto.id}"></c:out>'>
      	<input type="submit" value="Adicionar ao pedido">
      </form>
      <%} %>
    </div>
	
	</c:forEach>

</body>
</html>