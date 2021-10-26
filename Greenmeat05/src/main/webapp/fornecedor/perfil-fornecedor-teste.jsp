<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

	<style type="text/css">
	
	
@import
    url('https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap')
    ;
* {
    top:0px;
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    list-style: none;
    text-decoration: none;
    font-family: 'Josefin Sans', sans-serif;
}

.nome{
	display: inline-block;
}

body {
    background: #f7f7f7;
}

form{
    padding-top: 5%;
    margin-left: 2%;
}

.form-control{
	width: 190%;
}


.col{
	width: 80%;
	padding-right: 209px;
}	
	
	</style>


<!-- lib de icons -->
<link rel="stylesheet" href="https://cdn.linearicons.com/free/1.0.0/icon-font.min.css">
<link rel="stylesheet" href="perfil.css">

</head>
<body>

    <div class="row">
<div class="col-2">
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
    
            
     <form class="form" action="editar-fornecedor" method="post">
     <div class="row">
        
        
        <div class="col">
         
         <div class="form-group">
           <label for="id">ID</label>
           <input type="number" id="id" class="form-control" value="<c:out value="${fornecedor.id}" />" name="nomeFantasia" placeholder=""/>  
        </div>
         
        <div class="form-group">
           <label for="nomeFantasia">Nome fantasia</label>
           <input type="text" id="razaoSocial" class="form-control" value="<c:out value="${fornecedor.nomeFantasia}" />" name="nomeFantasia" placeholder=""/>  
        </div> 
         
        <div class="form-group">
           <label for="cpf">Razão Social</label>
           <input type="text" id="razaoSocial" class="form-control" value="<c:out value="${fornecedor.razaoSocial}" />" name="razaoSocial" placeholder=""/>  
        </div>
       <div class="form-group">
           <label for="CNPJ">CNPJ</label> 
           <input type="text" id="login" class="form-control" value="<c:out value="${fornecedor.CNPJ}" />" name="CNPJ" placeholder="">
	   </div>
       <div class="form-group">
           <label for="senha">E-MAIL</label> 
           <input type="text" id="senha" class="form-control" value="<c:out value="${contato.email}" />" name="email"> 
		</div>
        <div class="form-group">
            <label for="login">Telefone</label> 
            <input type="text" id="login" class="form-control" value="<c:out value="${contato.telefone}" />" name="telefone" >
		</div>
   </div>
<!--FORMULARIO DIREITO-->
   <div class="col">
   
     <div class="form-group2">
       <label for= "email">Nome da Rua</label> 
       <input type="text" id="email" class="form-control" value="<c:out value="${endereco.nomeDaRua}" />" name="nomeDaRua">
	</div>
	<br>
    <div class="form-group">
        <label for="login">Tipo da Via</label> 
        <input type="text" id="login" class="form-control" value="<c:out value="${endereco.tipoDaVia}" />" name="tipoDaVia">
    </div>
    <br>
    <div class="form-group">
        <label for="login">Numero</label> 
        <input type="number" id="login" class="form-control" value="<c:out value="${endereco.numero}" />" name="numero" >
    </div>
    <br>
    <div class="form-group">
        <label for="login">CEP</label> 
        <input type="text" id="login" class="form-control" value="<c:out value="${endereco.CEP}" />" name="CEP">
    </div>
    
 </div>

</div>
<input type="submit" value="Salvar alterações">
</form>
</div>
    </div>
</div>
</body>




