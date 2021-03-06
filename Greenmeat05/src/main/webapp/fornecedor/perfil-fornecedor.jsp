<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="UTF-8">

<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>" resources/css/mystyle.css />
<style><%@include file="/resources/css/mystyles.css"%></style><title>Perfil Fornecedor</title>
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

	<%if(request.getSession().getAttribute("usuario") instanceof Cliente){%>
		<h3>Detalhes do fornecedor</h3>
	<%} %>
	<%if(request.getSession().getAttribute("usuario") instanceof Funcionario){%>
		<h3>Detalhes do fornecedor</h3>
	<%}%>
	<%if(request.getSession().getAttribute("usuario") instanceof Fornecedor){%>	
		<h3>Meu perfil</h3>
	<%}%>
		
	
	<div id="tabela_exibir_perfil">
		<table>
			<tr>
				<th>ID</th>
				<th>Razão Social</th>
				<th>Nome Fantasia</th>
				<th>CNPJ</th>
				<th>E-mail</th>
				<th>Telefone</th>
			</tr>
			<tr>
				<c:forEach var="fornecedor" items="${fornecedores}">
				<td><c:out value="${fornecedor.id}" /></td>
				<td><c:out value="${fornecedor.razaoSocial}" /></td>
				<td><c:out value="${fornecedor.nomeFantasia}" /></td>
				<td><c:out value="${fornecedor.CNPJ}" /></td>
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
				<th>Logradouro</th>
				<th>Número</th>
				<th>Cep</th>
				<th>Complemento</th>
				<th>País</th>
				<th>Estado</th>
				<th>Província</th>
				<th>Continente</th>

			</tr>
			<tr>
				<c:forEach var="endereco" items="${enderecos}">
					<td><c:out value="${endereco.nomeDaRua}" /></td>
					<td><c:out value="${endereco.tipoDaVia}" /></td>
					<td><c:out value="${endereco.logradouro}" /></td>
					<td><c:out value="${endereco.numero}" /></td>
					<td><c:out value="${endereco.cep}" /></td>
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