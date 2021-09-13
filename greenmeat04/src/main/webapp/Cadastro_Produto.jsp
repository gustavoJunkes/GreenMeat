<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>




<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <!DOCTYPE html>
  <head>
    <meta charset="UTF-8" />
    <title>Formulário de Login e Registro com HTML5 e CSS3</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
    <link rel="stylesheet" type="text/css" href="style.css" />
  </head>
  <body>
    <div class="container" >
      <a class="links" id="paracadastro"></a>
      <a class="links" id="paralogin"></a>
      </div>
      
        <!--FORMULÁRIO DE CADASTRO-->
        <div id="cadastro">
          <form method="post" action=""> 
            
             <h1>Cadastro de  Produto</h1>
              <p> 
              <label for="Nome do Produto"> Nome do Produto </label>                                                           
              <input id="Nome do Produto" name="Nome do Produto" required="required" type="text" placeholder="" /> value="<c:out value='${produto.nome}'/>"
            </p>

            <p> 
              <label for=" Descricao">  Descrição </label>                                                           
              <input id=" Descrição" name="nome_cad" required="required" type="text" placeholder=" " /> value="<c:out value='${produto.descricao}'/>"
            </p>
            
            <label for="Nome do Produto"> Validade </label>                                                           
            <input id="Nome do Produto" name="Nome do Produto" required="required" type="date" placeholder="" />  value="<c:out value='${produto.dataValidade}'/>"
            

            <p> 
              <label for=" ID do Produto"> ID do Produto</label>
              &nbsp; &nbsp; &nbsp; &nbsp;<input id=" ID do Produto" name=" ID do Produto" required="required" type="number" placeholder=  >  value="<c:out value='${produto.id_produto}'/>"
            </p>
            </p>
             
            <p> 
              Preço de Custo        <input type="" placeholder=""/>  value="<c:out value='${produto.precoCusto}'/>"
            </p>
            </p>
               Preço de Venda        <input type="text" placeholder=""/>  value="<c:out value='${produto.precoVenda}'/>"
            </p>
            <p> 
              Preço de Venda        <input type="text" placeholder=""/>  value="<c:out value='${produto.precoVenda}'/>"
            </p>
            </p>
              Tipo de Carne             <input type="" placeholder="" >  value="<c:out value='${produto. tipoCarne;}'/>"
            </p>
            <p> 
           
              <br>
                

  
             
            <p> 
              <input type="submit" value="Cadastrar"/> 
            </p>
             
            <p class="link">  
              Já tem conta?
              <a href="#paralogin"> Ir para Login </a>
            </p>
            
          </form>
        </div>
      </div>
    </div>  

</body>
</html>