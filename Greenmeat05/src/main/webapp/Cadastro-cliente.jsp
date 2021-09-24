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

              <br> 
              <label for="nome"> Nome </label>                                                           
              <input id="nome" name="nome" required="nome" type="text" placeholder="nome" value="<c:out value="nome"/>" />
            <br>

            <br> 

              <label for="sobrenome"> Sobrenome </label>                                                           

              <input id="sobrenome_cad" name="sobrenome" required="required" type="text" placeholder="Sobrenome" value="<c:out value='${cliente.sobrenome}'/>"/>


           
             
            
           
           

              <label for="senha">Crie uma senha</label>

              <input id="senha" name="senha" required="required" type="password" placeholder="ex. 1234" value="<c:out value='${cliente.senha}'/>"/>


            
            
              <input type="submit" value="Cadastrar"/> 
            


            
             
            <p class="link">  
              Já tem conta?
              <a href="#paralogin"> Ir para Login </a>
           
            
          </form>
        </div>
     



</body>
</html>