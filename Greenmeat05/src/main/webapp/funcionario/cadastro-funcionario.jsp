<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>


<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Funcionário</title>
<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
</head>

<body>
<div>
	<jsp:include page="../menu-lateral.jsp"/>
	
   </div>

    <div id="cadastro">
        <form method="post" action=""> 
          
           <h1>Cadastre-se</h1>
           <p>
            <label for="nome"> Nome</label>                                                           
            <input id="nome" name="nome" required="required" type="text"  value="<c:out value='${funcionario.nome}' />" />  
            </p>
            <p>              
            <label for="sobrenome"> Sobrenome</label>                                                           
            <input id="sobrenome" name="sobrenome" required="required" type="text"  value="<c:out value='${funcionario.sobrenome}' />" />
              </p>
              <p>
            <label for="cpf"> CPF</label>
            <input id="cpf" name="cpf" required="required" type="text"  value="<c:out value='${funcionario.CPF}' />" />
         </p>
         <p>
            <label for="dataDeNascimento"> Data De Nascimento</label>                                                           
            <input id="dataDeNascimento" name="dataDeNascimento" required="required" type="text"  value="<c:out value='${funcionario.dataDeNascimento}' />" />
          </p>
          <p>
            <label for="funcao"> Função</label>                                                           
            <input id="funcao" name="funcao" required="required" type="text"  value="<c:out value='${funcionario.funcao}' />" />
          </p>
          <p>
            <label for="cargo"> Cargo</label>                                                           
            <input id="cargo" name="cargo" required="required" type="text" value="<c:out value='${funcionario.cargo}' />" />
         </p>
         <p>
            <label for="login">Crie um Login</label>
            <input id="loginInserir" name="login" required="required" type="text"  value="<c:out value='${funcionario.login}' />"/>
          </p>
          <p>
            <label for="senha">Crie uma senha</label>
            <input id="senha" name="senha" required="required" type="password"  value="<c:out value='${funcionario.senha}' />"/>
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
				 <input id="endereco" name="nomeDaRua" required="required"
					type="text"  value="<c:out value='${endereco.nomeDaRua}'/>" /> 
					</p>
					
					<p>
					 <label	for="endereco"> Tipo Da Via</label> 
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
					 <input id="endereco" name="cep" required="required"
					type="text"  value="<c:out value='${endereco.cep}' />" /> 
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