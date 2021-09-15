<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



 <div class="container" >
      <a class="links" id="paracadastro"></a>
      <a class="links" id="paralogin"></a>
      </div>
      
        <!--FORMULÁRIO DE CADASTRO-->
        <div id="cadastro">
          <form method="post" action="inserir-cliente"> 
            
             <h1>Cadastre-se</h1>
              <p> 
              <label for="nome"> Nome </label>                                                           
              <input id="nome" name="nome" required="required" type="text" placeholder="None" value="<c:out value='${cliente.nome}'/>" />
            </p>

            <p> 
              <label for="nome_cad"> Sobrenome </label>                                                           
              <input id="nome_cad" name="nome_cad" required="required" type="text" placeholder="Sobrenome" value="<c:out value='${cliente.sobrenome}'/>"/>
            </p>

            <p> 
              <label for="cnpj_cad"> CPF/CNPJ</label>
              &nbsp; &nbsp; &nbsp; &nbsp;<input id="cnpj_cad" name="CPF/CNPJ" required="required" type="text" placeholder="CPF/CNPJ"value="<c:out value='${cliente.CPF}'/>" /> 
            </p>
             
            <p> 
              <label for="email_cad"> E-mail</label>
              &nbsp; &nbsp; <input id="email_cad" name="email_cad" required="required" type="email" placeholder="contato@gmail.com"value="<c:out value='${cliente.email}'/>" /> 
            </p>

            <p> 
              <label for="telefone_cad"> Contato</label>
              &nbsp;<input id="telefone_cad" name="telefone_cad" required="required" type="text" placeholder="Contato" value="<c:out value='${cliente.telefone}'/>"/>
            </p>

            <p> 
              <label for="endereço_cad"> Endereço</label>
              <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Nome Da Rua" value="<c:out value='${cliente.nomeDaRua}'/>"/>
              <br>
                
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Tipo Da Via" value="<c:out value='${cliente.tipoDaVia}'/>" />  
                <br>
               
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Logradouro" value="<c:out value='${cliente.logradouro}'/>" /> 
                <br>
                 
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Número" value="<c:out value='${cliente.numero}'/>" /> 
                 <br>
                 
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Cep" value="<c:out value='${cliente.CEP}'/>"/> 
              <br>
              
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Complemento" value="<c:out value='${cliente.complemento}'/>" />  
              <br>
              
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="País" value="<c:out value='${cliente.pais}'/>"/>  
              <br>
             
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="estado" value="<c:out value='${cliente.estado}'/>" /> 
              <br>
               
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="provincia" value="<c:out value='${cliente.provincia}'/>"/> 
               <br>
                
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad" name="endereço_cad" required="required" type="text" placeholder="Continente" value="<c:out value='${cliente.continente}'/>"/>
                <br>
            </p>

            <p> 
              <label for="senha_cad">Crie um Login</label>
              <input id="senha_cad" name="senha_cad" required="required" type="password" placeholder="login" value="<c:out value='${cliente.login}'/>"/>
            </p>

            <p> 
              <label for="senha_cad">Crie uma senha</label>
              <input id="senha_cad" name="senha_cad" required="required" type="password" placeholder="ex. 1234" value="<c:out value='${cliente.senha}'/>"/>
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
      </div>
    </div>  



</body>
</html>