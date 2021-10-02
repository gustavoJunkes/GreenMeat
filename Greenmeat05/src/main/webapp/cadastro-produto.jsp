<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
</head>

<body>
<div>
	<jsp:include page="menu-lateral.jsp"/>
	
   </div>

<div class="cadastro_produto">
<form method="post" action="inserir-produto">
	<h1>Cadastro de Produto</h1>
	<p>
		<label for="nome"> Nome: </label> <input id="nome" required="required"
			type="text" value="" name="nome">
	</p>
	<br> 
	<label for="descricao">Descrição: </label> <input id="nome"
		required="required" type="text" value="" name="descricao"> <label
		for="precoCusto">Preço de custo: </label> <input id="nome"
		required="required" type="number" value="" name="precoCusto">
<br>
	<label for="precoVenda">Preço de venda: </label> <input id="nome"
		required="required" type="number" value="" name="precoVenda">
	
	<br>
	
	<label for="TipoCarne">Tipo: </label> <input id="nome"
		required="required" type="text" value="" name="tipoCarne">

	<br>
	
	<label for="id">Id do fornecedor: </label> <input id=""
		required="required" type="text" value="" name="idFornecedor">

	<br>
	
	<p>
		<button type="submit">Salvar</button>
	</p>
	<p class="link">
		Já tem conta? <a href="#paralogin"> Ir para Login </a>
	</p>
</form>
 </div>
</body>
</html>
