<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="org.Dhiraj.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Succes</title>
</head>
<body>
<h1> Login Succesfull</h1>

 <jsp:useBean id="user" class="org.Dhiraj.dto.User" scope="request"></jsp:useBean>

Hello <jsp:getProperty property="userName" name="user"/>
</body>
</html>