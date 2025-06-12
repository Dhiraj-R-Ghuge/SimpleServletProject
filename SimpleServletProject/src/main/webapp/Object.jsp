<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String username=request.getParameter("name");

if(username != null){
	session.setAttribute("sessionusername",username);
	application.setAttribute("applicationusername",username);
	pageContext.setAttribute("pageContextusername",username);
	pageContext.setAttribute("applicationusername",username,PageContext.APPLICATION_SCOPE);
	pageContext.findAttribute("name");
}
%>
<br>
This user name in the request object is:<%=username %>
<br>
This user name in the session object is:<%=session.getAttribute("sessionusername") %>
<br>
This user name in the application object is:<%=application.getAttribute("applicationusername")%>
<br>
This user name in the page context object is:<%=pageContext.getAttribute("pageContextusername")%>


</body>
</html>
