<<<<<<< Updated upstream
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
 <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>"resources/css/menu.css/>
 <style><%@include file="/resources/css/menu.css"%></style>
<title>Insert title here</title>

</head>
<body>


 <div class="wrapper">
<div class="sidebar">
    <h2>MENU</h2>
    <ul>
<li>HOME</li>
<li><a href="<%=request.getContextPath()%>/exibir-produto.jsp" target="_self"> CATEGORIAS</a></li>
<li><a href="<%=request.getContextPath()%>/cadastro-fornecedor.jsp" target="_self">SEJA UM FORNECEDOR</a></li>
<li><a href="<%=request.getContextPath()%>/cadastro-produto.jsp" target="_self">CADASTRAR PRODUTOS</a></li>
<li><a href="<%=request.getContextPath()%>/cadastro-cliente.jsp" target="_self">CADASTRE-SE E SEJA CLIENTE</a></li>
<li><a href="<%=request.getContextPath()%>/cadastro-funcionario.jsp" target="_self">CADASTRO DE FUNCIONARIO</a></li>
<li><a href="<%=request.getContextPath()%>/listar-produto.jsp" target="_self">LISTAR PRODUTOS</a></li>
<li><a href="<%=request.getContextPath()%>/perfil-cliente.jsp" target="_self">PERFIL CLIENTE</a></li>
<li><a href="<%=request.getContextPath()%>/perfil-fornecedor.jsp" target="_self">PERFIL FORNECEDOR</a></li>
<li><a href="<%=request.getContextPath()%>/perfil-funcionario.jsp" target="_self">PERFIL DO FUNCIONARIO</a></li>
<li><a href="<%=request.getContextPath()%>/listar-produtos-funcionario.jsp" target="_self">Listar produtos do funcionario</a></li>
</ul>
</div>
</div>
</body>
</html>
 
