

<link type="text/css" rel="stylesheet"
    href="<%=request.getContextPath()%>"resources/css/mystyles.css/>
 <style><%@include file="/resources/css/mystyles.css"%></style>
 


        <div id="login">
          <form method="post" action="logar"> 
            <h1>Login</h1>
                     
              <label for="login">Login</label>
              <input id="loginInserir" name="login" required="required" type="text" placeholder="login"  value=""/>                 
              <label for="email_login">Senha</label>
              <input id="email_login" name="senha" required="required" type="password" placeholder="ex. senha"  value="" />                   
				              
				              <script> 
				function validarSenha(){ 
				senha1 = document.f1.senha1.value 
				senha2 = document.f1.senha2.value 
				
				if (senha1 == senha2) 
				alert("SENHAS IGUAIS") 
				document.f1.submit(); // Adiciona isso que ele irá submeter o form!
				else 
				alert("SENHAS DIFERENTES") 
				} 
</script> 
				<br></br>
              <input type="submit" value="Logar" />                      
          
          
          </form>
      </div>
