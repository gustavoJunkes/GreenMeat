<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<<<<<<< Updated upstream
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored="false" %>
=======
    <%@ page isELIgnored="false" %>




>>>>>>> Stashed changes
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
<title>Perfil Funcionário</title>

 <style><%@include file="/resources/css/estilo.css"%></style>


</head>
<body>
<<<<<<< Updated upstream
<div>
	<jsp:include page="menu-lateral.jsp"/>
   </div>
=======

	<div>
	<jsp:include page="menu-lateral.jsp"/>
	
   </div>



>>>>>>> Stashed changes
 <div class=imagemPerfil>
<img src="perfil_img.jfif" alt=""></div>




    <div class="MeuPerfil"><h3>Meu Perfil</h3></div>
    <div class="tabela_exibir_perfil">
     <c:forEach var="funcionario" items="${funcionarios}">
    <table>
    <tr>
        <th>Nome</th>
        <th>Sobrenome </th>
        <th> CPF</th>
        <th> Data De Nascimento</th>
        <th> Função</th>
        <th> Cargo</th>
       <th>E-mail</th>
       <th>Telefone</th>
       
      </tr>
      <tr>
        <td><c:out value="${funcionario.nome}" /></td>
        <td><c:out value="${funcionario.sobrenome}" /></td>
        <td><c:out value="${funcionario.CPF}" /></td>
        <td><c:out value="${funcionario.dataDeNascimento}" /></td>
        <td><c:out value="${funcionario.funcao}" /></td>
        <td><c:out value="${funcionario.cargo}" /></td>
        <td><c:out value="${contato.email}" /></td>
        <td><c:out value="${contato.telefone}" /></td>
     
    </table>
     </c:forEach>
    </div>

  
    <div class="tabela_exibir_perfil">
     <c:forEach var="endereco" items="${enderecos}">
    <table>
    <tr>
        <th>Nome Da Rua</th>
        <th>Tipo Da Via</th>
        <th> Logradouro</th>
        <th> Número</th>
        <th> Cep</th>
        <th> Complemento</th>
       <th>País</th>
       <th>Estado</th>
       <th>Província</th>
       <th>Continente</th>
       
      </tr>
      <tr>
        <td><c:out value="${endereco.nomeDaRua}" /></td>
         <td><c:out value="${endereco.tipoDaVia}" /></td>
        <td><c:out value="${endereco.logradouro}" /></td>
        <td><c:out value="${endereco.numero}" /></td>
        <td><c:out value="${endereco.cep}" /></td>
        <td><c:out value="${endereco.complemento}" /></td>
        <td><c:out value="${localidade.pais}" /></td>
        <td><c:out value="${localidade.estado}" /></td>
        <td><c:out value="${localidade.provincia}" /></td>
        <td><c:out value="${localidade.continente}" /></td>
     
    </table>
     </c:forEach>
    </div>
</body>
</html>