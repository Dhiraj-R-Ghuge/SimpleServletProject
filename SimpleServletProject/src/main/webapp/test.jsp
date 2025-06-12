<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>Hello guys</h3>
  <%! 
    
    public int add(int a ,int b){
        return a + b;
    }
  %>
  <%
    int i = 1;
    int j = 2;
    int k;
    k = i + j;
    //out.println("Value of k: " + k);
  %>
  the value of k is:<%=k %>
  <%
  k=add(3545,5876);
  %>
  <br>
  the value of k is : <%=k %>
  
</body>

</html>
