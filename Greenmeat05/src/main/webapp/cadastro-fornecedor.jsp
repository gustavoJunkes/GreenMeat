<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Fornecedor</title>

<<<<<<< Updated upstream
<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
=======


    <link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
 



>>>>>>> Stashed changes
 
</head>
<body>
	<div>
<<<<<<< Updated upstream
	<jsp:include page="menu-lateral.jsp"/>	
=======
	<jsp:include page="menu-lateral.jsp"/>
>>>>>>> Stashed changes
   </div>

	<div id="cadastro">
		<form method="post" action="inserir-fornecedor">
			<h1>Cadastre-se</h1>
			<p>
				<label for="razaoSocial"> Raz�o Social</label> <input
					id="razaoSocial" name="razaoSocial" required="required" type="text"
					placeholder="raz�o social"
					value="<c:out value='${fornecedor.razaoSocial}' />" />
			</p>
			<p>
				<label for="nomeFantasia"> Nome Fantasia </label> <input
					id="nomeFantasia" name="nomeFantasia" required="required"
					type="text" placeholder="nome fantasia"
					value="<c:out value='${fornecedor.nomeFantasia}' />" />
			</p>
			<p>
				<label for="CNPJ"> CNPJ</label> &nbsp; &nbsp; &nbsp; &nbsp;<input
					id="CNPJ" name="CNPJ" required="required" type="text"
					placeholder="CNPJ" value="<c:out value='${fornecedor.cnpj}' />" />
			</p>
			<p>
				<label for="login">Crie um Login</label> <input id="loginInserir"
					name="login" required="required" type="text" placeholder="login"
					value="<c:out value='${fornecedor.login}' />" />
			</p>
			<p>
				<label for="senha">Crie uma senha</label> <input id="senha"
					name="senha" required="required" type="password"
					placeholder="ex. 1234"
					value="<c:out value='${fornecedor.senha}' />" />
			</p>
			<p>
				<input type="submit" value="Continuar Cadastro" />
			</p>
			<p class="link">
				J� tem conta? <a href="login.jsp"> Ir para Login </a>
			</p>
		</form>
	</div>
</body>
</html>