<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 	<link type="text/css" href="/resources/css/css/bootstrap.min.css" rel="stylesheet">
	<style><%@include file="/resources/css/css/bootstrap.min.css"%></style>
	
	
 	
	<style type="text/css">	
	.lista-compras{
  position: fixed;
  right: 2px;
  top: 10%;
 }
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
<body>
<nav class="navbar navbar-super navbar-expand-lg navbar-light bg-light">
  		<a class="navbar-brand" href="#">Ecological Meat</a>
  		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado" aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
   			<span class="navbar-toggler-icon"></span>
 		</button>

  		<div class="collapse navbar-collapse" id="conteudoNavbarSuportado">
    			<ul class="navbar-nav mr-auto">
      				<li class="nav-item active">
        				<a class="nav-link" href="index.jsp">Home <span class="sr-only">(página atual)</span></a>
      				</li>
      				<li class="nav-item active">
       	 				<a class="nav-link" href="novo-cliente">Cadastre-se <span class="sr-only">(página atual)</span></a>
      				</li>
      				<li class="nav-item active">
       	 				<a class="nav-link" href="novo-fornecedor">Seja um Fornecedor <span class="sr-only">(página atual)</span></a>
      				</li>
      				
      				<li class="nav-item active">
       	 				<a class="nav-link" href="listar-produtos">Produtos<span class="sr-only">(página atual)</span></a>
      				</li>


    	 		</ul>
  		</div>
	</nav>
</body>
</html>