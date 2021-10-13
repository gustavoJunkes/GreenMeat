<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

    <div class="txt_lista_fornecedores"><h3>Lista dos Clientes cadastrados</h3></div>
	<div class="tabela_exibir_fornecedores">
	
	<table>

  <thead>
      <tr>
    <th>Id</th>
    <th>Nome </th>
    <th>Sobrenome</th>
    <th>CPF</th>
   </tr>
  <tr>
  <c:forEach var="cliente" items="${clientes}">
	<tr>
    <td><c:out value="${cliente.id}" /></td>
    <td><a href="perfil-cliente?id=<c:out value='${cliente.id}'/>"><c:out value="${cliente.nome}" /></a> </td>
    <td><c:out value="${cliente.sobrenome}" /></td>
    <td><c:out value="${cliente.CPF}" /></td>
   
 </tr>
    </c:forEach>
    </tbody>
    </table>
    </div>

</body>
</html>