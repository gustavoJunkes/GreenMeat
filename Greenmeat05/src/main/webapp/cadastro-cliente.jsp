<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Cliente</title>

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>

</head>
<body>
	<div>
	<jsp:include page="menu-lateral.jsp"/>
   </div>
  
	<div id="cadastro">
		<form method="post" action="inserir-cliente">
			<h1>Cadastre-se</h1>
			<p>
				<label for="nome"> Nome </label> <input id="nome" name="nome"
					required="required" type="text" placeholder="nome"
					value="<c:out value=''/>" />
			</p>
			<p>
				<label for="sobrenome"> Sobrenome </label> <input id="sobrenome"
					name="sobrenome" required="required" type="text"
					placeholder="Sobrenome" value='' />
					</p>
					<p>
					 <label for="login">Crie um Login</label> 
					 <input id="loginInserir" name="login" required="required" type="text" placeholder="login"
					value="<c:out value='${cliente.login}' />" />
			</p>
				<label for="senha"> Senha</label> <input id=" senha"
					name="senha" required="required" type="password"
					placeholder="ex. 1234" value="<c:out value='${cliente.senha}'/>" />
			</p>
		
			</p>
				<label for="senha">Confirme a sua  senha</label> <input id=" senha"
					name="senha" required="required" type="password"
					placeholder="ex. 1234" value="<c:out value='${cliente.senha}'/>" />
			</p>
			
			<label for="id"></label> <input id="id" name="id" type="hidden"
				value="<c:out value='${cliente.id}'/>" />
			
			<h2>Contato</h1>
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
			
			<h1>Localidade</h1>

			<label>País</label><br>
			<input type="text" value="<c:out value='${localidade.pais}'/>" name="pais" >
						
			<label>Estado</label><br>
			<input type="text" value="<c:out value='${localidade.estado}'/>" name="estado" >		

			<label>Cidade</label><br>
			<input type="text" value="<c:out value="${localidade.provincia}"/>" name="provincia" >		

			<label>Continente</label><br>
			<input type="text" value="<c:out value="${localidade.continente}"/>" name="continente">		
		
		<h1>Endereço</h1>
			
				<label for="endereco"> Nome Da Rua</label>
				 <input id="endereco" name="rua" required="required"
					type="text" placeholder="Nome Da Rua" value="<c:out value='${endereco.nomeDaRua}'/>" /> 
					
					<br>
					 <label	for="endereço_cad"> Tipo Da Via</label> 
					  <input id="endereco" name="tipoDaVia" required="required" type="text"
					placeholder="Tipo Da Via" value="<c:out value='${endereco.tipoDaVia}' />"/> 
					<br> 
					<label for="endereço_cad">Logradouro</label>
				<input id="endereco" name="logradouro" required="required"
					type="text" placeholder="Logradouro" value="<c:out value='${endereco.logradouro}' />"/> 
					<br>
					<label for="endereço_cad"> Número</label> 
					 <input id="endereco" name="numero" required="required" type="number"
					placeholder="Número" value="<c:out value='${endereco.numero}' />"/> 
					<br> <label for="endereco">Cep</label> 
					 <input id="endereco" name="endereco" required="required"
					type="text" placeholder="Cep" value="<c:out value='${endereco.cep}' />" /> 
					<br> 
					<label for="endereco"> Complemento</label> 
					<input id="endereco" name="complemento" required="required" type="text"
					placeholder="Complemento" value="<c:out value='${endereco.complemento}' />"/> 
					<br> 
			
			
		<input type="submit" value="Cadastrar" />
	</form>
	</div>
</body>
</html>