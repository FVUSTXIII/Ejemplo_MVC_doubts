<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>You're now registered!</title>
</head>
<body>
	 ${student.name}  ${ student.lastName } has been successfully registered
	 <br/>
	 The chosen course is : ${student.optCourse}
	 <br/> which will be taking place in: ${student.city}
</body>
</html>