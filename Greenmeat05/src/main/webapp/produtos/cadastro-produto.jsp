<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Produto</title>
<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
</head>

<body>
<div>
	<jsp:include page="../menu-lateral.jsp"/>
	
   </div>

<div id="cadastro">
<form method="post" action="inserir-produto">
	<h1>Cadastro de Produto</h1>
	
		<label for="nome"> Nome: </label> <input id="nome" required="required"
			type="text" value="" name="nome">
	<br> 
	<label for="descricao">Descrição: </label> <input id="nome"
		required="required" type="text" value="" name="descricao"> <label
		for="precoCusto">Preço de custo: </label> <input id="nome"
		required="required" type="number" value="" name="precoCusto">
<br>
	<label for="precoVenda">Preço de venda: </label> <input id="nome"
		required="required" type="number" value="" name="precoVenda">
	
	<br>
	


	<br>
	<label for="TipoCarne">Tipo: </label> <input id="nome"
		required="required" type="text" value="" name="tipoCarne">

	<br>
	
	<label for="id">Id do fornecedor: </label> <input id=""
		required="required" type="text" value="" name="idFornecedor">

	<br>
	
	<br>
		<input type="submit" value="Salvar" />

</form>
 </div>
</body>
</html>
