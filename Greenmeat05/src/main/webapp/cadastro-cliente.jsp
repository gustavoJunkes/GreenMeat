<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Cliente</title>

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>

</head>
<body>
	<div>
	<jsp:include page="menu-lateral.jsp"/>
   </div>
  
	<div id="cadastro">
		<form method="post" action="inserir-cliente">
			<h1>Cadastre-se</h1>
			<p>
				<label for="nome"> Nome </label> <input id="nome" name="nome"
					required="required" type="text" placeholder="nome"
					value="<c:out value=''/>" />
			</p>
			<p>
				<label for="sobrenome"> Sobrenome </label> <input id="sobrenome_cad"
					name="sobrenome" required="required" type="text"
					placeholder="Sobrenome" value='' />
					 <label for="login">Crie um Login</label> 
					 <input id="loginInserir" name="login" required="required" type="text" placeholder="login"
					value="<c:out value='${cliente.login}' />" />
			</p>
			<p>
				<label for="senha">Crie uma senha</label> <input id="senha"
					name="senha" required="required" type="password"
					placeholder="ex. 1234" value="<c:out value='${cliente.senha}'/>" />
			</p>
			<p>
				<label for="senha">Confirme sua senha</label> <input id="senha"
					name="senha" required="required" type="password"
					placeholder="ex. 1234" value="<c:out value='${cliente.senha}'/>" />
			</p>
			<label for="id"></label> <input id="id" name="id" type="hidden"
				value="<c:out value='${cliente.id}'/>" />
			<p>
				<input type="submit" value="Cadastrar" />
			</p>
			<p class="link">
				Já tem conta? <a href="login.jsp"> Ir para Login </a>
			</p>
		</form>
	</div>
</body>
</html>