<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>

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
	<%if(request.getSession().getAttribute("usuario") instanceof Cliente){%>
		<jsp:include page="menu-lateral-cliente.jsp"/>
	<%} %>
	<%if(request.getSession().getAttribute("usuario") instanceof Funcionario){%>
		<jsp:include page="menu-lateral-funcionario.jsp"/>
	<%}%>
	<%if(request.getSession().getAttribute("usuario") instanceof Fornecedor){%>	
	<jsp:include page="menu-lateral-fornecedor.jsp"/>
	<%}%>
	</div>
  
	<div id="cadastro">
		<form method="post" action="inserir-cliente">
			<h1>Cadastre-se</h1>
			<p>
				<label for="nome"> Nome </label> <input id="nome" name="nome"
					required="required" type="text" 
					value="<c:out value=''/>" />
			</p>
			<p>
				<label for="sobrenome"> Sobrenome </label> <input id="sobrenome"
					name="sobrenome" required="required" type="text"
					 value='' />
					</p>
					<p>
					 <label for="login">Crie um Login</label> 
					 <input id="loginInserir" name="login" required="required" type="text" 
					value="<c:out value='${cliente.login}' />" />
			</p>
			<p>
				<label for="senha"> Senha</label> <input id=" senha"
					name="senha" required="required" type="password"
					 value="<c:out value='${cliente.senha}'/>" />
			</p>
			
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
							
			<p>
				<label for="senha">Confirme a sua  senha</label> <input id=" senha"
					name="senha" required="required" type="password"
					 value="<c:out value='${cliente.senha}'/>" />
			</p>
			
			<label for="id"></label> <input id="id" name="id" type="hidden"
				value="<c:out value='${cliente.id}'/>" />
			
			<h2>Contato</h2>
			<br>
			<p>
				<label for="email"> E-mail</label>  <input
					id="email" name="email" required="required" type="text"
					 value='${contato.email}' />
			</p>
			<p>
				<label for="telefone"> Telefone</label><input
					id="telefone" name="telefone" required="required" type="text"
					 value="<c:out value='${contato.telefone}'/>" />
		</p>
			<h2>Localidade</h2>
<br>
			<P>
			<label>País</label><br>
			<input type="text" value="<c:out value='${localidade.pais}'/>" name="pais" >
						</p>
						<p>
			<label>Estado</label><br>
			<input type="text" value="<c:out value='${localidade.estado}'/>" name="estado" >		
</p>
<p>
			<label>Cidade</label><br>
			<input type="text" value="<c:out value="${localidade.provincia}"/>" name="provincia" >		
</p>
<p>
			<label>Continente</label><br>
			<input type="text" value="<c:out value="${localidade.continente}"/>" name="continente">		
		</p>
		<h2>Endereço</h2>
		<br>
		<p>
				<label for="endereco"> Nome Da Rua</label>
				 <input id="endereco" name="nomeDaRua" required="required"
					type="text"  value="<c:out value='${endereco.nomeDaRua}'/>" /> 
					</p>
					
					<p>
					 <label	for="endereço_cad"> Tipo Da Via</label> 
					  <input id="endereco" name="tipoDaVia" required="required" type="text"
					 value="<c:out value='${endereco.tipoDaVia}' />"/> 
					 </p>
					
					<p>
					<label for="endereco">Logradouro</label>
				<input id="endereco" name="logradouro" required="required"
					type="text"  value="<c:out value='${endereco.logradouro}' />"/> 
					</p>
				
					<p>
					<label for="endereço_cad"> Número</label> 
					 <input id="endereco" name="numero" required="required" type="number"
					 value="<c:out value='${endereco.numero}' />"/> 
					 </p>
					
					<p>
					 <label for="endereco">Cep</label> 
					 <input id="endereco" name="CEP" required="required"
					type="text"  value="<c:out value='${endereco.CEP}' />" /> 
					</p>
				
					<p>
					<label for="endereco"> Complemento</label> 
					<input id="endereco" name="complemento" required="required" type="text"
					value="<c:out value='${endereco.complemento}' />"/> 
					</p>
					<br> 
			
			
		<input type="submit" value="Cadastrar" />
	</form>
	</div>
</body>
</html>