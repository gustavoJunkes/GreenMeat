<%@page import="modelo.entitidade.usuario.Fornecedor"%>
<%@page import="modelo.entitidade.usuario.Funcionario"%>
<%@page import="modelo.entitidade.usuario.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta charset="UTF-=8">
<title>Relatorio-fob</title>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>"resources/css/fob.css/>
<style><%@include file="/resources/css/fob.css"%></style>

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
	
	<div class="tabela_relatorio_fob"><table>

        <tr>
           <th>Valor do produto No Mercado Interno</th>
           <th>Resultado</th>
          
        </tr>
          <tr>
            <td>Lucro Pretendido No Mercado Interno</td>
            <td>Resultado</td>
          
        </tr> 
           <tr>
            <td>Preço da Moeda</td>
            <td>Resultado</td>
          
        </tr>
        <tr>
            <td>Despesas Ocorridas No Mercado INTERNO cOM a VENDA </td>
            <td>22344545</td>

        </tr>
        <td>vfgfg</td>
        <td>788979</td>
        </tr>
        
        </table>




</body>
</html>