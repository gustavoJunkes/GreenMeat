<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>
     <%@ page isELIgnored="false" %>
<<<<<<< Updated upstream
=======
    

>>>>>>> Stashed changes
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Produtos cadastrados</title>

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>


</head>

<body>
<div>
	<jsp:include page="menu-lateral.jsp"/>
   </div>

	<div>
	<jsp:include page="menu-lateral.jsp"/>
	
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
              <th>Nome do produto</th>
              <th>Descrição</th>
              <th>Tipo da Carne</th>
              <th>Preço Custo</th>
              <th>Preço venda</th>
               
            </tr>
            </thead>
				<tbody>
            <c:forEach var="produtos" items="${produtos}">
						<tr>
            
              <td><c:out value="${produtos.id}" /></td>
              <td><c:out value="${produtos.nome}" /></td>
              <td><c:out value="${produtos.descricao}" /></td>
              <th><c:out value="${produtos.tipoCarne }" /></th>
              <th><c:out value="${produtos.precoCusto}" /></th>
              <th><c:out value="${produtos.custoVenda}" /></th>
              
            </tr>
            </c:forEach>
            	</tbody>
          </table>
        </div>
        
</body>
</html>