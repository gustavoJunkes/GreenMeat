<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
 <meta charset="UTF-8">
<title>Inicio</title>
<style type="text/css">

.texto{
	<% if(request.getSession().getAttribute("usuario") == null){ %>
	margin-top: -28%; 
	<%}else{%>
		margin-top: 8%; 
	<%}%>
	
}

</style>
</head>
<body>
<div class=telaInicial>

	<div>

	<jsp:include page="navbar.jsp"/>
    </div>

	<%if(request.getSession().getAttribute("usuario") == null){ %>
	<div>
	<jsp:include page="login.jsp"/>
	</div>
   	<%}%>
   
   <div class="texto" >
	<jsp:include page="text.jsp"/>
   </div>
</div>
</body>
</html>