<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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