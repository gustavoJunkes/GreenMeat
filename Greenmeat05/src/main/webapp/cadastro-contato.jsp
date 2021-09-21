<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contato</title>
</head>
<body>

	<!--FORMULÁRIO DE CADASTRO-->
	<div id="contato">
		<form method="post" action="inserir-contato">

			<h1>Contato</h1>

			<p>
				<label for="login"> Login</label> &nbsp;<input id="login"
					name="login" required="required" type="text" placeholder="login"
					value='${contato.usuario.login}' />" />
			</p>

			<p>
				<label for="email_cad"> E-mail</label> &nbsp; &nbsp; <input
					id="email" name="email" required="required" type="text"
					placeholder="contato@email.com" value='${contato.email}' />"/>
			</p>

			<p>
				<label for="telefone_cad"> Telefone</label> &nbsp;<input
					id="telefone" name="telefone" required="required" type="text"
					placeholder="telefone" value='${contato.telefone}' />" />
			</p>

			<p>
				<input type="submit" value="Cadastrar" />
			</p>

		</form>
	</div>
</body>
</html>