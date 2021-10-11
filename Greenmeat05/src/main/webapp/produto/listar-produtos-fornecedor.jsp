<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Produtos cadastrados</title>

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

<header>
		<nav>
			<ul>
				<li><a href="<%=request.getContextPath()%>/listar-produtos">Produtos</a></li>
				<li><a href="<%=request.getContextPath()%>/perfil-fornecedor?id=<c:out value='${fornecedor.id}'/>">Produtos de: <c:out value="${fornecedor.nomeFantasia}" /></a></li>
			</ul>
		</nav>
	</header>
	

<div class="txt_Listar_produtos"> <h2>Lista de produtos fornecedor <a href="<%=request.getContextPath()%>/perfil-fornecedor?id=<c:out value='${fornecedor.id}'/>"><c:out value="${fornecedor.nomeFantasia}" /></a> </h2> </div>
    
    <div class="Listar_produtos_tabela" >
        <table>
        <thead>
            <tr>
              <th>Id do produto</th>
              <th>Nome do produto</th>
              <th>Descrição</th>
              <th>Tipo da Carne</th>
              <th>Preço Custo</th>
              <th>Preço venda</th>
             <%-- <th>Quantidade em estoque</th> --%>
              <th>Ações</th>
            </tr>
            </thead>
				<tbody>
            <c:forEach var="produtos" items="${produtos}">
						<tr>
              <td><c:out value="${produtos.id}" /></td>
              <td><c:out value="${produtos.nome}" /></td>
              <td><c:out value="${produtos.descricao}" /></td>
              <td><c:out value="${produtos.tipoCarne }" /></th>
              <td><c:out value="${produtos.precoCusto}" /></th>
              <td><c:out value="${produtos.precoVenda}" /></th>
             <%-- <td><c:out value="${produtos.fornecedor.estoque.item.quantidade}" /></th>
              --%>  
              <td><a href="editar-produto?id=<c:out value='${produtos.id}'/>">Editar</a><a href="deletar-produto?id=<c:out value='${produtos.id}'/>">Deletar</a></td>
             
            </tr>
            </c:forEach>
            	</tbody>
          </table>
        </div>
        
</body>
</html>