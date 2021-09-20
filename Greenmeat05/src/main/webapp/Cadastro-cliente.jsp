<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>
    
<!DOCTYPE html>
<html>
<head><style type="text/css"> @import url("../css/texto.css"); </style>
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
              <input id="nome" name="nome" required="nome" type="text" placeholder="nome" value="<c:out value=''/>" />
            </p>

            <p> 
              <label for="sobrenome"> Sobrenome </label>                                                           
              <input id="sobrenome" name="nome_cad" required="Sobrenome" type="text" placeholder="Sobrenome" value="<c:out value=''/>"/>
            </p>

            <p> 
              <label for="CPF"> CPF</label>
              &nbsp; &nbsp; &nbsp; &nbsp;<input id="CPF" name="CPF" required="required" type="text" placeholder="CPF"value="<c:out value=''/>" /> 
            </p>
             
            <p> 
           
            <p> 
              <label for="login">Crie um Login</label>
              <input id="login" name="login" required="required" type="text" placeholder="login" value="<c:out value=''/>"/>
            </p>

            <p> 
              <label for="senha">Crie uma senha</label>
              <input id="senha" name="senha_cad" required="required" type="password" placeholder="ex. 1234" value="<c:out value=''/>"/>
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