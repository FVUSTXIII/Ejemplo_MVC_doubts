<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="procesar-formulario" modelAttribute="student">
		Name: <form:input path="name" />
		<br><br><br>
		
		Last Name : <form:input path="lastName" />
		<br><br><br>
		
		Asignaturas Optativas: <br/>
		<form:select path="optCourse" multiple="true">
			<form:option value="Design" label="Design" />
			<form:option value="Karate" label="Karate" />
			<form:option value="Economy" label="Economy" />
			<form:option value="Dance" label="Dance" />
		</form:select>
		<br/><br/><br/>
		Guadalajara<form:radiobutton path="city" value="Guadalajara"/>
		Ciudad Guzman<form:radiobutton path="city" value="Ciudad Guzman"/>
		El grullo<form:radiobutton path="city" value="El grullo"/>
		<br/><br/><br/>
		Inglés<form:checkbox path="language" value="Inglés"/>
		Alemán<form:checkbox path="language" value="Alemán"/>
		Ruso<form:checkbox path="language" value="Ruso"/>
		
		<br/><br/><br/>
		
		<input type="submit" value="Send"/>
		
	</form:form>
</body>
</html>