<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
    

<html>
<head>

 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>"resources/css/fob.css/>
<style><%@include file="/resources/css/fob.css"%></style>
 
 
</head>
    <title>FOB</title>
    
</head>
<body>

	<div>
	<jsp:include page="../menu-lateral.jsp"/>
	
   </div>

  
    <!--etapa 1-->

<div class="text_fob"><h2></h2></div> <br>

<div class="calculo_fob">
<form action="fob">
    <label for="aquestion">Valor do produto no mercado interno:</label>
    <input type="text" id="valor_produto_mercado_interno" name="prod_merc_inter"><br><br>

    <label for="bquestion">Lucro pretendido no mercado interno:</label>
    <input type="text" id="lucro_pretendido_mercado_interno" name="lucro_pretendido_mercado_interno"><br><br>

    <label for="cquestion">Moeda:</label>
    <input type="text" id="moeda" name="moeda"><br><br>

    <!--etapa 2-->

    <label for="dquestion">Despesas ocorridas no mercado interno com a venda do produto:</label>
    <input type="text" id="Despesas_ocorridas_mercado_interno_venda_produto" name="Despesas_ocorridas_mercado_interno_venda_produto"><br><br>
    
    <label for="equestion">Despesas com intermediarios em serviços no mercado interno:</label>
    <input type="text" id="Despesas_intermediarios_em_servicos_mercado_interno" name="Despesas_intermediarios_em servicos_mercado_interno"><br><br>



    <!--etapa 3-->
    <label for="fquestion">Despesas com intermediarios em serviços no mercado externos:</label>
    <input type="text" id="Despesas_intermediarios_em_servicos_mercado_externos" name="Despesas_intermediarios_em servicos_mercado_externos"><br><br>

    <label for="gquestion">Despesas com despacho de exportação:</label>
    <input type="text" id="Despesas_com_despacho_exportacao" name="Despesas_com_despacho_exportacao"><br><br>

    <label for="hquestion">Despesas com transporte até o porto na origem::</label>
    <input type="text" id="Despesas_com_transporte_ate_porto_origem" name="Despesas_com_transporte_ate_porto_origem"><br><br>

    <label for="iquestion">Despesas portuarias:</label>
    <input type="text" id="Despesas_portuarias" name="Despesas_portuarias"><br><br>


    <input type="submit" value="Calcular">
  </form>
</div>
</body>
</html>