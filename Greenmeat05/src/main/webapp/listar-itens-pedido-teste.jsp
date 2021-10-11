<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>" resources/css/mystyle.css />
<style>
<%@ include file="/resources/css/mystyles.css"%>
</style>
<title>Pedido</title>
</head>
<body>
<%--
	<div>
	<%if(request.getSession().getAttribute("usuario") instanceof Cliente){%>
		<jsp:include page="menu-lateral-cliente.jsp"/>
	<%} %>
	<%if(request.getSession().getAttribute("usuario") instanceof Funcionario){%>
		<jsp:include page="menu-lateral-funcionario.jsp"/>
	<%}%>
	<%if(request.getSession().getAttribute("usuario") instanceof Fornecedor){%>	
	<jsp:include page="menu-lateral-fornecedor.jsp"/>
	<%}%>
	</div>
	 --%>
	
	<!-- Botão para acionar modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#ExemploModalCentralizado">
  Abrir modal de demonstração
</button>
	

	<div id="tabela_exibir_perfil">
		<table>
			<thead>
				<tr>
					<th scope="col">Produto</th>
					<th scope="col">Quantidade</th>
					<th scope="col">Valor</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${itens}">
					<tr>
						<td><c:out value="${item.produto.nome}" /></td>
						<td><c:out value="${item.quantidade}" /> </td>
						<td><c:out value="${item.valorTotal}" /></td>
						<td><a href="editar-item?id=<c:out value='${item.id}'/>quantidade=<c:out value='${item.quantidade}'/>">Editar</a><a href="deletar-item?id=<c:out value='${item.id}'/>">Deletar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<form action="finalizar-pedido" method="post">
			<input type="hidden" value="${pedido.id}" name="idPedido">
			<input type="submit" value="Finalizar pedido">
		</form>
		
	</div>

<!-- Modal -->
<div class="modal fade" id="ExemploModalCentralizado" tabindex="-1" role="dialog" aria-labelledby="TituloModalCentralizado" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="TituloModalCentralizado">Título do modal</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
        <button type="button" class="btn btn-primary">Salvar mudanças</button>
      </div>
    </div>
  </div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>