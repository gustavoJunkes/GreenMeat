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
<title>Fornecedores</title>
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

    <div class="txt_lista_fornecedores"><h3>Lista dos Fornecedores cadastrados</h3></div>
	<div class="tabela_exibir_fornecedores">
	
	<table>

  <thead>
      <tr>
    <th>Id</th>
    <th>Nome Fantasia</th>
    <th>Razão Social</th>
    <th>CNPJ</th>
   </tr>
  <tr>
  <c:forEach var="fornecedor" items="${fornecedores}">
	<tr>
    <td><c:out value="${fornecedor.id}" /></td>
    <td><c:out value="${fornecedor.nomeFantasia}" /></td>
    <td><c:out value="${fornecedor.razaoSocial}" /></td>
    <td><c:out value="${fornecedor.CNPJ}" /></th>
   
 </tr>
    </c:forEach>
    </tbody>
    </table>
    </div>
</body>
</html>