<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>"resources/css/mystyle.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
<title>Inicial</title>
</head>
<body>

	<jsp:include page="menu-lateral.jsp"/>
	<jsp:include page="cadastro-cliente.jsp"/>


	<div class="imagem_tela_inicial">
		<img src="img/aviao-exportacao.jfif" alt="foto da tela inicial ">
	</div>

	<div class="txt_tela_inicial">
		"O novo mercado � altamente competitivo, tecnol�gico e com a presen�a
		de empresas que exportam o produto para todo o mundo" <br>
		<br> &nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;A atividade pecu�ria
		no Brasil ganhou for�a nos �ltimos anos e os investimentos em
		tecnologia trouxeram ganhos significativos para o setor, Pensando
		nisso, nos do ... exportamos para pa�ses do mundo todo carnes de alta
		qualidade e estamos sempre pensando em transmitir a confiabilidade
		para seus clientes. Pois � nossa miss�o selecionar as melhores carnes
		do mercado e fornecedores que respeitam todas as normas trabalhistas,
		ambientais e sanit�rias. Com os valores de preservar o meio ambiente,
		temos como parceiros fornecedores com fazendas livres de
		desmatamentos, (pois temos ci�ncia que a mesma � a atividade mais
		poluidora do pa�s se considerarmos a emiss�o de gases da queima de
		florestas que contribuem para o aquecimento global) e fornecedores que
		cumprem com seu compromisso referente a sa�de e bem estar animal at�,
		e durante o seu abate visando sempre buscar qualidade na m�o de obra.
	</div>





</body>
</html>