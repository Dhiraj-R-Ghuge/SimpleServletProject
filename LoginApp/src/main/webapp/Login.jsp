<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<h2>Login</h2>
<form action="Login" method="post">
    <label for="userId">UserId:</label>
    <input type="text" id="userId" name="userId"/><br><br>

    <label for="Password">Password:</label>
    <input type="Password" id="Password" name="Password"/><br><br>

    <input type="submit" value="Login"/>
</form>
</body>
</html>
