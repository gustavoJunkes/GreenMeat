<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div class="content">      
        <!--FORMUL�RIO DE LOGIN-->
        <div id="login">
          <form method="post" action=""> 
            <h1>Login</h1>
           
              <label for="nome_login">Login</label>
              <input id="nome_login" name="nome_login" required="required" type="text" placeholder="login"  value="<c:out value='${usuario.login}' />"/>
            
             
            
              <label for="email_login">Senha</label>
              <input id="email_login" name="email_login" required="required" type="password" placeholder="ex. senha"  value="<c:out value='${usuario.senha}' />" /> 
            
             
           
              <input type="checkbox" name="manterlogado" id="manterlogado" value="" /> 
              <label for="manterlogado">Manter-me logado</label>
           
             
        
              <input type="submit" value="Logar" /> 
            
             
            <p class="link">
              Ainda n�o tem conta?
              <a href="cliente.html">Cadastre-se</a>
            
          </form>
      </div>

</body>
</html>