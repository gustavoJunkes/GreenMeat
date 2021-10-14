<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>
	<link type="text/css" rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"resources/css/teste.css/>
 	<style><%@include file="/resources/css/mystyles.css"%></style>
 	
 	<link type="text/css" href="/resources/css/css/bootstrap.min.css" rel="stylesheet">
	<style><%@include file="/resources/css/css/bootstrap.min.css"%></style>
	
	<meta charset="UTF-8">
	<title>Produtos</title>
	
	<style>
	.lista-compras{
  position: fixed;
  right: 2px;
  top: 10%;
  width: 30%;
 }
 <%--select * from produto where nome like "%var%"--%>
 .navbar-super{
 	top:0px;
	left:14%;
	width: 85%;
	box-shadow: lightgrey 0em 0em 1em 0px;
}

.produto{
	margin-top: 70px;
    margin-left: 5%;
    border: 0.1px solid rgb(0, 0, 0);
    float: left;
    width: 180px;
    
}
.separacao{
	left:150px;
	margin-left:200px; 
}

.botao{
width: 100%;
}
 </style>
</head>
<body>


	<nav class="navbar navbar-super navbar-expand-lg navbar-light bg-light">
  		<a class="navbar-brand" href="#">Navbar</a>
  		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado" aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
   			<span class="navbar-toggler-icon"></span>
 		</button>

  		<div class="collapse navbar-collapse" id="conteudoNavbarSuportado">
    			<ul class="navbar-nav mr-auto">
      				<li class="nav-item active">
        				<a class="nav-link" href="#">Home <span class="sr-only">(página atual)</span></a>
      				</li>
      				<li class="nav-item">
       	 				<a class="nav-link" href="#">Link</a>
      				</li>
    	 		</ul>
    			<form class="form-inline my-2 my-lg-0" action="pesquisar-produtos" method="post">
	      		<input class="form-control mr-sm-2" type="search" placeholder="Pesquisar" aria-label="Pesquisar" name="nome">
      				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Pesquisar</button>
    			</form>
  		</div>
	</nav>

<%if(request.getSession().getAttribute("usuario") instanceof Cliente){%>
		<jsp:include page="../menu-lateral-cliente.jsp"/>
	<%} %>
	<%if(request.getSession().getAttribute("usuario") instanceof Funcionario){%>
		<jsp:include page="../menu-lateral-funcionario.jsp"/>
	<%}%>
	<%if(request.getSession().getAttribute("usuario") instanceof Fornecedor){%>	
	<jsp:include page="../menu-lateral-fornecedor.jsp"/>
	<%}%>


  <div class="container separacao">
    <div class="row">
        <div class="col-md-8" >
        <c:forEach var="produto" items="${produtos}">
	
	 <div class="produto">
      		<div class="desc1"> 
      			<p><c:out value="${produto.nome}" /></p>
      			<p><c:out value="${produto.precoVenda}"/></p>
        	</div>
      	<%if(request.getSession().getAttribute("usuario") instanceof Cliente){ %>
     
      		<!-- Button trigger modal(adicionar ao pedido) -->
			<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
  				Adicionar ao pedido
			</button>
      		
      	<%}%>
    </div>
	
	<!-- Modal adicionar ao pedido -->

<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form action="adicionar-produto-pedido" method="post">
		      	<input type="hidden" name="idProduto" value='<c:out value="${produto.id}"></c:out>'>
		      	<input type="number" name="quantidade" value='<c:out value="${produto.id}"></c:out>'>
		      	<input type="submit" value="Adicionar ao pedido">
      	</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
<!-- fim do modal -->
	
	</c:forEach>
  </div>
        <div class="col-md-2">
       <div class="lista-compras">
          <ul>
          <c:forEach var="item" items="${itens}">
            <li class="list-group-item d-flex justify-content-between lh-condensed">
              <div>
                <h6 class="my-0"><c:out value="${item.produto.nome}-${item.quantidade} unidades" /></h6>
				          
            <!-- Modal editar item-->
<div class="modal fade" id="modaleditaritem" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
    
                <small class="text-muted"><c:out value="${item.produto.descricao}" /></small>
              </div>
              <span class="text-muted"><c:out value="${item.produto.precoVenda}" /></span>
            </li>
        </c:forEach>            
            <li class="list-group-item d-flex justify-content-between">
              <span>Total (BRL)</span>
              <strong>R$<c:out value="${pedido.valorTotal}" /></strong>
            </li>
          </ul>	

          <form class="card p-2" action="finalizar-pedido" method="post">
            <div class="input-group">
                <button type="button" class="btn btn-primary botao" data-toggle="modal" data-target="#ExemploModalCentralizado">
  					Finalizar pedido
				</button>
                
            </div>
          </form>
        </div>
        </div>
        
    </div>
</div>

<!-- Modal finalizar pedido -->
<div class="modal fade" id="ExemploModalCentralizado" tabindex="-1" role="dialog" aria-labelledby="TituloModalCentralizado" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="TituloModalCentralizado">Finalizar pedido</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-footer">
      	<form action="finalizar-pedido" method="post">
        	<button type="button" class="btn btn-secondary" data-dismiss="modal">Continuar comprando</button>
        	<button type="submit" class="btn btn-primary" >Confirmar</button>
        </form>	
      </div>
    </div>
  </div>
</div>



<%-- Javascript modal --%>
<script type="text/javascript">
$('#exampleModal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget) // Button that triggered the modal
  var recipient = button.data('whatever') // Extract info from data-* attributes
   var modal = $(this)
  modal.find('.modal-title').text('New message to ' + recipient)
  modal.find('.modal-body input').val(recipient)
})
</script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>


</body>
</html>