<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>
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
	<jsp:include page="../menu-lateral-funcionario.jsp"/>
   </div>

<header>
		<nav>
			<ul>
				<li><a href="<%=request.getContextPath()%>/listar">Produtos</a>
				</li>
			</ul>
		</nav>
	</header>
	

<div class="txt_Listar_produtos"> <h2>Lista de produtos cadastrados</h2> </div>
    
    <div class="Listar_produtos_tabela" >
        <table>
        <thead>
            <tr>
              <th>Id do produto</th>
              <th>Fornecedor</th>
              <th>Nome do produto</th>
              <th>Descrição</th>
              <th>Tipo da Carne</th>
              <th>Preço Custo</th>
              <th>Preço venda</th>
             <%-- <th>Quantidade em estoque</th> --%>
             
            </tr>
            </thead>
             <tr>
              <td class="text-left"></td>
         
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
          </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
           <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
          </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
          <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
          </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
           <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
          </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
          <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
          </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
           <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
          </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
              <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
          </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
           <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
          </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
          <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
          </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
           <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
          </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
          <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
          </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
           <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
          </tr>
        <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
         <td class="text-left"></td>
				<tbody>
            <c:forEach var="produtos" items="${produtos}">
						<tr>
              <td><c:out value="${produtos.id}" /></td>
              <td><a href="perfil-fornecedor?id=<c:out value='${produtos.fornecedor.id}'/>"><c:out value="${produtos.fornecedor.nomeFantasia}" /></a> </td>
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