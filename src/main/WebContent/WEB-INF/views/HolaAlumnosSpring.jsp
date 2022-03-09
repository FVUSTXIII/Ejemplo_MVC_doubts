<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/estilos/style.css"/>
</head>
<body>
	<h1>
		Hola ${param.nombreAlumno }. Bienvenido al curso de spring
	</h1>
	<p>
	<br/>
		<h2>Atención a todos</h2>
			${mensaje_claro}
	</p>
	<img alt="foto" src="${pageContext.request.contextPath}/resources/imgs/gundam.jpg">
</body>
</html>