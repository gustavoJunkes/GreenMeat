<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Fornecedor</title>
</head>
<body>

 <div class="container" >
      <a class="links" id="paracadastro"></a>
      <a class="links" id="paralogin"></a>
      </div>
      
        <!--FORMULÁRIO DE CADASTRO-->
        <div id="cadastro">
          <form method="post" action=""> 
            
             <h1>Cadastre-se</h1>
              <p> 
              <label for="nome_cad"> Razão Social</label>                                                           
              <input id="nome_cad" name="nome_cad" required="required" type="text" placeholder="razão social" value="<c:out value='${fornecedor.razaoSocial}'/>" />
            </p>

            <p> 
              <label for="nome_cad"> Nome Fantasia </label>                                                           
              <input id="nome_cad" name="nome_cad" required="required" type="text" placeholder="nome fantasia" value="<c:out value='${fornecedor.nomeFantasia}'/>" />
            </p>

            <p> 
              <label for="cnpj_cad"> CNPJ</label>
              &nbsp; &nbsp; &nbsp; &nbsp;<input id="cnpj_cad" name="cnpj_cad" required="required" type="text" placeholder="CNPJ" value="<c:out value='${fornecedor.CNPJ}'/>" />
            </p>
             
            <p> 
              <label for="email_cad"> E-mail</label>
              &nbsp; &nbsp; <input id="email_cad" name="email_cad" required="required" type="email" placeholder="contato@gmail.com" value="<c:out value='${fornecedor.email}'/>" /> 
            </p>

            <p> 
              <label for="telefone_cad"> Telefone</label>
              &nbsp;<input id="telefone_cad" name="telefone_cad" required="required" type="text" placeholder="telefone" value="<c:out value='${fornecedor.telefone}'/>" />
            </p>

            <p> 
              <label for="endereço_cad"> Endereço</label>
              <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Nome Da Rua" value="<c:out value='${fornecedor.nomeDaRua}'/>" />
              <br>
                
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Tipo Da Via" value="<c:out value='${fornecedor.tipoDaVia}'/>"/>  
                <br>
               
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Logradouro" value="<c:out value='${fornecedor.logradouro}'/>" /> 
                <br>
                 
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Número" value="<c:out value='${fornecedor.numero}'/>"/> 
                 <br>
                 
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Cep" value="<c:out value='${fornecedor.CEP}'/>"/> 
              <br>
              
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Complemento" value="<c:out value='${fornecedor.complemento}'/>"/>  
              <br>
              
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="País" value="<c:out value='${fornecedor.pais}'/>"/>  
              <br>
             
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="estado" value="<c:out value='${fornecedor.estado}'/>" /> 
              <br>
               
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="provincia" value="<c:out value='${fornecedor.provincia}'/>"/> 
               <br>
                
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Continente" value="<c:out value='${fornecedor.continente}'/>"/>
                <br>
            </p>

            <p> 
              <label for="senha_cad">Crie um Login</label>
              <input id="senha_cad" name="senha_cad" required="required" type="password" placeholder="login" value="<c:out value='${fornecedor.login}'/>"/>
            </p>

            <p> 
              <label for="senha_cad">Crie uma senha</label>
              <input id="senha_cad" name="senha_cad" required="required" type="password" placeholder="ex. 1234" value="<c:out value='${fornecedor.senha}'/>"/>
            </p>
             
            <p> 
              <input type="submit" value="Cadastrar"/> 
            </p>
             
            <p class="link">  
              Já tem conta?
              <a href="#paralogin"> Ir para Login </a>
            </p>
            
          </form>
        </div>
</body>
</html>