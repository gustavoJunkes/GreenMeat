<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Fornecedor</title>

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
 
</head>
<body>
	<div>
	<%if(request.getSession().getAttribute("usuario") instanceof Cliente){%>
		<jsp:include page="../menu-lateral-cliente.jsp"/>
	<%} %>
	<%if(request.getSession().getAttribute("usuario") instanceof Funcionario){%>
		<jsp:include page="../menu-lateral-funcionario.jsp"/>
	<%}%>
	<%if(request.getSession().getAttribute("usuario") instanceof Fornecedor){%>	
	<jsp:include page="../menu-lateral-fornecedor.jsp"/>
	<%}%>
	</div>

	<div id="cadastro">
		<form method="post" action="inserir-fornecedor">
		
		<h1>Cadastro Fornecedor</h1>
		
        <p>Possui Licença Ambiental De Operação?Se sim, informe:</p>
        
           <label for="licenca"> Número Da Licença:</label>                                                          
           <input id="licenca" name="numeroLicenca" type="text" />
       		<br>	
       		<br>
          <label for="licenca"> Data de validade:</label>                                                          
            <input id="licenca" name="dataValidadeLicenca" type="text"  />
         <br>
         <br>
          <label for="ibama"> Se não, informe o número da inscrição de<br> regularidade no Ibama:</label>                                                         
          <input id="ibama" name="ibama" type="text" />
    <br>
    <br>
       <p>Para pastagem, foi necessário desmatamento? Se sim, informe: </p>
          
          <label for="licenca"> O número da ART:</label>                                                          
            <input id="pastagem" name="ART" required="required" type="text"  />
        
   			<br>
   			<br>
          	<p>
				<label for="razaoSocial"> Razão Social</label> <input
					id="razaoSocial" name="razaoSocial" required="required" type="text" value="<c:out value='${fornecedor.razaoSocial}' />" />
			</p>
			<p>
				<label for="nomeFantasia"> Nome Fantasia </label> <input
					id="nomeFantasia" name="nomeFantasia" required="required"
					type="text" 
					value="<c:out value='${fornecedor.nomeFantasia}' />" />
			</p>
			<p>
				<label for="CNPJ"> CNPJ</label>
				<input id="CNPJ" name="CNPJ" required="required" type="text"
					 value="<c:out value='${fornecedor.cnpj}' />" />
			</p>
			<p>
				<label for="login">Crie um Login</label> <input id="loginInserir"
					name="login" required="required" type="text" 
					value="<c:out value='${fornecedor.login}' />" />
			</p>
			<p>
				<label for="senha">Crie uma senha</label> <input id="senha"
					name="senha" required="required" type="password"
					value="<c:out value='${fornecedor.senha}' />" />
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
			</p>
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
				 <input id="endereco" name="NomeDaRua" required="required"
					type="text"  value="<c:out value='${endereco.nomeDaRua}'/>" /> 
					</p>
					
					<p>
					 <label	for="endereço_cad"> Tipo Da Via</label> 
					  <input id="endereco" name="tipoDaVia" required="required" type="text"
					 value="<c:out value='${endereco.tipoDaVia}'/>"/> 
					 </p>
					
					<p>
					<label for="endereco">Logradouro</label>
				<input id="endereco" name="logradouro" required="required"
					type="text"  value="<c:out value='${endereco.logradouro}' />"/> 
					</p>
				
					<p>
					<label for="endereço_cad">Número</label> 
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