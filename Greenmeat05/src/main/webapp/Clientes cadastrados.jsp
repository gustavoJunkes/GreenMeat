<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



        		<th>nome</th><div></div>
                <th> sobrenome</th>
                <th>login</th>
                <th>senha</th>
                <th>CPF</th>
                <th> dataDeNascimento</th>
                <th>contato</th>
                <th>email</th>
                <th>id_contato</th>
                <th>id_usuario</th>
                <th>telefone</th>
                
                
                
            </thead>
                <tbody>
          </tr>
  <c:forEach var="produtos" items="${cliente}">
                        <tr>
            
              <td><c:out value="${cliente.nome}" /></td>
              <td><c:out value="${clientes.sobrenome}" /></td>
              <td><c:out value="${cliente.login}" /></td>
              <th><c:out value="${cliente.senha}" /></th>
              <th><c:out value="${cliente.CPF}" /></th>
              <th><c:out value="${cliente.dataDeNascimento}" /></th>
              <th><c:out value="${cliente.id_contato}" /></th>
              <th><c:out value="${cliente.email}" /></th>
              <th><c:out value="${cliente.contato}" /></th>
              <th><c:out value="${cliente.id_usuario}" /></th>
              <th><c:out value="${cliente.telefone}" /></th>
              
            </tr>
            </c:forEach>





</body>
</html>