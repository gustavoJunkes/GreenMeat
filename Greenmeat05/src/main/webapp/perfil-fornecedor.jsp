<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Perfil Fornecedor</title>
</head>
<body>
 <div class=imagemPerfil>
        <img src="perfil_img.jfif" alt=""></div>
        
            <div class="MeuPerfil"><h3>Meu Perfil</h3></div>
            <div class="tabela_exibir_perfil"><table>
            <tr>
                <th>Razão Social</th>
                <th>Nome Fantasia </th>
                <th> CNPJ</th>
               <th>E-mail</th>
               <th>Telefone</th>
               
              </tr>
              <tr>
        <td><c:out value="${fornecedor.razaoSocial}" /></td>
        <td><c:out value="${fornecedor.nomeFantasia}" /></td>
        <td><c:out value="${fornecedor.CNPJ}" /></td>
        <td><c:out value="${contato.email}" /></td>
        <td><c:out value="${contato.telefone}" /></td>
             
            </table>
            </div>
        
            <div class="tabela_exibir_perfil"><table>
            <tr>
                <th>Nome Da Rua</th>
                <th>Tipo Da Via</th>
                <th> Logradouro</th>
                <th> Número</th>
                <th> Cep</th>
                <th> Complemento</th>
               <th>País</th>
               <th>Estado</th>
               <th>Província</th>
               <th>Continente</th>
               
              </tr>
              <tr>
         <td><c:out value="${endereco.nomeDaRua}" /></td>
         <td><c:out value="${endereco.tipoDaVia}" /></td>
        <td><c:out value="${endereco.logradouro}" /></td>
        <td><c:out value="${endereco.numero}" /></td>
        <td><c:out value="${endereco.cep}" /></td>
        <td><c:out value="${endereco.complemento}" /></td>
        <td><c:out value="${localidade.pais}" /></td>
        <td><c:out value="${localidade.estado}" /></td>
        <td><c:out value="${localidade.provincia}" /></td>
        <td><c:out value="${localidade.continente}" /></td>
             
            </table>
            </div>
</body>
</html>