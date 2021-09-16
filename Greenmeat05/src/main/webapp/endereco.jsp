<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Endereço</title>
</head>
<body>
	<!--FORMULÁRIO DE CADASTRO-->
	<div id="endereco">
		<form method="post" action="">

			<h1>Endereço</h1>

			<p>
				<label for="endereço_cad"> Nome Da Rua</label> <input
					id="endereço_cad" name="endereço_cad" required="required"
					type="text" placeholder="Nome Da Rua" value="<c:out value='${endereco.nomeDaRua}' />" /> <br> <label
					for="endereço_cad"> Tipo Da Via</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad"
					name="endereço_cad" required="required" type="text"
					placeholder="Tipo Da Via" value="<c:out value='${endereco.tipoDaVia}' />"/> <br> <label for="endereço_cad">
					Logradouro</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				<input id="endereço_cad" name="endereço_cad" required="required"
					type="text" placeholder="Logradouro" value="<c:out value='${endereco.logradouro}' />"/> <br> <label
					for="endereço_cad"> Número</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad"
					name="endereço_cad" required="required" type="text"
					placeholder="Número" value="<c:out value='${fornecedor.numero}' />"/> <br> <label for="endereço_cad">
					Cep</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input
					id="endereço_cad" name="endereço_cad" required="required"
					type="text" placeholder="Cep" value="<c:out value='${fornecedor.cep}' />" /> <br> <label
					for="endereço_cad"> Complemento</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad"
					name="endereço_cad" required="required" type="text"
					placeholder="Complemento" value="<c:out value='${endereco.complemento}' />"/> <br> <label for="endereço_cad">
					País</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input
					id="endereço_cad" name="endereço_cad" required="required"
					type="text" placeholder="País" value="<c:out value='${localidade.pais}' />"/> <br> <label
					for="endereço_cad"> Estado</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad"
					name="endereço_cad" required="required" type="text"
					placeholder="estado" value="<c:out value='${localidade.estado}' />"/> <br> <label for="endereço_cad">
					Província</label> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input
					id="endereço_cad" name="endereço_cad" required="required"
					type="text" placeholder="provincia" value="<c:out value='${localidade.provincia}' />"/> <br> <label
					for="endereço_cad"> Continente</label> &nbsp; &nbsp; &nbsp; &nbsp;
				&nbsp; &nbsp; &nbsp; &nbsp; <input id="endereço_cad"
					name="endereço_cad" required="required" type="text"
					placeholder="Continente" value="<c:out value='${localidade.continente}' />"/> <br>
			</p>


			<p>
				<input type="submit" value="Continuar Cadastro" />
			</p>

		</form>
	</div>
</body>
</html>