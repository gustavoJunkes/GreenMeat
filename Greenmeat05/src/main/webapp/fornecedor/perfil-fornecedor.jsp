<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="UTF-8">

<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
<title>Perfil Fornecedor</title>
</head>
<body>
<div>
	<jsp:include page="../menu-lateral.jsp"/>
   </div>
 <div class=imagemPerfil>
        <img src="perfil_img.jfif" alt=""></div>
        
            <div class="MeuPerfil"><h3>Meu Perfil</h3></div>
            <div id="tabela_exibir_perfil"><table>
            <tr>
                <th>Razão Social</th>
                <th>Nome Fantasia </th>
                <th> CNPJ</th>
               <th>E-mail</th>
               <th>Telefone</th>
               
              </tr>
              <tr>
               <c:forEach var="fornecedor" items="${fornecedores}">
        <td><c:out value="${fornecedor.razaoSocial}" /></td>
        <td><c:out value="${fornecedor.nomeFantasia}" /></td>
        <td><c:out value="${fornecedor.CNPJ}" /></td>
        <td><c:out value="${contato.email}" /></td>
        <td><c:out value="${contato.telefone}" /></td>
             </c:forEach> 
            </table>
            </div>
            
            <br>
        
            <div id="tabela_exibir_perfil"><table>
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
         <c:forEach var="endereco" items="${enderecos}">
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
              </c:forEach> 
            </table>
            </div>
</body>
</html>