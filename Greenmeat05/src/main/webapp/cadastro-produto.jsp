<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>




<form method="post" action="inserirNutricionista">
<h1>Cadastro de Produto</h1>
<p>
<label for="nome"> Nome: </label> <input id="nome"
required="required" type="text"
value="${produto.nome}" name="nome">
</p>
<br>
<p>
<button type="submit">Salvar</button>
</p>
<p class="link">
Já tem conta? <a href="#paralogin"> Ir para Login </a>
</p>
</form>