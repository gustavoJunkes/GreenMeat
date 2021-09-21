<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Fornecedor</title>
<link type="text/css" rel="stylesheet" href="<c:url value="/mystyles.css" />" />
</head>
<body>

  <div class="container" >
      <a class="links" id="paracadastro"></a>
      <a class="links" id="paralogin"></a>
      </div>
      
        <!--FORMULÁRIO DE CADASTRO-->
        <div id="cadastro">
          <form method="post" action=""> 
            
             <h1>Cadastre-se</h1>
              <p> 
              <label for="razaoSocial"> Razão Social</label>                                                           
              <input id="razaoSocial" name="razaoSocial" required="required" type="text" placeholder="razão social" value="<c:out value='${fornecedor.razaoSocial}' />" />
            </p>

            <p> 
              <label for="nomeFantasia"> Nome Fantasia </label>                                                           
              <input id="nomeFantasia" name="nomeFantasia" required="required" type="text" placeholder="nome fantasia" value="<c:out value='${fornecedor.nomeFantasia}' />"/>
            </p>

            <p> 
              <label for="CNPJ"> CNPJ</label>
              &nbsp; &nbsp; &nbsp; &nbsp;<input id="CNPJ" name="CNPJ" required="required" type="text" placeholder="CNPJ" value="<c:out value='${fornecedor.CNPJ}' />"/>
            </p>
            <p> 
              <label for="login">Crie um Login</label>
              <input id="login" name="login" required="required" type="text" placeholder="login" value="<c:out value='${fornecedor.login}' />"/>
            </p>
      
            <p> 
              <label for="senha">Crie uma senha</label>
              <input id="senha" name="senha" required="required" type="password" placeholder="ex. 1234" value="<c:out value='${fornecedor.senha}' />"/>
            </p>

            <p> 
              <input type="submit" value="Continuar Cadastro"/> 
            </p>
             
            <p class="link">  
              Já tem conta?
              <a href="login.html"> Ir para Login </a>
            </p>
            
          </form>
        </div>
</body>
</html>