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
    <form method="post" action=""> 
      
       <h1>Contato</h1>
       
      <p> 
        <label for="email_cad"> E-mail</label>
        &nbsp; &nbsp; <input id="email_cad" name="email_cad" required="required" type="email" placeholder="contato@email.com" value='${contato.email}' />"/> 
      </p>

      <p> 
        <label for="telefone_cad"> Telefone</label>
        &nbsp;<input id="telefone_cad" name="telefone_cad" required="required" type="text" placeholder="telefone" value='${contato.telefone}' />" />
      </p>
       
      <p> 
        <input type="submit" value="Cadastrar"/> 
      </p>
      
    </form>
  </div>
</body>
</html>