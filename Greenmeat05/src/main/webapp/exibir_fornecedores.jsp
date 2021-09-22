<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Funcionarios</title>
</head>
<body>

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
  <c:forEach var="produtos" items="${fornecedor}">
  <tr>
    <td><c:out value="${fornecedor.id_fornecedor}" /></td>
    <td><c:out value="${fornecedor.razaosocial}" /></td>
    <th><c:out value="${fornecedor.CNPJ}" /></th>
    <th><c:out value="${fornecedor.email}" /></th>
    <th><c:out value="${fornecedor.telefone}" /></th>
    <th><c:out value="${fornecedor.estado}" /></th>
    <th><c:out value="${fornecedor.pais}" /></th>
 	
 	</th>
 
</c:forEach>
</table>
</div>


</body>
</html>