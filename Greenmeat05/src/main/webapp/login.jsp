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
<div>
	<jsp:include page="menu-lateral.jsp"/>
   </div>
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
          
          </form>
      </div>
</body>
</html>