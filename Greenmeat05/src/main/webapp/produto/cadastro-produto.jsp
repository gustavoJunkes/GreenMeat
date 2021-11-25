<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>

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
	<%if(request.getSession().getAttribute("usuario") instanceof Cliente){%>
		<jsp:include page="../menu-lateral-cliente.jsp"/>
	<%} %>
	<%if(request.getSession().getAttribute("usuario") instanceof Funcionario){%>
		<jsp:include page="../menu-lateral-funcionario.jsp"/>
	<%}%>
	<%if(request.getSession().getAttribute("usuario") instanceof Fornecedor){%>	
	<jsp:include page="../menu-lateral-fornecedor.jsp"/>
	<%}%>
	</div>
<div id="cadastro">
	<c:if test="${contato != null}">
		<form action="atualizar-produto" method="post">
	</c:if>
	<c:if test="${contato == null}">
		<form action="inserir-produto" method="post">
	</c:if>	
	<h2>
	<c:if test="${produto != null}">Editar Produto</c:if>
	<c:if test="${produto == null}">Inserir Produto</c:if>
	</h2>
	
		<label for="nome"> Nome: </label> <input id="nome" required="required"
			type="text" value="<c:out value='${produto.nome}' />" name="nome">
	<br> 
	<br> 
	<label for="descricao">Descrição: </label> <input id="nome"
		required="required" type="text" value="<c:out value='${produto.descricao}' />" name="descricao"> 
		
		<br> <br> 
		<label for="precoCusto">Preço de custo: </label> <input id="nome"
		required="required" type="number" value="<c:out value='${produto.precoCusto}' />" name="precoCusto">
<br>
<br> 
	<label for="precoVenda">Preço de venda: </label> <input id="nome"
		required="required" type="number" value="<c:out value='${produto.precoVenda}' />" name="precoVenda">
	
	<br>
	<br> 
	<label for="TipoCarne">Tipo: </label> <input id="nome"
		required="required" type="text" value="<c:out value='${produto.tipoCarne}' />" name="tipoCarne">

	<br>
	<br> 
	<label for="quantidadeEmEstoque">Quantidade em estoque: </label> <input id="quantidadeEmEstoque"
		required="required" type="number" value="<c:out value='${item.quantidade}' />" name="quantidadeEmEstoque">
	
	<br>
	<br> 
	<label for="id">Id do fornecedor: </label> <input id=""
		required="required" type="text" value="<c:out value='${produto.fornecedor.id}' />" name="idFornecedor">

	<br>
	<br> 
	
	
		<input type="submit" value="Salvar" />

</form>
 </div>
</body>
</html>
