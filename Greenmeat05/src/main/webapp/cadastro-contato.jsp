<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<head>
 <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>

<title>cadastro-contato</title>
</head>
<body>

	<div>
	<jsp:include page="menu-lateral.jsp"/>
   </div>

	<div id="cadastro">
		<form method="post" action="inserir-contato">

			<h1>Contato</h1>
			<p>
				<label for="email_cad"> E-mail</label>  <input
					id="email" name="email" required="required" type="text"
					placeholder="contato@email.com" value='${contato.email}' />
			</p>
			<p>
				<label for="telefone_cad"> Telefone</label><input
					id="telefone" name="telefone" required="required" type="text"
					placeholder="ex. 1234" value="<c:out value='${contato.telefone}'/>" />
			</p>
			<p>
				<input type="submit" value="Cadastrar" />
			</p>
		</form>
	</div>
</body>
</html>