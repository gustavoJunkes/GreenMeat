<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div id="perfilFuncionario">
          
           <h1>Meu Perfil</h1>
            <p> 
            <label for="nome"> Nome</label>                                                           
            <input id="nome" name="nome" required="required" type="text" placeholder="nome" value="<c:out value='${funcionario.nome}' />" />
          </p>

          <p> 
            <label for="sobrenome"> Sobrenome</label>                                                           
            <input id="sobrenome" name="sobrenome" required="required" type="text" placeholder="sobrenome" value="<c:out value='${funcionario.sobrenome}' />" />
          </p>

          <p> 
            <label for="cpf"> CPF</label>
            &nbsp; &nbsp; &nbsp; &nbsp;<input id="cpf" name="cpf" required="required" type="text" placeholder="CPF" value="<c:out value='${funcionario.CPF}' />" />
          </p>

          <p> 
            <label for="dataDeNascimento"> Data De Nascimento</label>                                                           
            <input id="dataDeNascimento" name="dataDeNascimento" required="required" type="text" placeholder="dataDeNascimento" value="<c:out value='${funcionario.dataDeNascimento}' />" />
          </p>
          <p> 
            <label for="funcao"> Função</label>                                                           
            <input id="funcao" name="funcao" required="required" type="text" placeholder="função" value="<c:out value='${funcionario.funcao}' />" />
          </p>
          <p> 
            <label for="cargo"> Cargo</label>                                                           
            <input id="cargo" name="cargo" required="required" type="text" placeholder="cargo" value="<c:out value='${funcionario.cargo}' />" />
          </p>
          <p> 
            <label for="login">Crie um Login</label>
            <input id="login" name="login" required="required" type="text" placeholder="login" value="<c:out value='${funcionario.login}' />"/>
          </p>
    
          <p> 
            <label for="senha">Crie uma senha</label>
            <input id="senha" name="senha" required="required" type="password" placeholder="ex. 1234" value="<c:out value='${funcionario.senha}' />"/>
          </p>

          <p> 
            <input type="submit" value="Continuar Cadastro"/> 
          </p>
           
          <p class="link">  
            Já tem conta?
            <a href="login.html"> Ir para Login </a>
          </p>
      </div>

</body>
</html>