<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
 <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>"resources/css/menu.css/>
 <style><%@include file="/resources/css/menu.css"%></style>
 
<title>Index</title>
</head>
<body>


 <div class="wrapper">
<div class="sidebar">
    <h2>MENU</h2>
    <ul>
        <li>HOME</li>
        <li><a href="<%=request.getContextPath()%>/listar-produtos-por-categoria" target="_self"> CATEGORIAS</a></li>
        <li><a href="<%=request.getContextPath()%>/novo-fornecedor" target="_self">SEJA UM FORNECEDOR</a></li>
		<li><a href="<%=request.getContextPath()%>/novo-produto" target="_self">CADASTRAR PRODUTOS</a></li>
		<li><a href="<%=request.getContextPath()%>/novo-cliente" target="_self">CADASTRE-SE E SEJA CLIENTE</a></li>
		<li><a href="<%=request.getContextPath()%>/novo-funcionario" target="_self">CADASTRO DE FUNCIONARIOS</a></li>
		<li><a href="<%=request.getContextPath()%>/listar-produto" target="_self">LISTAR PRODUTOS</a></li>
		<li><a href="<%=request.getContextPath()%>/perfil-cliente" target="_self">PERFIL CLIENTE</a></li>
		<li><a href="<%=request.getContextPath()%>/perfil-fornecedor" target="_self">PERFIL FORNECEDOR</a></li>
		<li><a href="<%=request.getContextPath()%>/perfil-funcionario" target="_self">PERFIL DO FUNCIONARIO</a></li>
    </ul>
</div>
    </div>


</body>
</html>
 
