<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Funcionarios</title>
<<<<<<< Updated upstream
=======

<style><%@include file="/resources/css/estilo.css"%></style>

</head>
<body>
>>>>>>> Stashed changes

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>

</head>
<body>
<div>
	<jsp:include page="menu-lateral.jsp"/>
	
   </div>

    <div class="txt_lista_fornecedores"><h3>Lista dos Fornecedores</h3></div>
<div class="tabela_exibir_fornecedores"><table>
<tr>
    <th>Id</th>
    <th>Razão Social </th>
    <th> CNPJ</th>
   <th>E-mail</th>
   <th>Telefone</th>
   <th>Estado</th>
   <th>Pais</th>
   
  </tr>
  <tr>
  <c:forEach var="produtos" items="${fornecedor}">
  
    <td><c:out value="${fornecedor.id_fornecedor}" /></td>
    <td><c:out value="${fornecedor.razaosocial}" /></td>
    <th><c:out value="${fornecedor.CNPJ}" /></th>
    <th><c:out value="${fornecedor.email}" /></th>
    <th><c:out value="${fornecedor.telefone}" /></th>
    <th><c:out value="${fornecedor.estado}" /></th>
    <th><c:out value="${fornecedor.pais}" /></th>
 	
 	
 
</c:forEach>
</table>
</div>


</body>
</html>