<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>
	<link type="text/css" rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"resources/css/teste.css/>
 	<style><%@include file="/resources/css/mystyles.css"%></style>
 	
 	<link type="text/css" href="/resources/css/css/bootstrap.min.css" rel="stylesheet">
	<style><%@include file="/resources/css/css/bootstrap.min.css"%></style>
	
	<meta charset="UTF-8">
	<title>Produtos</title>
	
	<style>
	.lista-compras{
  position: fixed;
  right: 2px;
  top: 10%;
 }
 
 .navbar-super{
	left:20%;
	width: 60%;
}
 </style>
</head>
<body>

	<nav class="navbar navbar-super navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado" aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="conteudoNavbarSuportado">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(página atual)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
 
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Pesquisar" aria-label="Pesquisar">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Pesquisar</button>
    </form>
  </div>
</nav>

	
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


<div class="lista-compras"> 
<div class="row">
        <div>
          <ul>
          <c:forEach var="item" items="${itens}">
            <li class="list-group-item d-flex justify-content-between lh-condensed">
              <div>
                <h6 class="my-0"><c:out value="${item.produto.nome}" /></h6>
                <small class="text-muted"><c:out value="${item.produto.descricao}" /></small>
              </div>
              <span class="text-muted"><c:out value="${item.produto.precoVenda}" /></span>
            </li>
          </c:forEach>            
            <li class="list-group-item d-flex justify-content-between">
              <span>Total (BRL)</span>
              <strong>R$<c:out value="${pedido.valorTotal}" /></strong>
            </li>
          </ul>

          <form class="card p-2">
            <div class="input-group">
              <input type="text" class="form-control" placeholder="Pesquisar item">
              <div class="input-group-append">
                <button type="submit" class="btn btn-secondary">Pesquisar</button>
              </div>
            </div>
          </form>
        </div>
	</div>
</div>

<main>


<c:forEach var="produto" items="${produtos}">
	
	<div class="gallery1">
      <div class="desc1"> 
      	<p><c:out value="${produto.nome}" /></p>
      	<p><c:out value="${produto.precoCusto}"/></p>
      </div>
      <%if(request.getSession().getAttribute("usuario") instanceof Cliente){ %>
      <form action="adicionar-produto-pedido" method="post">
      	<input type="hidden" name="idProduto" value='<c:out value="${produto.id}"></c:out>'>
      	<input type="submit" value="Adicionar ao pedido">
      </form>
      <%} %>
    </div>
	
	</c:forEach>

</main>
</body>
</html>