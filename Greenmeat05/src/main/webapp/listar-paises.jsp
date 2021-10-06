<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exibição de paises</title>
</head>
<body>

<div>
   <a href="<%=request.getContextPath()%>/listar-paises">Localidades</a>
	
	<form method="post" action="listar-paises">
		<table>
			<thead>
				<tr>
					<th>Paises</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="localidade" items="${localidades}">
					<tr>
						<td><c:out value="${localidade.pais}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
	</div>
</tbody>


</body>
</html>