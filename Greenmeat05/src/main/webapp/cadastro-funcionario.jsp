<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style><%@include file="/resources/css/estilo.css"%></style>
<style><%@include file="/resources/css/menu.css"%></style>
</head>
<body>


<div>
	<jsp:include page="menu-lateral.jsp"/>
	
   </div>



 <!--FORMULÁRIO DE CADASTRO-->
    <div id="cadastro">
        <form method="post" action=""> 
          
           <h1>Cadastre-se</h1>

            <label for="nome"> Nome</label>                                                           
            <input id="nome" name="nome" required="required" type="text" placeholder="nome" value="<c:out value='${funcionario.nome}' />" />
        

          
            <label for="sobrenome"> Sobrenome</label>                                                           
            <input id="sobrenome" name="sobrenome" required="required" type="text" placeholder="sobrenome" value="<c:out value='${funcionario.sobrenome}' />" />
         

         
            <label for="cpf"> CPF</label>
            <input id="cpf" name="cpf" required="required" type="text" placeholder="CPF" value="<c:out value='${funcionario.CPF}' />" />
       

       
            <label for="dataDeNascimento"> Data De Nascimento</label>                                                           
            <input id="dataDeNascimento" name="dataDeNascimento" required="required" type="text" placeholder="dataDeNascimento" value="<c:out value='${funcionario.dataDeNascimento}' />" />
          
            <label for="funcao"> Função</label>                                                           
            <input id="funcao" name="funcao" required="required" type="text" placeholder="função" value="<c:out value='${funcionario.funcao}' />" />
          
            <label for="cargo"> Cargo</label>                                                           
            <input id="cargo" name="cargo" required="required" type="text" placeholder="cargo" value="<c:out value='${funcionario.cargo}' />" />
         
            <label for="login">Crie um Login</label>
            <input id="loginInserir" name="login" required="required" type="text" placeholder="login" value="<c:out value='${funcionario.login}' />"/>
          
    
        
            <label for="senha">Crie uma senha</label>
            <input id="senha" name="senha" required="required" type="password" placeholder="ex. 1234" value="<c:out value='${funcionario.senha}' />"/>
         

         
            <input type="submit" value="Continuar Cadastro"/> 
          
           
          <p class="link">  
            Já tem conta?
            <a href="login.html"> Ir para Login </a>
          </p>
          
        </form>
      </div>
</body>
</html>