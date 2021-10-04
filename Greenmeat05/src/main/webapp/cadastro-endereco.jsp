<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Endere�o</title>
 
 <link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>

</head>

<body>
<div>
	<jsp:include page="menu-lateral.jsp"/>
   </div>
   
	<div id="endereco">
		<form method="post" action="inserir-endereco">
			<h1>Endere�o</h1>
			<p>
				<label for="endere�o_cad"> Nome Da Rua</label>
				 <input id="endere�o_cad" name="nomeDaRua" required="required"
					type="text" placeholder="Nome Da Rua" value="<c:out value='${endereco.nomeDaRua}'/>" /> 
					<br>
					 <label	for="endere�o_cad"> Tipo Da Via</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endere�o_cad"
					name="tipoDaVia" required="required" type="text"
					placeholder="Tipo Da Via" value="<c:out value='${endereco.tipoDaVia}' />"/> 
					<br> 
					<label for="endere�o_cad">Logradouro</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				<input id="endere�o_cad" name="logradouro" required="required"
					type="text" placeholder="Logradouro" value="<c:out value='${endereco.logradouro}' />"/> 
					<br>
					<label for="endere�o_cad"> N�mero</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endere�o_cad"name="numero" required="required" type="number"
					placeholder="N�mero" value="<c:out value='${endereco.numero}' />"/> 
					<br> <label for="endere�o_cad">
					Cep</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input
					id="endere�o_cad" name="CEP" required="required"
					type="text" placeholder="Cep" value="<c:out value='${endereco.cep}' />" /> 
					<br> <label
					for="endere�o_cad"> Complemento</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endere�o_cad"
					name="complemento" required="required" type="text"
					placeholder="Complemento" value="<c:out value='${endereco.complemento}' />"/> 
					<br> 
			<p>
				<input type="submit" value="Continuar Cadastro" />
			</p>
		</form>
	</div>
</body>
</html>