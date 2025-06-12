<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="xmlServletpath" >
usename:<input name="username"/>
fullname:<input name="fullname"/>
<br>

profession:<input type="radio" name="prof" value="Devloper">Developer</input>
profession:<input type="radio" name="prof" value="architext">architect</input>
<select name="location" multiple size=3>
	<option value="here">here</option>
	<option value="there">there</option>
	<option value="far">far</option>
	<option value="aeay">away</option>

</select>
<input type="submit"/>

</form>
</body>
</html>
