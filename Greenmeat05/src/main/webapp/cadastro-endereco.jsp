<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Endere�o</title>
</head>
<body>
	<!--FORMUL�RIO DE CADASTRO-->
	<div id="endereco">
		<form method="post" action="">

			<h1>Endere�o</h1>

			<p>
				<label for="endere�o_cad"> Nome Da Rua</label> <input
					id="endere�o_cad" name="endere�o_cad" required="required"
					type="text" placeholder="Nome Da Rua" value="<c:out value='${endereco.nomeDaRua}' />" /> <br> <label
					for="endere�o_cad"> Tipo Da Via</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endere�o_cad"
					name="endere�o_cad" required="required" type="text"
					placeholder="Tipo Da Via" value="<c:out value='${endereco.tipoDaVia}' />"/> <br> <label for="endere�o_cad">
					Logradouro</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				<input id="endere�o_cad" name="endere�o_cad" required="required"
					type="text" placeholder="Logradouro" value="<c:out value='${endereco.logradouro}' />"/> <br> <label
					for="endere�o_cad"> N�mero</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endere�o_cad"
					name="endere�o_cad" required="required" type="text"
					placeholder="N�mero" value="<c:out value='${endereco.numero}' />"/> <br> <label for="endere�o_cad">
					Cep</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input
					id="endere�o_cad" name="endere�o_cad" required="required"
					type="text" placeholder="Cep" value="<c:out value='${endereco.cep}' />" /> <br> <label
					for="endere�o_cad"> Complemento</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endere�o_cad"
					name="endere�o_cad" required="required" type="text"
					placeholder="Complemento" value="<c:out value='${endereco.complemento}' />"/> <br> <label for="endere�o_cad">
					Pa�s</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input
					id="endere�o_cad" name="endere�o_cad" required="required"
					type="text" placeholder="Pa�s" value="<c:out value='${localidade.pais}' />"/> <br> <label
					for="endere�o_cad"> Estado</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endere�o_cad"
					name="endere�o_cad" required="required" type="text"
					placeholder="estado" value="<c:out value='${localidade.estado}' />"/> <br> <label for="endere�o_cad">
					Prov�ncia</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input
					id="endere�o_cad" name="endere�o_cad" required="required"
					type="text" placeholder="provincia" value="<c:out value='${localidade.provincia}' />"/> <br> <label
					for="endere�o_cad"> Continente</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endere�o_cad"
					name="endere�o_cad" required="required" type="text"
					placeholder="Continente" value="<c:out value='${localidade.continente}' />"/> <br>
			</p>


			<p>
				<input type="submit" value="Continuar Cadastro" />
			</p>

		</form>
	</div>
</body>
</html>