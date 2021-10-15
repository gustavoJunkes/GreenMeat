
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored="false" %>

<html lang="pt-br">
<head>
    <head>
        <title>Perfil-cliente</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyles.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>

</head>
<body>

<div>
<jsp:include page="menu-lateral-cliente.jsp"/>
</div>

<div class="txt_perfil_cliene_a"><h1>Meu Perfil</div>

<div class="perfil_cliente">
    <div class="container bootstrap snippet">
    
            
              
                     <div class="col-sm-3"><!--left col-->        
  <div class="text-center">
          </div></hr><br>
          
              <div class="tab-content">
                <div class="tab-pane active" id="home">
                    <hr>
                      <form class="form" action="##" method="post" id="registrationForm">
                          <div class="form-group">
                              
                              <div class="col-xs-6">
                                  <label for="first_name"><h4>Nome</h4></label>
                                  <input type="text" class="form-control" name="Nome" id="first_name" placeholder="Nome" title="enter your first name if any.">
                              </div>
                          </div>
                          <div class="form-group">
                              
                              <div class="col-xs-6">
                                <label for="last_name"><h4>Sobrenome</h4></label>
                                  <input type="text" class="form-control" name="last_name" id="last_name" placeholder="Sobrenome" title="enter your last name if any.">
                              </div>
                          </div>
              
                          <div class="form-group">
                              
                              <div class="col-xs-6">
                                  <label for="phone"><h4>CPF</h4></label>
                                  <input type="text" class="form-control" name="phone" id="phone" placeholder="CPF" title="enter your phone number if any.">
                              </div>
                          </div>
              
                          <div class="form-group">
                              <div class="col-xs-6">
                                 <label for="mobile"><h4>Data de nascimento</h4></label>
                                  <input type="text" class="form-control" name="mobile" id="mobile" placeholder="Data de nascimento" title="enter your mobile number if any.">
                              </div>
                          </div>
                          <div class="form-group">
                              
                              <div class="col-xs-6">
                                  <label for="email"><h4>Telefone</h4></label>
                                  <input type="email" class="form-control" name="email" id="email" placeholder="Telefone" title="enter your email.">
                              </div>
                          </div>
                          <div class="form-group">
                              
                              <div class="col-xs-6">
                                  <label for="email"><h4>Nome da rua</h4></label>
                                  <input type="email" class="form-control" id="location" placeholder="Nome da rua" title="enter a location">
                              </div>
                          </div>
                          <div class="form-group">
                              
                              <div class="col-xs-6">
                                  <label for="password"><h4>Tipo da via</h4></label>
                                  <input type="password" class="form-control" name="password" id="password" placeholder="Tipo da via" title="enter your password.">
                              </div>
                          </div>
                          <div class="form-group">
                              
                              <div class="col-xs-6">
                                <label for="password2"><h4>Logradouro</h4></label>
                                  <input type="password" class="form-control" name="password2" id="password2" placeholder="Logradouro" title="enter your password2.">
                              </div>
                          </div>
                          <div class="form-group">
                              
                            <div class="col-xs-6">
                                <label for="password"><h4>Número</h4></label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="Número" title="enter your password.">
                            </div>
                        </div>
                        <div class="form-group">
                              
                            <div class="col-xs-6">
                                <label for="password"><h4>Cep</h4></label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="Cep" title="enter your password.">
                            </div>
                        </div>
                        <div class="form-group">
                              
                            <div class="col-xs-6">
                                <label for="password"><h4>Complemento</h4></label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="Complemento" title="enter your password.">
                            </div>
                        </div>
                        <div class="form-group">
                              
                            <div class="col-xs-6">
                                <label for="password"><h4>País</h4></label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="País" title="enter your password.">
                            </div>
                        </div>
                        <div class="form-group">
                              
                            <div class="col-xs-6">
                                <label for="password"><h4>Estado</h4></label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="Estado" title="enter your password.">
                            </div>
                        </div>
                        <div class="form-group">
                              
                            <div class="col-xs-6">
                                <label for="password"><h4>Província</h4></label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="Província" title="enter your password.">
                            </div>
                        </div>
                        <div class="form-group">
                              
                            <div class="col-xs-6">
                                <label for="password"><h4>Continente</h4></label>
                                <input type="password" class="form-control" name="password" id="password" placeholder="Continente" title="enter your password.">
                            </div>
                        </div>
                         
                      </form>
                  <hr>
            </div><!--/col-9-->
        </div><!--/row-->
    </div>
    </div>
 
</body>
</html>



