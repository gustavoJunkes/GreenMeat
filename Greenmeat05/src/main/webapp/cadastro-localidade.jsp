<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>

<<<<<<< Updated upstream
<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
=======
 <style><%@include file="/resources/css/estilo.css"%></style>
 
>>>>>>> Stashed changes

<meta charset="ISO-8859-1">
<title>cadastro-localidade</title>
</head>
<body>
<div>
	<jsp:include page="menu-lateral.jsp"/>
   </div>

<<<<<<< Updated upstream
<div id="cadastro">
=======
	
	<div>
	<jsp:include page="menu-lateral.jsp"/>
	
   </div>


>>>>>>> Stashed changes
<form action="inserir-localidade" method="post">

<h1>Localidade</h1>

			<label>País</label><br>
			<input type="text" value="<c:out value='${localidade.pais}'/>" name="pais" >
						
			<label>Estado</label><br>
			<input type="text" value="<c:out value='${localidade.estado}'/>" name="estado" >		

			<label>Cidade</label><br>
			<input type="text" value="<c:out value="${localidade.provincia}"/>" name="provincia" >		

			<label>Continente</label><br>
			<input type="text" value="<c:out value="${localidade.continente}"/>" name="continente">		
		
				<input type="submit" value="Continuar Cadastro" />
			
	</form>
	</div>
</body>
</html>