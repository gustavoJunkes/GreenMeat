<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<html>
<head>
 <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Index</title>
</head>
<body>
<div class=telaInicial>
    <c:if test="${usuario == null}">  
	<div>
	<jsp:include page="navbar.jsp"/>
    </div>
  </c:if>
   
  <c:if test="${usuario == null}">  
	<div>
	<jsp:include page="login.jsp"/>
    </div>
  </c:if>
  
   <c:if test="${usuario == null}">  
	<div>
	<jsp:include page="text.jsp"/>
    </div>
  </c:if>
  </div>
</body>
</html>

