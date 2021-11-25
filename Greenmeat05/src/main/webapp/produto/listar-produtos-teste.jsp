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
	
	 
<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/css/bootstrap.min.css/>
 <style><%@include file="/resources/css/css/bootstrap.min.css"%></style>
 
	
	<meta charset="UTF-8">
	<title>Produtos</title>
	
	<style>
	.lista-compras{
  position: fixed;
  right: 2px;
  margin-top: 8.5%;
  width: 30%;
 }
 


 .diferenciado{
	margin-top:5px; 
 }

 .col-md-4 {
    -webkit-box-flex: 0;
    -ms-flex: 0 0 33.2222%;
    flex: 0 0 18.333%;
    height: 8%;
    
    max-width: 18.000%;

 
}


 body {
    margin: 0;
    font-family: Roboto, -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
    font-size: .7000rem;
    font-weight: 250;
    line-height: 1.000;
    color: #194f15;
    text-align: left;
    background-color: #194f15
    
}
.mb-2{
color:#194f15
}

.mt-50 {
    margin-top: 25px
}

.mb-50 {
    margin-bottom: 50px
}

.card {
    position: relative;
    display: -ms-flexbox;
    display: flex;
    -ms-flex-direction: column;
    flex-direction: column;
    min-width: 0;
    word-wrap: break-word;
    background-color: #green;
    background-clip: border-box ;
    border: 0px solid rgba(0, 0, 0, .0);
    border-radius: .1500rem;
    height: 100%;
 
}

.card-img-actions {
    position: relative
}

.card-body {
    -ms-flex: 1 1 auto;
    flex: 1 1 auto;
    padding: 1.rem;
    text-align: center;
       height: -40%;
           
}

.card-img {
}

.star {
    color: grenn;
}

.bg-cart {
    background-color: grenn;
    color: #fff
}

.bg-cart:hover {
    color: #grenn;
}

.bg-buy {
    background-color: green;
    color: #fff;
    padding-right: 25px
}

.bg-buy:hover {
    color: #fff
}

a {
    text-decoration: none !important
} 
 
 .navbar-super{
 	top:0px;
	left:15%;
	width: 85%;
	box-shadow: lightgrey 0em 0em 1em 0px;
}

.produto{
	margin-top: 70px;
    margin-left: 0%;
    border: 0.1px solid rgb(0, 0, 0);
    float: left;
    width: 180px;
    
}
.separacao{
	left:2%;
	margin-left:15%; 
	position: relative;
}

.botao{
width: 100%;
}
 </style>
</head>
<body>


	<nav class="navbar navbar-super navbar-expand-lg navbar-light bg-light">
  		<a class="navbar-brand" href="#">Home</a>
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
<div class="col-md-4 mt-5">
  <div class="container separacao">
    <div class="row">
    
        <c:forEach var="produto" items="${produtos}">

        <div class="col-md-6 diferenciado">
                
        <div class="card altura-diferenciada">
                <div class="card-body">
                   
                <div class="card-body bg-light text-center">
                    <div class="mb-2">
                        <h6 class="font-weight-semibold mb-2"> <a href="#" class="text-default mb-2" data-abc="true"><c:out value="${produto.nome}" /></a> </h6> <h7 class="text-muted"><c:out value="${produto.tipoCarne}" /><h7>
                    </div>
                    <h3 class="mb-0 font-weight-semibold">R$<c:out value="${produto.precoVenda}" /></h3>
                    <div> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> <i class="fa fa-star star"></i> </div>
                    <div class="text-muted mb-3">Fornecedor verificado</div> 
                    <!-- Button trigger modal(adicionar ao pedido) -->
			<button type="button" class="" data-toggle="modal" data-target="#exampleModalCenter<c:out value="${produto.id}" />">
  				Adicionar ao pedido
			</button>
                </div>
                
                		<!-- Modal adicionar ao pedido -->
      		
<div class="modal fade" id="exampleModalCenter<c:out value="${produto.id}" />" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">        		 <p>Informe uma quantidade:</p>    	
</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      	
    </div>
      <form action="adicionar-produto-pedido" method="post">
      <div class="modal-body">
        		      	<input type="hidden" name="idProduto" value='<c:out value="${produto.id}"></c:out>'>
		      	<input id="qtd" type="number" name="quantidade" min="1" max="100" value='1'>
	
	
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
       <button type="submit" class="btn btn-primary">Adicionar ao pedido</button>
      </div>
       </form>
    </div>
  </div>
</div>
<!-- fim do modal -->
            </div>
        </div>
      </div>
      </c:forEach>
    
  </div>
        <div class="col-md-1">
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
              <span class="text-muted"><c:out value="${item.valorTotal}" /></span>
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