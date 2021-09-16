<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Cadastro Produto</title>
</head>
<body>

	<form method="post" action="inserir-produto">

		<h1>Cadastro de Produto</h1>
		<p>
			<label for="nome"> Nome do Produto </label> <input
				id="nome" type="text"
				value="<c:out value='${produto.nome}' />" name="nome" />

		</p>

		<p>
			<label for=" descricao"> Descrição </label> <input id=" descricao"
				required="required" type="text"
				value="<c:out value='${produto.descricao}' />"
				name="descricao">
		</p>

		<p>
			<label for=" precoCusto"> Preço Custo </label> <input
				id=" precoCusto" required="required" type="text"
				value="<c:out value='${produto.precoCusto}' />" name="precoCusto">
		</p>

		<p>
			<label for="precoVenda"> Preço Venda</label> <input id=" precoVenda"
				required="required" type="text"
				value="<c:out value='${produto.precoVenda}' />" name="precoVenda">
		</p>

		<p>
			<label for="tipoCarne"> Tipo da carne</label> <input id="tipoCarne"
				required="required" type="text"
				value="<c:out value='${produto.tipoCarne}' />" name="tipoCarne">
		</p>

		<br>
		<p>
			<button type="submit">Salvar</button>
		</p>

		<p class="link">
			Já tem conta? <a href="#paralogin"> Ir para Login </a>
		</p>

	</form>
</body>
</html>