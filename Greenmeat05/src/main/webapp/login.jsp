<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored="false" %>

<html>
<head>

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyles.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
 

<meta charset="UTF-8">
	<title>Login</title>
</head>
<body>

        <div id="login">
          <form method="post" action="logar"> 
            <h1>Login</h1>
                     
              <label for="login">Login</label>
              <input id="loginInserir" name="login" required="required" type="text" placeholder="login"  value="<c:out value='${usuario.login}' />"/>                 
              <label for="email_login">Senha</label>
              <input id="email_login" name="senha" required="required" type="password" placeholder="ex. senha"  value="<c:out value='${usuario.senha}' />" />                   
				              
				              <script> 
				function validarSenha(){ 
				senha1 = document.f1.senha1.value 
				senha2 = document.f1.senha2.value 
				
				if (senha1 == senha2) 
				alert("SENHAS IGUAIS") 
				document.f1.submit(); // Adiciona isso que ele irá submeter o form!
				else 
				alert("SENHAS DIFERENTES") 
				} 
</script> 
				<br></br>
              <input type="submit" value="Logar" />                      
          
          
          </form>
      </div>
</body>
</html>