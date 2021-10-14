<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="UTF-8">
<title>Perfil Cliente</title>

 	
 	<link type="text/css" href="/resources/css/css/bootstrap.min.css" rel="stylesheet">
	<style><%@include file="/resources/css/css/bootstrap.min.css"%></style>
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
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
	<div>
		<jsp:include page="menu-lateral-cliente.jsp"/>
    </div>
   
   <div class="MeuPerfil">
   		<h3>Meu Perfil</h3>
   </div>
   <div id="tabela_exibir_perfil">
    <table>
    <tr>
       <th>Nome</th>
       <th>Sobrenome </th>
       <th>CPF</th>
       <th>Data De Nascimento</th>
       <th>E-mail</th>
       <th>Telefone</th>
    </tr>
      <tr>
        <td><c:out value="${cliente.nome}" /></td>
        <td><c:out value="${cliente.sobrenome}" /></td>
        <td><c:out value="${cliente.CPF}" /></td>
        <td><c:out value="${cliente.dataDeNascimento}" /></td>
        <td><c:out value="${contato.email}" /></td>
        <td><c:out value="${contato.telefone}" /></td>  
     </tr> 
    </table>
    </div> 
    <br>
    <div id="tabela_exibir_perfil">
    
    <c:forEach var="endereco" items="${enderecos}">
    <table>
    <tr>
        <th>Nome Da Rua</th>
        <th>Tipo Da Via</th>
        <th> Logradouro</th>
        <th> Número</th>
        <th> Cep</th>
        <th> Complemento</th>
       </tr>
      <tr>
        <td><c:out value="${endereco.nomeDaRua}" /></td>
        <td><c:out value="${endereco.tipoDaVia}" /></td>
        <td><c:out value="${endereco.logradouro}" /></td>
        <td><c:out value="${endereco.numero}" /></td>
        <td><c:out value="${endereco.CEP}" /></td>
        <td><c:out value="${endereco.complemento}" /></td>
    </table>
     </c:forEach> 
     
     <c:forEach var="localidade" items="${localidades}">
     <table>
     <tr>
     <th>País</th>
     <th>Estado</th>
     <th>Província</th>
     <th>Continente</th>
     </tr>
     <tr>
     <td><c:out value="${localidade.pais}" /></td>
     <td><c:out value="${localidade.estado}" /></td>
  	 <td><c:out value="${localidade.provincia}" /></td>
     <td><c:out value="${localidade.continente}" /></td>
     </tr>
     </table>
     </c:forEach> 
     
    </div>
</body>
</html>
