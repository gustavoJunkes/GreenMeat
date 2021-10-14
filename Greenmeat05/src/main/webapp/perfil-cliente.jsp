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
        <c:forEach var="cliente" items="${clientes}">
        <td><c:out value="${cliente.nome}" /></td>
        <td><c:out value="${cliente.sobrenome}" /></td>
        <td><c:out value="${cliente.CPF}" /></td>
        <td><c:out value="${cliente.dataDeNascimento}" /></td>
        <td><c:out value="${contato.email}" /></td>
        <td><c:out value="${contato.telefone}" /></td>  
         </c:forEach> 
     </tr> 
    </table>
    </div> 
    <br>
    <div id="tabela_exibir_perfil">

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
      <c:forEach var="endereco" items="${enderecos}">
        <td><c:out value="${endereco.nomeDaRua}" /></td>
        <td><c:out value="${endereco.tipoDaVia}" /></td>
        <td><c:out value="${endereco.logradouro}" /></td>
        <td><c:out value="${endereco.numero}" /></td>
        <td><c:out value="${endereco.CEP}" /></td>
        <td><c:out value="${endereco.complemento}" /></td>
         </c:forEach> 
         </tr>
    </table>
     
     <table>
     <tr>
     <th>País</th>
     <th>Estado</th>
     <th>Província</th>
     <th>Continente</th>
     </tr>
     <tr>
       <c:forEach var="localidade" items="${localidades}">
     <td><c:out value="${localidade.pais}" /></td>
     <td><c:out value="${localidade.estado}" /></td>
  	 <td><c:out value="${localidade.provincia}" /></td>
     <td><c:out value="${localidade.continente}" /></td>
      </c:forEach> 
     </tr>
     </table>
    </div>
</body>
</html>
