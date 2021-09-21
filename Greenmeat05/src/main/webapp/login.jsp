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
        <!--FORMULÁRIO DE LOGIN-->
        <div id="login">
          <form method="post" action=""> 
            <h1>Login</h1>
            <p> 
              <label for="nome_login">Login</label>
              <input id="nome_login" name="nome_login" required="required" type="text" placeholder="login"  value="<c:out value='${usuario.login}' />"/>
            </p>
             
            <p> 
              <label for="email_login">Senha</label>
              <input id="email_login" name="email_login" required="required" type="password" placeholder="ex. senha"  value="<c:out value='${usuario.senha}' />" /> 
            </p>
             
            <p> 
              <input type="checkbox" name="manterlogado" id="manterlogado" value="" /> 
              <label for="manterlogado">Manter-me logado</label>
            </p>
             
            <p> 
              <input type="submit" value="Logar" /> 
            </p>
             
            <p class="link">
              Ainda não tem conta?
              <a href="cliente.html">Cadastre-se</a>
            </p>
          </form>
      </div>

</body>
</html>