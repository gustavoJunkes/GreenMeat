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
		<jsp:include page="menu-lateral.jsp"/>
    </div>


	<c:forEach var="produto" items="${produtos}">
	
	<div class="gallery1">
      <div class="desc1"> 
      	<p><c:out value="${produto.nome}" /></p>
      	<p><c:out value="${produto.precoCusto}"/></p>
      </div>
      <form action="adicionar-produto-pedido" method="post">
      	<input type="hidden" name="idProduto" value='<c:out value="${produto.id}"></c:out>'>
      	<input type="submit" value="Adicionar ao pedido">
      </form>
    </div>
	
	</c:forEach>

</body>
</html>