<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
 <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <style><%@include file="/resources/css/estilo.css"%></style>
<title>cadastro-contato</title>
</head>
<body>

	<div>
	<jsp:include page="menu-lateral.jsp"/>
	
   </div>


	<!--FORMULÁRIO DE CADASTRO-->
	<div id="contato">
		<form method="post" action="inserir-contato">

			<h1>Contato</h1>
			<p>
				<label for="email_cad"> E-mail</label> &nbsp; &nbsp; <input
					id="email" name="email" required="required" type="text"
					placeholder="contato@email.com" value='${contato.email}' />"/>
			</p>

			<p>
				<label for="telefone_cad"> Telefone</label> &nbsp;<input
					id="telefone" name="telefone" required="required" type="text"
					placeholder="telefone" value='${contato.telefone}' />" />
			</p>

			<p>
				<input type="submit" value="Cadastrar" />
			</p>

		</form>
	</div>
</body>
</html>