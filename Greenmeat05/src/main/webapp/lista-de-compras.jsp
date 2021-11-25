<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Principal CSS do Bootstrap -->
    <link type="text/css" href="/resources/css/css/bootstrap.css" rel="stylesheet">
	<style><%@include file="/resources/css/css/bootstrap.css"%></style>
   
    
     <style>
.lista-compras{
  position: fixed;
  right: 2px;
  top: 10%;
 }
 
 .row{
 
 }
</style>
</head>
<body>

<div class="lista-compras"> 
<div class="row">
        <div>
          <h4	>
            <span class="text-muted">Seu carrinho</span>
            <span class="badge badge-secondary badge-pill">3</span>
          </h4>
          <ul class="list-group mb-3">
            <li class="list-group-item d-flex justify-content-between lh-condensed">
              <div>
                <h6 class="my-0">Nome do produto</h6>
                <small class="text-muted">Breve descrição</small>
              </div>
              <span class="text-muted">R$12</span>
            </li>
                       
            <li>
              <span>Total (BRL)</span>
              <strong>R$20</strong>
            </li>
          </ul>

          <form class="card p-2">
            <div class="input-group">
              <input type="text" class="form-control" placeholder="Pesquisar item">
              <div class="input-group-append">
                <button type="submit" class="btn btn-secondary">Pesquisar</button>
              </div>
            </div>
          </form>
        </div>
	</div>
</div>






</body>
</html>