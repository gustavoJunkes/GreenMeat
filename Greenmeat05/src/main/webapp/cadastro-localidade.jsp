<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>

<meta charset="ISO-8859-1">
<title>cadastro-localidade</title>
</head>
<body>

<form action="inserir-localidade" method="post">
	<div class="formulario"></div>
			<label>País</label><br>
			<input type="text" value="<c:out value='${localidade.pais}'/>" name="pais" >
						
			<label>Estado</label><br>
			<input type="text" value="<c:out value='${localidade.estado}'/>" name="estado" >		

			<label>Cidade</label><br>
			<input type="text" value="<c:out value="${localidade.provincia}"/>" name="provincia" >		

			<label>Continente</label><br>
			<input type="text" value="<c:out value="${localidade.continente}"/>" name="continente">		
			
			<button class="button" type="submit">Cadastrar</button>
	</form>
</body>
</html>