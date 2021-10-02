<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored="false" %>

<html>
<head>
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>

<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div>
	<jsp:include page="menu-lateral.jsp"/>
   </div>
      
        <!--FORMULÁRIO DE LOGIN-->
        <div id="login">
          <form method="post" action="logar"> 
            <h1>Login</h1>
                     
              <label for="login">Login</label>
              <input id="loginInserir" name="login" required="required" type="text" placeholder="login"  value="<c:out value='${usuario.login}' />"/>                 
              <label for="email_login">Senha</label>
              <input id="email_login" name="senha" required="required" type="password" placeholder="ex. senha"  value="<c:out value='${usuario.senha}' />" />                   
              <input type="checkbox" name="manterlogado" id="manterlogado" value="" /> 
              <label for="manterlogado">Manter-me logado</label>     
              <input type="submit" value="Logar" />                      
            <p class="link">
              Ainda não tem conta?
          <li><a href="<%=request.getContextPath()%>/novo-cliente.jsp" target="_self"> Cadastre-se</a></li>
            </p>
          </form>
      </div>
</body>
</html>