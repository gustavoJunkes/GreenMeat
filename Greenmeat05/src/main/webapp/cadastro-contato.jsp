<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
<meta charset="ISO-8859-1">
<title>Contato</title>
</head>
<body>

	<!--FORMULÁRIO DE CADASTRO-->
	<div id="contato">
		<form method="post" action="inserir-contato">

			<h1>Contato</h1>
			<p>
				<label for="email"> E-mail</label> &nbsp; &nbsp; <input
					id="email" name="email" required="required" type="text"
					placeholder="contato@email.com" value="<c:out value='${contato.email}'/>"/>
			</p>

			<p>
				<label for="telefone"> Telefone</label> &nbsp;<input
					id="telefone" name="telefone" required="required" type="text"
					placeholder="telefone" value="<c:out value='${contato.telefone}' />" />
			</p>
			
				<label for="id"></label> <input id="id"
					name="id"  type="hidden" value="<c:out value='${contato.id}' />" />
			

			<p>
				<input type="submit" value="Cadastrar" />
			</p>

		</form>
	</div>
</body>
</html>