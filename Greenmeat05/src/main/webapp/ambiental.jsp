<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <style><%@include file="/resources/css/estilo.css"%></style>
<title>Insert title here</title>
</head>
<body>
<div id="ambiental">
 <form>
      <div id="txt"><p>Possui Licença Ambiental De Operação?Se sim,informe:</p></div>
     <p> 
       <div id="txt"> <label for="licenca"> Número da Licença:</label></div>                                                           
        <input id="licenca" name="licenca" required="required" type="text" placeholder="" />
      </p>
 
      <p> 
        <div id="txt"> <label for="licenca"> Data de validade:</label></div>                                                           
         <input id="licenca" name="licenca" required="required" type="text" placeholder="" />
       </p>
 
       <div id="txt"> <label for="ibama"> Se não,informe o número da inscrição de<br> regularidade no Ibama:</label></div>                                                           
       <input id="ibama" name="ibama" required="required" type="text" placeholder="" />
 
      <div id="txt"><p>Para pastagem,foi necessário desmatamento?Se sim,informe: </p></div>
       <p> 
        <div id="txt"> <label for="licenca"> O número da ART:</label></div>                                                           
         <input id="pastagem" name="pastagem" required="required" type="text" placeholder="" />
       </p>
 
       <div id="txt"> <label for="ibama"> Se não,informe o n�mero da inscrição de<br> regularidade no Ibama:</label></div>                                                           
       <input id="ibama" name="ibama" required="required" type="text" placeholder="" />
    </form> 
    </div>
</body>
</html>