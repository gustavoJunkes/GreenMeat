<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <style><%@include file="/resources/css/estilo.css"%></style>S
<title>Ambiental</title>
</head>
<body>
<div id="ambiental">
 <form>
      <div id="txt"><p>Possui Licen�a Ambiental De Opera��o?Se sim,informe:</p></div>
     <p> 
       <div id="txt"> <label for="licenca"> N�mero da Licen�a:</label></div>                                                           
        <input id="licenca" name="licenca" required="required" type="text" placeholder="" />
      </p>

      <p> 
        <div id="txt"> <label for="licenca"> Data de validade:</label></div>                                                           
         <input id="licenca" name="licenca" required="required" type="text" placeholder="" />
       </p>

       <div id="txt"> <label for="ibama"> Se n�o,informe o n�mero da inscri��o de<br> regularidade no Ibama:</label></div>                                                           
       <input id="ibama" name="ibama" required="required" type="text" placeholder="" />

      <div id="txt"><p>Para pastagem,foi necess�rio desmatamento?Se sim,informe: </p></div>
       <p> 
        <div id="txt"> <label for="licenca"> O n�mero da ART:</label></div>                                                           
         <input id="pastagem" name="pastagem" required="required" type="text" placeholder="" />
       </p>

       <div id="txt"> <label for="ibama"> Se n�o,informe o n�mero da inscri��o de<br> regularidade no Ibama:</label></div>                                                           
       <input id="ibama" name="ibama" required="required" type="text" placeholder="" />
    </form> 
    </div>
</body>
</html>