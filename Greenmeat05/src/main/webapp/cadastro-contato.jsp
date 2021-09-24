<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contato</title>
</head>
<body>
  <!--FORMULÁRIO DE CADASTRO-->
   <div id="contato">
    <form method="post" action="inserir-contato"> 
      
       <h1>Contato</h1>
       
       
        <label for="login"> Login</label>
        ;<input id="login" name="login" required="required" type="text" placeholder="login" value='${contato.usuario.login}' />" />
    
       
    
        <label for="email_cad"> E-mail</label>
         <input id="email" name="email" required="required" type="text" placeholder="contato@email.com" value='${contato.email}' />"/> 
     

       
        <label for="telefone_cad"> Telefone</label>
        <input id="telefone" name="telefone" required="required" type="text" placeholder="telefone" value='${contato.telefone}' />" />
      
       
    
        <input type="submit" value="Cadastrar"/> 
     
    </form>
  </div>
</body>
</html>