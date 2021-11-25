<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ambiental</title>

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
    <form>
        <p>Possui Licença Ambiental De Operação?Se sim,informe:</p>
        
           <label for="licenca"> Número Da Licença:</label>                                                          
           <input id="licenca" name="licenca" required="required" type="text" placeholder="" />
       
          <label for="licenca"> Data de validade:</label>                                                          
            <input id="licenca" name="licenca" required="required" type="text" placeholder="" />
         
    
          <label for="ibama"> Se não,informe o número da inscrição de<br> regularidade no Ibama:</label>                                                         
          <input id="ibama" name="ibama" required="required" type="text" placeholder="" />
    
       <p>Para pastagem,foi necessário desmatamento?Se sim,informe: </p>
          
          <label for="licenca"> O número da ART:</label>                                                          
            <input id="pastagem" name="pastagem" required="required" type="text" placeholder="" />
        
     <label for="ibama"> Se não,informe o número da inscrição de<br> regularidade no Ibama:</label>                                                         
          <input id="ibama" name="ibama" required="required" type="text" placeholder="" />
          
          	<input type="submit" value="Salvar" />
       </form> 
       </div>
</body>
</html>