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
 <%--select * from produto where nome like "%var%"--%>
 .navbar-super{
 	top:0px;
	left:0%;
	width: 100%;
	box-shadow: lightgrey 0em 0em 1em 0px;
}

.main{
width: 70%;
left: 30%;
display: inline;
}

.produto{
	margin-top: 70px;
    margin-left: 5%;
    border: 0.1px solid rgb(0, 0, 0);
    float: left;
    width: 180px;
    
}
.separacao{
	left:150px;
	margin-left:200px; 
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
    			<form class="form-inline my-2 my-lg-0" action="pesquisar-produtos" method="post">
	      		<input class="form-control mr-sm-2" type="search" placeholder="Pesquisar" aria-label="Pesquisar" name="nome">
      				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Pesquisar</button>
    			</form>
  		</div>
	</nav>

<%if(request.getSession().getAttribute("usuario") instanceof Cliente){%>
		<jsp:include page="../menu-lateral-cliente.jsp"/>
	<%} %>
	<%if(request.getSession().getAttribute("usuario") instanceof Funcionario){%>
		<jsp:include page="../menu-lateral-funcionario.jsp"/>
	<%}%>
	<%if(request.getSession().getAttribute("usuario") instanceof Fornecedor){%>	
	<jsp:include page="../menu-lateral-fornecedor.jsp"/>
	<%}%>


<div class="container separacao">
    <div class="row">
        <div class="col-md-8" >
        <c:forEach var="produto" items="${produtos}">
	
	<div class="produto">
      		<div class="desc1"> 
      			<p><c:out value="${produto.nome}" /></p>
      			<p><c:out value="${produto.precoVenda}"/></p>
        </div>
      	<%if(request.getSession().getAttribute("usuario") instanceof Cliente){ %>
      		<form action="adicionar-produto-pedido" method="post">
		      	<input type="hidden" name="idProduto" value='<c:out value="${produto.id}"></c:out>'>
		      	<input type="submit" value="Adicionar ao pedido">
      		</form>
      	<%}%>
    	</div>
	
	</c:forEach>
       	</div>
        <div class="col-md-2">
       <div class="lista-compras">
          <ul>
          <c:forEach var="item" items="${itens}">
            <li class="list-group-item d-flex justify-content-between lh-condensed">
              <div>
                <h6 class="my-0"><c:out value="${item.produto.nome}-${item.quantidade} unidades" /></h6>
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
</div>
</body>
</html>