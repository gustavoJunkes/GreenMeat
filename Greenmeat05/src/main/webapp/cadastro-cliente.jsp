<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>

<meta charset="ISO-8859-1">
<title>Cadastro Cliente</title>
</head>
<body>
	<div class="container">
		<a class="links" id="paracadastro"></a> <a class="links"
			id="paralogin"></a>
	</div>

	<!--FORMULÁRIO DE CADASTRO-->
	<div id="cadastro">
		<form method="post" action="inserir-cliente">

			<h1>Cadastre-se</h1>
			<p>
				<label for="nome"> Nome </label> <input id="nome" name="nome"
					required="nome" type="text" placeholder="nome"
					value="<c:out value=''/>" />
			</p>

			<p>
				<label for="sobrenome"> Sobrenome </label> <input id="sobrenome_cad"
					name="sobrenome" required="required" type="text"

					placeholder="Sobrenome" value='sobrenome'/>


			</p>

			<p>
				<label for="senha">Crie uma senha</label> <input id="senha"
					name="senha" required="required" type="password"
					placeholder="ex. 1234" value="<c:out value='${cliente.senha}'/>" />

			</p>

				<label for="id"></label> <input id="id"
					name="id"  type="hidden" value="<c:out value='${cliente.id}'/>" />


			<p>
				<input type="submit" value="Cadastrar" />
			</p>
			
			<p class="link">
				Já tem conta? <a href="#paralogin"> Ir para Login </a>
			</p>

		</form>
	</div>




</body>
</html>