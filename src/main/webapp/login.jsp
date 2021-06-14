<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<script src="login.js"></script>
</head>
<body>
	<form action="LoginServlet" method="post">
		UserName:<input type="text" id="name" name="user">
		<error-output class="text-error" for="text"></error-output>
		<br> Password:<input type="password" id="pwd" name="pwd">
		<br> <input type="submit" value="Login">
	</form>
</body>
</html>