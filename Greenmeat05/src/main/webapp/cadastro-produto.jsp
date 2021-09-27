<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<form method="post" action="inserirNutricionista">
<h1>Cadastro de nutricionista</h1>
<p>
<label for="nome"> Nome: </label> <input id="nome"
required="required" type="text"
value="${produto.nome}" name="nome">
</p>
<p>
<label for="sobrenome"> Sobrenome </label> <input id="sobrenome"
required="required" type="text"
value="${nutricionista.sobrenome}" name="sobrenome">
</p>
<p>
<label for="cnpj"> CNPJ: </label> <input id="cnpj"
required="required" type="text"
value="${nutricionista.cnpj}" name="cnpj">
</p>
<p>
<label for="senha"> Senha: </label> <input id="senha"
required="required" type="text"
value="${nutricionista.senha}" name="senha">
</p>
<br>
<p>
<button type="submit">Salvar</button>
</p>
<p class="link">
Já tem conta? <a href="#paralogin"> Ir para Login </a>
</p>
</form>